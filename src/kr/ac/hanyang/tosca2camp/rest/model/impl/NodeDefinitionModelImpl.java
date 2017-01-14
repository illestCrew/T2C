/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;
import kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.VersionModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeDefinitionModelImpl extends MinimalEObjectImpl.Container implements NodeDefinitionModel {
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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementDefinitionModel> requirements;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityDefinitionModel> capabilities;

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
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactTypeModel> artifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NODE_DEFINITION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_DEFINITION_MODEL__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_DEFINITION_MODEL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_DEFINITION_MODEL__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_DEFINITION_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModel> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<PropertyModel>(PropertyModel.class, this, ModelPackage.NODE_DEFINITION_MODEL__PROPERTIES);
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
			attributes = new EObjectResolvingEList<AttributeDefinitionModel>(AttributeDefinitionModel.class, this, ModelPackage.NODE_DEFINITION_MODEL__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementDefinitionModel> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<RequirementDefinitionModel>(RequirementDefinitionModel.class, this, ModelPackage.NODE_DEFINITION_MODEL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityDefinitionModel> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectResolvingEList<CapabilityDefinitionModel>(CapabilityDefinitionModel.class, this, ModelPackage.NODE_DEFINITION_MODEL__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceTypeModel> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<InterfaceTypeModel>(InterfaceTypeModel.class, this, ModelPackage.NODE_DEFINITION_MODEL__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactTypeModel> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectResolvingEList<ArtifactTypeModel>(ArtifactTypeModel.class, this, ModelPackage.NODE_DEFINITION_MODEL__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.NODE_DEFINITION_MODEL__TYPE_NAME:
				return getTypeName();
			case ModelPackage.NODE_DEFINITION_MODEL__DERIVED_FROM:
				return getDerivedFrom();
			case ModelPackage.NODE_DEFINITION_MODEL__VERSION:
				return getVersion();
			case ModelPackage.NODE_DEFINITION_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.NODE_DEFINITION_MODEL__PROPERTIES:
				return getProperties();
			case ModelPackage.NODE_DEFINITION_MODEL__ATTRIBUTES:
				return getAttributes();
			case ModelPackage.NODE_DEFINITION_MODEL__REQUIREMENTS:
				return getRequirements();
			case ModelPackage.NODE_DEFINITION_MODEL__CAPABILITIES:
				return getCapabilities();
			case ModelPackage.NODE_DEFINITION_MODEL__INTERFACES:
				return getInterfaces();
			case ModelPackage.NODE_DEFINITION_MODEL__ARTIFACTS:
				return getArtifacts();
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
			case ModelPackage.NODE_DEFINITION_MODEL__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__DERIVED_FROM:
				setDerivedFrom((String)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__VERSION:
				setVersion((VersionModel)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyModel>)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeDefinitionModel>)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends RequirementDefinitionModel>)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends CapabilityDefinitionModel>)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceTypeModel>)newValue);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends ArtifactTypeModel>)newValue);
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
			case ModelPackage.NODE_DEFINITION_MODEL__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__DERIVED_FROM:
				setDerivedFrom(DERIVED_FROM_EDEFAULT);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__CAPABILITIES:
				getCapabilities().clear();
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__INTERFACES:
				getInterfaces().clear();
				return;
			case ModelPackage.NODE_DEFINITION_MODEL__ARTIFACTS:
				getArtifacts().clear();
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
			case ModelPackage.NODE_DEFINITION_MODEL__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ModelPackage.NODE_DEFINITION_MODEL__DERIVED_FROM:
				return DERIVED_FROM_EDEFAULT == null ? derivedFrom != null : !DERIVED_FROM_EDEFAULT.equals(derivedFrom);
			case ModelPackage.NODE_DEFINITION_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.NODE_DEFINITION_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.NODE_DEFINITION_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.NODE_DEFINITION_MODEL__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ModelPackage.NODE_DEFINITION_MODEL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ModelPackage.NODE_DEFINITION_MODEL__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case ModelPackage.NODE_DEFINITION_MODEL__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ModelPackage.NODE_DEFINITION_MODEL__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //NodeDefinitionModelImpl
