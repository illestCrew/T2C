package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class InterfaceTypeModel {
	
	private String typeName;
	private String derived_from;
	private VersionModel version;
	private String description;
	private List<PropertyModel> inputs;
	private List<OperationDefinitionModel> operations;
	
	
	private InterfaceTypeModel(){ }
	
	public static InterfaceTypeModel of(){
		return new InterfaceTypeModel();
	}
	
	public InterfaceTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
	public InterfaceTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public InterfaceTypeModel version(VersionModel version){	this.version = version; 	return this; 	}
	public InterfaceTypeModel description(String description){	this.description = description; 	return this; 	}
	public InterfaceTypeModel inputs(List<PropertyModel> properties){	this.inputs = properties; 	return this; 	}
	public InterfaceTypeModel operations(List<OperationDefinitionModel> operations){	this.operations = operations; 	return this; 	}
	
	@XmlElement(name="typeName")
	public String getTypeName(){
		return typeName;
	}
	
	@XmlElement(name="derived_from")
	public String getDerivedFrom(){
		return derived_from;
	}
	
	@XmlElement(name="version")
	public VersionModel getVersion(){
		return version;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="inputs")
	public List<PropertyModel> getInputs(){
		return inputs;
	}
	
	@XmlElement(name="operations")
	public List<OperationDefinitionModel> getOperations(){
		return operations;
	}
	
}
