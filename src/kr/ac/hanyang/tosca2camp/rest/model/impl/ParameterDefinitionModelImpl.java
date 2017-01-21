/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel;
import kr.ac.hanyang.tosca2camp.rest.model.DataModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel;

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
 * An implementation of the model object '<em><b>Parameter Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getDataValue <em>Data Value</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getValue <em>Value</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl#getEntrySchema <em>Entry Schema</em>}</li>
 * </ul>
 *
 * 
 */
public class ParameterDefinitionModelImpl extends MinimalEObjectImpl.Container implements ParameterDefinitionModel, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7737351522062695769L;

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
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
	protected DataModel dataValue;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DataModel value;

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
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintModel> constraint;

	/**
	 * The default value of the '{@link #getEntrySchema() <em>Entry Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrySchema()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntrySchema() <em>Entry Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrySchema()
	 * @generated
	 * @ordered
	 */
	protected String entrySchema = ENTRY_SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PARAMETER_DEFINITION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getDataValue() {
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataValue(DataModel newDataValue, NotificationChain msgs) {
		DataModel oldDataValue = dataValue;
		dataValue = newDataValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE, oldDataValue, newDataValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValue(DataModel newDataValue) {
		if (newDataValue != dataValue) {
			NotificationChain msgs = null;
			if (dataValue != null)
				msgs = ((InternalEObject)dataValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE, null, msgs);
			if (newDataValue != null)
				msgs = ((InternalEObject)newDataValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE, null, msgs);
			msgs = basicSetDataValue(newDataValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE, newDataValue, newDataValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (DataModel)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PARAMETER_DEFINITION_MODEL__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(DataModel newValue) {
		DataModel oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintModel> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<ConstraintModel>(ConstraintModel.class, this, ModelPackage.PARAMETER_DEFINITION_MODEL__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntrySchema() {
		return entrySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrySchema(String newEntrySchema) {
		String oldEntrySchema = entrySchema;
		entrySchema = newEntrySchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA, oldEntrySchema, entrySchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getRequired() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE:
				return basicSetDataValue(null, msgs);
			case ModelPackage.PARAMETER_DEFINITION_MODEL__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.PARAMETER_DEFINITION_MODEL__NAME:
				return getName();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__TYPE:
				return getType();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE:
				return getDataValue();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__STATUS:
				return getStatus();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__CONSTRAINT:
				return getConstraint();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA:
				return getEntrySchema();
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
			case ModelPackage.PARAMETER_DEFINITION_MODEL__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__TYPE:
				setType((String)newValue);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE:
				setDataValue((DataModel)newValue);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__VALUE:
				setValue((DataModel)newValue);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__STATUS:
				setStatus((String)newValue);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends ConstraintModel>)newValue);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA:
				setEntrySchema((String)newValue);
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
			case ModelPackage.PARAMETER_DEFINITION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE:
				setDataValue((DataModel)null);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__VALUE:
				setValue((DataModel)null);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__CONSTRAINT:
				getConstraint().clear();
				return;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA:
				setEntrySchema(ENTRY_SCHEMA_EDEFAULT);
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
			case ModelPackage.PARAMETER_DEFINITION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PARAMETER_DEFINITION_MODEL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.PARAMETER_DEFINITION_MODEL__DATA_VALUE:
				return dataValue != null;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__VALUE:
				return value != null;
			case ModelPackage.PARAMETER_DEFINITION_MODEL__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ModelPackage.PARAMETER_DEFINITION_MODEL__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case ModelPackage.PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA:
				return ENTRY_SCHEMA_EDEFAULT == null ? entrySchema != null : !ENTRY_SCHEMA_EDEFAULT.equals(entrySchema);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.PARAMETER_DEFINITION_MODEL___GET_REQUIRED:
				return getRequired();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", entrySchema: ");
		result.append(entrySchema);
		result.append(')');
		return result.toString();
	}

} //ParameterDefinitionModelImpl
