package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */

public interface ImportDefinitionModel extends EObject{//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 4731381996169854411L;
//	private String file;
//	private String repository;
//	private String namespace_uri;
//	private String namespace_prefix;
//	private List<PropertyModel> inputs;
//	private List<OperationDefinitionModel> operations;
//	
//	
//	private ImportDefinitionModel(){ }
//	
//	public static ImportDefinitionModel of(){
//		return new ImportDefinitionModel();
//	}
//	
//	public ImportDefinitionModel file(String file){	this.file = file; 	return this; 	}
//	public ImportDefinitionModel repository(String repository){	this.repository = repository; 	return this; 	}
//	public ImportDefinitionModel namespace_uri(String namespace_uri){	this.namespace_uri = namespace_uri; 	return this; 	}
//	public ImportDefinitionModel namespace_prefix(String namespace_prefix){	this.namespace_prefix = namespace_prefix; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="file")
	public String getFile();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getFile <em>File</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getRepository <em>Repository</em>}' attribute.
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
	@XmlElement(name="namespace_uri")
	public String getNamespaceUri();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uri</em>' attribute.
	 * @see #getNamespaceUri()
	 * @generated
	 */
	void setNamespaceUri(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="namespace_prefix")
	public String getNamespacePrefix();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getNamespacePrefix <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Prefix</em>' attribute.
	 * @see #getNamespacePrefix()
	 * @generated
	 */
	void setNamespacePrefix(String value);
	
	public void eSet(int featureID, Object newValue);
	
	
}
