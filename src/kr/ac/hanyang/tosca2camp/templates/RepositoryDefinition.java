package kr.ac.hanyang.tosca2camp.templates;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef.Builder;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;

public class RepositoryDefinition {
	private String description;
	private String url;
	private DataTypeDef credential;
	
	public static class Builder {
		private String description;
		private String url;
		private DataTypeDef credential;
		
		//used to builde a type Definition
		public Builder(String url){ 
			this.url = url;
		}
		
		public Builder description(String description){
			this.description = description;
			return this;
		}
		
		public Builder credential(DataTypeDef credential){
			this.credential = credential;
			return  this;
		}
		
		public RepositoryDefinition build(){
			return new RepositoryDefinition(this);
		}
	}
	
	private RepositoryDefinition(Builder builder){
		this.description = builder.description;
		this.url = builder.url;
		this.credential = builder.credential;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder(this.url);
		builder.description = this.description;
		builder.credential = this.credential;
		return builder;
	}
	
	public Object clone(){
		try{
			RepositoryDefinition toReturn = (RepositoryDefinition) super.clone();
			toReturn.description = new String(description);
			toReturn.url = new String(url);
			toReturn.credential = (DataTypeDef) credential.clone();
			
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}

}
