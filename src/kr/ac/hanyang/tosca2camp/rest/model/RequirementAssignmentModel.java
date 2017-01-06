package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;

public class RequirementAssignmentModel {
	
	
	private String capability;
	private String node;
	private String relationship;
	//private List<PropertyDefinitionModel> node_filter;

	
	
	private RequirementAssignmentModel(){ }
	
	public static RequirementAssignmentModel of(){
		return new RequirementAssignmentModel();
	}
	
	public RequirementAssignmentModel capability(String name){	this.capability = name; 	return this; 	}
	public RequirementAssignmentModel node(String derived_from){	this.node = derived_from; 	return this; 	}
	public RequirementAssignmentModel relationship(String description){	this.relationship = description; 	return this; 	}
	//public RequirementAssignmentModel properties(List<PropertyDefinitionModel> properties){	this.properties = properties; 	return this; 	}
	
	@XmlElement(name="capability")
	public String getCapability(){
		return capability;
	}
	
	@XmlElement(name="node")
	public String getNode(){
		return node;
	}
	
	@XmlElement(name="relationship")
	public String getRelationship(){
		return relationship;
	}
	
//	@XmlElement(name="properties")
//	public List<PropertyDefinitionModel> getProperties(){
//		return properties;
//	}
//	
	
}

