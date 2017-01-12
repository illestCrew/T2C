package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @model kind="class"
 */

public class ConstraintModel {
	private String operator;
	private DataModel value;
	
	private ConstraintModel(){ }
	
	public static ConstraintModel of(){
		return new ConstraintModel();
	}
	
	public ConstraintModel operator(String operator){	this.operator = operator; 	return this; 	}
	public ConstraintModel defaultValue(DataModel value){	this.value = value; 	return this; 	}

	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName(){
		return operator;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="value")
	public DataModel getValue(){
		return value;
	}
}

