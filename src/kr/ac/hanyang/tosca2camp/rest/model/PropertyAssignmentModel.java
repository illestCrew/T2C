package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
@Deprecated
public interface PropertyAssignmentModel extends EObject, Serializable {//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 8731192114504430167L;
//	private String name;
//	private DataModel value;
//	
//	private PropertyAssignmentModel(){ }
//	
//	public static PropertyAssignmentModel of(){
//		return new PropertyAssignmentModel();
//	}
//	
//	public PropertyAssignmentModel name(String name){	this.name = name; 	return this; 	}
//	public PropertyAssignmentModel defaultValue(DataModel value){	this.value = value; 	return this; 	}

	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel#getName <em>Name</em>}' attribute.
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
	@XmlElement(name="value")
	public DataModel getValue();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataModel value);
	
	public void eSet(int featureID, Object newValue);
	
}

