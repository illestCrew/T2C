package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Kena Alexander
 * @since 
 */

public class ConstraintDef implements Cloneable{

	private String operator; //this represents the type
	private DataTypeDef value; 
	private List<String> valueType;
	
	
	public static class Builder{
		private String operator;
		private DataTypeDef value;
		private List<String> valueType;
		
		public Builder(String operator){
			this.operator = operator;
			valueType = new ArrayList<String>();
		}
		public Builder(){
			valueType = new ArrayList<String>();
		}
		
		public Builder operator(String operator){
			this.operator = operator;
			return this;
		}
		
		public Builder value(DataTypeDef value){
			this.value = value;
			return this;
		}
		
		public Builder valueTypes(List<String> valueType){
			this.valueType = valueType;
			return this;
		}
		
		public Builder valueType(String valueType){
			this.valueType.add(valueType);
			return this;
		}
		
		public ConstraintDef build(){
			return new ConstraintDef(this);
		}
	}
	
	private ConstraintDef(Builder builder){
		this.operator = builder.operator;
		this.value = builder.value;
		this.valueType = builder.valueType;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.operator = this.operator;
		builder.value = this.value;
		builder.valueType = this.valueType;
		return builder;
	}
	
	public Object clone(){
		try{
			ConstraintDef toReturn = (ConstraintDef) super.clone();
			toReturn.operator = new String(operator);
			toReturn.value = (DataTypeDef) value.clone(); //TODO this should clone
			toReturn.valueType = new ArrayList<String>();
			for (String item: valueType)
				toReturn.valueType.add(item);
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
		
	
	public String getOperator(){return operator;}
	
	public DataTypeDef getValue(){return value;}
	
	
private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (operator != null) builder.appendToString("\n"+padding+operator+": "+value);
										
		return builder.toString();
	}

		
}
