package kr.ac.hanyang.tosca2camp;

import kr.ac.hanyang.tosca2camp.rest.T2CWebServer;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;

public class Tosca2CampLauncher {
	
	private static Tosca2CampPlatform platform;// = Tosca2CampPlatform.newPlatform();
	
	public static Tosca2CampPlatform getPlatform(){
		return platform;
	}
	
	public static void main( String[] args ) throws Exception{
		
		platform = Tosca2CampPlatform.newPlatform();
		//System.out.println(platform.createServiceTemplate("WebappExample.yml"));
		//ServiceTemplate st = platform.getServiceTemplate("ServiceTemplate");
		//st.configure();
		T2CWebServer t2cWebServer = new T2CWebServer();
		t2cWebServer.start();
	
	}
}
