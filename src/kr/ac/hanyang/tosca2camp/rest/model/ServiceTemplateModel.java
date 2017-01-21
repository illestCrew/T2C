package kr.ac.hanyang.tosca2camp.rest.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
@XmlRootElement
public interface ServiceTemplateModel extends EObject{


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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getTopologyTemplate <em>Topology Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Template</em>' containment reference.
	 * @see #getTopologyTemplate()
	 * @generated
	 */
	void setTopologyTemplate(TopologyTemplateModel value);
	
	//public void eSet(int featureID, Object newValue);
}
