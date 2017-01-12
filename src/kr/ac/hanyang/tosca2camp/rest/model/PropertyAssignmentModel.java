package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
/**
 * @model kind="class"
 */
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
	@XmlElement(name="value")
	public DataModel getValue(){
		return value;
	}
	
}

