package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * @model kind="class"
 */

public class CapabilityAssignmentModel {
	
	private String name;
	private List<PropertyAssignmentModel> properties;
	private List<AttributeAssignmentModel> attributes;
	
	
	private CapabilityAssignmentModel(){ }
	
	public static CapabilityAssignmentModel of(){
		return new CapabilityAssignmentModel();
	}
	
	public CapabilityAssignmentModel name(String name){	this.name = name; 	return this; 	}
	public CapabilityAssignmentModel properties(List<PropertyAssignmentModel> properties){	this.properties = properties; 	return this; 	}
	public CapabilityAssignmentModel attributes(List<AttributeAssignmentModel> attributes){	this.attributes = attributes; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName(){
		return name;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public List<PropertyAssignmentModel> getProperties(){
		return properties;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="attributes")
	public List<AttributeAssignmentModel> getAttributes(){
		return attributes;
	}
	
	
}
