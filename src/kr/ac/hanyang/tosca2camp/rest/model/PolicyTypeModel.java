package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
/**
 * @model kind="class"
 */
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
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName(){
		return typeName;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="derived_from")
	public String getDerivedFrom(){
		return derived_from;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="version")
	public VersionModel getVersion(){
		return version;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public List<PropertyModel> getProperties(){
		return properties;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="targets")
	public String[] getTargets(){
		return targets;
	}
	
	
}
