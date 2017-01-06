package kr.ac.hanyang.tosca2camp.templates;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.GroupDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.InterfaceDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.NodeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RelationshipDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RepositoryDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RequirementDef;

public class TopologyTemplate implements Cloneable{
	private String name; 
	private String typeName;
	private TopologyTemplate derived_from; //URI string
	private String description; // description are treated as their own type but for now they will be string
	private List<String> directives; //Node template item
	private List<PropertyDef> inputs;
	private List<NodeDef> nodeTemplates; 
	private List<RelationshipDef> relationshipTemplates;
	private List<GroupDef> groups;
	private List<PolicyDef> policies;
	private List<PropertyDef> outputs;
	
	//-------------------------------------------------------------------------------
	public void resolve(){
		for (NodeDef node: nodeTemplates){
			List<RequirementDef> requirements = node.getConfiguredRequirements();
			for(RequirementDef reqDef: requirements)
				node.connect(getRequiredNode(reqDef), reqDef);
		}
	}
	
	private NodeDef getRequiredNode(RequirementDef requirement){
		String nodeName = requirement.getNode();
		String capabilityName = requirement.getCapability();
		NodeDef toReturn = getNodeByName(nodeName);
		if (toReturn != null)
			return toReturn;
		else
			return getNodeByCap(capabilityName);
	}
	
	private NodeDef getNodeByName(String name){
		for(NodeDef node: nodeTemplates)
			if (node.getName().equals(name))
				return node;
		return null;
	}
	
	private NodeDef getNodeByCap(String cap){
		for(NodeDef node: nodeTemplates)
			if (node.getCapability(name) != null)
				return node;
		return null;
	}
	
	//-------------------------------------------------------------------------------
	public void configure(){
		for (NodeDef node: nodeTemplates){
			node.configure();
		}
	}
	
	public void start(){}
	public void stop(){}
	public void delete(){}
	//-------------------------------------------------------------------------------
	
	
	public static class Builder {
		private String name;
		private String typeName;
		private TopologyTemplate derived_from; //URI string
		private String description; // description are treated as their own type but for now they will be string
		private List<String> directives = new ArrayList<String>();
		private List<PropertyDef> inputs = new ArrayList<PropertyDef>();
		private List<NodeDef> nodeTemplates = new ArrayList<NodeDef>();
		private List<RelationshipDef> relationshipTemplates = new ArrayList<RelationshipDef>();
		private List<GroupDef> groups = new ArrayList<GroupDef>();
		private List<PolicyDef> policies = new ArrayList<PolicyDef>();
		private List<PropertyDef> outputs = new ArrayList<PropertyDef>();
		
		
		//used to builde a type Definition
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

		public Builder derived_from(TopologyTemplate derived_from){
			this.derived_from = derived_from;
			return  this;
		}
		
		public Builder description(String description){
			this.description = description;
			return  this;
		}
		
		public Builder directives(List<String> directives){
			this.directives = directives;
			return this;
		}
		
		public Builder addInput(PropertyDef input){
			this.inputs.add(input);
			return  this;
		}
		
		public Builder addNode(NodeDef node){
			this.nodeTemplates.add(node);
			return  this;
		}
		
		public Builder addRelationship(RelationshipDef relationship){
			this.relationshipTemplates.add(relationship);
			return  this;
		}
		
		public Builder addGroup(GroupDef group){
			this.groups.add(group);
			return  this;
		}
		
		public Builder addPolicy(PolicyDef policy){
			this.policies.add(policy);
			return  this;
		}
		
		public Builder addOutput(PropertyDef output){
			this.outputs.add(output);
			return  this;
		}
		
		public TopologyTemplate build(){
			return new TopologyTemplate(this);
		}
	}
	
	
	
