package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
public interface GroupDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -8616463959818160750L;
//	private String name;
//	private String type;
//	private String description;
//	private List<PropertyAssignmentModel> properties;
//	private List<NodeTemplateModel> members;
//	private List<InterfaceTypeModel> interfaces;
//	
//	
//	private GroupDefinitionModel(){ }
//	
//	public static GroupDefinitionModel of(){
//		return new GroupDefinitionModel();
//	}
//	
//	public GroupDefinitionModel name(String name){	this.name = name; 	return this; 	}
//	public GroupDefinitionModel typeName(String name){	this.type = name; 	return this; 	}
//	public GroupDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public GroupDefinitionModel properties(List<PropertyAssignmentModel> properties){	this.properties = properties; 	return this; 	}
//	public GroupDefinitionModel members(List<NodeTemplateModel> members){	this.members = members; 	return this; 	}
//	public GroupDefinitionModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getName <em>Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getType <em>Type</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="members")
	public EList<NodeTemplateModel> getMembers();
	
	/**
	 * @model 
	 */
	@XmlElement(name="interfaces")
	public EList<InterfaceTypeModel> getInterfaces();
	
}
