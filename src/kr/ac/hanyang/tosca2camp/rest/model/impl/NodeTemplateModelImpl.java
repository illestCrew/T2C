/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.util.Collection;

import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;
import kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Template Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTemplateModelImpl extends MinimalEObjectImpl.Container implements NodeTemplateModel {
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
	 * The default value of the '{@link #getDirectives() <em>Directives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTIVES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected String directives = DIRECTIVES_EDEFAULT;

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
	protected EList<AttributeAssignmentModel> attributes;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementAssignmentModel> requirements;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityAssignmentModel> capabilities;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDefinitionModel> interfaces;

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
	protected NodeTemplateModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NODE_TEMPLATE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_TEMPLATE_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_TEMPLATE_MODEL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectives() {
		return directives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectives(String newDirectives) {
		String oldDirectives = directives;
		directives = newDirectives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_TEMPLATE_MODEL__DIRECTIVES, oldDirectives, directives));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE_TEMPLATE_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyModel> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<PropertyModel>(PropertyModel.class, this, ModelPackage.NODE_TEMPLATE_MODEL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAssignmentModel> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<AttributeAssignmentModel>(AttributeAssignmentModel.class, this, ModelPackage.NODE_TEMPLATE_MODEL__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementAssignmentModel> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<RequirementAssignmentModel>(RequirementAssignmentModel.class, this, ModelPackage.NODE_TEMPLATE_MODEL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityAssignmentModel> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectResolvingEList<CapabilityAssignmentModel>(CapabilityAssignmentModel.class, this, ModelPackage.NODE_TEMPLATE_MODEL__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDefinitionModel> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<InterfaceDefinitionModel>(InterfaceDefinitionModel.class, this, ModelPackage.NODE_TEMPLATE_MODEL__INTERFACES);
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
			artifacts = new EObjectResolvingEList<ArtifactTypeModel>(ArtifactTypeModel.class, this, ModelPackage.NODE_TEMPLATE_MODEL__ARTIFACTS);
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
			case ModelPackage.NODE_TEMPLATE_MODEL__NAME:
				return getName();
			case ModelPackage.NODE_TEMPLATE_MODEL__TYPE:
				return getType();
			case ModelPackage.NODE_TEMPLATE_MODEL__DIRECTIVES:
				return getDirectives();
			case ModelPackage.NODE_TEMPLATE_MODEL__DESCRIPTION:
				return getDescription();
			case ModelPackage.NODE_TEMPLATE_MODEL__PROPERTIES:
				return getProperties();
			case ModelPackage.NODE_TEMPLATE_MODEL__ATTRIBUTES:
				return getAttributes();
			case ModelPackage.NODE_TEMPLATE_MODEL__REQUIREMENTS:
				return getRequirements();
			case ModelPackage.NODE_TEMPLATE_MODEL__CAPABILITIES:
				return getCapabilities();
			case ModelPackage.NODE_TEMPLATE_MODEL__INTERFACES:
				return getInterfaces();
			case ModelPackage.NODE_TEMPLATE_MODEL__ARTIFACTS:
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
			case ModelPackage.NODE_TEMPLATE_MODEL__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__TYPE:
				setType((String)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__DIRECTIVES:
				setDirectives((String)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyModel>)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeAssignmentModel>)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends RequirementAssignmentModel>)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends CapabilityAssignmentModel>)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceDefinitionModel>)newValue);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__ARTIFACTS:
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
			case ModelPackage.NODE_TEMPLATE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__DIRECTIVES:
				setDirectives(DIRECTIVES_EDEFAULT);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__CAPABILITIES:
				getCapabilities().clear();
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__INTERFACES:
				getInterfaces().clear();
				return;
			case ModelPackage.NODE_TEMPLATE_MODEL__ARTIFACTS:
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
			case ModelPackage.NODE_TEMPLATE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.NODE_TEMPLATE_MODEL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ModelPackage.NODE_TEMPLATE_MODEL__DIRECTIVES:
				return DIRECTIVES_EDEFAULT == null ? directives != null : !DIRECTIVES_EDEFAULT.equals(directives);
			case ModelPackage.NODE_TEMPLATE_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.NODE_TEMPLATE_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.NODE_TEMPLATE_MODEL__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ModelPackage.NODE_TEMPLATE_MODEL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ModelPackage.NODE_TEMPLATE_MODEL__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case ModelPackage.NODE_TEMPLATE_MODEL__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ModelPackage.NODE_TEMPLATE_MODEL__ARTIFACTS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", directives: ");
		result.append(directives);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NodeTemplateModelImpl
