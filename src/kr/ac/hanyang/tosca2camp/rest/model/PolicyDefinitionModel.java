package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;

public class PolicyDefinitionModel {
	
	private String name;
	private String type;
	private String description;
	private List<PropertyAssignmentModel> properties;
	private String[] targets;
	
	
	private PolicyDefinitionModel(){ }
	
	public static PolicyDefinitionModel of(){
		return new PolicyDefinitionModel();
	}
	
	public PolicyDefinitionModel name(String name){	this.name = name; 	return this; 	}
	public PolicyDefinitionModel typeName(String name){	this.type = name; 	return this; 	}
	public PolicyDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public PolicyDefinitionModel properties(List<PropertyAssignmentModel> properties){	this.properties = properties; 	return this; 	}
	public PolicyDefinitionModel targets(String[] targets){	this.targets = targets; 	return this; 	}
	
	@XmlElement(name="name")
	public String getName(){
		return name;
	}
	
	@XmlElement(name="type")
	public String getType(){
		return type;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="properties")
	public List<PropertyAssignmentModel> getProperties(){
		return properties;
	}
	
	@XmlElement(name="targets")
	public String[] getTargets(){
		return targets;
	}
	
}
