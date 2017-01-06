package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.templates.OperationDef;

public class InterfaceDef implements Cloneable{

	private String name;
	private String type;
	private String derived_from;
	private DataTypeDef version;
	private String description;
	private List<PropertyDef> inputs; //TODO define the property definitions or property assignments
	private List<OperationDef> operations;

	public static class Builder{
		private String name;
		private String type;
		private String derived_from;
		private DataTypeDef version;
		private String description;
		private List<PropertyDef> inputs;// = new ArrayList<PropertyDef>(); //TODO define the property definitions or property assignments
		private List<OperationDef> operations;// = new ArrayList<OperationDef>();
		
		
		public Builder(){
			this.inputs = new ArrayList<PropertyDef>(); 
			this.operations = new ArrayList<OperationDef>();
		}
		
		public Builder(String name){
			this();
			this.name = name;
			
		}
		
		public Builder name(String name){
			this.name = name;
			return this;
		}
		
		public Builder type(String type){
			this.type = type;
			return this;
		}
		
		public Builder derived_from(String derived_from){
			this.derived_from = derived_from;
			return this;
		}
		
		public Builder version(DataTypeDef version){
			this.version = version;
			return this;
		}
		
		public Builder description(String description){
			this.description = description;
			return this;
		}
		
		public Builder addInput(PropertyDef input){
			this.inputs.add(input);
			return this;
		}
		
		public Builder addOperation(OperationDef ops){
			this.operations.add(ops);
			return this;
		}
		
		public InterfaceDef build(){
			return new InterfaceDef(this);
		}
	}
	
	
	public Object clone(){
		try{
			InterfaceDef toReturn = (InterfaceDef) super.clone();
			if(derived_from != null) toReturn.derived_from = new String(derived_from);
			if(version != null) toReturn.version = (DataTypeDef) version.clone();
			if(description != null) toReturn.description = new String(description);
			toReturn.inputs = new ArrayList<PropertyDef>();
			for(PropertyDef pDef: inputs)
				toReturn.inputs.add((PropertyDef) pDef.clone());
			toReturn.operations = new ArrayList<OperationDef>();
			for(OperationDef oDef: operations)
				toReturn.operations.add((OperationDef) oDef.clone());
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}		  
	}
	
	private InterfaceDef(Builder builder){
		this.name = builder.name;
		this.type = builder.type;
		this.derived_from = builder.derived_from;
		this.version = builder.version;
		this.description = builder.description;
		this.inputs = builder.inputs;
		this.operations = builder.operations;
	}
	
	public Builder getBuilder(){
		Builder builder = new Builder(name);
		builder.name = this.name;
		builder.type = this.type;
		builder.derived_from = this.derived_from;
		builder.version = this.version;
		builder.description = this.description;
		builder.inputs = this.inputs;
		builder.operations = this.operations;
		return builder;
	}
	
	public String getName(){return name;}
	public String getType(){return type;}
	
	public String getDerived_from() {return derived_from;}

	public String getDescription() {return description;}

	public List<PropertyDef> getInputs() {return inputs;}
	
	public List<OperationDef> getOperations(){return operations;}
	
	public OperationDef getOperation(String operationName){
		for(OperationDef operation: operations){
			if (operation.getName().equals(operationName))
				return operation;
		}
		return null;
	}
	
	public void setInputValue(String name, DataTypeDef value){
		PropertyDef toSet = inputs.get(inputs.indexOf(name));
		toSet.setPropertyValue(value);
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
										if (type != null) builder.appendToString("\n"+padding+"type: "+type);
										if (derived_from != null) builder.appendToString("\n"+padding+"derived_from: "+derived_from);
										if (version != null) builder.appendToString("\n"+padding+"version: "+version);
										if (description != null) builder.appendToString("\n"+padding+"description: "+description);
										builder.append("\n"+padding+"inputs: ");
										for(PropertyDef input: inputs){
											input.setTabNum(tabNum+1);
											builder.appendToString(padding+input.toString());
										}
										builder.append("\n"+padding+"operations: ");
										for(OperationDef operation: operations){
											operation.setTabNum(tabNum+1);
											builder.appendToString(padding+operation.toString());
										}
		return builder.toString();
	}
	
}
