package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class ImportDefinitionModel {
	
	private String file;
	private String repository;
	private String namespace_uri;
	private String namespace_prefix;
	private List<PropertyModel> inputs;
	private List<OperationDefinitionModel> operations;
	
	
	private ImportDefinitionModel(){ }
	
	public static ImportDefinitionModel of(){
		return new ImportDefinitionModel();
	}
	
	public ImportDefinitionModel file(String file){	this.file = file; 	return this; 	}
	public ImportDefinitionModel repository(String repository){	this.repository = repository; 	return this; 	}
	public ImportDefinitionModel namespace_uri(String namespace_uri){	this.namespace_uri = namespace_uri; 	return this; 	}
	public ImportDefinitionModel namespace_prefix(String namespace_prefix){	this.namespace_prefix = namespace_prefix; 	return this; 	}
	
	@XmlElement(name="file")
	public String getFile(){
		return file;
	}
	
	@XmlElement(name="repository")
	public String getRepository(){
		return repository;
	}
	
	@XmlElement(name="namespace_uri")
	public String getNamespaceUri(){
		return namespace_uri;
	}
	
	@XmlElement(name="namespace_prefix")
	public String getNamespacePrefix(){
		return namespace_prefix;
	}
	
}
