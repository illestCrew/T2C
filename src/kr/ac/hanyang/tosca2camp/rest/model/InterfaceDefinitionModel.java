package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface InterfaceDefinitionModel extends EObject{
	

	/**
	 * 
	 */
//	private static final long serialVersionUID = 6731383169853955255L;
//	private List<PropertyModel> inputs;
//	
//	private InterfaceDefinitionModel(){ }
//	
//	public static InterfaceDefinitionModel of(){
//		return new InterfaceDefinitionModel();
//	}
//	
//	public InterfaceDefinitionModel inputs(List<PropertyModel> inputs){	this.inputs = inputs; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="inputs")
	public EList<PropertyModel> getInputs();
	
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ModelPackage#getInterfaceDefinitionModel_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinitionModel> getOperations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ModelPackage#getInterfaceDefinitionModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	//public void eSet(int featureID, Object newValue);
	
}
