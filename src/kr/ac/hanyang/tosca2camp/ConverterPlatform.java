package kr.ac.hanyang.tosca2camp;

import java.util.ArrayList;
import java.util.List;

//import org.apache.brooklyn.api.entity.EntityType;
//import org.apache.brooklyn.launcher.BrooklynLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.ac.hanyang.oCamp.camp.platform.oCampPlatform;
import kr.ac.hanyang.oCamp.core.catalog.OCampServiceCatalog;
import kr.ac.hanyang.oCamp.core.mgmt.BaseEntityManager;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;

public class ConverterPlatform {
	
	private static final Logger log = LoggerFactory.getLogger(ConverterPlatform.class);
	
	private List<String> convertedNodes;
	private Tosca2CampPlatform toscaPlatform;
	private oCampPlatform campPlatform;
	private OCampServiceCatalog serviceCatalog;
	
	protected ConverterPlatform(){
		convertedNodes = new ArrayList<String>();
	}
	
	public static ConverterPlatform newConverterPlatform(){
		ConverterPlatform platform = new ConverterPlatform();
		return platform;
	}
	
	public ConverterPlatform toscaPlatform(Tosca2CampPlatform toscaPlatform){
		this.toscaPlatform = toscaPlatform;
		return this;
	}
	
	public ConverterPlatform campPlatform(oCampPlatform campPlatform){
		this.campPlatform = campPlatform;
		return this;
	}
	
	public void loadServiceTemplate(String stPath){
		toscaPlatform.createServiceTemplate(stPath);
	}
	
	
	
	
	
}
