package kr.ac.hanyang.tosca2camp.definitiontypes;
/**
 * PropertyDef will server as a parameter also.
 * 
 * 
 */



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.Utilities;
import kr.ac.hanyang.tosca2camp.templates.Function;


public class PropertyDef implements Cloneable{

	private String name;
	private String type;
	private String description; // description are treated as their own type but for now they will be string
	private boolean required;

	private String status;
	private ArrayList<ConstraintDef> constraints; //TODO this type will have to be defined
	private EntrySchemaDef entry_schema; 
	private String deployPath;
	private Object valid;
	
	private DataTypeDef defaultValue;
	private DataTypeDef propertyValue; 
	private Boolean hasValue;
	
	//-------------------------------------------------------------------------------
//	public Object resolve(){
//		Object resolution = propertyValue.resolve();
//		if( resolution != null){
//			//verify the entry schema etc
//			return resolution;
//		}
//		return null;
//			
//	}
	//-------------------------------------------------------------------------------
	
	
	public static class Builder{
		private String name;
		private String type;
		private String description; // description are treated as their own type but for now they will be string
		private boolean required = true;

		private String status;
		private ArrayList<ConstraintDef> constraints = new ArrayList<ConstraintDef>(); //TODO this type will have to be defined
		private EntrySchemaDef entry_schema; 
		
		private DataTypeDef defaultValue;
		private DataTypeDef propertyValue;
		private Boolean hasValue;
		
		public Builder(String name){
			this.name = name;
			//this.type = type;
			//this.defaultVal = "";
			this.hasValue = false;
		}

		public Builder() {	}

		public Builder type(String type){
			this.type = type;
			return this;
		}
		
		public Builder description(String description){
			this.description = description;
			return this;
		}
		
		public Builder required(boolean required){
			this.required = required;
			return this;
		}
		
		
		public Builder propertyValue(DataTypeDef propertyValue){
			this.propertyValue = propertyValue;
			return this;
		}
		
		public Builder defaultValue(DataTypeDef defaultValue){
			this.defaultValue = defaultValue;
			return this;
		}
		
		public Builder status(String status){
			this.status = status;
			return this;
		}
		
		public Builder addConstraint(ConstraintDef constraint){
			this.constraints.add(constraint);
			return this;
		}
		
		public Builder entry_schema(EntrySchemaDef entry_schema){
			this.entry_schema = entry_schema;
			return this;
		}
		
		public Builder hasValue(boolean hasValue){
			this.hasValue = hasValue;
			return this;
		}
		
		public PropertyDef peek(){
			return new PropertyDef(this);
		}
		
		public PropertyDef build(){
			// if the default value is not set then set it here.
			return new PropertyDef(this);
		}
	}
	
	
	private PropertyDef(Builder builder){
		this.name = builder.name;
		this.type = builder.type;
		this.description = builder.description;
		this.required = builder.required;
		this.propertyValue = builder.propertyValue;
		this.defaultValue = builder.defaultValue;
		this.status = builder.status;
		this.constraints = builder.constraints;
		this.entry_schema = builder.entry_schema;
		this.hasValue = builder.hasValue;
	}
	
	public Object clone(){
		try{
			PropertyDef toReturn = (PropertyDef) super.clone();
//			if (propertyValue instanceof DataTypeDef)
//				toReturn.propertyValue = ((DataTypeDef) propertyValue).clone();
//			else
			toReturn.propertyValue =  (DataTypeDef) propertyValue.clone();
			//toReturn.defaultVal = (DataTypeDef) defaultVal.clone(); TODO
			toReturn.constraints = (ArrayList<ConstraintDef>) this.constraints.clone(); //make sure to create a copy
			if(entry_schema != null) toReturn.entry_schema = (EntrySchemaDef) entry_schema.clone();
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder(name);
		builder.type = this.type;
		builder.description = this.description;
		builder.required = this.required;
		builder.defaultValue = this.defaultValue;
		builder.propertyValue = this.propertyValue;
		builder.status = this.status;
		builder.constraints = this.constraints;
		builder.entry_schema = this.entry_schema;
		return builder;
	}
	
	
	
	public String getName(){return name;}	
	public String getType(){return type;}	
	public String getDescription(){return description;}
	public boolean isRequired(){return required;}
	public String getStatus(){return status;}
	public List<ConstraintDef> getConstraints(){return constraints;}
	public EntrySchemaDef getEntrySchema(){return entry_schema;}
	public boolean hasValue() {return hasValue;}
	
	public DataTypeDef getDefaultVal(){return defaultValue;} // fix this
	
	public DataTypeDef getPropertyValue(){
		return propertyValue;
	}
	
	@Deprecated
	public Object getActualValue(){
		return propertyValue.getValueStored();
	}
	
	@Deprecated
	public void setPropertyValue(Object value){		
		Object type = Utilities.isPrimative(value.toString());
		if (type != null){
			String typeName = Utilities.normalizeTypeName(type.getClass().getName(), "datatype");
			propertyValue = (DataTypeDef) Utilities.loadData(value, new DataTypeDef.Builder().typeName(typeName).build());
		}else
			propertyValue = (DataTypeDef) Utilities.loadData(value, new DataTypeDef.Builder().typeName("").build());
		hasValue = true;
	}
	
	
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(!getClass().equals(obj.getClass())) return false;
		PropertyDef prop = (PropertyDef) obj;
		return (name.equals(prop.getName()));
	}
	
	
	private int tabNum = 0;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if(propertyValue instanceof DataTypeDef)
											 ((DataTypeDef)propertyValue).setTabNum(tabNum+1);
										builder.appendToString("\n"+padding+name+": "+propertyValue.toString());
										
		return builder.toString();
	}
	
	
	
}
