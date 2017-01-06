package kr.ac.hanyang.tosca2camp.templates;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef.Builder;

public class PropertyFilter {
	private String propertyName;
	private List<ConstraintDef> constraints;
	
	
	public static class Builder {
		private String propertyName; 
		private List<ConstraintDef> constraints;
		
		//used to builde a type Definition
		public Builder(){ 
			constraints = new ArrayList<ConstraintDef>();
		}
		
		public Builder propertyName(String propertyName){
			this.propertyName = propertyName;
			return this;
		}
		
		public Builder constraints(List<ConstraintDef> constraints){
			this.constraints = constraints;
			return  this;
		}
		
		public Builder constraint(ConstraintDef constraint){
			this.constraints.add(constraint);
			return this;
		}
		
		public PropertyFilter build(){
			return new PropertyFilter(this);
		}
	}
	
	private PropertyFilter(Builder builder){
		this.propertyName = builder.propertyName;
		this.constraints = builder.constraints;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.propertyName = this.propertyName;
		builder.constraints = this.constraints;
		return builder;
	}
	
	public Object clone(){
		try{
			PropertyFilter toReturn = (PropertyFilter) super.clone();
			toReturn.propertyName = new String(propertyName);
			for (ConstraintDef constraint: constraints)
				toReturn.constraints.add(constraint);
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (propertyName != null) builder.appendToString("\n"+padding+"property: "+propertyName);
										for(ConstraintDef constraint: constraints){
											constraint.setTabNum(tabNum+1);
											builder.appendToString(padding+constraint.toString());
										}
		return builder.toString();
	}

}
