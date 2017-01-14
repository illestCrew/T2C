package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
public interface RepositoryDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 169892110739145591L;
//	private String url;
//	private String description;
//	private String credential; //FIXME 
//	
//	private RepositoryDefinitionModel(){ }
//	
//	public static RepositoryDefinitionModel of(){
//		return new RepositoryDefinitionModel();
//	}
//	
//	public RepositoryDefinitionModel url(String url){	this.url = url; 	return this; 	}
//	public RepositoryDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public RepositoryDefinitionModel defaultValue(String credential){	this.credential = credential; 	return this; 	}

	/**
	 * @model 
	 */
	@XmlElement(name="url")
	public String getUrl();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="credential")
	public String getCredential();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getCredential <em>Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential</em>' attribute.
	 * @see #getCredential()
	 * @generated
	 */
	void setCredential(String value);
	
	public void eSet(int featureID, Object newValue);
	
}

