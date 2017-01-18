package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface OperationDefinitionModel extends EObject{//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -2938633533178742519L;
//	private String description;
//	private String implementation;
//	private List<PropertyModel> inputs_prop_definitions;
//	private List<PropertyAssignmentModel> inputs_prop_assignments;
//	
//	private OperationDefinitionModel(){ }
//	
//	public static OperationDefinitionModel of(){
//		return new OperationDefinitionModel();
//	}
//	
//	public OperationDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public OperationDefinitionModel implementation(String implementation){	this.implementation = implementation; 	return this; 	}
//	public OperationDefinitionModel inputs_prop_definitions(List<PropertyModel> inputs_prop_definitions){	this.inputs_prop_definitions = inputs_prop_definitions; 	return this; 	}
//	public OperationDefinitionModel inputs_prop_assignments(List<PropertyAssignmentModel> inputs_prop_assignments){	this.inputs_prop_assignments = inputs_prop_assignments; 	return this; 	}
//	
	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="implementation")
	public String getImplementation();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="inputs_prop_definitions")
	public EList<PropertyModel> getInputs_definitions();
	
	/**
	 * @model 
	 */
	@XmlElement(name="inputs_prop_assignments")
	public EList<PropertyAssignmentModel> getInputs_assignments();
	
	public void eSet(int featureID, Object newValue);
}

