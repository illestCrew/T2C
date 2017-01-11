package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class NodeTemplateModel {
	
	private String name;
	private String type;
	private String description;
	private String directives;
	private List<PropertyModel> properties;
	private List<AttributeAssignmentModel> attributes;
	private List<RequirementAssignmentModel> requirements;
	private List<CapabilityAssignmentModel> capabilities;
	private List<InterfaceDefinitionModel> interfaces;
	private List<ArtifactTypeModel> artifacts;
	
	
	private NodeTemplateModel(){ }
	
	public static NodeTemplateModel of(){
		return new NodeTemplateModel();
	}
	
	public NodeTemplateModel name(String name){	this.name = name; 	return this; 	}
	public NodeTemplateModel typeName(String name){	this.type = name; 	return this; 	}
	public NodeTemplateModel derived_from(String derived_from){	this.directives = derived_from; 	return this; 	}
	public NodeTemplateModel description(String description){	this.description = description; 	return this; 	}
	public NodeTemplateModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	public NodeTemplateModel attributes(List<AttributeAssignmentModel> attributes){	this.attributes = attributes; 	return this; 	}
	public NodeTemplateModel requirements(List<RequirementAssignmentModel> requirements){	this.requirements = requirements; 	return this; 	}
	public NodeTemplateModel capabilities(List<CapabilityAssignmentModel> capabilities){	this.capabilities = capabilities; 	return this; 	}
	public NodeTemplateModel interfaces(List<InterfaceDefinitionModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
	public NodeTemplateModel artifacts(List<ArtifactTypeModel> artifacts){	this.artifacts = artifacts; 	return this; 	}
	
	@XmlElement(name="name")
	public String getName(){
		return name;
	}
	
	@XmlElement(name="type")
	public String getType(){
		return type;
	}
	
	@XmlElement(name="directives")
	public String getDirectives(){
		return directives;
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
	public List<AttributeAssignmentModel> getAttributes(){
		return attributes;
	}
	
	@XmlElement(name="requirements")
	public List<RequirementAssignmentModel> getRequirements(){
		return requirements;
	}
	
	@XmlElement(name="capabilities")
	public List<CapabilityAssignmentModel> getCapabilities(){
		return capabilities;
	}
	
	@XmlElement(name="interfaces")
	public List<InterfaceDefinitionModel> getInterfaces(){
		return interfaces;
	}
	
	@XmlElement(name="artifacts")
	public List<ArtifactTypeModel> getArtifacts(){
		return artifacts;
	}
		
}
