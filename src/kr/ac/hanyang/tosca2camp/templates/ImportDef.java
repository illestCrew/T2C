package kr.ac.hanyang.tosca2camp.templates;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Kena Alexander
 * @since 
 */

public class ImportDef implements Cloneable{

	private String name;
	private String file; //URI string
	private String repository; 
	private String namespaceUri; // description are treated as their own type but for now they will be string
	private String namespacePrefix;
	
	public static class Builder{
		private String name;
		private String file; //URI string
		private String repository; 
		private String namespaceUri; // description are treated as their own type but for now they will be string
		private String namespacePrefix;
		
		public Builder(String file){
			this.name = file;
		}
		
		public Builder name(String name){
			this.name = name;
			return this;
		}
		
		public Builder repository(String repository){
			this.repository = repository;
			return this;
		}
		
		public Builder namespaceUri(String namespaceUri){
			this.namespaceUri = namespaceUri;
			return this;
		}
		
		public Builder nameSpacePrefix(String namespacePrefix){
			this.namespacePrefix = namespacePrefix;
			return this;
		}
		
		public ImportDef build(){
			return new ImportDef(this);
		}
	}
	
	private ImportDef(Builder builder){
		this.name = builder.name;
		this.file = builder.file;
		this.repository = builder.repository;
		this.namespaceUri = builder.namespaceUri;
		this.namespacePrefix = builder.namespacePrefix;
	}
	
	public Builder getBuilder(String file){ 
		Builder builder = new Builder(file);
		builder.namespaceUri = this.namespaceUri;
		builder.name = this.name;
		builder.repository = this.repository;
		builder.namespacePrefix = this.namespacePrefix;
		return builder;
	}
	
	public Object clone(){
		try{
			ImportDef toReturn = (ImportDef) super.clone();
			toReturn.name = new String(name);
			toReturn.file = new String(file);
			toReturn.repository = new String(repository);
			toReturn.namespaceUri = new String(namespaceUri);
			toReturn.namespacePrefix = new String(namespacePrefix);
			
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	
	public String getName(){return name;}
	public String getFile(){return file;}
	public String getDescription(){return namespaceUri;}
	public String getImplementation(){return file;}
	public String getRepository(){return repository;}
	public String getNamespaceUri(){return namespaceUri;}
	public String getNamespacePrefix(){return namespacePrefix;}
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (name != null) builder.appendToString("\n"+padding+"name: "+name);
										if (file != null) builder.appendToString("\n"+padding+"file: "+file);
										if (repository != null) builder.appendToString("\n"+padding+"repository: "+repository);
										if (namespaceUri != null) builder.appendToString("\n"+padding+"namespaceUri: "+namespaceUri);
										if (namespacePrefix != null) builder.appendToString("\n"+padding+"namespacePrefix: "+namespacePrefix);
		return builder.toString();
	}
	
}
