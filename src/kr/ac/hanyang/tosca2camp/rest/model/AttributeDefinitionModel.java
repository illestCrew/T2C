package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */

public interface AttributeDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1305702950716179304L;
//	private String name;
//	private String type;
//	private String description;
//	private DataModel defaultValue;
//	private String status;
//	
//	
//	private AttributeDefinitionModel(){ }
//	
//	public static AttributeDefinitionModel of(){
//		return new AttributeDefinitionModel();
//	}
//	
//	public AttributeDefinitionModel name(String name){	this.name = name; 	return this; 	}
//	public AttributeDefinitionModel type(String type){	this.type = type; 	return this; 	}
//	public AttributeDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public AttributeDefinitionModel defaultValue(DataModel defaultValue){	this.defaultValue = defaultValue; 	return this; 	}
//	public AttributeDefinitionModel properties(String status){	this.status = status; 	return this; 	}

	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getName <em>Name</em>}' attribute.
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
	@XmlElement(name="type")
	public String getType();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="defaultValue")
	public DataModel getDataValue();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getDataValue <em>Data Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Value</em>' reference.
	 * @see #getDataValue()
	 * @generated
	 */
	void setDataValue(DataModel value);

	/**
	 * @model 
	 */
	@XmlElement(name="status")
	public String getStatus();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	public void eSet(int featureID, Object newValue);
}

