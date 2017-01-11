package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class CapabilityDefinitionModel {
	
	
	private String typeName;
	private String derived_from;
	private VersionModel version;
	private String description;
	private List<PropertyModel> properties;
	private List<AttributeDefinitionModel> attributes;
	private String[] valid_sources;
	
	
	private CapabilityDefinitionModel(){ }
	
	public static CapabilityDefinitionModel of(){
		return new CapabilityDefinitionModel();
	}
	
	public CapabilityDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
	public CapabilityDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public CapabilityDefinitionModel version(VersionModel version){	this.version = version; 	return this; 	}
	public CapabilityDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public CapabilityDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	public CapabilityDefinitionModel attributes(List<AttributeDefinitionModel> attributes){	this.attributes = attributes; 	return this; 	}
	public CapabilityDefinitionModel validSources(String[] valid_sources){	this.valid_sources = valid_sources; 	return this; 	}
	
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
	
	@XmlElement(name="attributes")
	public List<AttributeDefinitionModel> getAttributes(){
		return attributes;
	}
	
	@XmlElement(name="valid_sources")
	public String[] getValidSources(){
		return valid_sources;
	}
	
}
