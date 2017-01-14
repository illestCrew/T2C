/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceDefinitionModelImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefinitionModelImpl extends MinimalEObjectImpl.Container implements InterfaceDefinitionModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyModel> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INTERFACE_DEFINITION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModel> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<PropertyModel>(PropertyModel.class, this, ModelPackage.INTERFACE_DEFINITION_MODEL__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.INTERFACE_DEFINITION_MODEL__INPUTS:
				return getInputs();
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
			case ModelPackage.INTERFACE_DEFINITION_MODEL__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends PropertyModel>)newValue);
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
			case ModelPackage.INTERFACE_DEFINITION_MODEL__INPUTS:
				getInputs().clear();
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
			case ModelPackage.INTERFACE_DEFINITION_MODEL__INPUTS:
				return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceDefinitionModelImpl
