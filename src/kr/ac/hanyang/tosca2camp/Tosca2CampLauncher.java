package kr.ac.hanyang.tosca2camp;

import java.util.ArrayList;
import java.util.List;

import kr.ac.hanyang.tosca2camp.rest.T2CWebServer;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;

public class Tosca2CampLauncher {
	
	private Tosca2CampPlatform platform;// = Tosca2CampPlatform.newPlatform();
	private T2CWebServer webServer;
	private List<String> serviceTemplates;
	private boolean createTemplates;
	private boolean startWebServer;
	
	private Tosca2CampLauncher(){
		serviceTemplates = new ArrayList<String>();
	}
	
	public static Tosca2CampLauncher of(){
		return new Tosca2CampLauncher();
	}
	
	public Tosca2CampLauncher platform(Tosca2CampPlatform platform){
		this.platform = platform;
		return this;
	}
	
	public Tosca2CampLauncher webServer(){
		this.webServer = new T2CWebServer();
		return this;
	}
	
	public Tosca2CampLauncher startWebServer(boolean option){
		startWebServer = option;
		return this;
	}
	
	public Tosca2CampLauncher createTemplates(boolean option){
		createTemplates = option;
		return this;
	}
	
	public Tosca2CampLauncher serviceTemplate(String name){
		serviceTemplates.add(name);
		return this;
	}
	
	public Tosca2CampLauncher launchPlatform(){
		if (this.platform == null)
			platform = Tosca2CampPlatform.newPlatform();
		if (startWebServer) webServer.start();
		if (createTemplates){
			for (String name: serviceTemplates){
				platform.createServiceTemplate(name);
			}
		}
		return this;
	}
	
	public Tosca2CampPlatform getPlatform(){
		return platform;
	}
	
//	public static void main( String[] args ) throws Exception{
//		
//		platform = Tosca2CampPlatform.newPlatform();
//		//System.out.println(platform.createServiceTemplate("WebappExample.yml"));
//		//ServiceTemplate st = platform.getServiceTemplate("ServiceTemplate");
//		//st.configure();
//		T2CWebServer t2cWebServer = new T2CWebServer();
//		t2cWebServer.start();
//	
//	}
}
