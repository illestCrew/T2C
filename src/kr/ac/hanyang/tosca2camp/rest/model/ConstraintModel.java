package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;

/**
 * @model kind="class"
 */

public interface ConstraintModel extends EObject, Serializable{//  implements EObject, Serializable{
	/**
	 * 
	 */
//	private static final long serialVersionUID = -6226469767815057188L;
//	private String operator;
//	private DataModel value;
//	
//	private ConstraintModel(){ }
//	
//	public static ConstraintModel of(){
//		return new ConstraintModel();
//	}
//	
//	public ConstraintModel operator(String operator){	this.operator = operator; 	return this; 	}
//	public ConstraintModel defaultValue(DataModel value){	this.value = value; 	return this; 	}

	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel#getName <em>Name</em>}' attribute.
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
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataModel value);
	
	public void eSet(int featureID, Object newValue);
}

