package kr.ac.hanyang.tosca2camp;

import kr.ac.hanyang.oCamp.camp.platform.oCampPlatform;
import kr.ac.hanyang.oCamp.camp.platform.oCampPlatformLauncher;
import kr.ac.hanyang.oCamp.core.mgmt.BaseEntityManager;
import kr.ac.hanyang.oCamp.launcher.NewLauncher;

public class UnifiedLauncher {
	
	
	public static void main( String[] args ) throws Exception{
		
	Tosca2CampPlatform toscaPlatform = Tosca2CampPlatform.newPlatform();
	oCampPlatform campPlatform = new oCampPlatformLauncher()
            .useManagementContext(new BaseEntityManager())
            .launch()
            .getCampPlatform();
	
	ConverterPlatform converter = ConverterPlatform.newConverterPlatform()
													.toscaPlatform(toscaPlatform)
													.campPlatform(campPlatform);
	
	converter.loadServiceTemplate("WebappExample.yml");
	
	converter.convertServiceTemplate("NewTemplate");
	}
}
