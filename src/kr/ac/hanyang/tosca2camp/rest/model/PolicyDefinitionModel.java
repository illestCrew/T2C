package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface PolicyDefinitionModel extends EObject{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -4738136118140253465L;
//	private String name;
//	private String type;
//	private String description;
//	private List<PropertyAssignmentModel> properties;
//	private String[] targets;
//	
//	
//	private PolicyDefinitionModel(){ }
//	
//	public static PolicyDefinitionModel of(){
//		return new PolicyDefinitionModel();
//	}
//	
//	public PolicyDefinitionModel name(String name){	this.name = name; 	return this; 	}
//	public PolicyDefinitionModel typeName(String name){	this.type = name; 	return this; 	}
//	public PolicyDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public PolicyDefinitionModel properties(List<PropertyAssignmentModel> properties){	this.properties = properties; 	return this; 	}
//	public PolicyDefinitionModel targets(String[] targets){	this.targets = targets; 	return this; 	}
//	
	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getName <em>Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getType <em>Type</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	public EList<PropertyAssignmentModel> getProperties();
	
	/**
	 * @model 
	 */
	@XmlElement(name="targets")
	public String[] getTargets();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getTargets <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' attribute.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(String[] value);
	
	public void eSet(int featureID, Object newValue);
	
}
