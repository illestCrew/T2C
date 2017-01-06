package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Kena Alexander
 * @since 
 */

public class ArtifactDef implements Cloneable{
	/**
	 * ArtifactDef
	 */
	private String name;
	private String type;
	private String file; //URI string
	private String repository; 
	private String description; // description are treated as their own type but for now they will be string
	private String deployPath;
	
	/**
	 * ArtifactType
	 */
	private String derived_from;
	private DataTypeDef version;
	private String mime_type;
	private List<String> file_ext;
	private List<PropertyDef> properties;
	
	public static class Builder{
		private String name;
		private String type;
		private String file; //URI string
		private String repository; 
		private String description; // description are treated as their own type but for now they will be string
		private String deployPath;
		
		private String derived_from;
		private DataTypeDef version;
		private String mime_type;
		private List<String> file_ext = new ArrayList<String>();
		private List<PropertyDef> properties = new ArrayList<PropertyDef>();
		
		public Builder(){ }
		
		public Builder(String file, String type){
			this.name = file;
			this.type = type;
		}
		
		public Builder name(String name){
			this.name = name;
			return this;
		}
		
		public Builder type(String type){
			this.type = type;
			return this;
		}
		
		public Builder derived_from(String derived_from){
			this.derived_from = derived_from;
			return this;
		}
		
		public Builder version(DataTypeDef version){
			this.version = version;
			return this;
		}
		
		public Builder mime_type(String mime_type){
			this.mime_type = mime_type;
			return this;
		}
		
		public Builder file_ext(List<String> file_ext){
			this.file_ext = file_ext;
			return this;
		}
		
		public Builder properties(List<PropertyDef> properties){
			this.properties = properties;
			return this;
		}
		
		public Builder property(PropertyDef property){
			this.properties.add(property);
			return this;
		}
		
		
		public Builder file(String file){
			this.file = file;
			return this;
		}
		
		public Builder repository(String repository){
			this.repository = repository;
			return this;
		}
		
		public Builder description(String description){
			this.description = description;
			return this;
		}
		
		public Builder deployPath(String deployPath){
			this.deployPath = deployPath;
			return this;
		}
		
		public ArtifactDef build(){
			return new ArtifactDef(this);
		}
	}
	
	private ArtifactDef(Builder builder){
		this.name = builder.name;
		this.type = builder.type;
		this.file = builder.file;
		this.repository = builder.repository;
		this.description = builder.description;
		this.deployPath = builder.deployPath;
		
		this.derived_from = builder.derived_from;
		this.version = builder.version;
		this.mime_type = builder.mime_type;
		this.file_ext = builder.file_ext;
		this.properties = builder.properties;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.type = this.type;
		builder.file = this.file;
		builder.description = this.description;
		builder.name = this.name;
		builder.repository = this.repository;
		builder.deployPath = this.deployPath;
		
		builder.derived_from = this.derived_from;
		builder.version = this.version;
		builder.mime_type = this.mime_type;
		builder.file_ext = this.file_ext;
		builder.properties = this.properties;
		return builder;
	}
	
	public Object clone(){
		try{
			ArtifactDef toReturn = (ArtifactDef) super.clone();
			if (name != null) toReturn.name = new String(name);
			if (type != null) toReturn.type = new String(type);
			if (file != null) toReturn.file = new String(file);
			if (repository != null) toReturn.repository = new String(repository);
			if (description != null) toReturn.description = new String(description);
			if (deployPath != null) toReturn.deployPath = new String(deployPath);
			
			if (derived_from != null) toReturn.derived_from = new String(derived_from);
			if (version != null) toReturn.version = (DataTypeDef) version.clone();
			if (mime_type != null) toReturn.mime_type = new String(mime_type);
			toReturn.file_ext = new ArrayList<String>();
			for (String file_ext: file_ext)
				toReturn.file_ext.add(new String(file_ext));
			toReturn.properties = new ArrayList<PropertyDef>();
			for (PropertyDef property: properties)
				toReturn.properties.add((PropertyDef) property.clone());
			
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	
	public String getName(){return name;}	
	public String getType(){return type;}
	public String getDescription(){return description;}
	public String getImplementation(){return file;}
	public String getRepository(){return repository;}
	
	public String getDerivedFrom(){return derived_from;}	
	public DataTypeDef getVersion(){return version;}
	public String getMimeType(){return mime_type;}
	public List<String> getFileExtentions(){return file_ext;}
	public List<PropertyDef> getProperties(){return properties;}
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (name != null) builder.appendToString("\n"+padding+"name: "+name);
										if (type != null) builder.appendToString("\n"+padding+"type: "+type);
										if (file != null) builder.appendToString("\n"+padding+"file: "+file);
										if (repository != null) builder.appendToString("\n"+padding+"repository: "+repository);
										if (description != null) builder.appendToString("\n"+padding+"description: "+description);
										if (deployPath != null) builder.appendToString("\n"+padding+"deployPath: "+deployPath);
		return builder.toString();
	}
	
}
