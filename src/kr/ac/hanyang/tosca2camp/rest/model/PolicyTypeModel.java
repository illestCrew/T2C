package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class PolicyTypeModel {
	
	private String typeName;
	private String derived_from;
	private VersionModel version;
	private String description;
	private List<PropertyModel> properties;
	private String[] targets;

	
	private PolicyTypeModel(){ }
	
	public static PolicyTypeModel of(){
		return new PolicyTypeModel();
	}
	
	public PolicyTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
	public PolicyTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public PolicyTypeModel version(VersionModel version){	this.version = version; 	return this; 	}
	public PolicyTypeModel description(String description){	this.description = description; 	return this; 	}
	public PolicyTypeModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	public PolicyTypeModel targets(String[] targets){	this.targets = targets; 	return this; 	}
	
	@XmlElement(name="typeName")
	public String getTypeName(){
		return typeName;
	}
	
	@XmlElement(name="derived_from")
	public String getDerivedFrom(){
		return derived_from;
	}
	
	@XmlElement(name="version")
	public VersionModel getVersion(){
		return version;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="properties")
	public List<PropertyModel> getProperties(){
		return properties;
	}
	
	@XmlElement(name="targets")
	public String[] getTargets(){
		return targets;
	}
	
	
}
