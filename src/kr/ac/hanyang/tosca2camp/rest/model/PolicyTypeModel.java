package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface PolicyTypeModel extends EObject{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 3131633548859928754L;
//	private String typeName;
//	private String derived_from;
//	private String version;
//	private String description;
//	private List<PropertyModel> properties;
//	private String[] targets;
//
//	
//	private PolicyTypeModel(){ }
//	
//	public static PolicyTypeModel of(){
//		return new PolicyTypeModel();
//	}
//	
//	public PolicyTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public PolicyTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public PolicyTypeModel version(String version){	this.version = version; 	return this; 	}
//	public PolicyTypeModel description(String description){	this.description = description; 	return this; 	}
//	public PolicyTypeModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	public PolicyTypeModel targets(String[] targets){	this.targets = targets; 	return this; 	}
//	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getTypeName <em>Type Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getDerivedFrom <em>Derived From</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getVersion <em>Version</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="targets")
	public String[] getTargets();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getTargets <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' attribute.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(String[] value);
	
	public void eSet(int featureID, Object newValue);
	
	
}
