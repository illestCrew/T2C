package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.RelationshipDef.Builder;

public class RelationshipDef implements Cloneable{
	private String name;
	private String type;
	private String derived_from; 
	private DataTypeDef version;
	private String description; // description are treated as their own type but for now they will be string
	private Map<String, PropertyDef> properties; 
	private Map<String, AttributeDef> attributes;
	private Map<String, InterfaceDef> interfaces;
	private List<String> valid_target_types;
	
	//-------------------------------------------------------------------------------
	public void pre_configure_source(){}
	public void pre_configure_target(){}
	public void post_configure_source(){}
	public void post_configure_target(){}
	public void add_target(){}
	public void add_source(){}
	public void target_changed(){}
	public void remove_target(){}
	
	//-------------------------------------------------------------------------------
	
	
	public static class Builder {
		private String name;
		private String type;
		private String derived_from; 
		private DataTypeDef version;
		private String description; // description are treated as their own type but for now they will be string
		private Map<String, PropertyDef> properties = new LinkedHashMap(); 
		private Map<String, AttributeDef> attributes = new LinkedHashMap();
		private Map<String, InterfaceDef> interfaces = new LinkedHashMap();
		private List<String> valid_target_types = new ArrayList();
		
		public Builder(){ }
		
		public Builder(String type){
			this.type = type;
		}
		
		public Builder(String name, String type) {
			this.name = name;
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
		
		public Builder addInterface(InterfaceDef iFace){
			this.interfaces.put(iFace.getName(),iFace);
			return this;
		}
		
		public Builder addValid_target_types(String valid_target_types){
			this.valid_target_types.add(valid_target_types);
			return this;
		}
		
		public RelationshipDef build(){
			return new RelationshipDef(this);
		}
	}
	

	private RelationshipDef(Builder builder){
		this.name = builder.name;
		this.type = builder.type;
		this.derived_from = builder.derived_from;
		this.version = builder.version;
		this.description = builder.description;
		this.properties = builder.properties;
		this.attributes = builder.attributes;
		this.interfaces = builder.interfaces;
		this.valid_target_types = builder.valid_target_types;
		
	}
	
	
	public Object clone(){
		try{
			RelationshipDef toReturn = (RelationshipDef) super.clone();
			if(version != null) toReturn.version = (DataTypeDef) version.clone();
			if(derived_from != null) toReturn.derived_from = new String(derived_from);
			if(properties != null)toReturn.properties = new LinkedHashMap<String, PropertyDef>();
			for(String pDefName:properties.keySet()){
				PropertyDef pDef = properties.get(pDefName);
				toReturn.properties.put(pDefName,  (PropertyDef)pDef.clone()); //make sure pDef can create a copy
			}
			toReturn.attributes = new LinkedHashMap<String, AttributeDef>();
			for(String aDefName:attributes.keySet()){
				AttributeDef aDef = attributes.get(aDefName);
				toReturn.attributes.put(aDefName,  (AttributeDef)aDef.clone()); //make sure aDef can create a copy
			}
			toReturn.interfaces = new LinkedHashMap<String, InterfaceDef>();
			for(String iDefName:interfaces.keySet()){
				InterfaceDef iDef = interfaces.get(iDefName);
				toReturn.interfaces.put(iDefName,  (InterfaceDef)iDef.clone()); //make sure aDef can create a copy
			}
			toReturn.valid_target_types = new ArrayList<String>();
			for(String vSource: valid_target_types)
				toReturn.valid_target_types.add(vSource);
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}		   
	}
	
	
	public Builder getBuilder(){
		Builder builder = new Builder();
		builder.name = this.name;
		builder.type = this.type;
		builder.derived_from = this.derived_from;
		builder.version = this.version;
		builder.description = this.description;
		builder.properties = this.properties;
		builder.attributes = this.attributes;
		builder.interfaces = this.interfaces;
		builder.valid_target_types = this.valid_target_types;
		return builder;
	}
	
	public String getName(){return name;}
	public String getType(){return type;}
	

	public String getDerived_from() {
		return derived_from;
	}


	public DataTypeDef getVersion() {
		return version;
	}


	public String getDescription() {
		return description;
	}


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


	public Map<String, InterfaceDef> getInterfaces() {
		return interfaces;
	}
	public List<InterfaceDef> getInterfaceList(){
		ArrayList<InterfaceDef> toReturn = new ArrayList<InterfaceDef>();
		for (InterfaceDef iface: interfaces.values()){
			toReturn.add(iface);
		}
		return toReturn;
	}

	public List<String> getValid_target_types() {
		return valid_target_types;
	}


	public void setPropertyValue(String name, DataTypeDef value){
		PropertyDef toSet = properties.get(name);
		toSet.setPropertyValue(value);
	}
	
	public void setAttributeValue(String name, DataTypeDef value){
		AttributeDef toSet = attributes.get(name);
		toSet.setAttributeValue(value);
	}
	
	public PropertyDef getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
	public AttributeDef getAttribute(String attributeName){
		return attributes.get(attributeName);
	}
	
	public InterfaceDef getInterfaceDef(String interfaceName){
		return interfaces.get(interfaceName);
	}
	
	public void addInterface(InterfaceDef iface){
		this.interfaces.put(iface.getName(), iface);
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
											builder.appendToString(padding+property.toString());
										}
		return builder.toString();
	}

	
}

