/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.DataModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl#getDataValue <em>Data Value</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDefinitionModelImpl extends MinimalEObjectImpl.Container implements AttributeDefinitionModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
	protected DataModel dataValue;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATTRIBUTE_DEFINITION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE_DEFINITION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE_DEFINITION_MODEL__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getDataValue() {
		if (dataValue != null && dataValue.eIsProxy()) {
			InternalEObject oldDataValue = (InternalEObject)dataValue;
			dataValue = (DataModel)eResolveProxy(oldDataValue);
			if (dataValue != oldDataValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE, oldDataValue, dataValue));
			}
		}
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel basicGetDataValue() {
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValue(DataModel newDataValue) {
		DataModel oldDataValue = dataValue;
		dataValue = newDataValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE, oldDataValue, dataValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE_DEFINITION_MODEL__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__NAME:
				return getName();
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__TYPE:
				return getType();
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE:
				if (resolve) return getDataValue();
				return basicGetDataValue();
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__STATUS:
				return getStatus();
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
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__TYPE:
				setType((String)newValue);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE:
				setDataValue((DataModel)newValue);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__STATUS:
				setStatus((String)newValue);
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
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE:
				setDataValue((DataModel)null);
				return;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE:
				return dataValue != null;
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //AttributeDefinitionModelImpl
