package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface RequirementDefinitionModel extends EObject{
	

	/**
	 * 
	 */
//	private static final long serialVersionUID = -2386894893709994135L;
//	
//	private String capability;
//	private String node;
//	private String relationship_type_name;
//	private RelationshipDefinitionModel relationship_definition;
//	//private List<PropertyDefinitionModel> node_filter;
//
//	
//	
//	private RequirementDefinitionModel(){ }
//	
//	public static RequirementDefinitionModel of(){
//		return new RequirementDefinitionModel();
//	}
//	
//	public RequirementDefinitionModel capability(String name){	this.capability = name; 	return this; 	}
//	public RequirementDefinitionModel node(String derived_from){	this.node = derived_from; 	return this; 	}
//	public RequirementDefinitionModel relationship_type_name(String relationship_type_name){	this.relationship_type_name = relationship_type_name; 	return this; 	}
//	public RequirementDefinitionModel relationship_definition(RelationshipDefinitionModel relationship_definition){	this.relationship_definition = relationship_definition; 	return this; 	}
//	//public RequirementAssignmentModel properties(List<PropertyDefinitionModel> properties){	this.properties = properties; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="capability")
	public String getCapability();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getCapability <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' attribute.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="node")
	public String getNode();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="relationship_type_name")
	public String getRelationship_type();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getRelationship_type <em>Relationship type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship type</em>' attribute.
	 * @see #getRelationship_type()
	 * @generated
	 */
	void setRelationship_type(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="relationship_definition")
	public RelationshipDefinitionModel getRelationship_definition();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getRelationship_definition <em>Relationship definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship definition</em>' containment reference.
	 * @see #getRelationship_definition()
	 * @generated
	 */
	void setRelationship_definition(RelationshipDefinitionModel value);
	
	public void eSet(int featureID, Object newValue);
	
//	@XmlElement(name="properties")
//	public List<PropertyDefinitionModel> getProperties(){
//		return properties;
//	}
//	
}

