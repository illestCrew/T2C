package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;

/**
 * @model kind="class"
 */

public interface AttributeAssignmentModel extends EObject, Serializable{//  implements EObject, Serializable{
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 5409955638809017992L;
//	private String name;
//	private String description;
//	private DataModel value;
//	
//	private AttributeAssignmentModel(){ }
//	
//	public static AttributeAssignmentModel of(){
//		return new AttributeAssignmentModel();
//	}
//	
//	public AttributeAssignmentModel name(String name){	this.name = name; 	return this; 	}
//	public AttributeAssignmentModel description(String description){	this.description = description; 	return this; 	}
//	public AttributeAssignmentModel defaultValue(DataModel value){	this.value = value; 	return this; 	}

	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getName <em>Name</em>}' attribute.
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
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="value")
	public DataModel getValue();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataModel value);
	
	public void eSet(int featureID, Object newValue);
	
}

