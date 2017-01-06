package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;

@Deprecated
public class PropertyAssignmentModel {
	
	private String name;
	private DataModel value;
	
	private PropertyAssignmentModel(){ }
	
	public static PropertyAssignmentModel of(){
		return new PropertyAssignmentModel();
	}
	
	public PropertyAssignmentModel name(String name){	this.name = name; 	return this; 	}
	public PropertyAssignmentModel defaultValue(DataModel value){	this.value = value; 	return this; 	}

	@XmlElement(name="name")
	public String getName(){
		return name;
	}
	
	@XmlElement(name="value")
	public DataModel getValue(){
		return value;
	}
	
}

