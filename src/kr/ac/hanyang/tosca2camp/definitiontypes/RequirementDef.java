package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.templates.NodeFilter;

public class RequirementDef implements Cloneable{
	private String name;
	private String capability;
	private String nodeType; 
	private RelationshipDef relationship; // the Requirement type may require a relationship definition 
	private DataTypeDef occurence; // must fix
	
	private NodeFilter nodeFilter;
	//--------------------------------------------
	private NodeDef connectedNode;
	private boolean isConnected;
	private boolean isConfigured;
	//--------------------------------------------
	
	public static class Builder {
		private String name;
		private String capability;
		private String nodeType; 
		private RelationshipDef relationship;
		private DataTypeDef occurence; // must fix
		
		private NodeFilter nodeFilter;
		private boolean isConnected;
		private boolean isConfigured;
		
		public Builder(String name){
			this.name = name;
			this.isConnected = false;
			this.isConfigured = false;
			//this.capability = capability;
		}
		
		public Builder name(String name){
			this.name = name;
			return this;
		}
		
		public Builder node(String node){
			this.nodeType = node;
			return this;
		}
		
		
		public Builder relationshipDef(RelationshipDef relationshipDef){
			this.relationship = relationshipDef;
			return this;
		}
		
		public Builder capability (String capability){
			this.capability = capability;
			return this;
		}
			
		
		public Builder occurence(DataTypeDef occurence){
			this.occurence = occurence;
			return this;
		}
		
		public Builder nodeFilter(NodeFilter nodefilter){
			this.nodeFilter = nodeFilter;
			return this;
		}
		
		public RequirementDef build(){
			return new RequirementDef(this);
		}
	}
	
	private RequirementDef(Builder builder){
		this.name = builder.name;
		this.capability = builder.capability;
		this.nodeType = builder.nodeType;
		this.relationship = builder.relationship;
		this.occurence = builder.occurence;
		
		this.nodeFilter = builder.nodeFilter;
		this.isConnected = builder.isConnected;
		this.isConfigured = builder.isConfigured;
	}
	
	public Object clone(){
		try{
			@SuppressWarnings("unchecked")
			RequirementDef toReturn = (RequirementDef) super.clone();
			if (capability != null) toReturn.capability = new String(capability);
			if (nodeType != null) toReturn.nodeType = new String(nodeType);
			if (relationship != null) toReturn.relationship = (RelationshipDef) relationship.clone();
			if (occurence != null) toReturn.occurence = (DataTypeDef) occurence.clone();
			if (nodeFilter != null) toReturn.nodeFilter = (NodeFilter) nodeFilter.clone();
			toReturn.isConnected = this.isConnected;
			toReturn.isConfigured = this.isConfigured;
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	public Builder getBuilder(){
		Builder builder = new Builder(name);
		builder.nodeType = this.nodeType;
		builder.capability = this.capability;
		builder.relationship = this.relationship;
		builder.occurence = this.occurence;
		
		builder.nodeFilter = this.nodeFilter;
		builder.isConnected = this.isConnected;
		builder.isConfigured = this.isConfigured;
		return builder;	
	}
	
	public String getName(){return name;}
	public String getCapability(){return capability;}
	public String getNode(){return nodeType;}
	public String getRelationshipName(){return relationship.getName();}
	public RelationshipDef getRelationship(){return relationship;}
	
	public void setNodeVal(String nodeType){
		this.nodeType = nodeType;
	}
	
	public void setCapValue(String capability){
		this.capability = capability;
	}
	
	public void setRelValue(String value){
		relationship = relationship.getBuilder().type(value).build();
	}
	
	public void setRelValue(RelationshipDef relationship){
		
	}
	
	public void connectNode(NodeDef node){
		this.connectedNode = node;
		this.isConnected = true;
	}
	
	public NodeDef getConnectedNode(){
		return this.connectedNode;
	}
	
	public void setConfigured(boolean value){
		this.isConfigured = value;
	}
	
	public boolean isConfigured(){
		return this.isConfigured;
	}
	
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		RequirementDef rDef = (RequirementDef) obj;
		return name.equals(rDef.name);
	}
	
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE)
										.appendToString("\n"+padding+"name: "+name)
										.appendToString("\n"+padding+"capability: "+capability)
										.appendToString("\n"+padding+"node: "+nodeType)
										.appendToString("\n"+padding+"relationship: "+relationship.getName());
										
		return builder.toString();
	}


}

