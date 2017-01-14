package kr.ac.hanyang.tosca2camp.templates;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef.Builder;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;

public class Function implements Cloneable{
	private String typeName;
	private ArrayList<PropertyDef> parameters;
	
	//-------------------------------------------------------------------------------
//	public Object resolve(){
//		Map<String, Object> toReturn = new LinkedHashMap<String, Object>();
//		for (PropertyDef property: parameters){
//			toReturn.put(property.getName(),property.resolve());
//		}
//		return toReturn;
//	}
	//-------------------------------------------------------------------------------
	
	public static class Builder {
		private String typeName; 
		private ArrayList<PropertyDef> parameters;
		
		public Builder(){ 
			parameters = new ArrayList<PropertyDef>();
		}
		
		public Builder typeName(String typeName){
			this.typeName = typeName;
			return this;
		}
		
		public Builder parameters(ArrayList<PropertyDef> parameters){
			this.parameters = parameters;
			return  this;
		}
		
		public Builder parameter(PropertyDef parameter){
			this.parameters.add(parameter);
			return this;
		}
		
		public Function build(){
			return new Function(this);
		}
	}
	
	private Function(Builder builder){
		this.typeName = builder.typeName;
		this.parameters = builder.parameters;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.typeName = this.typeName;
		builder.parameters = this.parameters;
		return builder;
	}
	
	@SuppressWarnings("unchecked")
	public Object clone(){
		try{
			Function toReturn = (Function) super.clone();
			toReturn.typeName = new String(typeName);
			toReturn.parameters = (ArrayList<PropertyDef>) this.parameters.clone();
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	public String getName(){
		return this.typeName;
	}
	
	//adds or overwrites
	public void addParameter(PropertyDef property){
		this.parameters.remove(property);
		this.parameters.add(property);
	}
	
	public PropertyDef getParameter(String paramName){
		for(PropertyDef parameter: parameters)
			if (parameter.getName().equals(paramName))
				return parameter;
		return null;
	}
	
	public List<PropertyDef> getParameters(){
		return parameters;
	}
	

	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (typeName != null) builder.appendToString("\n"+padding+typeName);
										builder.appendToString(parameters.toString());
										
		return builder.toString();
	}

}
