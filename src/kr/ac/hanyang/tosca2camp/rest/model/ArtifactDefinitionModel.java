package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
public interface ArtifactDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -6042288078801986884L;
//	private String type;
//	private String file;
//	private String repository;
//	private String description;
//	private String deploy_path;

	
	
	//public ArtifactDefinitionModel(){ }
	
//	public static ArtifactDefinitionModel of(){
//		return new ArtifactDefinitionModel();
//	}
//	
//	public ArtifactDefinitionModel type(String type){	this.type = type; 	return this; 	}
//	public ArtifactDefinitionModel file(String file){	this.file = file; 	return this; 	}
//	public ArtifactDefinitionModel repository(String repository){	this.repository = repository; 	return this; 	}
//	public ArtifactDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public ArtifactDefinitionModel deploy_path(String deploy_path){	this.deploy_path = deploy_path; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="type")
	public String getType();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getType <em>Type</em>}' attribute.
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
	@XmlElement(name="file")
	public String getFile();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="repository")
	public String getRepository();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="deploy_path")
	public String getDeploy_path();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDeploy_path <em>Deploy path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy path</em>' attribute.
	 * @see #getDeploy_path()
	 * @generated
	 */
	void setDeploy_path(String value);
	
	public void eSet(int featureID, Object newValue);
	
}
