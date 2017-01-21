/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Assignment Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementAssignmentModelImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementAssignmentModelImpl#getNode <em>Node</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementAssignmentModelImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * 
 */
public class RequirementAssignmentModelImpl extends MinimalEObjectImpl.Container implements RequirementAssignmentModel, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7889160460992594372L;

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
	 * The default value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected String relationship = RELATIONSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementAssignmentModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REQUIREMENT_ASSIGNMENT_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY, oldCapability, capability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(String newRelationship) {
		String oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY:
				return getCapability();
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__NODE:
				return getNode();
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP:
				return getRelationship();
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
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY:
				setCapability((String)newValue);
				return;
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__NODE:
				setNode((String)newValue);
				return;
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP:
				setRelationship((String)newValue);
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
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY:
				setCapability(CAPABILITY_EDEFAULT);
				return;
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP:
				setRelationship(RELATIONSHIP_EDEFAULT);
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
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY:
				return CAPABILITY_EDEFAULT == null ? capability != null : !CAPABILITY_EDEFAULT.equals(capability);
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP:
				return RELATIONSHIP_EDEFAULT == null ? relationship != null : !RELATIONSHIP_EDEFAULT.equals(relationship);
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
		result.append(", relationship: ");
		result.append(relationship);
		result.append(')');
		return result.toString();
	}

} //RequirementAssignmentModelImpl
