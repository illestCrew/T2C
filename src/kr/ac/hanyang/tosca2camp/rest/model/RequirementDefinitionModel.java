package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
/**
 * @model kind="class"
 */
public class RequirementDefinitionModel {
	
	private String capability;
	private String node;
	private String relationship_type_name;
	private RelationshipDefinitionModel relationship_definition;
	//private List<PropertyDefinitionModel> node_filter;

	
	
	private RequirementDefinitionModel(){ }
	
	public static RequirementDefinitionModel of(){
		return new RequirementDefinitionModel();
	}
	
	public RequirementDefinitionModel capability(String name){	this.capability = name; 	return this; 	}
	public RequirementDefinitionModel node(String derived_from){	this.node = derived_from; 	return this; 	}
	public RequirementDefinitionModel relationship_type_name(String relationship_type_name){	this.relationship_type_name = relationship_type_name; 	return this; 	}
	public RequirementDefinitionModel relationship_definition(RelationshipDefinitionModel relationship_definition){	this.relationship_definition = relationship_definition; 	return this; 	}
	//public RequirementAssignmentModel properties(List<PropertyDefinitionModel> properties){	this.properties = properties; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="capability")
	public String getCapability(){
		return capability;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="node")
	public String getNode(){
		return node;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="relationship_type_name")
	public String getRelationship_type(){
		return relationship_type_name;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="relationship_definition")
	public RelationshipDefinitionModel getRelationship_definition(){
		return relationship_definition;
	}
	
//	@XmlElement(name="properties")
//	public List<PropertyDefinitionModel> getProperties(){
//		return properties;
//	}
//	
}

