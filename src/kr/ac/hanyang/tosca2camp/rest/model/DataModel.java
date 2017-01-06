package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;

public class DataModel {
	
	
	private Object value;
	
	
	private DataModel(){ }
	
	public static DataModel of(){
		return new DataModel();
	}
	
	public DataModel value(Object value){	this.value = value; 	return this; 	}

	
	
	@XmlElement(name="value")
	public Object getValue(){
		return value;
	}
	
	
	
}
