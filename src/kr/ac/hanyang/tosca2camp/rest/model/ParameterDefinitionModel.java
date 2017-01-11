package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class ParameterDefinitionModel {
	
	private String name;
	private String type;
	private String description;
	private boolean required;
	private DataModel defaultValue;
	private DataModel value;
	private String status;
	private List<ConstraintModel> constraints;
	private String entry_schema;
	
	
	private ParameterDefinitionModel(){ }
	
	public static ParameterDefinitionModel of(){
		return new ParameterDefinitionModel();
	}
	
	public ParameterDefinitionModel name(String name){	this.name = name; 	return this; 	}
	public ParameterDefinitionModel type(String type){	this.type = type; 	return this; 	}
	public ParameterDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public ParameterDefinitionModel required(boolean required){	this.required = required; 	return this; 	}
	public ParameterDefinitionModel defaultValue(DataModel defaultValue){	this.defaultValue = defaultValue; 	return this; 	}
	public ParameterDefinitionModel value(DataModel value){	this.value = value; 	return this; 	}
	public ParameterDefinitionModel properties(String status){	this.status = status; 	return this; 	}
	public ParameterDefinitionModel attributes(List<ConstraintModel> constraints){	this.constraints = constraints; 	return this; 	}
	public ParameterDefinitionModel requirements(String entry_schema){	this.entry_schema = entry_schema; 	return this; 	}
	
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
	
	@XmlElement(name="value")
	public DataModel getValue(){
		return value;
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
	
}

