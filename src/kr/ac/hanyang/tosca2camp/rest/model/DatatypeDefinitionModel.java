package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
public interface DatatypeDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -8410816364471570657L;
//	private String typeName;
//	private String derived_from;
//	private String version;
//	private String description;
//	private List<ConstraintModel> constraints;
//	private List<PropertyModel> properties;
//	
//	
//	private DatatypeDefinitionModel(){ }
//	
//	public static DatatypeDefinitionModel of(){
//		return new DatatypeDefinitionModel();
//	}
//	
//	public DatatypeDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public DatatypeDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public DatatypeDefinitionModel version(String version){	this.version = version; 	return this; 	}
//	public DatatypeDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public DatatypeDefinitionModel constraints(List<ConstraintModel> constraints){	this.constraints = constraints; 	return this; 	}
//	public DatatypeDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getTypeName <em>Type Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getDerivedFrom <em>Derived From</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getVersion <em>Version</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="constraints")
	public EList<ConstraintModel> getConstraints();
	
	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public EList<PropertyModel> getProperties();
	
	public void eSet(int featureID, Object newValue);
	
}
