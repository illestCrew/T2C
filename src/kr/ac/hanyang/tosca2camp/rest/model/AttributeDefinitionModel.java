package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
/**
 * @model kind="class"
 */

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
	@XmlElement(name="type")
	public String getType(){
		return type;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="defaultValue")
	public DataModel getDataValue(){
		return defaultValue;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="status")
	public String getStatus(){
		return status;
	}

	
}

