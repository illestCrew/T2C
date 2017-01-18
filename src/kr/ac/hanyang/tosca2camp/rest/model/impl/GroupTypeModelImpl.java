/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.io.Serializable;
import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
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
 * An implementation of the model object '<em><b>Group Type Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupTypeModelImpl extends MinimalEObjectImpl.Container implements GroupTypeModel, Serializable {
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
	 * The default value of the '{@link #getMembers() <em>Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final String[] MEMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected String[] members = MEMBERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceTypeModel> interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupTypeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GROUP_TYPE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GROUP_TYPE_MODEL__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GROUP_TYPE_MODEL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GROUP_TYPE_MODEL__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GROUP_TYPE_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModel> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<PropertyModel>(PropertyModel.class, this, ModelPackage.GROUP_TYPE_MODEL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getMembers() {
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembers(String[] newMembers) {
		String[] oldMembers = members;
		members = newMembers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GROUP_TYPE_MODEL__MEMBERS, oldMembers, members));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceTypeModel> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<InterfaceTypeModel>(InterfaceTypeModel.class, this, ModelPackage.GROUP_TYPE_MODEL__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.GROUP_TYPE_MODEL__TYPE_NAME:
				return getTypeName();
			case ModelPackage.GROUP_TYPE_MODEL__DERIVED_FROM:
				return getDerivedFrom();
			case ModelPackage.GROUP_TYPE_MODEL__VERSION:
				return getVersion();
			case ModelPackage.GROUP_TYPE_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.GROUP_TYPE_MODEL__PROPERTIES:
				return getProperties();
			case ModelPackage.GROUP_TYPE_MODEL__MEMBERS:
				return getMembers();
			case ModelPackage.GROUP_TYPE_MODEL__INTERFACES:
				return getInterfaces();
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
			case ModelPackage.GROUP_TYPE_MODEL__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__DERIVED_FROM:
				setDerivedFrom((String)newValue);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__VERSION:
				setVersion((VersionModel)newValue);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyModel>)newValue);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__MEMBERS:
				setMembers((String[])newValue);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceTypeModel>)newValue);
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
			case ModelPackage.GROUP_TYPE_MODEL__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__DERIVED_FROM:
				setDerivedFrom(DERIVED_FROM_EDEFAULT);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.GROUP_TYPE_MODEL__MEMBERS:
				setMembers(MEMBERS_EDEFAULT);
				return;
			case ModelPackage.GROUP_TYPE_MODEL__INTERFACES:
				getInterfaces().clear();
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
			case ModelPackage.GROUP_TYPE_MODEL__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ModelPackage.GROUP_TYPE_MODEL__DERIVED_FROM:
				return DERIVED_FROM_EDEFAULT == null ? derivedFrom != null : !DERIVED_FROM_EDEFAULT.equals(derivedFrom);
			case ModelPackage.GROUP_TYPE_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.GROUP_TYPE_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.GROUP_TYPE_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.GROUP_TYPE_MODEL__MEMBERS:
				return MEMBERS_EDEFAULT == null ? members != null : !MEMBERS_EDEFAULT.equals(members);
			case ModelPackage.GROUP_TYPE_MODEL__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
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
		result.append(", members: ");
		result.append(members);
		result.append(')');
		return result.toString();
	}

} //GroupTypeModelImpl