	protected TopologyTemplate(Builder builder){
		this.name = builder.name;
		this.typeName = builder.typeName;
		this.derived_from = builder.derived_from;
		this.description = builder.description;
		this.directives = builder.directives;
		this.inputs = builder.inputs;
		this.nodeTemplates = builder.nodeTemplates;
		this.relationshipTemplates = builder.relationshipTemplates;
		this.groups = builder.groups;
		this.policies = builder.policies;
		this.outputs = builder.outputs;
	}

	
	//using a static clone method because I can make use of the builder to build a 
	//properly constructed clone
	//@Override
//	public Object clone(){
//		try{
//			TopologyTemplateDef toReturn = (TopologyTemplateDef) super.clone();
//			toReturn.properties = new LinkedHashMap<String, PropertyDef>();
//			for(String pDefName:properties.keySet()){
//				PropertyDef pDef = properties.get(pDefName);
//				toReturn.properties.put(pDefName,  (PropertyDef)pDef.clone()); //make sure pDef can create a copy
//			}
//			toReturn.attributes = new LinkedHashMap<String, AttributeDef>();
//			for(String aDefName:attributes.keySet()){
//				AttributeDef aDef = attributes.get(aDefName);
//				toReturn.attributes.put(aDefName,  (AttributeDef)aDef.clone()); //make sure aDef can create a copy
//			}
//			toReturn.requirements = new ArrayList<RequirementDef>();
//			for(RequirementDef rDef:requirements){
//				toReturn.requirements.add((RequirementDef)rDef.clone()); //make sure pDef can create a copy
//			}
//			toReturn.capabilities = new LinkedHashMap<String, CapabilityDef>();
//			for(String cDefName:capabilities.keySet()){
//				CapabilityDef cDef = capabilities.get(cDefName);
//				toReturn.capabilities.put(cDefName, (CapabilityDef)cDef.clone()); //make sure pDef can create a copy
//			}
//			return toReturn;
//		}catch(CloneNotSupportedException e){
//			return null;
//		}		   
//	}
	
	public Builder getBuilder(String typeName){
		Builder builder = new Builder(typeName);
		builder.name = this.name;
		builder.derived_from = this.derived_from;
		builder.description = this.description;
		builder.directives = this.directives;
		builder.inputs = this.inputs;
		builder.nodeTemplates = this.nodeTemplates;
		builder.relationshipTemplates = this.relationshipTemplates;
		builder.groups = this.groups;
		builder.policies = this.policies;
		builder.outputs = this.outputs;
		return builder;
	}	
	

	public String getTypeName() {return typeName;}

	public TopologyTemplate getDerived_from() {return derived_from;}

    public String getDescription() {return description;}

	public List<PropertyDef> getInputs() {return inputs;}
	
	public List<NodeDef> getNodes() {return nodeTemplates;}
	
	public List<RelationshipDef> getRelationships() {return relationshipTemplates;}
	
	public List<GroupDef> getGroups() {return groups;}
	
	public List<PolicyDef> getPolicies() {return policies;}
	
	public List<PropertyDef> getOutputs() {return outputs;}
	
	public Object evaluateFunction(Function function){
		return null; //TODO
	}
	
private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE)
										.appendToString("\n"+padding+"name: "+name)
										.appendToString("\n"+padding+"type: "+name)
										.appendToString("\n"+padding+"derived_from: "+name)
										.appendToString("\n"+padding+"description: "+description)
										.append("\n"+padding+"directives: ");
										for(String directive: directives){
											builder.appendToString("\n"+padding+directive.toString());
										}
										builder.append("\n"+padding+"inputs: ");
										for(PropertyDef input: inputs){
											input.setTabNum(tabNum+1);
											builder.appendToString(padding+input.toString());
										}
										builder.append("\n"+padding+"node tempates: ");
										for(NodeDef node: nodeTemplates){
											node.setTabNum(tabNum+1);
											builder.appendToString(padding+node.toString());
										}
										builder.append("\n"+padding+"relationship templates: ");
										for(RelationshipDef relationship: relationshipTemplates){
											relationship.setTabNum(tabNum+1);
											builder.appendToString(padding+relationship.toString());
										}
										builder.append("\n"+padding+"groups: ");
										for(GroupDef group: groups){
											group.setTabNum(tabNum+1);
											builder.appendToString(padding+group.toString());
										}
										builder.append("\n"+padding+"policies: ");
										for(PolicyDef policy: policies){
											policy.setTabNum(tabNum+1);
											builder.appendToString(padding+policy.toString());
										}
										builder.append("\n"+padding+"outputs: ");
										for(PropertyDef output: outputs){
											output.setTabNum(tabNum+1);
											builder.appendToString(padding+output.toString());
										}
										
		return builder.toString();
	}

	

	
}
