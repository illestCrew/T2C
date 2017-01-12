package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
/**
 * @model kind="class"
 */
public class ArtifactTypeModel {
	
	private String typeName;
	private String derived_from;
	private VersionModel version;
	private String description;
	private String mime_type;
	private String[] file_ext;
	private List<PropertyModel> properties;
	
	
	private ArtifactTypeModel(){ }
	
	public static ArtifactTypeModel of(){
		return new ArtifactTypeModel();
	}
	
	public ArtifactTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
	public ArtifactTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public ArtifactTypeModel version(VersionModel version){	this.version = version; 	return this; 	}
	public ArtifactTypeModel description(String description){	this.description = description; 	return this; 	}
	public ArtifactTypeModel mime_type(String mime_type){	this.mime_type = mime_type; 	return this; 	}
	public ArtifactTypeModel file_ext(String[] file_ext){	this.file_ext = file_ext; 	return this; 	}
	public ArtifactTypeModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	
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
	public VersionModel getVersion(){
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
	@XmlElement(name="mime_type")
	public String getMime_type(){
		return mime_type;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="file_ext")
	public String[] getFile_ext(){
		return file_ext;
	}
	
	/**
	 * @model 
	 */
	@XmlElement(name="properties")
	public List<PropertyModel> getProperties(){
		return properties;
	}
	
}
