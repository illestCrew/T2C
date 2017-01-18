package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */

public interface NodeTemplateModel extends EObject{//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 2339083300677385800L;
//	private String name;
//	private String type;
//	private String description;
//	private String directives;
//	private List<PropertyModel> properties;
//	private List<AttributeAssignmentModel> attributes;
//	private List<RequirementAssignmentModel> requirements;
//	private List<CapabilityAssignmentModel> capabilities;
//	private List<InterfaceDefinitionModel> interfaces;
//	private List<ArtifactTypeModel> artifacts;
//	
//	
//	private NodeTemplateModel(){ }
//	
//	public static NodeTemplateModel of(){
//		return new NodeTemplateModel();
//	}
//	
//	public NodeTemplateModel name(String name){	this.name = name; 	return this; 	}
//	public NodeTemplateModel typeName(String name){	this.type = name; 	return this; 	}
//	public NodeTemplateModel derived_from(String derived_from){	this.directives = derived_from; 	return this; 	}
//	public NodeTemplateModel description(String description){	this.description = description; 	return this; 	}
//	public NodeTemplateModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	public NodeTemplateModel attributes(List<AttributeAssignmentModel> attributes){	this.attributes = attributes; 	return this; 	}
//	public NodeTemplateModel requirements(List<RequirementAssignmentModel> requirements){	this.requirements = requirements; 	return this; 	}
//	public NodeTemplateModel capabilities(List<CapabilityAssignmentModel> capabilities){	this.capabilities = capabilities; 	return this; 	}
//	public NodeTemplateModel interfaces(List<InterfaceDefinitionModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
//	public NodeTemplateModel artifacts(List<ArtifactTypeModel> artifacts){	this.artifacts = artifacts; 	return this; 	}
	
	/**
	 * 
	 * @model
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @model
	 */
	@XmlElement(name="type")
	public String getType();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * 
	 * @model
	 */
	@XmlElement(name="directives")
	public String getDirectives();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getDirectives <em>Directives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directives</em>' attribute.
	 * @see #getDirectives()
	 * @generated
	 */
	void setDirectives(String value);

	/**
	 * 
	 * @model
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * 
	 * @model
	 */
	@XmlElement(name="properties")
	public EList<PropertyModel> getProperties();
	
	/**
	 * 
	 * @model
	 */
	@XmlElement(name="attributes")
	public EList<AttributeAssignmentModel> getAttributes();
	
	/**
	 * 
	 * @model
	 */
	@XmlElement(name="requirements")
	public EList<RequirementAssignmentModel> getRequirements();
	
	/**
	 * 
	 * @model
	 */
	@XmlElement(name="capabilities")
	public EList<CapabilityAssignmentModel> getCapabilities();
	
	/**
	 * 
	 * @model
	 */
	@XmlElement(name="interfaces")
	public EList<InterfaceDefinitionModel> getInterfaces();
	
	/**
	 * 
	 * @model
	 */
	@XmlElement(name="artifacts")
	public EList<ArtifactTypeModel> getArtifacts();
	
	public void eSet(int featureID, Object newValue);
		
}
