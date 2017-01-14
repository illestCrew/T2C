package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.Utilities;
import kr.ac.hanyang.tosca2camp.templates.DataType;
import kr.ac.hanyang.tosca2camp.templates.Function;

import java.util.Iterator;

/**
 * @author Kena Alexander
 * @since 
 */

public class DataTypeDef implements Cloneable{

	private String typeName;
	private String derived_from;
	private String description; // description are treated as their own type but for now they will be string
	private List<ConstraintDef> constraints; 
	private DataTypeDef version;
	
	/**
	 * the  value of the datatype may be held in any of these variables. 
	 * 1. the Datatype may be a complex type therefore the information is stored in its properties
	 * 2. the Datatype may be a primitive type resulting in the information being stored as a primitive value
	 * 3. the Datatype may be expressed as a function. Here the value must be determined by evaluating the function.
	 */
	private Map<String, PropertyDef> properties;
	private Object primitiveValue;
	private Function function; 
	private DataType storedData;
	
	//-------------------------------------------------------------------------------
//	public Object resolve(){
//		switch (storedData){
//		case COMPLEX: 
//			List<PropertyDef> props = new ArrayList<PropertyDef>();
//			for(PropertyDef property: properties.values()){
//				props.add((PropertyDef) property.resolve());
//			}
//			return null;
//		case FUNCTION: 
//			return function.resolve();
//		case VALUE:
//			return primitiveValue;
//		}
//		return null;
//	}
	//-------------------------------------------------------------------------------
	
	public static class Builder{
		private String typeName;
		private String derived_from;
		private String description; // description are treated as their own type but for now they will be string
		private List<ConstraintDef> constraints = new ArrayList<ConstraintDef>();
		private DataTypeDef version;
		private Map<String, PropertyDef> properties = new LinkedHashMap<String, PropertyDef>(); 
		private Object primitiveValue;
		private Function function; 
		private DataType storedData;	
		
		public Builder(){ }
		
		public Builder (String typeName){
			this.typeName = typeName;
			//return this;
		}
		
		public Builder typeName(String typeName){
			this.typeName = typeName;
			return this;
		}
		
		public Builder derived_from(String derived_from){
			this.derived_from = derived_from;
			return this;
		}
		
		public Builder description(String description){
			this.description = description;
			return this;
		}
		
		public Builder addConstraint(ConstraintDef constraint){
			this.constraints.add(constraint);
			return this;
		}
		
		public Builder addProperty(PropertyDef property){
			this.properties.put(property.getName(),property);
			return  this;
		}
		
		public Builder primitiveValue(Object value){
			this.primitiveValue = value;
			return this;
		}
		
		public Builder function(Function function){
			this.function = function;
			return this;
		}
		
		public Builder version(DataTypeDef version){
			this.version = version;
			return this;
		}
		
		public Builder dataStored(DataType dataStored){
			this.storedData = dataStored;
			return this;
		}
		
		public DataTypeDef peek(){
			return new DataTypeDef(this);
		}
		
		
		
		public DataTypeDef build(){
			return new DataTypeDef(this);
		}
		
		
	}
	
	protected DataTypeDef(Builder builder){
		this.typeName = builder.typeName;
		this.derived_from = builder.derived_from;
		this.description = builder.description;
		this.constraints = builder.constraints;
		this.properties = builder.properties;
		this.primitiveValue = builder.primitiveValue;
		this.function = builder.function;
		this.version = builder.version;
		this.storedData = builder.storedData;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.typeName = this.typeName;
		builder.derived_from = this.derived_from;
		builder.description = this.description;
		builder.constraints = this.constraints;
		builder.properties = this.properties;
		builder.primitiveValue = this.primitiveValue;
		builder.function = this.function;
		builder.version = this.version;
		builder.storedData = this.storedData;
		return builder;
	}
	
	public Object clone(){
		try{
			DataTypeDef toReturn = (DataTypeDef) super.clone();
			if (toReturn.derived_from != null) toReturn.derived_from = new String(derived_from);
			toReturn.constraints = new ArrayList<ConstraintDef>();
			for( ConstraintDef constraint:constraints){
				toReturn.constraints.add((ConstraintDef) constraint.clone()); //make sure to create a copy
			}
			toReturn.properties = new LinkedHashMap<String, PropertyDef>();
			for(String pDefName:properties.keySet()){
				PropertyDef pDef = properties.get(pDefName);
				toReturn.properties.put(pDefName,  (PropertyDef)pDef.clone()); //make sure pDef can create a copy
			}
			if (primitiveValue != null)toReturn.primitiveValue = Utilities.clonePrimitive(this.primitiveValue);
			if (function != null)toReturn.function = (Function) function.clone();
			if (version != null)toReturn.version = (DataTypeDef) version.clone();
			toReturn.storedData = storedData;
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	public String getTypeName(){return typeName;}
	public String getDerived_from(){return derived_from;}
	public String getDescription(){return description;}
	public List<ConstraintDef> getConstraints(){return constraints;}
	public Map<String, PropertyDef>  getProperties(){return properties;}
	public List<PropertyDef> getPropertiesList(){
		List<PropertyDef> toReturn = new ArrayList<PropertyDef>();
		for(PropertyDef property: properties.values()){
			toReturn.add(property);
		}
		return toReturn;
	}
	
	public PropertyDef getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
	public Function getFunction(){
		return this.function;
	}
	
	public Object getPrimitiveValue(){
		return primitiveValue;
	}
	
	public DataType getTypeStored(){
		return storedData;
	}
	
	public Object getValueStored(){
		switch(storedData){
		case COMPLEX: 
			List<PropertyDef> props = new ArrayList<PropertyDef>();
			for(PropertyDef property: properties.values())
				props.add(property);
			return props;
		case FUNCTION: 
			return function;
		case VALUE: 
			return primitiveValue;
		}
		return null; //FIXME
	}
	
	public void setPropertyValue(String name, Object value){
//		PropertyDef toSet = properties.get(name);
//		toSet.setPropertyValue(value);
	}
	
	public void setValueOrFunction(Object value){
		//evaluate the function here
//		if (Utilities.isFunction(value))
//			function = buildFunction(value);
//		else
			primitiveValue = value;
	}
	
	//set the dataType
	public void setData(Object data){
		Utilities.loadData(data, this);
	}
	
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE)
										.appendToString("\n"+padding+"typeName: "+typeName);
										if (primitiveValue != null)
											builder.append("\n"+padding+"value: "+primitiveValue);
										else{
											builder.appendToString("\n"+padding+"properties: ");
											for(PropertyDef property: properties.values()){
												property.setTabNum(tabNum+1);
												builder.appendToString(property.toString());
											}
										}
		return builder.toString();
	}
	
}
