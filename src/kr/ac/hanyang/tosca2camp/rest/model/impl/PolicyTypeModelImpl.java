/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;
import kr.ac.hanyang.tosca2camp.rest.model.VersionModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Type Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyTypeModelImpl extends MinimalEObjectImpl.Container implements PolicyTypeModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedFrom() <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected String derivedFrom = DERIVED_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final VersionModel VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected VersionModel version = VERSION_EDEFAULT;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyModel> properties;

	/**
	 * The default value of the '{@link #getTargets() <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final String[] TARGETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected String[] targets = TARGETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyTypeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.POLICY_TYPE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLICY_TYPE_MODEL__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(String newDerivedFrom) {
		String oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLICY_TYPE_MODEL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionModel getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(VersionModel newVersion) {
		VersionModel oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLICY_TYPE_MODEL__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLICY_TYPE_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModel> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<PropertyModel>(PropertyModel.class, this, ModelPackage.POLICY_TYPE_MODEL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getTargets() {
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargets(String[] newTargets) {
		String[] oldTargets = targets;
		targets = newTargets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLICY_TYPE_MODEL__TARGETS, oldTargets, targets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.POLICY_TYPE_MODEL__TYPE_NAME:
				return getTypeName();
			case ModelPackage.POLICY_TYPE_MODEL__DERIVED_FROM:
				return getDerivedFrom();
			case ModelPackage.POLICY_TYPE_MODEL__VERSION:
				return getVersion();
			case ModelPackage.POLICY_TYPE_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.POLICY_TYPE_MODEL__PROPERTIES:
				return getProperties();
			case ModelPackage.POLICY_TYPE_MODEL__TARGETS:
				return getTargets();
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
			case ModelPackage.POLICY_TYPE_MODEL__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__DERIVED_FROM:
				setDerivedFrom((String)newValue);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__VERSION:
				setVersion((VersionModel)newValue);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyModel>)newValue);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__TARGETS:
				setTargets((String[])newValue);
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
			case ModelPackage.POLICY_TYPE_MODEL__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__DERIVED_FROM:
				setDerivedFrom(DERIVED_FROM_EDEFAULT);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.POLICY_TYPE_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.POLICY_TYPE_MODEL__TARGETS:
				setTargets(TARGETS_EDEFAULT);
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
			case ModelPackage.POLICY_TYPE_MODEL__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ModelPackage.POLICY_TYPE_MODEL__DERIVED_FROM:
				return DERIVED_FROM_EDEFAULT == null ? derivedFrom != null : !DERIVED_FROM_EDEFAULT.equals(derivedFrom);
			case ModelPackage.POLICY_TYPE_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.POLICY_TYPE_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.POLICY_TYPE_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.POLICY_TYPE_MODEL__TARGETS:
				return TARGETS_EDEFAULT == null ? targets != null : !TARGETS_EDEFAULT.equals(targets);
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", derivedFrom: ");
		result.append(derivedFrom);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", targets: ");
		result.append(targets);
		result.append(')');
		return result.toString();
	}

} //PolicyTypeModelImpl
