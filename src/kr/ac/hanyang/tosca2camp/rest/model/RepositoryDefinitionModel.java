package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class RepositoryDefinitionModel {
	
	private String url;
	private String description;
	private String credential; //FIXME 
	
	private RepositoryDefinitionModel(){ }
	
	public static RepositoryDefinitionModel of(){
		return new RepositoryDefinitionModel();
	}
	
	public RepositoryDefinitionModel url(String url){	this.url = url; 	return this; 	}
	public RepositoryDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public RepositoryDefinitionModel defaultValue(String credential){	this.credential = credential; 	return this; 	}

	@XmlElement(name="url")
	public String getUrl(){
		return url;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="credential")
	public String getCredential(){
		return credential;
	}
	
}

