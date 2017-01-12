package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
/**
 * @model kind="class"
 */
public class DatatypeDefinitionModel {
	
	
	private String typeName;
	private String derived_from;
	private String version;
	private String description;
	private List<ConstraintModel> constraints;
	private List<PropertyModel> properties;
	
	
	private DatatypeDefinitionModel(){ }
	
	public static DatatypeDefinitionModel of(){
		return new DatatypeDefinitionModel();
	}
	
	public DatatypeDefinitionModel typeName(String name){	this.typeName = name; 	return this; 	}
	public DatatypeDefinitionModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public DatatypeDefinitionModel version(String version){	this.version = version; 	return this; 	}
	public DatatypeDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public DatatypeDefinitionModel constraints(List<ConstraintModel> constraints){	this.constraints = constraints; 	return this; 	}
	public DatatypeDefinitionModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="typeName")
	public String getTypeName(){
		return typeName;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="derived_from")
	public String getDerivedFrom(){
		return derived_from;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="version")
	public String getVersion(){
		return version;
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
	@XmlElement(name="constraints")
	public List<ConstraintModel> getConstraints(){
		return constraints;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public List<PropertyModel> getProperties(){
		return properties;
	}
	
	
	
}
