package kr.ac.hanyang.tosca2camp.templates;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.ArtifactDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.GroupDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.InterfaceDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.NodeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RelationshipDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RepositoryDef;

public class ServiceTemplate implements Cloneable{
	private String id;
	private String tosca_definitions_version; 
	private Map<String,String> metaData;
	private String description; // description are treated as their own type but for now they will be string
	private List<RepositoryDef> repositories; 
	private List<ImportDef> imports; 
	private List<ArtifactDef> artifactTypes;
	private List<DataTypeDef> dataTypes; 
	private List<CapabilityDef> capabilityTypes;
	private List<InterfaceDef> interfaceTypes;
	private List<RelationshipDef> relationshipTypes;
	private List<NodeDef> nodeTypes;
	private List<GroupDef> groupTypes;
	private List<PolicyDef> policyTypes;
	private TopologyTemplate topologyTemplate;
	
	//-------------------------------------------------------------------------------
	
	public void resolve(){
		topologyTemplate.resolve();
	}
	//-------------------------------------------------------------------------------
	public void configure(){
		topologyTemplate.configure();
	}
	
	public void start(){}
	public void stop(){}
	public void delete(){}
	//-------------------------------------------------------------------------------
	
	
	public static class Builder {
		private String tosca_definitions_version;
		private Map<String,String> metaData;
		private String description; // description are treated as their own type but for now they will be string
		private List<RepositoryDef> repositories = new ArrayList<RepositoryDef>();
		private List<ImportDef> imports = new ArrayList<ImportDef>(); 
		private List<ArtifactDef> artifactTypes = new ArrayList<ArtifactDef>();
		private List<DataTypeDef> dataTypes = new ArrayList<DataTypeDef>(); 
		private List<CapabilityDef> capabilityTypes = new ArrayList<CapabilityDef>();
		private List<InterfaceDef> interfaceTypes = new ArrayList<InterfaceDef>();
		private List<RelationshipDef> relationshipTypes = new ArrayList<RelationshipDef>();
		private List<NodeDef> nodeTypes = new ArrayList<NodeDef>();
		private List<GroupDef> groupTypes = new ArrayList<GroupDef>();
		private List<PolicyDef> policyTypes = new ArrayList<PolicyDef>();
		private TopologyTemplate topologyTemplate;
		
		//used to build a type Definition
		public Builder(){
			//this.tosca_definitions_version = tosca_definitions_version;
			//UUID.randomUUID().toString();
		}
		
		
		public Builder(String tosca_definitions_version){
			this.tosca_definitions_version = tosca_definitions_version;
		}
		
		public Builder version(String tosca_definitions_version){
			this.tosca_definitions_version = tosca_definitions_version;
			return  this;
		}
		
		public Builder metaData(Map<String,String> metaData){
			this.metaData = metaData;
			return  this;
		}
		
		public Builder description(String description){
			this.description = description;
			return  this;
		}
		
		public Builder addRepository(RepositoryDef repository){
			this.repositories.add(repository);
			return this;
		}
		
		public Builder addImport(ImportDef imprt){
			this.imports.add(imprt);
			return this;
		}
		
		public Builder addArtifactType(ArtifactDef artifactType){
			this.artifactTypes.add(artifactType);
			return this;
		}
		
		public Builder addDataType(DataTypeDef dataType){
			this.dataTypes.add(dataType);
			return this;
		}
		
		public Builder addCapabilityType(CapabilityDef capabilityType){
			this.capabilityTypes.add(capabilityType);
			return this;
		}
		
		public Builder addInterfaceType(InterfaceDef interfaceType){
			this.interfaceTypes.add(interfaceType);
			return this;
		}
		
		public Builder addRelationshipType(RelationshipDef relationshipType){
			this.relationshipTypes.add(relationshipType);
			return this;
		}
		
		public Builder addNodeType(NodeDef nodeType){
			this.nodeTypes.add(nodeType);
			return this;
		}
		
		public Builder addGroupType(GroupDef groupType){
			this.groupTypes.add(groupType);
			return this;
		}
		
		public Builder addPolicyType(PolicyDef policyType){
			this.policyTypes.add(policyType);
			return this;
		}
		
		public Builder addTopologyTemplate(TopologyTemplate topologyTemplate){
			this.topologyTemplate = topologyTemplate;
			return this;
		}
		
		public ServiceTemplate peek(){
			return this.build();
		}
		
		public ServiceTemplate build(){
			return new ServiceTemplate(this);
		}
	}
	
	
	
	protected ServiceTemplate(Builder builder){
		this.id = "ServiceTemplate";//UUID.randomUUID().toString();
		this.tosca_definitions_version = builder.tosca_definitions_version;
		this.metaData = builder.metaData;
		this.description = builder.description;
		this.repositories = builder.repositories;
		this.imports = builder.imports;
		this.artifactTypes = builder.artifactTypes;
		this.dataTypes = builder.dataTypes;
		this.capabilityTypes = builder.capabilityTypes;
		this.interfaceTypes = builder.interfaceTypes;
		this.relationshipTypes = builder.relationshipTypes;
		this.nodeTypes = builder.nodeTypes;
		this.groupTypes = builder.groupTypes;
		this.policyTypes = builder.policyTypes;
		this.topologyTemplate = builder.topologyTemplate;
	}
	
