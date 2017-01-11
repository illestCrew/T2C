package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.InterfaceDef.Builder;

public class PolicyDef implements Cloneable{
	private String name; //Node Template name
	private String typeName;
	private String derived_from;
	private DataTypeDef version;
	private String description; // description are treated as their own type but for now they will be string
	private Map<String, PropertyDef> properties; 
	private List<String> targets;
	
	
	public static class Builder {
		private String name;
		private String typeName;
		private String derived_from;
		private DataTypeDef version;
		private String description; // description are treated as their own type but for now they will be string
		private Map<String, PropertyDef> properties = new LinkedHashMap<String, PropertyDef>(); 
		private List<String> targets = new ArrayList<String>();
		
		//used to builde a type Definition
		public Builder(){ }
		
		public Builder(String typeName){
			this.typeName = typeName;
		}
		
		//usede to builde a NodeTemplate
		public Builder(String name, String typeName) {   
			this.name = name;
			this.typeName = typeName;
		}
		
		public Builder name(String name){
			this.name = name;
			return  this;
		}
		
		public Builder typeName(String typeName){
			this.typeName = typeName;
			return this;
		}

		public Builder derived_from(String derived_from){
			this.derived_from = derived_from;
			return  this;
		}
		
		public Builder version(DataTypeDef version){
			this.version = version;
			return this;
		}
		
		public Builder description(String description){
			this.description = description;
			return  this;
		}
		
		
		public Builder addProperty(PropertyDef property){
			this.properties.put(property.getName(),property);
			return  this;
		}
		
		public Builder addTargets(String target){
			this.targets.add(target);
			return  this;
		}
		
		public PolicyDef build(){
			return new PolicyDef(this);
		}
	}
	
	
	
	protected PolicyDef(Builder builder){
		this.name = builder.name;
		this.typeName = builder.typeName;
		this.derived_from = builder.derived_from;
		this.version = builder.version;
		this.description = builder.description;
		this.properties = builder.properties;
		this.targets = builder.targets;
	}

	
	@Override
	public Object clone(){
		try{
			PolicyDef toReturn = (PolicyDef) super.clone();
			if(version != null) toReturn.version = (DataTypeDef) version.clone();
			toReturn.properties = new LinkedHashMap<String, PropertyDef>();
			for(String pDefName:properties.keySet()){
				PropertyDef pDef = properties.get(pDefName);
				toReturn.properties.put(pDefName,  (PropertyDef)pDef.clone()); //make sure pDef can create a copy
			}
			toReturn.targets = new ArrayList<String>();
			for(String nDef:targets){
				toReturn.targets.add(new String(nDef)); 
			}
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}		   
	}
	
	public Builder getBuilder(){
		Builder builder = new Builder();
		builder.name = this.name;
		builder.typeName = this.name;
		builder.derived_from = this.derived_from;
		builder.version = this.version;
		builder.description = this.description;
		builder.properties = this.properties;
		builder.targets = this.targets;
		return builder;
	}	
	

	public String getTypeName() {return typeName;}
	public String getDerivedFrom() {return derived_from;}
    public String getDescription() {return description;}
    public List<PropertyDef> getPropertiesList() {
		List toReturn =  new ArrayList<PropertyDef>();
		for(PropertyDef property: properties.values()){
			toReturn.add(property);
		}
		return toReturn;
	}
	public Map<String, PropertyDef> getProperties() {return properties;}
	

	//public AttributeDef getAttribute(String name){return attributes.get(name);}

	public List<String> getTargets() {return targets;}
	
	
	public void setPropertyValue(String name, DataTypeDef value){
		PropertyDef toSet = properties.get(name);
		toSet.setPropertyValue(value);
	}
	
	public PropertyDef getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
	
private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE)
										.appendToString("\n"+padding+"typeName: "+typeName)
										.appendToString("\n"+padding+"derived_from: "+derived_from)
										.appendToString("\n"+padding+"properties: ");
										for(PropertyDef property: properties.values()){
											property.setTabNum(tabNum+1);
											builder.appendToString(property.toString());
										}
										builder.append("\n"+padding+"targets: ");
										for(String target: targets){
											builder.appendToString(target+" ");
										}
		return builder.toString();
	}
	
}
