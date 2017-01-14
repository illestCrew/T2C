package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

	/**
	 * @model kind="class"
	 */
	public interface FunctionModel extends EObject, Serializable{//  implements EObject, Serializable{
		
		/**
		 * 
		 */
//		private static final long serialVersionUID = 1579718526342218398L;
//		private String typeName;
//		private List<PropertyModel> parameters;
//		
//		
//		private FunctionModel(){ }
//		
//		public static FunctionModel of(){
//			return new FunctionModel();
//		}
//		
//		public FunctionModel typeName(String name){	this.typeName = name; 	return this; 	}
//		public FunctionModel parameters(List<PropertyModel> parameters){	this.parameters = parameters; 	return this; 	}

		/**
		 * @model 
		 */
		@XmlElement(name="typeName")
		public String getTypeName();
		
		
		/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.FunctionModel#getTypeName <em>Type Name</em>}' attribute.
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
		@XmlElement(name="parameters")
		public EList<PropertyModel> getParameters();
		
		public void eSet(int featureID, Object newValue);
		
		
}
