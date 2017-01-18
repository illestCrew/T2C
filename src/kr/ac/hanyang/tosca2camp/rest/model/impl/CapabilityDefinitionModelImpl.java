/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.io.Serializable;
import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel;
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
 * An implementation of the model object '<em><b>Capability Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl#getValidSources <em>Valid Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityDefinitionModelImpl extends MinimalEObjectImpl.Container implements CapabilityDefinitionModel, Serializable {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinitionModel> attributes;

	/**
	 * The default value of the '{@link #getValidSources() <em>Valid Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidSources()
	 * @generated
	 * @ordered
	 */
	protected static final String[] VALID_SOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidSources() <em>Valid Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidSources()
	 * @generated
	 * @ordered
	 */
	protected String[] validSources = VALID_SOURCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CAPABILITY_DEFINITION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAPABILITY_DEFINITION_MODEL__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAPABILITY_DEFINITION_MODEL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAPABILITY_DEFINITION_MODEL__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAPABILITY_DEFINITION_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModel> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<PropertyModel>(PropertyModel.class, this, ModelPackage.CAPABILITY_DEFINITION_MODEL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinitionModel> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<AttributeDefinitionModel>(AttributeDefinitionModel.class, this, ModelPackage.CAPABILITY_DEFINITION_MODEL__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getValidSources() {
		return validSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidSources(String[] newValidSources) {
		String[] oldValidSources = validSources;
		validSources = newValidSources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAPABILITY_DEFINITION_MODEL__VALID_SOURCES, oldValidSources, validSources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__TYPE_NAME:
				return getTypeName();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DERIVED_FROM:
				return getDerivedFrom();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VERSION:
				return getVersion();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__PROPERTIES:
				return getProperties();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__ATTRIBUTES:
				return getAttributes();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VALID_SOURCES:
				return getValidSources();
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
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DERIVED_FROM:
				setDerivedFrom((String)newValue);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VERSION:
				setVersion((VersionModel)newValue);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyModel>)newValue);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeDefinitionModel>)newValue);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VALID_SOURCES:
				setValidSources((String[])newValue);
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
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DERIVED_FROM:
				setDerivedFrom(DERIVED_FROM_EDEFAULT);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VALID_SOURCES:
				setValidSources(VALID_SOURCES_EDEFAULT);
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
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DERIVED_FROM:
				return DERIVED_FROM_EDEFAULT == null ? derivedFrom != null : !DERIVED_FROM_EDEFAULT.equals(derivedFrom);
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL__VALID_SOURCES:
				return VALID_SOURCES_EDEFAULT == null ? validSources != null : !VALID_SOURCES_EDEFAULT.equals(validSources);
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
		result.append(", validSources: ");
		result.append(validSources);
		result.append(')');
		return result.toString();
	}

} //CapabilityDefinitionModelImpl
