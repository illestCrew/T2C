package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;

/**
 * @model 
 */

public interface DataModel extends EObject{//  implements EObject, Serializable{
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -1721195028285571413L;
//	private Object value;
//	
//	
//	private DataModel(){ }
//	
//	public static DataModel of(){
//		return new DataModel();
//	}
//	
//	public DataModel value(Object value){	this.value = value; 	return this; 	}

	
	/**
	 * @model 
	 */
	@XmlElement(name="value")
	public Object getValue();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.DataModel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);
	
	public void eSet(int featureID, Object newValue);
	
}
