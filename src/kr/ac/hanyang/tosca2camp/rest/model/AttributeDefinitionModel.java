package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class AttributeDefinitionModel {
	
	private String name;
	private String type;
	private String description;
	private DataModel defaultValue;
	private String status;
	
	
	private AttributeDefinitionModel(){ }
	
	public static AttributeDefinitionModel of(){
		return new AttributeDefinitionModel();
	}
	
	public AttributeDefinitionModel name(String name){	this.name = name; 	return this; 	}
	public AttributeDefinitionModel type(String type){	this.type = type; 	return this; 	}
	public AttributeDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public AttributeDefinitionModel defaultValue(DataModel defaultValue){	this.defaultValue = defaultValue; 	return this; 	}
	public AttributeDefinitionModel properties(String status){	this.status = status; 	return this; 	}

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
	
	@XmlElement(name="defaultValue")
	public DataModel getDataValue(){
		return defaultValue;
	}
	
	@XmlElement(name="status")
	public String getStatus(){
		return status;
	}

	
}

