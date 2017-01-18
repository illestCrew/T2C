package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface RelationshipTemplateModel extends EObject{//  implements EObject, Serializable{
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 9150816971780193190L;
//	private String name;
//	private String type;
//	private String description;
//	private List<PropertyModel> properties;
//	private List<AttributeAssignmentModel> attributes;
//	private List<InterfaceDefinitionModel> interfaces;
//	private String copy;
//	
//	
//	private RelationshipTemplateModel(){ }
//	
//	public static RelationshipTemplateModel of(){
//		return new RelationshipTemplateModel();
//	}
//	
//	public RelationshipTemplateModel name(String name){	this.name = name; 	return this; 	}
//	public RelationshipTemplateModel typeName(String name){	this.type = name; 	return this; 	}
//	public RelationshipTemplateModel description(String description){	this.description = description; 	return this; 	}
//	public RelationshipTemplateModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	public RelationshipTemplateModel attributes(List<AttributeAssignmentModel> attributes){	this.attributes = attributes; 	return this; 	}
//	public RelationshipTemplateModel interfaces(List<InterfaceDefinitionModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
//	public RelationshipTemplateModel copy(String copy){	this.copy = copy; 	return this; 	}
//	
	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getName <em>Name</em>}' attribute.
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
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getTypeName <em>Type Name</em>}' attribute.
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
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getDescription <em>Description</em>}' attribute.
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
	public EList<AttributeAssignmentModel> getAttributes();
	
	/**
	 * @model 
	 */
	@XmlElement(name="interfaces")
	public EList<InterfaceDefinitionModel> getInterfaces();

	/**
	 * @model 
	 */
	@XmlElement(name="copy")
	public String getCopy();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #getCopy()
	 * @generated
	 */
	void setCopy(String value);
	
	public void eSet(int featureID, Object newValue);
}
