package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface TopologyTemplateModel extends EObject{

	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -6268009846470213260L;
//	private String description;
//	private List<ParameterDefinitionModel> inputs;
//	private List<NodeTemplateModel> node_templates;
//	private List<RelationshipTemplateModel> relationship_templates;
//	private List<GroupDefinitionModel> groups;
//	private List<PolicyDefinitionModel> policies;
//	private List<ParameterDefinitionModel> outputs;
//	//private List<ArtifactDefinitionModel> artifacts;
//	
//	
//	private TopologyTemplateModel(){ }
//	
//	public static TopologyTemplateModel of(){
//		return new TopologyTemplateModel();
//	}
//	public TopologyTemplateModel description(String description){	this.description = description; 	return this; 	}
//	public TopologyTemplateModel inputs(List<ParameterDefinitionModel> inputs){	this.inputs = inputs; 	return this; 	}
//	public TopologyTemplateModel nodeTemplates(List<NodeTemplateModel> node_templates){	this.node_templates = node_templates; 	return this; 	}
//	public TopologyTemplateModel relationshipTemplates(List<RelationshipTemplateModel> relationship_templates){	this.relationship_templates = relationship_templates; 	return this; 	}
//	public TopologyTemplateModel groups(List<GroupDefinitionModel> groups){	this.groups = groups; 	return this; 	}
//	public TopologyTemplateModel policies(List<PolicyDefinitionModel> policies){	this.policies = policies; 	return this; 	}
//	public TopologyTemplateModel outputs(List<ParameterDefinitionModel> outputs){	this.outputs = outputs; 	return this; 	}
	

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getDescription <em>Description</em>}' attribute.
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
	@XmlElement(name="inputs")
	public EList<ParameterDefinitionModel> getInputs();
	
	/**
	 * @model 
	 */
	@XmlElement(name="node_templates")
	public EList<NodeTemplateModel> getNodeTemplates();
	
	/**
	 * @model 
	 */
	@XmlElement(name="relationship_templates")
	public EList<RelationshipTemplateModel> getRelationshipTemplates();
	
	/**
	 * @model 
	 */
	@XmlElement(name="groups")
	public EList<GroupDefinitionModel> getGroups();
	
	/**
	 * @model 
	 */
	@XmlElement(name="policies")
	public EList<PolicyDefinitionModel> getPolicies();
	
	/**
	 * @model 
	 */
	@XmlElement(name="outputs")
	public EList<ParameterDefinitionModel> getOutputs();
	
	public void eSet(int featureID, Object newValue);
}
