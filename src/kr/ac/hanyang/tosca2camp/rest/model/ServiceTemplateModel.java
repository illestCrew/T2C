package kr.ac.hanyang.tosca2camp.rest.model;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * @model kind="class"
 */
@XmlRootElement
public class ServiceTemplateModel {

	private String tosca_definitions_version;
	private Map<String, String> metadata;
	private String description;
	private List<RepositoryDefinitionModel> repositories;
	private List<ImportDefinitionModel> imports;
	private List<ArtifactTypeModel> artifact_types;
	private List<DatatypeDefinitionModel> data_types;
	private List<CapabilityDefinitionModel> capability_types;
	private List<InterfaceTypeModel> interface_types;
	private List<RelationshipDefinitionModel> relationship_types;
	private List<NodeDefinitionModel> node_types;
	private List<GroupDefinitionModel> group_types;
	private List<PolicyDefinitionModel> policy_types;
	private TopologyTemplateModel topology_template;
	//private List<ArtifactDefinitionModel> artifacts;
	
	
	private ServiceTemplateModel(){ }
	
	public static ServiceTemplateModel of(){
		return new ServiceTemplateModel();
	}
	public ServiceTemplateModel toscaDefinition(String tosca_definitions_version){	this.tosca_definitions_version = tosca_definitions_version; 	return this; 	}
	public ServiceTemplateModel metadata(Map<String, String> metadata){	this.metadata = metadata; 	return this; 	}
	public ServiceTemplateModel description(String description){	this.description = description; 	return this; 	}
	public ServiceTemplateModel repositories(List<RepositoryDefinitionModel> repositories){	this.repositories = repositories; 	return this; 	}
	public ServiceTemplateModel imports(List<ImportDefinitionModel> imports){	this.imports = imports; 	return this; 	}
	public ServiceTemplateModel artifactTypes(List<ArtifactTypeModel> artifact_types){	this.artifact_types = artifact_types; 	return this; 	}
	public ServiceTemplateModel dataTypes(List<DatatypeDefinitionModel> data_types){	this.data_types = data_types; 	return this; 	}
	public ServiceTemplateModel capabilityTypes(List<CapabilityDefinitionModel> capability_types){	this.capability_types = capability_types; 	return this; 	}
	public ServiceTemplateModel interfaceTypes(List<InterfaceTypeModel> interface_types){	this.interface_types = interface_types; 	return this; 	}
	public ServiceTemplateModel relationshipTypes(List<RelationshipDefinitionModel> relationship_types){	this.relationship_types = relationship_types; 	return this; 	}
	public ServiceTemplateModel nodeTypes(List<NodeDefinitionModel> node_types){	this.node_types = node_types; 	return this; 	}
	public ServiceTemplateModel groupTypes(List<GroupDefinitionModel> group_types){	this.group_types = group_types; 	return this; 	}
	public ServiceTemplateModel policyTypes(List<PolicyDefinitionModel> policy_types){	this.policy_types = policy_types; 	return this; 	}
	public ServiceTemplateModel topologyTemplates(TopologyTemplateModel topology_template){	this.topology_template = topology_template; 	return this; 	}


	/**
	 * @model 
	 */
	@XmlElement(name="tosca_definitions_version")
	public String getVersion(){
		return tosca_definitions_version;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="metadata")
	public Map<String, String> getMetaData(){
		return metadata;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="repositories")
	public List<RepositoryDefinitionModel> getRepositories(){
		return repositories;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="imports")
	public List<ImportDefinitionModel> getImports(){
		return imports;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="artifact_types")
	public List<ArtifactTypeModel> getArtifactTypes(){
		return artifact_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="data_types")
	public List<DatatypeDefinitionModel> getDataTypes(){
		return data_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="capability_types")
	public List<CapabilityDefinitionModel> getCapabilityTypes(){
		return capability_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="interface_types")
	public List<InterfaceTypeModel> getInterfaceTypes(){
		return interface_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="relationship_types")
	public List<RelationshipDefinitionModel> getRelationshipTypes(){
		return relationship_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="node_types")
	public List<NodeDefinitionModel> getNodeTypes(){
		return node_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="group_types")
	public List<GroupDefinitionModel> getGroupTypes(){
		return group_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="policy_types")
	public List<PolicyDefinitionModel> getPolicyTypes(){
		return policy_types;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="topology_template")
	public TopologyTemplateModel getTopologyTemplate(){
		return topology_template;
	}
	
}
