package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;
/**
 * @model kind="class"
 */
public class RelationshipTemplateModel {
	
	
	private String name;
	private String type;
	private String description;
	private List<PropertyModel> properties;
	private List<AttributeAssignmentModel> attributes;
	private List<InterfaceDefinitionModel> interfaces;
	private String copy;
	
	
	private RelationshipTemplateModel(){ }
	
	public static RelationshipTemplateModel of(){
		return new RelationshipTemplateModel();
	}
	
	public RelationshipTemplateModel name(String name){	this.name = name; 	return this; 	}
	public RelationshipTemplateModel typeName(String name){	this.type = name; 	return this; 	}
	public RelationshipTemplateModel description(String description){	this.description = description; 	return this; 	}
	public RelationshipTemplateModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	public RelationshipTemplateModel attributes(List<AttributeAssignmentModel> attributes){	this.attributes = attributes; 	return this; 	}
	public RelationshipTemplateModel interfaces(List<InterfaceDefinitionModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
	public RelationshipTemplateModel copy(String copy){	this.copy = copy; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="name")
	public String getName(){
		return name;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName(){
		return type;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public List<PropertyModel> getProperties(){
		return properties;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="attributes")
	public List<AttributeAssignmentModel> getAttributes(){
		return attributes;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="interfaces")
	public List<InterfaceDefinitionModel> getInterfaces(){
		return interfaces;
	}

	/**
	 * @model 
	 */
	@XmlElement(name="copy")
	public String getCopy(){
		return copy;
	}
}
