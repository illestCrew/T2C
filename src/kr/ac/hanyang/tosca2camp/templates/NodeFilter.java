package kr.ac.hanyang.tosca2camp.templates;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef.Builder;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;

public class NodeFilter {
	private String filterName;
	private List<PropertyDef> properties;
	private List<CapabilityDef> capabilities;
	
	public static class Builder {
		private String filterName; 
		private List<PropertyDef> properties;
		private List<CapabilityDef> capabilities;
		
		//used to builde a type Definition
		public Builder(){ 
			properties = new ArrayList<PropertyDef>();
			capabilities = new ArrayList<CapabilityDef>();
		}
		
		public Builder propertyName(String propertyName){
			this.filterName = propertyName;
			return this;
		}
		
		public Builder properties(List<PropertyDef> properties){
			this.properties = properties;
			return  this;
		}
		
		public Builder property(PropertyDef property){
			this.properties.add(property);
			return this;
		}
		
		public Builder capabilities(List<CapabilityDef> capabilities){
			this.capabilities = capabilities;
			return  this;
		}
		
		public Builder capability(CapabilityDef capability){
			this.capabilities.add(capability);
			return this;
		}
		
		public NodeFilter build(){
			return new NodeFilter(this);
		}
	}
	
	private NodeFilter(Builder builder){
		this.filterName = builder.filterName;
		this.properties = builder.properties;
		this.capabilities = builder.capabilities;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.filterName = this.filterName;
		builder.properties = this.properties;
		builder.capabilities = this.capabilities;
		return builder;
	}
	
	public Object clone(){
		try{
			NodeFilter toReturn = (NodeFilter) super.clone();
			toReturn.filterName = new String(filterName);
			for (PropertyDef property: properties)
				toReturn.properties.add(property);
			for (CapabilityDef capability: capabilities)
				toReturn.capabilities.add(capability);
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}

}
