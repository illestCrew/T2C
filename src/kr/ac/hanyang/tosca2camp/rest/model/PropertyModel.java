package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class PropertyModel {
	
	private String name;
	private String type;
	private String description;
	private boolean required;
	private DataModel defaultValue;
	private String status;
	private List<ConstraintModel> constraints;
	private String entry_schema;
	
	private DataModel value;
	
	private PropertyModel(){ }
	
	public static PropertyModel of(){
		return new PropertyModel();
	}
	
	public PropertyModel name(String name){	this.name = name; 	return this; 	}
	public PropertyModel type(String type){	this.type = type; 	return this; 	}
	public PropertyModel description(String description){	this.description = description; 	return this; 	}
	public PropertyModel required(boolean required){	this.required = required; 	return this; 	}
	public PropertyModel defaultValue(DataModel defaultValue){	this.defaultValue = defaultValue; 	return this; 	}
	public PropertyModel status(String status){	this.status = status; 	return this; 	}
	public PropertyModel constraints(List<ConstraintModel> constraints){	this.constraints = constraints; 	return this; 	}
	public PropertyModel requirements(String entry_schema){	this.entry_schema = entry_schema; 	return this; 	}
	public PropertyModel value(DataModel value){	this.value = value; 	return this; 	}
	
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
	
	@XmlElement(name="required")
	public boolean getRequired(){
		return required;
	}
	
	@XmlElement(name="defaultValue")
	public DataModel getDataValue(){
		return defaultValue;
	}
	
	@XmlElement(name="status")
	public String getStatus(){
		return status;
	}
	
	@XmlElement(name="constraints")
	public List<ConstraintModel> getConstraint(){
		return constraints;
	}
	
	@XmlElement(name="entry_schema")
	public String getEntrySchema(){
		return entry_schema;
	}
	
	@XmlElement(name="value")
	public DataModel getValue(){
		return value;
	}
	
}

