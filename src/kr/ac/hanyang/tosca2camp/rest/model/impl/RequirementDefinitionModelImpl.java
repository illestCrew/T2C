/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl#getNode <em>Node</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl#getRelationship_type <em>Relationship type</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl#getRelationship_definition <em>Relationship definition</em>}</li>
 * </ul>
 *
 * 
 */
public class RequirementDefinitionModelImpl extends MinimalEObjectImpl.Container implements RequirementDefinitionModel, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9170429555364059598L;

	/**
	 * The default value of the '{@link #getCapability() <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected String capability = CAPABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationship_type() <em>Relationship type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship_type()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationship_type() <em>Relationship type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship_type()
	 * @generated
	 * @ordered
	 */
	protected String relationship_type = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationship_definition() <em>Relationship definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship_definition()
	 * @generated
	 * @ordered
	 */
	protected RelationshipDefinitionModel relationship_definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REQUIREMENT_DEFINITION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(String newCapability) {
		String oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_DEFINITION_MODEL__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_DEFINITION_MODEL__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationship_type() {
		return relationship_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship_type(String newRelationship_type) {
		String oldRelationship_type = relationship_type;
		relationship_type = newRelationship_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE, oldRelationship_type, relationship_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDefinitionModel getRelationship_definition() {
		return relationship_definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship_definition(RelationshipDefinitionModel newRelationship_definition, NotificationChain msgs) {
		RelationshipDefinitionModel oldRelationship_definition = relationship_definition;
		relationship_definition = newRelationship_definition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION, oldRelationship_definition, newRelationship_definition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship_definition(RelationshipDefinitionModel newRelationship_definition) {
		if (newRelationship_definition != relationship_definition) {
			NotificationChain msgs = null;
			if (relationship_definition != null)
				msgs = ((InternalEObject)relationship_definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION, null, msgs);
			if (newRelationship_definition != null)
				msgs = ((InternalEObject)newRelationship_definition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION, null, msgs);
			msgs = basicSetRelationship_definition(newRelationship_definition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION, newRelationship_definition, newRelationship_definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION:
				return basicSetRelationship_definition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__CAPABILITY:
				return getCapability();
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__NODE:
				return getNode();
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE:
				return getRelationship_type();
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION:
				return getRelationship_definition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__CAPABILITY:
				setCapability((String)newValue);
				return;
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__NODE:
				setNode((String)newValue);
				return;
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE:
				setRelationship_type((String)newValue);
				return;
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION:
				setRelationship_definition((RelationshipDefinitionModel)newValue);
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
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__CAPABILITY:
				setCapability(CAPABILITY_EDEFAULT);
				return;
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE:
				setRelationship_type(RELATIONSHIP_TYPE_EDEFAULT);
				return;
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION:
				setRelationship_definition((RelationshipDefinitionModel)null);
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
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__CAPABILITY:
				return CAPABILITY_EDEFAULT == null ? capability != null : !CAPABILITY_EDEFAULT.equals(capability);
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE:
				return RELATIONSHIP_TYPE_EDEFAULT == null ? relationship_type != null : !RELATIONSHIP_TYPE_EDEFAULT.equals(relationship_type);
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION:
				return relationship_definition != null;
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
		result.append(" (capability: ");
		result.append(capability);
		result.append(", node: ");
		result.append(node);
		result.append(", relationship_type: ");
		result.append(relationship_type);
		result.append(')');
		return result.toString();
	}

} //RequirementDefinitionModelImpl
