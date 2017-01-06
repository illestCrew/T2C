package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class TopologyTemplateModel {

	private String description;
	private List<ParameterDefinitionModel> inputs;
	private List<NodeTemplateModel> node_templates;
	private List<RelationshipTemplateModel> relationship_templates;
	private List<GroupDefinitionModel> groups;
	private List<PolicyDefinitionModel> policies;
	private List<ParameterDefinitionModel> outputs;
	//private List<ArtifactDefinitionModel> artifacts;
	
	
	private TopologyTemplateModel(){ }
	
	public static TopologyTemplateModel of(){
		return new TopologyTemplateModel();
	}
	public TopologyTemplateModel description(String description){	this.description = description; 	return this; 	}
	public TopologyTemplateModel inputs(List<ParameterDefinitionModel> inputs){	this.inputs = inputs; 	return this; 	}
	public TopologyTemplateModel nodeTemplates(List<NodeTemplateModel> node_templates){	this.node_templates = node_templates; 	return this; 	}
	public TopologyTemplateModel relationshipTemplates(List<RelationshipTemplateModel> relationship_templates){	this.relationship_templates = relationship_templates; 	return this; 	}
	public TopologyTemplateModel groups(List<GroupDefinitionModel> groups){	this.groups = groups; 	return this; 	}
	public TopologyTemplateModel policies(List<PolicyDefinitionModel> policies){	this.policies = policies; 	return this; 	}
	public TopologyTemplateModel outputs(List<ParameterDefinitionModel> outputs){	this.outputs = outputs; 	return this; 	}
	

	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="inputs")
	public List<ParameterDefinitionModel> getInputs(){
		return inputs;
	}
	
	@XmlElement(name="node_templates")
	public List<NodeTemplateModel> getNodeTemplates(){
		return node_templates;
	}
	
	@XmlElement(name="relationship_templates")
	public List<RelationshipTemplateModel> getRelationshipTemplates(){
		return relationship_templates;
	}
	
	@XmlElement(name="groups")
	public List<GroupDefinitionModel> getGroups(){
		return groups;
	}
	
	@XmlElement(name="policies")
	public List<PolicyDefinitionModel> getPolicies(){
		return policies;
	}
	
	@XmlElement(name="outputs")
	public List<ParameterDefinitionModel> getOutputs(){
		return outputs;
	}
}
