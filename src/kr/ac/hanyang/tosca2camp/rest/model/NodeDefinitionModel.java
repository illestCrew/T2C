package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface NodeDefinitionModel extends EObject{
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -7853713381724893045L;
//	private String typeName;
//	private String derived_from;
//	private String version;
//	private String description;
//	private List<PropertyModel> properties;
//	private List<AttributeDefinitionModel> attributes;
//	private List<RequirementDefinitionModel> requirements;
//	private List<CapabilityDefinitionModel> capabilities;
//	private List<InterfaceTypeModel> interfaces;
//	private List<ArtifactTypeModel> artifacts;
//	
//	
//	private NodeDefinitionModel(){ }
//	
//	public static NodeDefinitionModel of(){
//		return new NodeDefinitionModel();
//	}
//	
//	public NodeDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public NodeDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public NodeDefinitionModel version(String version){	this.version = version; 	return this; 	}
//	public NodeDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public NodeDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	public NodeDefinitionModel attributes(List<AttributeDefinitionModel> attributes){	this.attributes = attributes; 	return this; 	}
//	public NodeDefinitionModel requirements(List<RequirementDefinitionModel> requirements){	this.requirements = requirements; 	return this; 	}
//	public NodeDefinitionModel capabilities(List<CapabilityDefinitionModel> capabilities){	this.capabilities = capabilities; 	return this; 	}
//	public NodeDefinitionModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
//	public NodeDefinitionModel artifacts(List<ArtifactTypeModel> artifacts){	this.artifacts = artifacts; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="derived_from")
	public String getDerivedFrom();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getDerivedFrom <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' attribute.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="version")
	public String getVersion();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public EList<PropertyModel> getProperties();
	
	/**
	 * @model 
	 */
	@XmlElement(name="attributes")
	public EList<AttributeDefinitionModel> getAttributes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="requirements")
	public EList<RequirementDefinitionModel> getRequirements();
	
	/**
	 * @model 
	 */
	@XmlElement(name="capabilities")
	public EList<CapabilityDefinitionModel> getCapabilities();
	
	/**
	 * @model 
	 */
	@XmlElement(name="interfaces")
	public EList<InterfaceTypeModel> getInterfaces();
	
	/**
	 * @model 
	 */
	@XmlElement(name="artifacts")
	public EList<ArtifactTypeModel> getArtifacts();
	
	public void eSet(int featureID, Object newValue);
	
}
