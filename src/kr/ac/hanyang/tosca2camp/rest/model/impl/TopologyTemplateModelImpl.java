/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.io.Serializable;
import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Template Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl#getNodeTemplates <em>Node Templates</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl#getRelationshipTemplates <em>Relationship Templates</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyTemplateModelImpl extends MinimalEObjectImpl.Container implements TopologyTemplateModel, Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDefinitionModel> inputs;

	/**
	 * The cached value of the '{@link #getNodeTemplates() <em>Node Templates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeTemplateModel> nodeTemplates;

	/**
	 * The cached value of the '{@link #getRelationshipTemplates() <em>Relationship Templates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipTemplateModel> relationshipTemplates;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupDefinitionModel> groups;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyDefinitionModel> policies;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDefinitionModel> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyTemplateModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TOPOLOGY_TEMPLATE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDefinitionModel> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<ParameterDefinitionModel>(ParameterDefinitionModel.class, this, ModelPackage.TOPOLOGY_TEMPLATE_MODEL__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeTemplateModel> getNodeTemplates() {
		if (nodeTemplates == null) {
			nodeTemplates = new EObjectResolvingEList<NodeTemplateModel>(NodeTemplateModel.class, this, ModelPackage.TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES);
		}
		return nodeTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipTemplateModel> getRelationshipTemplates() {
		if (relationshipTemplates == null) {
			relationshipTemplates = new EObjectResolvingEList<RelationshipTemplateModel>(RelationshipTemplateModel.class, this, ModelPackage.TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES);
		}
		return relationshipTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupDefinitionModel> getGroups() {
		if (groups == null) {
			groups = new EObjectResolvingEList<GroupDefinitionModel>(GroupDefinitionModel.class, this, ModelPackage.TOPOLOGY_TEMPLATE_MODEL__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyDefinitionModel> getPolicies() {
		if (policies == null) {
			policies = new EObjectResolvingEList<PolicyDefinitionModel>(PolicyDefinitionModel.class, this, ModelPackage.TOPOLOGY_TEMPLATE_MODEL__POLICIES);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDefinitionModel> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<ParameterDefinitionModel>(ParameterDefinitionModel.class, this, ModelPackage.TOPOLOGY_TEMPLATE_MODEL__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__INPUTS:
				return getInputs();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES:
				return getNodeTemplates();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES:
				return getRelationshipTemplates();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__GROUPS:
				return getGroups();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__POLICIES:
				return getPolicies();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__OUTPUTS:
				return getOutputs();
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
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ParameterDefinitionModel>)newValue);
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES:
				getNodeTemplates().clear();
				getNodeTemplates().addAll((Collection<? extends NodeTemplateModel>)newValue);
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES:
				getRelationshipTemplates().clear();
				getRelationshipTemplates().addAll((Collection<? extends RelationshipTemplateModel>)newValue);
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends GroupDefinitionModel>)newValue);
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__POLICIES:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends PolicyDefinitionModel>)newValue);
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ParameterDefinitionModel>)newValue);
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
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__INPUTS:
				getInputs().clear();
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES:
				getNodeTemplates().clear();
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES:
				getRelationshipTemplates().clear();
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__GROUPS:
				getGroups().clear();
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__POLICIES:
				getPolicies().clear();
				return;
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__OUTPUTS:
				getOutputs().clear();
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
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES:
				return nodeTemplates != null && !nodeTemplates.isEmpty();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES:
				return relationshipTemplates != null && !relationshipTemplates.isEmpty();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__GROUPS:
				return groups != null && !groups.isEmpty();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__POLICIES:
				return policies != null && !policies.isEmpty();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TopologyTemplateModelImpl
