package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class InterfaceDefinitionModel {
	

	private List<PropertyModel> inputs;
	
	private InterfaceDefinitionModel(){ }
	
	public static InterfaceDefinitionModel of(){
		return new InterfaceDefinitionModel();
	}
	
	public InterfaceDefinitionModel inputs(List<PropertyModel> inputs){	this.inputs = inputs; 	return this; 	}
	
	
	@XmlElement(name="inputs")
	public List<PropertyModel> getInputs(){
		return inputs;
	}
	
}
