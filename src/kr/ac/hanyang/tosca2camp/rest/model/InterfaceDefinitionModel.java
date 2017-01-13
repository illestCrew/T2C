package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
public interface InterfaceDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	

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
	
}
