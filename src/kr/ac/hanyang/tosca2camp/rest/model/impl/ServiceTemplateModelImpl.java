/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.util.Collection;
import java.util.Map;

import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Template Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getArtifactTypes <em>Artifact Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getCapabilityTypes <em>Capability Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getInterfaceTypes <em>Interface Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getRelationshipTypes <em>Relationship Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getGroupTypes <em>Group Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getPolicyTypes <em>Policy Types</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl#getTopologyTemplate <em>Topology Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTemplateModelImpl extends MinimalEObjectImpl.Container implements ServiceTemplateModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> metaData;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryDefinitionModel> repositories;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDefinitionModel> imports;

	/**
	 * The cached value of the '{@link #getArtifactTypes() <em>Artifact Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactTypeModel> artifactTypes;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDefinitionModel> dataTypes;

	/**
	 * The cached value of the '{@link #getCapabilityTypes() <em>Capability Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityDefinitionModel> capabilityTypes;

	/**
	 * The cached value of the '{@link #getInterfaceTypes() <em>Interface Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceTypeModel> interfaceTypes;

	/**
	 * The cached value of the '{@link #getRelationshipTypes() <em>Relationship Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipDefinitionModel> relationshipTypes;

	/**
	 * The cached value of the '{@link #getNodeTypes() <em>Node Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeDefinitionModel> nodeTypes;

	/**
	 * The cached value of the '{@link #getGroupTypes() <em>Group Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupDefinitionModel> groupTypes;

	/**
	 * The cached value of the '{@link #getPolicyTypes() <em>Policy Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyDefinitionModel> policyTypes;

	/**
	 * The cached value of the '{@link #getTopologyTemplate() <em>Topology Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyTemplate()
	 * @generated
	 * @ordered
	 */
	protected TopologyTemplateModel topologyTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTemplateModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SERVICE_TEMPLATE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVICE_TEMPLATE_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(Map<String, String> newMetaData) {
		Map<String, String> oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVICE_TEMPLATE_MODEL__META_DATA, oldMetaData, metaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVICE_TEMPLATE_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryDefinitionModel> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectResolvingEList<RepositoryDefinitionModel>(RepositoryDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportDefinitionModel> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<ImportDefinitionModel>(ImportDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactTypeModel> getArtifactTypes() {
		if (artifactTypes == null) {
			artifactTypes = new EObjectResolvingEList<ArtifactTypeModel>(ArtifactTypeModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES);
		}
		return artifactTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionModel> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectResolvingEList<DatatypeDefinitionModel>(DatatypeDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityDefinitionModel> getCapabilityTypes() {
		if (capabilityTypes == null) {
			capabilityTypes = new EObjectResolvingEList<CapabilityDefinitionModel>(CapabilityDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES);
		}
		return capabilityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceTypeModel> getInterfaceTypes() {
		if (interfaceTypes == null) {
			interfaceTypes = new EObjectResolvingEList<InterfaceTypeModel>(InterfaceTypeModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES);
		}
		return interfaceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipDefinitionModel> getRelationshipTypes() {
		if (relationshipTypes == null) {
			relationshipTypes = new EObjectResolvingEList<RelationshipDefinitionModel>(RelationshipDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES);
		}
		return relationshipTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeDefinitionModel> getNodeTypes() {
		if (nodeTypes == null) {
			nodeTypes = new EObjectResolvingEList<NodeDefinitionModel>(NodeDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__NODE_TYPES);
		}
		return nodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupDefinitionModel> getGroupTypes() {
		if (groupTypes == null) {
			groupTypes = new EObjectResolvingEList<GroupDefinitionModel>(GroupDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__GROUP_TYPES);
		}
		return groupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyDefinitionModel> getPolicyTypes() {
		if (policyTypes == null) {
			policyTypes = new EObjectResolvingEList<PolicyDefinitionModel>(PolicyDefinitionModel.class, this, ModelPackage.SERVICE_TEMPLATE_MODEL__POLICY_TYPES);
		}
		return policyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTemplateModel getTopologyTemplate() {
		if (topologyTemplate != null && topologyTemplate.eIsProxy()) {
			InternalEObject oldTopologyTemplate = (InternalEObject)topologyTemplate;
			topologyTemplate = (TopologyTemplateModel)eResolveProxy(oldTopologyTemplate);
			if (topologyTemplate != oldTopologyTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE, oldTopologyTemplate, topologyTemplate));
			}
		}
		return topologyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTemplateModel basicGetTopologyTemplate() {
		return topologyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyTemplate(TopologyTemplateModel newTopologyTemplate) {
		TopologyTemplateModel oldTopologyTemplate = topologyTemplate;
		topologyTemplate = newTopologyTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE, oldTopologyTemplate, topologyTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SERVICE_TEMPLATE_MODEL__VERSION:
				return getVersion();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__META_DATA:
				return getMetaData();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__REPOSITORIES:
				return getRepositories();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__IMPORTS:
				return getImports();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES:
				return getArtifactTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DATA_TYPES:
				return getDataTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES:
				return getCapabilityTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES:
				return getInterfaceTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES:
				return getRelationshipTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__NODE_TYPES:
				return getNodeTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__GROUP_TYPES:
				return getGroupTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__POLICY_TYPES:
				return getPolicyTypes();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE:
				if (resolve) return getTopologyTemplate();
				return basicGetTopologyTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.SERVICE_TEMPLATE_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__META_DATA:
				setMetaData((Map<String, String>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends RepositoryDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES:
				getArtifactTypes().clear();
				getArtifactTypes().addAll((Collection<? extends ArtifactTypeModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DatatypeDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES:
				getCapabilityTypes().clear();
				getCapabilityTypes().addAll((Collection<? extends CapabilityDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				getInterfaceTypes().addAll((Collection<? extends InterfaceTypeModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES:
				getRelationshipTypes().clear();
				getRelationshipTypes().addAll((Collection<? extends RelationshipDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__NODE_TYPES:
				getNodeTypes().clear();
				getNodeTypes().addAll((Collection<? extends NodeDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__GROUP_TYPES:
				getGroupTypes().clear();
				getGroupTypes().addAll((Collection<? extends GroupDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__POLICY_TYPES:
				getPolicyTypes().clear();
				getPolicyTypes().addAll((Collection<? extends PolicyDefinitionModel>)newValue);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE:
				setTopologyTemplate((TopologyTemplateModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.SERVICE_TEMPLATE_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__META_DATA:
				setMetaData((Map<String, String>)null);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__REPOSITORIES:
				getRepositories().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__IMPORTS:
				getImports().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES:
				getArtifactTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DATA_TYPES:
				getDataTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES:
				getCapabilityTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES:
				getRelationshipTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__NODE_TYPES:
				getNodeTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__GROUP_TYPES:
				getGroupTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__POLICY_TYPES:
				getPolicyTypes().clear();
				return;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE:
				setTopologyTemplate((TopologyTemplateModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.SERVICE_TEMPLATE_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.SERVICE_TEMPLATE_MODEL__META_DATA:
				return metaData != null;
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.SERVICE_TEMPLATE_MODEL__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES:
				return artifactTypes != null && !artifactTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES:
				return capabilityTypes != null && !capabilityTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES:
				return interfaceTypes != null && !interfaceTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES:
				return relationshipTypes != null && !relationshipTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__NODE_TYPES:
				return nodeTypes != null && !nodeTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__GROUP_TYPES:
				return groupTypes != null && !groupTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__POLICY_TYPES:
				return policyTypes != null && !policyTypes.isEmpty();
			case ModelPackage.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE:
				return topologyTemplate != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", metaData: ");
		result.append(metaData);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ServiceTemplateModelImpl
