package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class RelationshipDefinitionModel {
	
	
	private String typeName;
	private String derived_from;
	private VersionModel version;
	private String description;
	private List<PropertyModel> properties;
	private List<AttributeDefinitionModel> attributes;
	private List<InterfaceTypeModel> interfaces;
	private String[] valid_target_types;
	
	
	private RelationshipDefinitionModel(){ }
	
	public static RelationshipDefinitionModel of(){
		return new RelationshipDefinitionModel();
	}
	
	public RelationshipDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
	public RelationshipDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public RelationshipDefinitionModel version(VersionModel version){	this.version = version; 	return this; 	}
	public RelationshipDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public RelationshipDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	public RelationshipDefinitionModel attributes(List<AttributeDefinitionModel> attributes){	this.attributes = attributes; 	return this; 	}
	public RelationshipDefinitionModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
	public RelationshipDefinitionModel validTargetTypes(String[] valid_target_types){	this.valid_target_types = valid_target_types; 	return this; 	}
	
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
	
	@XmlElement(name="interfaces")
	public List<InterfaceTypeModel> getInterfaces(){
		return interfaces;
	}

	@XmlElement(name="valid_target_types")
	public String[] getValidTargetTypes(){
		return valid_target_types;
	}
}
