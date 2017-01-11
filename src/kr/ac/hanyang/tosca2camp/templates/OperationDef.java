package kr.ac.hanyang.tosca2camp.templates;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;

public class OperationDef implements Cloneable{

	private String name;
	private String description; // description are treated as their own type but for now they will be string
	private ImplementationArtifact implementation; 
	private List<PropertyDef> inputs; //TODO define the property definitions or property assignments
	

	public static class Builder {
		private String name;
		private String description; // description are treated as their own type but for now they will be string
		private ImplementationArtifact implementation; 
		private List<PropertyDef> inputs; //TODO define the property definitions or property assignments
		
		public Builder(String name){
			this.name = name;
			this.inputs = new ArrayList<PropertyDef>();
			
		}
		
		public Builder description(String description){
			this.description = description;
			return this;
		}
		
		public Builder implementation(ImplementationArtifact implementation){
			this.implementation = implementation;
			return this;
		}
		
		public Builder inputs(List<PropertyDef> inputs){
			this.inputs = inputs;
			return this;
		}
		
		public Builder input(PropertyDef input){
			this.inputs.add(input);
			return this;
		}
		
		public OperationDef build(){
			return new OperationDef(this);
		}
	}
	
	private OperationDef(Builder builder){
		this.name = builder.name;
		this.description = builder.description;
		this.implementation = builder.implementation;
		this.inputs = builder.inputs;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder(this.name);
		builder.description = this.description;
		builder.implementation = this.implementation;
		builder.inputs = this.inputs;
		return builder;
	}
	
	public OperationDef clone(){
		try {
			OperationDef toReturn = (OperationDef) super.clone();
			if(name != null) toReturn.name = new String(name);
			if(description != null) toReturn.description = new String(description);
			if(implementation != null) toReturn.implementation = implementation.clone();
			toReturn.inputs = new ArrayList<PropertyDef>();
			for(PropertyDef input: inputs)
				toReturn.inputs.add(input);
			return toReturn;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public String getName(){return this.name;}	
	public String getDescription() {return description;}
	public ImplementationArtifact getImplementation() {	return implementation;}
	public List<PropertyDef> getInputs() {return inputs;}

	public void addImplementation(ImplementationArtifact implementation){
		this.implementation = implementation;
	}
	
	public void addInput(PropertyDef property){
		inputs.add(property);
	}
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (name != null) builder.appendToString("\n"+padding+"name: "+name);
										if (description != null) builder.appendToString("\n"+padding+"description: "+description);
										if (implementation != null) builder.appendToString("\n"+padding+"implementation: "+implementation);
										builder.append("\n"+padding+"inputs: ");
										for(PropertyDef input: inputs){
											input.setTabNum(tabNum+1);
											builder.appendToString(padding+input.toString());
										}
										
		return builder.toString();
	}
	
}
