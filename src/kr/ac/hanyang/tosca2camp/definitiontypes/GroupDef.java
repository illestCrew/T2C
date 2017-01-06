package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GroupDef implements Cloneable{
	private String name;
	private String type;
	private String derived_from; //URI string
	private String description; // description are treated as their own type but for now they will be string
	private Map<String, PropertyDef> properties; 
	private List<String> members;
	private Map<String, InterfaceDef> interfaces;
	
	
	public static class Builder {
		private String name;
		private String type;
		private String derived_from; //URI string
		private String description; // description are treated as their own type but for now they will be string
		private Map<String, PropertyDef> properties = new LinkedHashMap<String, PropertyDef>(); 
		private List<String> members = new ArrayList<String>();
		private Map<String, InterfaceDef> interfaces = new LinkedHashMap<String, InterfaceDef>();
		
		public Builder(){
			
		}
		
		public Builder(String type){
			this();
			this.type = type;
		}
		
		public Builder(String name, String type) {
			this();
			this.name = name;
			this.type = type;
		}
		
		public Builder name(String name){
			this.name = name;
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
		
		public Builder addProperty(PropertyDef property){
			this.properties.put(property.getName(),property);
			return this;
		}
		
		public Builder addMember(String node){
			this.members.add(node);
			return this;
		}
		
		public Builder addMembers(List<String> members) {
			this.members = members;
			return this;
		}
		
		public Builder addInterface(InterfaceDef iFace){
			this.interfaces.put(iFace.getName(),iFace);
			return this;
		}
		
		public GroupDef build(){
			return new GroupDef(this);
		}

		
	}
	

	private GroupDef(Builder builder){
		this.name = builder.name;
		this.type = builder.type;
		this.derived_from = builder.derived_from;
		this.description = builder.description;
		this.properties = builder.properties;
		this.members = builder.members;
		this.interfaces = builder.interfaces;
	}
	
	
	public Object clone(){
		try{
			GroupDef toReturn = (GroupDef) super.clone();
			if(name != null) toReturn.name = new String(name);
			if(derived_from != null) toReturn.derived_from = new String(derived_from);
			if(description != null) toReturn.description = new String(description);
			if(properties != null)toReturn.properties = new LinkedHashMap<String, PropertyDef>();
			for(String pDefName:properties.keySet()){
				PropertyDef pDef = properties.get(pDefName);
				toReturn.properties.put(pDefName,  (PropertyDef)pDef.clone()); //make sure pDef can create a copy
			}
			toReturn.members = new ArrayList<String>();
			for(String member:members){
				toReturn.members.add(new String(member)); //make sure aDef can create a copy
			}
			toReturn.interfaces = new LinkedHashMap<String, InterfaceDef>();
			for(String iDefName:interfaces.keySet()){
				InterfaceDef iDef = interfaces.get(iDefName);
				toReturn.interfaces.put(iDefName,  (InterfaceDef)iDef.clone()); //make sure aDef can create a copy
			}
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}		   
	}
	
	
	public Builder getBuilder(String type){
		Builder builder = new Builder(type);
		builder.derived_from = this.derived_from;
		builder.description = this.description;
		builder.properties = this.properties;
		builder.members = this.members;
		builder.interfaces = this.interfaces;
		return builder;
	}
	
	public String getName(){return name;}
	public String getType(){return type;}
	public String getDerived_from() {return derived_from;}
	public String getDescription() {return description;}


	public List<PropertyDef> getProperties() {
		List<PropertyDef> toReturn = new ArrayList<PropertyDef>();
		for(PropertyDef property: properties.values())
			toReturn.add(property);
		return toReturn;
	}

	public List<String> getMembers() {return members;}

	public List<InterfaceDef> getInterfaces() {
		List<InterfaceDef> toReturn = new ArrayList<InterfaceDef>();
		for(InterfaceDef iface: interfaces.values())
			toReturn.add(iface);
		return toReturn;
	}


	public void setPropertyValue(String name, DataTypeDef value){
		PropertyDef toSet = properties.get(name);
		toSet.setPropertyValue(value);
	}
	
	public PropertyDef getProperty(String type){
		return properties.get(type);
	}
	
	public void addInterface(InterfaceDef iface){
		this.interfaces.put(iface.getName(), iface);
	}
	
	public void addMembers(List<String> members){
		this.members = members;
	}
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (name != null) builder.appendToString("\n"+padding+"name: "+name);
										if (type != null) builder.appendToString("\n"+padding+"type: "+type);
										if (derived_from != null) builder.appendToString("\n"+padding+"derived_from: "+derived_from);
										if (description != null) builder.appendToString("\n"+padding+"description: "+description);
										builder.append("\n"+padding+"properties: ");
										for(PropertyDef property: properties.values()){
											property.setTabNum(tabNum+1);
											builder.appendToString(padding+property.toString());
										}
										builder.append("\n"+padding+"members: ");
										//for(String member: members){
											//member.setTabNum(tabNum+1);
										if (members != null) builder.appendToString(members.toString());
										//}
										builder.append("\n"+padding+"interfaces: ");
										for(InterfaceDef iface: interfaces.values()){
											iface.setTabNum(tabNum+1);
											builder.appendToString(padding+iface.toString());
										}
		return builder.toString();
	}
}

