package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class NodeDefinitionModel {
	
	
	private String typeName;
	private String derived_from;
	private VersionModel version;
	private String description;
	private List<PropertyModel> properties;
	private List<AttributeDefinitionModel> attributes;
	private List<RequirementDefinitionModel> requirements;
	private List<CapabilityDefinitionModel> capabilities;
	private List<InterfaceTypeModel> interfaces;
	private List<ArtifactTypeModel> artifacts;
	
	
	private NodeDefinitionModel(){ }
	
	public static NodeDefinitionModel of(){
		return new NodeDefinitionModel();
	}
	
	public NodeDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
	public NodeDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public NodeDefinitionModel version(VersionModel version){	this.version = version; 	return this; 	}
	public NodeDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public NodeDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	public NodeDefinitionModel attributes(List<AttributeDefinitionModel> attributes){	this.attributes = attributes; 	return this; 	}
	public NodeDefinitionModel requirements(List<RequirementDefinitionModel> requirements){	this.requirements = requirements; 	return this; 	}
	public NodeDefinitionModel capabilities(List<CapabilityDefinitionModel> capabilities){	this.capabilities = capabilities; 	return this; 	}
	public NodeDefinitionModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
	public NodeDefinitionModel artifacts(List<ArtifactTypeModel> artifacts){	this.artifacts = artifacts; 	return this; 	}
	
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
	
	@XmlElement(name="requirements")
	public List<RequirementDefinitionModel> getRequirements(){
		return requirements;
	}
	
	@XmlElement(name="capabilities")
	public List<CapabilityDefinitionModel> getCapabilities(){
		return capabilities;
	}
	
	@XmlElement(name="interfaces")
	public List<InterfaceTypeModel> getInterfaces(){
		return interfaces;
	}
	
	@XmlElement(name="artifacts")
	public List<ArtifactTypeModel> getArtifacts(){
		return artifacts;
	}
	
}
