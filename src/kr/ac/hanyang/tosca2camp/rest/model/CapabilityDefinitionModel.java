package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
public interface CapabilityDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 3480410611419031003L;
//	private String typeName;
//	private String derived_from;
//	private VersionModel version;
//	private String description;
//	private List<PropertyModel> properties;
//	private List<AttributeDefinitionModel> attributes;
//	private String[] valid_sources;
//	
//	
//	private CapabilityDefinitionModel(){ }
//	
//	public static CapabilityDefinitionModel of(){
//		return new CapabilityDefinitionModel();
//	}
//	
//	public CapabilityDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public CapabilityDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public CapabilityDefinitionModel version(VersionModel version){	this.version = version; 	return this; 	}
//	public CapabilityDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public CapabilityDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	public CapabilityDefinitionModel attributes(List<AttributeDefinitionModel> attributes){	this.attributes = attributes; 	return this; 	}
//	public CapabilityDefinitionModel validSources(String[] valid_sources){	this.valid_sources = valid_sources; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getTypeName <em>Type Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getDerivedFrom <em>Derived From</em>}' attribute.
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
	public VersionModel getVersion();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionModel value);

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="attributes")
	public EList<AttributeDefinitionModel> getAttributes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="valid_sources")
	public String[] getValidSources();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getValidSources <em>Valid Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Sources</em>' attribute.
	 * @see #getValidSources()
	 * @generated
	 */
	void setValidSources(String[] value);
	
	public void eSet(int featureID, Object newValue);
	
}
