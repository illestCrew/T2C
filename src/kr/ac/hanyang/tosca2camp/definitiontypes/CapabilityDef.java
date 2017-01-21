package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.*;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef.Builder;

public class CapabilityDef implements Cloneable{
	private String name; // for normative this should be the short name
	private String type;
	private String derived_from; 
	private DataTypeDef version;
	private String description; // description are treated as their own type but for now they will be string
	private Map<String, PropertyDef> properties; 
	private Map<String, AttributeDef> attributes;
	private List<String> valid_source_types;
	private boolean isConfigured;
	
	public static class Builder {
		private String name;
		private String type;
		private String derived_from; 
		private DataTypeDef version;
		private String description; // description are treated as their own type but for now they will be string
		private Map<String, PropertyDef> properties = new LinkedHashMap<String, PropertyDef>(); 
		private Map<String, AttributeDef> attributes = new LinkedHashMap<String, AttributeDef>();
		private List<String> valid_source_types = new ArrayList<String>();
		private boolean isConfigured = false;
		
		public Builder(){ }
		
		public Builder(String name, String type){
			this.name = name;
			this.type = type;
		}
		
		public Builder(String type){
			this.name = "";
			this.type = type;
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
		public Builder addProperty(PropertyDef property){
			this.properties.put(property.getName(),property);
			return this;
		}
		
		public Builder addAttribute(AttributeDef attribute){
			this.attributes.put(attribute.getName(),attribute);
			return this;
		}
		
		public Builder addValid_source_types(String valid_source_type){
			this.valid_source_types.add(valid_source_type);
			return this;
		}
		
		public Builder configure(boolean config){
			this.isConfigured = config;
			return this;
		}
		
		public CapabilityDef build(){
			return new CapabilityDef(this);
		}
	}
	
	
	public Object clone(){
		try{
			CapabilityDef.Builder toReturn = ((CapabilityDef) super.clone()).getBuilder();
			if (derived_from != null) toReturn.derived_from = new String(derived_from);
			toReturn.properties = new LinkedHashMap<String, PropertyDef>();
			if (version != null)toReturn.version = (DataTypeDef) version.clone();
			for(String pDefName:properties.keySet()){
				PropertyDef pDef = properties.get(pDefName);
				toReturn.properties.put(pDefName,  (PropertyDef)pDef.clone()); //make sure pDef can create a copy
			}
			toReturn.attributes = new LinkedHashMap<String, AttributeDef>();
			for(String aDefName:attributes.keySet()){
				AttributeDef aDef = attributes.get(aDefName);
				toReturn.attributes.put(aDefName,  (AttributeDef)aDef.clone()); //make sure aDef can create a copy
			}
			toReturn.valid_source_types = new ArrayList<String>();
			for(String vSource: valid_source_types)
				toReturn.valid_source_types.add(vSource);
			toReturn.isConfigured = this.isConfigured;
			return toReturn.build();
		}catch(CloneNotSupportedException e){
			return null;
		}		   
	}
	
	
	private CapabilityDef(Builder builder){
		this.name = builder.name;
		this.type = builder.type;
		this.derived_from = builder.derived_from;
		this.version = builder.version;
		this.description = builder.description;
		this.properties = builder.properties;
		this.attributes = builder.attributes;
		this.valid_source_types = builder.valid_source_types;
		this.isConfigured = builder.isConfigured;
	}
	
	public Builder getBuilder(){
		Builder builder = new Builder();
		builder.type = this.type;
		builder.name = this.name;
		builder.derived_from = this.derived_from;
		builder.version = this.version;
		builder.description = this.description;
		builder.properties = this.properties;
		builder.attributes = this.attributes;
		builder.valid_source_types = this.valid_source_types;
		builder.isConfigured = this.isConfigured;
		return builder;
		
	}
	

	public String getName() {return name;}

	public String getType() {return type;}

	public String getDerived_from() {return derived_from;}

	public String getDescription() {return description;}

	public List<PropertyDef> getProperties() {
		List toReturn =  new ArrayList<PropertyDef>();
		for(PropertyDef property: properties.values()){
			toReturn.add(property);
		}
		return toReturn;
	}
	

	public List<AttributeDef> getAttributes() {
		List toReturn =  new ArrayList<AttributeDef>();
		for(AttributeDef attribute: attributes.values()){
			toReturn.add(attribute);
		}
		return toReturn;
	}
	public List<String> getValid_source_types() {return valid_source_types;}
	
	public PropertyDef getProperty(String propName){
		return properties.get(propName);
	}
	
	public void setPropertyValue(String name, DataTypeDef value){
		PropertyDef toSet = properties.get(name);
		toSet.setPropertyValue(value);
	}
	
	public void setAttributeValue(String name, DataTypeDef value){
		AttributeDef toSet = attributes.get(name);
		toSet.setAttributeValue(value);
	}
	
	public AttributeDef getAttribute(String attributeName){
		return attributes.get(attributeName);
	}
	
	public void setConfigured(boolean config){
		this.isConfigured = config;
	}
	
	public boolean isConfigured(){
		return this.isConfigured;
	}
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE)
										.appendToString("\n"+padding+"name: "+name)
										.appendToString("\n"+padding+"type: "+type)
										.appendToString("\n"+padding+"derived_from: "+derived_from)
										.append("\n"+padding+"properties: ");
										for(PropertyDef property: properties.values()){
											property.setTabNum(tabNum+1);
											builder.appendToString(property.toString());
										}
		return builder.toString();
	}

}