	public Builder getBuilder(String tosca_definitions_version){
		Builder builder = new Builder(tosca_definitions_version);
		builder.metaData = this.metaData;
		builder.description = this.description;
		builder.repositories = this.repositories;
		builder.imports = this.imports;
		builder.artifactTypes = this.artifactTypes;
		builder.dataTypes = this.dataTypes;
		builder.capabilityTypes = this.capabilityTypes;
		builder.interfaceTypes = this.interfaceTypes;
		builder.relationshipTypes = this.relationshipTypes;
		builder.nodeTypes = this.nodeTypes;
		builder.groupTypes = this.groupTypes;
		builder.policyTypes = this.policyTypes;
		builder.topologyTemplate = this.topologyTemplate;
		return builder;
	}	
	
	public String getId() {return id;}
	
	public String getVersion() {return tosca_definitions_version;}
	
	public Map<String, String> getMetaData() {return metaData;}
	
    public String getDescription() {return description;}
    
    public List<ImportDef> getImports(){return imports;}
    
	public List<RepositoryDef> getDirectives() {return repositories;}
	
	public List<ArtifactDef> getArtifacts() {return artifactTypes;}
	
	public List<DataTypeDef> getDataTypes() {return dataTypes;}
	
	public List<CapabilityDef> getCapabilityTypes() {return capabilityTypes;}
	
	public List<InterfaceDef> getInterfaceTypes() {return interfaceTypes;}
	
	public List<RelationshipDef> getRelationshipTypes() {return relationshipTypes;}
	
	public RelationshipDef getRelationshipType(String typeName) {
		for(RelationshipDef relDef: relationshipTypes)
			if (relDef.getType().equals(typeName))
				return relDef;
		return null;
	}
	
	public GroupDef getGroupType(String typeName) {
		for(GroupDef groupDef: groupTypes)
			if (groupDef.getType().equals(typeName))
				return groupDef;
		return null;
	}

	
	public List<NodeDef> getNodeTypes() {return nodeTypes;}
	
	public NodeDef getNodeType(String typeName) {
		for(NodeDef nodeDef: nodeTypes)
			if (nodeDef.getTypeName().equals(typeName))
				return nodeDef;
		return null;
	}
	
	public List<GroupDef> getGroupTypes() {return groupTypes;}
	
	public List<PolicyDef> getPolicyTypes() {return policyTypes;}
	
	public PolicyDef getPolicyType(String typeName) {
		for(PolicyDef polDef: policyTypes)
			if (polDef.getTypeName().equals(typeName))
				return polDef;
		return null;
	}
	
	public TopologyTemplate getTopologyTemplate() {return topologyTemplate;}
	
	public Object evaluateFunction(Function function){ return topologyTemplate.evaluateFunction(function);}
	
	
	
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE)
										.appendToString("\n"+padding+"id: "+id)
										.appendToString("\n"+padding+"version: "+tosca_definitions_version)
										.appendToString("\n"+padding+"meta_data: "+metaData)
										.appendToString("\n"+padding+"description: "+description)
										.append("\n"+padding+"repositories: ");
										for(RepositoryDef repository: repositories){
											repository.setTabNum(tabNum+1);
											builder.appendToString(padding+repository.toString());
										}
										builder.append("\n"+padding+"imports: ");
										for(ImportDef imprt: imports){
											imprt.setTabNum(tabNum+1);
											builder.appendToString(padding+imprt.toString());
										}
										builder.append("\n"+padding+"artifact types: ");
										for(RepositoryDef repository: repositories){
											repository.setTabNum(tabNum+1);
											builder.appendToString(padding+repository.toString());
										}
										builder.append("\n"+padding+"data types: ");
										for(DataTypeDef datatype: dataTypes){
											datatype.setTabNum(tabNum+1);
											builder.appendToString(padding+datatype.toString());
										}
										builder.append("\n"+padding+"capability types: ");
										for(CapabilityDef capability: capabilityTypes){
											capability.setTabNum(tabNum+1);
											builder.appendToString(padding+capability.toString());
										}
										builder.append("\n"+padding+"interfaces: ");
										for(InterfaceDef iface: interfaceTypes){
											iface.setTabNum(tabNum+1);
											builder.appendToString(padding+iface.toString());
										}
										builder.append("\n"+padding+"relationship types: ");
										for(RelationshipDef relationship: relationshipTypes){
											relationship.setTabNum(tabNum+1);
											builder.appendToString(padding+relationship.toString());
										}
										builder.append("\n"+padding+"node types: ");
										for(NodeDef node: nodeTypes){
											node.setTabNum(tabNum+1);
											builder.appendToString(padding+node.toString());
										}
										builder.append("\n"+padding+"group types: ");
										for(GroupDef group: groupTypes){
											group.setTabNum(tabNum+1);
											builder.appendToString(padding+group.toString());
										}
										builder.append("\n"+padding+"policy types: ");
										for(PolicyDef policy: policyTypes){
											policy.setTabNum(tabNum+1);
											builder.appendToString(padding+policy.toString());
										}
										if (topologyTemplate != null){
											topologyTemplate.setTabNum(tabNum+1);
											builder.append("\n"+padding+"topology template: ");
											builder.appendToString(padding+topologyTemplate.toString());
										}
										
		return builder.toString();
	}
	
}
