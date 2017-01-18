package kr.ac.hanyang.tosca2camp.rest.model;
import java.io.Serializable;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
@XmlRootElement
public interface ServiceTemplateModel extends EObject{// implements EObject, Serializable{

	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1679463079123644230L;
//	private String tosca_definitions_version;
//	private Map<String, String> metadata;
//	private String description;
//	private List<RepositoryDefinitionModel> repositories;
//	private List<ImportDefinitionModel> imports;
//	private List<ArtifactTypeModel> artifact_types;
//	private List<DatatypeDefinitionModel> data_types;
//	private List<CapabilityDefinitionModel> capability_types;
//	private List<InterfaceTypeModel> interface_types;
//	private List<RelationshipDefinitionModel> relationship_types;
//	private List<NodeDefinitionModel> node_types;
//	private List<GroupDefinitionModel> group_types;
//	private List<PolicyDefinitionModel> policy_types;
//	private TopologyTemplateModel topology_template;
//	//private List<ArtifactDefinitionModel> artifacts;
//	
//	
//	public ServiceTemplateModel(){ }
//	
//	public static ServiceTemplateModel of(){
//		return new ServiceTemplateModel();
//	}
//	public ServiceTemplateModel toscaDefinition(String tosca_definitions_version){	this.tosca_definitions_version = tosca_definitions_version; 	return this; 	}
//	public ServiceTemplateModel metadata(Map<String, String> metadata){	this.metadata = metadata; 	return this; 	}
//	public ServiceTemplateModel description(String description){	this.description = description; 	return this; 	}
//	public ServiceTemplateModel repositories(List<RepositoryDefinitionModel> repositories){	this.repositories = repositories; 	return this; 	}
//	public ServiceTemplateModel imports(List<ImportDefinitionModel> imports){	this.imports = imports; 	return this; 	}
//	public ServiceTemplateModel artifactTypes(List<ArtifactTypeModel> artifact_types){	this.artifact_types = artifact_types; 	return this; 	}
//	public ServiceTemplateModel dataTypes(List<DatatypeDefinitionModel> data_types){	this.data_types = data_types; 	return this; 	}
//	public ServiceTemplateModel capabilityTypes(List<CapabilityDefinitionModel> capability_types){	this.capability_types = capability_types; 	return this; 	}
//	public ServiceTemplateModel interfaceTypes(List<InterfaceTypeModel> interface_types){	this.interface_types = interface_types; 	return this; 	}
//	public ServiceTemplateModel relationshipTypes(List<RelationshipDefinitionModel> relationship_types){	this.relationship_types = relationship_types; 	return this; 	}
//	public ServiceTemplateModel nodeTypes(List<NodeDefinitionModel> node_types){	this.node_types = node_types; 	return this; 	}
//	public ServiceTemplateModel groupTypes(List<GroupDefinitionModel> group_types){	this.group_types = group_types; 	return this; 	}
//	public ServiceTemplateModel policyTypes(List<PolicyDefinitionModel> policy_types){	this.policy_types = policy_types; 	return this; 	}
//	public ServiceTemplateModel topologyTemplates(TopologyTemplateModel topology_template){	this.topology_template = topology_template; 	return this; 	}


	/**
	 * @model 
	 */
	@XmlElement(name="tosca_definitions_version")
	public String getVersion();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

//	/**
//	 * 
//	 */
//	@XmlElement(name="metadata")
//	public Map<String, String> getMetaData();
	
//	/**
//	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getMetaData <em>Meta Data</em>}' attribute.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @param value the new value of the '<em>Meta Data</em>' attribute.
//	 * @see #getMetaData()
//	 * 
//	 */
//	void setMetaData(Map<String, String> value);

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="repositories")
	public EList<RepositoryDefinitionModel> getRepositories();
	
	/**
	 * @model 
	 */
	@XmlElement(name="imports")
	public EList<ImportDefinitionModel> getImports();
	
	/**
	 * @model 
	 */
	@XmlElement(name="artifact_types")
	public EList<ArtifactTypeModel> getArtifactTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="data_types")
	public EList<DatatypeDefinitionModel> getDataTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="capability_types")
	public EList<CapabilityDefinitionModel> getCapabilityTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="interface_types")
	public EList<InterfaceTypeModel> getInterfaceTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="relationship_types")
	public EList<RelationshipDefinitionModel> getRelationshipTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="node_types")
	public EList<NodeDefinitionModel> getNodeTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="group_types")
	public EList<GroupDefinitionModel> getGroupTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="policy_types")
	public EList<PolicyDefinitionModel> getPolicyTypes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="topology_template")
	public TopologyTemplateModel getTopologyTemplate();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getTopologyTemplate <em>Topology Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Template</em>' reference.
	 * @see #getTopologyTemplate()
	 * @generated
	 */
	void setTopologyTemplate(TopologyTemplateModel value);
	
	public void eSet(int featureID, Object newValue);
}
