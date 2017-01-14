package kr.ac.hanyang.tosca2camp.rest.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model kind="class"
 */
public interface ParameterDefinitionModel extends EObject, Serializable{//  implements EObject, Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -4217857658561704359L;
//	private String name;
//	private String type;
//	private String description;
//	private boolean required;
//	private DataModel defaultValue;
//	private DataModel value;
//	private String status;
//	private List<ConstraintModel> constraints;
//	private String entry_schema;
//	
//	
//	private ParameterDefinitionModel(){ }
//	
//	public static ParameterDefinitionModel of(){
//		return new ParameterDefinitionModel();
//	}
//	
//	public ParameterDefinitionModel name(String name){	this.name = name; 	return this; 	}
//	public ParameterDefinitionModel type(String type){	this.type = type; 	return this; 	}
//	public ParameterDefinitionModel description(String description){	this.description = description; 	return this; 	}
//	public ParameterDefinitionModel required(boolean required){	this.required = required; 	return this; 	}
//	public ParameterDefinitionModel defaultValue(DataModel defaultValue){	this.defaultValue = defaultValue; 	return this; 	}
//	public ParameterDefinitionModel value(DataModel value){	this.value = value; 	return this; 	}
//	public ParameterDefinitionModel properties(String status){	this.status = status; 	return this; 	}
//	public ParameterDefinitionModel attributes(List<ConstraintModel> constraints){	this.constraints = constraints; 	return this; 	}
//	public ParameterDefinitionModel requirements(String entry_schema){	this.entry_schema = entry_schema; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getName <em>Name</em>}' attribute.
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
	@XmlElement(name="type")
	public String getType();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getType <em>Type</em>}' attribute.
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
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="required")
	public boolean getRequired();
	
	/**
	 * @model 
	 */
	@XmlElement(name="defaultValue")
	public DataModel getDataValue();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getDataValue <em>Data Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Value</em>' reference.
	 * @see #getDataValue()
	 * @generated
	 */
	void setDataValue(DataModel value);

	/**
	 * @model 
	 */
	@XmlElement(name="value")
	public DataModel getValue();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataModel value);

	/**
	 * @model 
	 */
	@XmlElement(name="status")
	public String getStatus();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="constraints")
	public EList<ConstraintModel> getConstraint();
	
	/**
	 * @model 
	 */
	@XmlElement(name="entry_schema")
	public String getEntrySchema();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getEntrySchema <em>Entry Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Schema</em>' attribute.
	 * @see #getEntrySchema()
	 * @generated
	 */
	void setEntrySchema(String value);
	
	public void eSet(int featureID, Object newValue);
	
}

