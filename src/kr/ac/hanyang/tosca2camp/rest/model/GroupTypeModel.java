package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface GroupTypeModel extends EObject{//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -6314220638330382038L;
//	private String typeName;
//	private String derived_from;
//	private VersionModel version;
//	private String description;
//	private List<PropertyModel> properties;
//	private String[] members;
//	private List<InterfaceTypeModel> interfaces;
//	
//	
//	private GroupTypeModel(){ }
//	
//	public static GroupTypeModel of(){
//		return new GroupTypeModel();
//	}
//	
//	public GroupTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public GroupTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public GroupTypeModel version(VersionModel version){	this.version = version; 	return this; 	}
//	public GroupTypeModel description(String description){	this.description = description; 	return this; 	}
//	public GroupTypeModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
//	public GroupTypeModel members(String[] members){	this.members = members; 	return this; 	}
//	public GroupTypeModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
//	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getTypeName <em>Type Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getDerivedFrom <em>Derived From</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getVersion <em>Version</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="members")
	public String[] getMembers();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getMembers <em>Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Members</em>' attribute.
	 * @see #getMembers()
	 * @generated
	 */
	void setMembers(String[] value);

	/**
	 * @model 
	 */
	@XmlElement(name="interfaces")
	public EList<InterfaceTypeModel> getInterfaces();
	
	public void eSet(int featureID, Object newValue);
	
}
