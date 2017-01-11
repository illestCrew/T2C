package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class OperationDefinitionModel {
	
	private String description;
	private String implementation;
	private List<PropertyModel> inputs_prop_definitions;
	private List<PropertyAssignmentModel> inputs_prop_assignments;
	
	private OperationDefinitionModel(){ }
	
	public static OperationDefinitionModel of(){
		return new OperationDefinitionModel();
	}
	
	public OperationDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public OperationDefinitionModel implementation(String implementation){	this.implementation = implementation; 	return this; 	}
	public OperationDefinitionModel inputs_prop_definitions(List<PropertyModel> inputs_prop_definitions){	this.inputs_prop_definitions = inputs_prop_definitions; 	return this; 	}
	public OperationDefinitionModel inputs_prop_assignments(List<PropertyAssignmentModel> inputs_prop_assignments){	this.inputs_prop_assignments = inputs_prop_assignments; 	return this; 	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="implementation")
	public String getImplementation(){
		return implementation;
	}
	
	@XmlElement(name="inputs_prop_definitions")
	public List<PropertyModel> getInputs_definitions(){
		return inputs_prop_definitions;
	}
	
	@XmlElement(name="inputs_prop_assignments")
	public List<PropertyAssignmentModel> getInputs_assignments(){
		return inputs_prop_assignments;
	}
	
	
}

