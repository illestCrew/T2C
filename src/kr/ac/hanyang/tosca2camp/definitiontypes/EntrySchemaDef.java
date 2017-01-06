package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class EntrySchemaDef implements Cloneable{

	private Object type;
	private String description; // description are treated as their own type but for now they will be string
	private List<ConstraintDef> constraints; //TODO this type will have to be defined
	
	public static class Builder{
		private Object type;
		private String description; // description are treated as their own type but for now they will be string
		private List<ConstraintDef> constraints = new ArrayList<ConstraintDef>(); //TODO this type will have to be defined
		
		public Builder(){
			this.type = type;
		}
		
		public Builder type(Object type){
			this.type = type;
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
		
		public EntrySchemaDef build(){
			return new EntrySchemaDef(this);
		}
		
	}
	
	
	private EntrySchemaDef(Builder builder){
		this.type = builder.type;
		this.description = builder.description;
		this.constraints = builder.constraints;
	}
	
	public Object clone(){
		try{
			EntrySchemaDef toReturn = (EntrySchemaDef) super.clone();
			//toReturn.type = (DataTypeDef)type.clone();
			toReturn.constraints = new ArrayList<ConstraintDef>();
			for( ConstraintDef constraint:constraints){
				toReturn.constraints.add((ConstraintDef) constraint.clone()); //make sure to create a copy
			}
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}		  
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.type = this.type;
		builder.description = this.description;
		builder.constraints = this.constraints;
		return builder;
	}
	
	public String getDescription(){return description;}
	
	public String toString(){
		return new ToStringBuilder(this)
					.append("type: ",type)
					.append("constraints: \n",constraints)
					.toString();
	}
	
}
