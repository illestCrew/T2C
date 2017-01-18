package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface ArtifactTypeModel extends EObject{//  implements EObject, Serializable{
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 3060798844214919904L;
//	private String typeName;
//	private String derived_from;
//	private VersionModel version;
//	private String description;
//	private String mime_type;
//	private String[] file_ext;
//	private List<PropertyModel> properties;
//	
//	
//	private ArtifactTypeModel(){ }
//	
//	public static ArtifactTypeModel of(){
//		return new ArtifactTypeModel();
//	}
//	
//	public ArtifactTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
//	public ArtifactTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
//	public ArtifactTypeModel version(VersionModel version){	this.version = version; 	return this; 	}
//	public ArtifactTypeModel description(String description){	this.description = description; 	return this; 	}
//	public ArtifactTypeModel mime_type(String mime_type){	this.mime_type = mime_type; 	return this; 	}
//	public ArtifactTypeModel file_ext(String[] file_ext){	this.file_ext = file_ext; 	return this; 	}
//	public ArtifactTypeModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getTypeName <em>Type Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getDerivedFrom <em>Derived From</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getVersion <em>Version</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="mime_type")
	public String getMime_type();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getMime_type <em>Mime type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime type</em>' attribute.
	 * @see #getMime_type()
	 * @generated
	 */
	void setMime_type(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="file_ext")
	public String[] getFile_ext();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getFile_ext <em>File ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File ext</em>' attribute.
	 * @see #getFile_ext()
	 * @generated
	 */
	void setFile_ext(String[] value);

	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public EList<PropertyModel> getProperties();
	
	public void eSet(int featureID, Object newValue);
	
}
