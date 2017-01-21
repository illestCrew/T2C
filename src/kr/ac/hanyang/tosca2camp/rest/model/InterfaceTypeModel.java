package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface InterfaceTypeModel extends EObject{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 8353182089865790116L;
//	private String typeName;
//	private String derived_from;
//	private String version;
//	private String description;
//	private List<PropertyModel> inputs;
//	private List<OperationDefinitionModel> operations;
//	
//	
//	private InterfaceTypeModel(){ }
//	
//	public static InterfaceTypeModel of(){
//		return new InterfaceTypeModel();
//	}
//	
//	public InterfaceTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public InterfaceTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public InterfaceTypeModel version(String version){	this.version = version; 	return this; 	}
//	public InterfaceTypeModel description(String description){	this.description = description; 	return this; 	}
//	public InterfaceTypeModel inputs(List<PropertyModel> properties){	this.inputs = properties; 	return this; 	}
//	public InterfaceTypeModel operations(List<OperationDefinitionModel> operations){	this.operations = operations; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getTypeName <em>Type Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getDerivedFrom <em>Derived From</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getVersion <em>Version</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="inputs")
	public EList<PropertyModel> getInputs();
	
	/**
	 * @model 
	 */
	@XmlElement(name="operations")
	public EList<OperationDefinitionModel> getOperations();
	
	public void eSet(int featureID, Object newValue);
	
}
