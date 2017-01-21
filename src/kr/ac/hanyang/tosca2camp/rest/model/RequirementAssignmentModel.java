package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface RequirementAssignmentModel extends EObject{
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -4642505553332714078L;
//	
//	private String capability;
//	private String node;
//	private String relationship;
//	//private List<PropertyDefinitionModel> node_filter;
//
//	
//	
//	private RequirementAssignmentModel(){ }
//	
//	public static RequirementAssignmentModel of(){
//		return new RequirementAssignmentModel();
//	}
//	
//	public RequirementAssignmentModel capability(String name){	this.capability = name; 	return this; 	}
//	public RequirementAssignmentModel node(String derived_from){	this.node = derived_from; 	return this; 	}
//	public RequirementAssignmentModel relationship(String description){	this.relationship = description; 	return this; 	}
//	//public RequirementAssignmentModel properties(List<PropertyDefinitionModel> properties){	this.properties = properties; 	return this; 	}
//	
	/**
	 * @model 
	 */
	@XmlElement(name="capability")
	public String getCapability();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getCapability <em>Capability</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getNode <em>Node</em>}' attribute.
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
	@XmlElement(name="relationship")
	public String getRelationship();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getRelationship <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' attribute.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(String value);
	
	public void eSet(int featureID, Object newValue);
	
//	@XmlElement(name="properties")
//	public List<PropertyDefinitionModel> getProperties(){
//		return properties;
//	}
//	
	
}

