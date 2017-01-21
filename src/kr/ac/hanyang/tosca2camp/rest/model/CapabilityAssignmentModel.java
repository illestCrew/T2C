package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model 
 */

public interface CapabilityAssignmentModel extends EObject{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -2810897848163755187L;
//	private String name;
//	private List<PropertyAssignmentModel> properties;
//	private List<AttributeAssignmentModel> attributes;
//	
//	
//	private CapabilityAssignmentModel(){ }
//	
//	public static CapabilityAssignmentModel of(){
//		return new CapabilityAssignmentModel();
//	}
//	
//	public CapabilityAssignmentModel name(String name){	this.name = name; 	return this; 	}
//	public CapabilityAssignmentModel properties(List<PropertyAssignmentModel> properties){	this.properties = properties; 	return this; 	}
//	public CapabilityAssignmentModel attributes(List<AttributeAssignmentModel> attributes){	this.attributes = attributes; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public EList<PropertyAssignmentModel> getProperties();
	
	/**
	 * @model 
	 */
	@XmlElement(name="attributes")
	public EList<AttributeAssignmentModel> getAttributes();
	
	public void eSet(int featureID, Object newValue);
	
	
}
