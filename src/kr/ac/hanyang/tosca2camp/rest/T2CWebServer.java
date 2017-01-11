package kr.ac.hanyang.tosca2camp.rest;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.SecureRequestCustomizer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jersey.repackaged.com.google.common.collect.Multiset.Entry;
import kr.ac.hanyang.tosca2camp.Tosca2CampPlatform; 


public class T2CWebServer {
	
	private static final Logger log = LoggerFactory.getLogger(T2CWebServer.class);

	
	private Server webServer;
	
	public T2CWebServer(){
		// Setup Threadpool for multiple server connections
	    QueuedThreadPool threadPool = new QueuedThreadPool();
	    threadPool.setMaxThreads(500);
		
        webServer = new Server(threadPool);
        
        int port = T2CSettings.WEBSERVER_PORT;
        int portSecure = T2CSettings.WEBSERVER_SECURE_PORT;
        String home = "";
        
     // HTTP Configuration
        HttpConfiguration http_config = new HttpConfiguration();
        http_config.setSecureScheme("https");
        http_config.setSecurePort(portSecure);

        // Configure Connector for http
        ServerConnector http = new ServerConnector(webServer,new HttpConnectionFactory(http_config));
        http.setPort(port);
        http.setIdleTimeout(30000);

        // HTTPS Configuration
        HttpConfiguration https_config = new HttpConfiguration(http_config);
        https_config.addCustomizer(new SecureRequestCustomizer());

        SslContextFactory sslContextFactory = new SslContextFactory();
        sslContextFactory.setKeyStorePath(home + "/Users/kena/.ssh/keystore");
        sslContextFactory.setKeyStorePassword("0per@tioncwal");
        sslContextFactory.setKeyManagerPassword("0per@tioncwal");

        ServerConnector sslConnector = new ServerConnector(webServer, new SslConnectionFactory(sslContextFactory, "http/1.1"),
                new HttpConnectionFactory(https_config));
        sslConnector.setPort(portSecure);

        webServer.setConnectors(new Connector[] { http, sslConnector });
        
        
        
        
        
        
        
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        webServer.setHandler(context);
        
        ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/api/*");
        jerseyServlet.setInitOrder(1);
        
        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames",
        		io.swagger.jaxrs.listing.ApiListingResource.class.getCanonicalName() +","+
                io.swagger.jaxrs.listing.SwaggerSerializers.class.getCanonicalName() +","+
        		ServiceTemplateApi.class.getCanonicalName() +","+
        		NodeApi.class.getCanonicalName()            +","+
        		CapabilityApi.class.getCanonicalName()      +","+
        		DataTypeApi.class.getCanonicalName()        +","+
        		ArtifactApi.class.getCanonicalName()        +","+
        		InterfaceApi.class.getCanonicalName()       +","+
        		PolicyApi.class.getCanonicalName()          +","+
        		GroupApi.class.getCanonicalName());     
        

        ServletHolder swaggerServlet = context.addServlet(io.swagger.jersey.config.JerseyJaxrsConfig.class, "/swagger-core");
        swaggerServlet.setInitOrder(2);
        swaggerServlet.setInitParameter("api.version","1.0.0");
        
        
     
	}
	
	public Server start() {
        try {
        	webServer.start();
        	webServer.join();
        	return webServer;
        }catch(Exception e){
        	log.error(e.getMessage());
        	return null;
        } finally {
        	webServer.destroy();
        }
    }
}
