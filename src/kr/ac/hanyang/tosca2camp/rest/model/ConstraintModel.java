package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;

public class ConstraintModel {
	private String operator;
	private DataModel value;
	
	private ConstraintModel(){ }
	
	public static ConstraintModel of(){
		return new ConstraintModel();
	}
	
	public ConstraintModel operator(String operator){	this.operator = operator; 	return this; 	}
	public ConstraintModel defaultValue(DataModel value){	this.value = value; 	return this; 	}

	@XmlElement(name="name")
	public String getName(){
		return operator;
	}
	
	@XmlElement(name="value")
	public DataModel getValue(){
		return value;
	}
}

