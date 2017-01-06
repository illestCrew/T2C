package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class GroupTypeModel {
	
	private String typeName;
	private String derived_from;
	private VersionModel version;
	private String description;
	private List<PropertyModel> properties;
	private String[] members;
	private List<InterfaceTypeModel> interfaces;
	
	
	private GroupTypeModel(){ }
	
	public static GroupTypeModel of(){
		return new GroupTypeModel();
	}
	
	public GroupTypeModel typeName(String name){	this.typeName = name; 	return this; 	}
	public GroupTypeModel derived_from(String derived_from){	this.derived_from = derived_from; 	return this; 	}
	public GroupTypeModel version(VersionModel version){	this.version = version; 	return this; 	}
	public GroupTypeModel description(String description){	this.description = description; 	return this; 	}
	public GroupTypeModel properties(List<PropertyModel> properties){	this.properties = properties; 	return this; 	}
	public GroupTypeModel members(String[] members){	this.members = members; 	return this; 	}
	public GroupTypeModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
	
	@XmlElement(name="typeName")
	public String getTypeName(){
		return typeName;
	}
	
	@XmlElement(name="derived_from")
	public String getDerivedFrom(){
		return derived_from;
	}
	
	@XmlElement(name="version")
	public VersionModel getVersion(){
		return version;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="properties")
	public List<PropertyModel> getProperties(){
		return properties;
	}
	
	@XmlElement(name="members")
	public String[] getMembers(){
		return members;
	}
	
	@XmlElement(name="interfaces")
	public List<InterfaceTypeModel> getInterfaces(){
		return interfaces;
	}
	
}
