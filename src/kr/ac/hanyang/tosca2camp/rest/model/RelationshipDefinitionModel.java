package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface RelationshipDefinitionModel extends EObject{//  implements EObject, Serializable{
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 7816920253360860892L;
//	private String typeName;
//	private String derived_from;
//	private VersionModel version;
//	private String description;
//	private List<PropertyModel> properties;
//	private List<AttributeDefinitionModel> attributes;
//	private List<InterfaceTypeModel> interfaces;
//	private String[] valid_target_types;
//	
//	
//	private RelationshipDefinitionModel(){ }
//	
//	public static RelationshipDefinitionModel of(){
//		return new RelationshipDefinitionModel();
//	}
//	
//	public RelationshipDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public RelationshipDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public RelationshipDefinitionModel version(VersionModel version){	this.version = version; 	return this; 	}
//	public RelationshipDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public RelationshipDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	public RelationshipDefinitionModel attributes(List<AttributeDefinitionModel> attributes){	this.attributes = attributes; 	return this; 	}
//	public RelationshipDefinitionModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
//	public RelationshipDefinitionModel validTargetTypes(String[] valid_target_types){	this.valid_target_types = valid_target_types; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getTypeName <em>Type Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getDerivedFrom <em>Derived From</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getVersion <em>Version</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="interfaces")
	public EList<InterfaceTypeModel> getInterfaces();

	/**
	 * @model 
	 */
	@XmlElement(name="valid_target_types")
	public String[] getValidTargetTypes();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getValidTargetTypes <em>Valid Target Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Target Types</em>' attribute.
	 * @see #getValidTargetTypes()
	 * @generated
	 */
	void setValidTargetTypes(String[] value);
	
	public void eSet(int featureID, Object newValue);
}
