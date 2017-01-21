/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.io.Serializable;
import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl#getInputs_definitions <em>Inputs definitions</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl#getInputs_assignments <em>Inputs assignments</em>}</li>
 * </ul>
 *
 * 
 */
public class OperationDefinitionModelImpl extends MinimalEObjectImpl.Container implements OperationDefinitionModel, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1373994651654367485L;

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
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs_definitions() <em>Inputs definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs_definitions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyModel> inputs_definitions;

	/**
	 * The cached value of the '{@link #getInputs_assignments() <em>Inputs assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs_assignments()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAssignmentModel> inputs_assignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OPERATION_DEFINITION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OPERATION_DEFINITION_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OPERATION_DEFINITION_MODEL__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModel> getInputs_definitions() {
		if (inputs_definitions == null) {
			inputs_definitions = new EObjectContainmentEList<PropertyModel>(PropertyModel.class, this, ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS);
		}
		return inputs_definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAssignmentModel> getInputs_assignments() {
		if (inputs_assignments == null) {
			inputs_assignments = new EObjectContainmentEList<PropertyAssignmentModel>(PropertyAssignmentModel.class, this, ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS);
		}
		return inputs_assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS:
				return ((InternalEList<?>)getInputs_definitions()).basicRemove(otherEnd, msgs);
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS:
				return ((InternalEList<?>)getInputs_assignments()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.OPERATION_DEFINITION_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.OPERATION_DEFINITION_MODEL__IMPLEMENTATION:
				return getImplementation();
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS:
				return getInputs_definitions();
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS:
				return getInputs_assignments();
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
			case ModelPackage.OPERATION_DEFINITION_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.OPERATION_DEFINITION_MODEL__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS:
				getInputs_definitions().clear();
				getInputs_definitions().addAll((Collection<? extends PropertyModel>)newValue);
				return;
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS:
				getInputs_assignments().clear();
				getInputs_assignments().addAll((Collection<? extends PropertyAssignmentModel>)newValue);
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
			case ModelPackage.OPERATION_DEFINITION_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.OPERATION_DEFINITION_MODEL__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS:
				getInputs_definitions().clear();
				return;
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS:
				getInputs_assignments().clear();
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
			case ModelPackage.OPERATION_DEFINITION_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.OPERATION_DEFINITION_MODEL__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS:
				return inputs_definitions != null && !inputs_definitions.isEmpty();
			case ModelPackage.OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS:
				return inputs_assignments != null && !inputs_assignments.isEmpty();
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
		result.append(", implementation: ");
		result.append(implementation);
		result.append(')');
		return result.toString();
	}

} //OperationDefinitionModelImpl
