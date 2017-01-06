package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class AttributeAssignmentModel {
	
	private String name;
	private String description;
	private DataModel value;
	
	private AttributeAssignmentModel(){ }
	
	public static AttributeAssignmentModel of(){
		return new AttributeAssignmentModel();
	}
	
	public AttributeAssignmentModel name(String name){	this.name = name; 	return this; 	}
	public AttributeAssignmentModel description(String description){	this.description = description; 	return this; 	}
	public AttributeAssignmentModel defaultValue(DataModel value){	this.value = value; 	return this; 	}

	@XmlElement(name="name")
	public String getName(){
		return name;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="value")
	public DataModel getValue(){
		return value;
	}
	
}

