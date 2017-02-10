package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.templates.NodeFilter;
import kr.ac.hanyang.tosca2camp.templates.Representation;

public class NodeDef implements Cloneable{
	private String name; //Node Template name
	private String typeName;
	private String derived_from; //URI string
	private String description; // description are treated as their own type but for now they will be string
	private List<String> directives; //Node template item
	private Map<String, PropertyDef> properties; 
	private Map<String, AttributeDef> attributes;
	private List<RequirementDef> requirements;
	private Map<String, CapabilityDef> capabilities;
	private Map<String, InterfaceDef> interfaces;
	private Map<String, ArtifactDef> artifacts;
	
	private NodeFilter nodeFilter;
	
	
	//-------------------------------------------------------------------------------
	
	public List<RequirementDef> getConfiguredRequirements(){
		List<RequirementDef> toReturn = new ArrayList<RequirementDef>();
		for(RequirementDef req: requirements){
			if(req.isConfigured() && req.getConnectedNode() == null){
				toReturn.add(req);
			}
		}
		return toReturn;
	}
	
	public void connect(NodeDef node, RequirementDef req){
		req.connectNode(node);
	}
	
	//-------------------------------------------------------------------------------
		public void configure(){
			//TODO perform node configuration
			System.out.println("Configuring Node "+name);
		}
		
		
		public void start(){}
		public void stop(){}
		public void delete(){}
	//-------------------------------------------------------------------------------
	
	public static class Builder {
		private String name;
		private String typeName;
		private String derived_from; //URI string
		private String description; // description are treated as their own type but for now they will be string
		private List<String> directives;
		private Map<String, PropertyDef> properties; 
		private Map<String, AttributeDef> attributes;
		private List<RequirementDef> requirements;
		private Map<String, CapabilityDef> capabilities;
		private Map<String, InterfaceDef> interfaces;
		private Map<String, ArtifactDef> artifacts;
		
		private NodeFilter nodeFilter;
		
		public Builder(){ 
			this.properties = new LinkedHashMap<String, PropertyDef>(); 
			this.attributes = new LinkedHashMap<String, AttributeDef>() ;
			this.requirements = new ArrayList<RequirementDef>();
			this.capabilities = new LinkedHashMap<String, CapabilityDef>();
			this.interfaces = new LinkedHashMap<String, InterfaceDef>();
			this.artifacts = new LinkedHashMap<String, ArtifactDef>();
		}
		
		public Builder(String typeName){
			this();
			this.typeName = typeName;
		}
		
		//usede to builde a NodeTemplate
		public Builder(String name, String typeName) {  
			this();
			this.name = name;
			this.typeName = typeName;
		}
		
		public Builder name(String name){
			this.name = name;
			return  this;
		}
		
		public Builder type(String typeName){
			this.typeName = typeName;
			return this;
		}

		public Builder derived_from(String derived_from){
			this.derived_from = derived_from;
			return  this;
		}
		
		public Builder description(String description){
			this.description = description;
			return  this;
		}
		
		public Builder directives(List<String> directives){
			this.directives = directives;
			return this;
		}
		
		public Builder addProperty(PropertyDef property){
			this.properties.put(property.getName(),property);
			return  this;
		}
		
		public Builder addAttribute(AttributeDef attribute){
			this.attributes.put(attribute.getType(),attribute);
			return  this;
		}
		
		public Builder addRequirement(RequirementDef requirement){
			this.requirements.remove(requirement);
			this.requirements.add(requirement);
			return  this;
		}
		
		public Builder addCapabilitiy(CapabilityDef capability){
			this.capabilities.put(capability.getName(),capability);
			return  this;
		}
		
		public Builder addInterface(InterfaceDef iface){
			this.interfaces.put(iface.getName(),iface);
			return  this;
		}
		
		public Builder addArtifact(ArtifactDef artifact){
			this.artifacts.put(artifact.getName(),artifact);
			return  this;
		}
		
		private Builder nodefilter(NodeFilter nodeFilter){
			this.nodeFilter = nodeFilter;
			return this;
		}
		
		public NodeDef build(){
			return new NodeDef(this);
		}
	}
		
	
	protected NodeDef(Builder builder){
		this.name = builder.name;
		this.typeName = builder.typeName;
		this.derived_from = builder.derived_from;
		this.description = builder.description;
		this.directives = builder.directives;
		this.properties = builder.properties;
		this.attributes = builder.attributes;
		this.requirements = builder.requirements;
		this.capabilities = builder.capabilities;
		this.interfaces = builder.interfaces;
		this.artifacts = builder.artifacts;
		
		this.nodeFilter = builder.nodeFilter;
	}

	
	//using a static clone method because I can make use of the builder to build a 
	//properly constructed clone
	@Override
	public Object clone(){
		try{
			NodeDef toReturn = (NodeDef) super.clone();		    
			toReturn.properties = new LinkedHashMap<String, PropertyDef>();
			for(String pDefName:properties.keySet()){
				PropertyDef pDef = properties.get(pDefName);
				toReturn.properties.put(pDefName,  (PropertyDef)pDef.clone()); //make sure pDef can create a copy
			}
			toReturn.attributes = new LinkedHashMap<String, AttributeDef>();
			for(String aDefName:attributes.keySet()){
				AttributeDef aDef = attributes.get(aDefName);
				toReturn.attributes.put(aDefName,  (AttributeDef)aDef.clone()); //make sure aDef can create a copy
			}
			toReturn.requirements = new ArrayList<RequirementDef>();
			for(RequirementDef rDef:requirements){
				toReturn.requirements.add((RequirementDef)rDef.clone()); //make sure pDef can create a copy
			}
			toReturn.capabilities = new LinkedHashMap<String, CapabilityDef>();
			for(String cDefName:capabilities.keySet()){
				CapabilityDef cDef = capabilities.get(cDefName);
				toReturn.capabilities.put(cDefName, (CapabilityDef)cDef.clone()); //make sure pDef can create a copy
			}
			toReturn.interfaces = new LinkedHashMap<String, InterfaceDef>();
			for(String intDefName:interfaces.keySet()){
				InterfaceDef interDef = interfaces.get(intDefName);
				toReturn.interfaces.put(intDefName, (InterfaceDef)interDef.clone()); //make sure interDef can create a copy
			}
			toReturn.artifacts = new LinkedHashMap<String, ArtifactDef>();
			for(String artDefName:artifacts.keySet()){
				ArtifactDef artDef = artifacts.get(artDefName);
				toReturn.artifacts.put(artDefName, (ArtifactDef)artDef.clone()); 
			}
			if (nodeFilter != null) toReturn.nodeFilter = (NodeFilter) nodeFilter.clone();
			return toReturn;
		}catch(Exception e){}
		return null;
	}
	
	public Builder getBuilder(){
		Builder builder = new Builder(typeName);
		builder.name = this.name;
		builder.typeName = this.typeName;
		builder.derived_from = this.derived_from;
		builder.description = this.description;
		builder.properties = this.properties;
		builder.attributes = this.attributes;
		builder.requirements = this.requirements;
		builder.capabilities = this.capabilities;
		builder.interfaces = this.interfaces;
		builder.artifacts = this.artifacts;
		
		builder.nodeFilter = this.nodeFilter;
		return builder;
	}	
	
	public String getName() {return name;}

	public String getTypeName() {return typeName;}

	public String getDerived_from() {return derived_from;}

    public String getDescription() {return description;}

	public List<PropertyDef> getProperties() {
		List toReturn =  new ArrayList<PropertyDef>();
		for(PropertyDef property: properties.values()){
			toReturn.add(property);
		}
		return toReturn;
	}
	

	public List<AttributeDef> getAttributes() {
		List toReturn =  new ArrayList<AttributeDef>();
		for(AttributeDef attribute: attributes.values()){
			toReturn.add(attribute);
		}
		return toReturn;
	}
	
	public List<CapabilityDef> getCapabilities() {
		List toReturn =  new ArrayList<CapabilityDef>();
		for(CapabilityDef capability: capabilities.values()){
			toReturn.add(capability);
		}
		return toReturn;
	}

	public List<RequirementDef> getRequirements() {return requirements;}
	
	//might be a custom requirement then I cater for the default not being found
	public RequirementDef getRequirement(String reqName){
		for(RequirementDef requirement: requirements)
			//if(requirement.getCapability().equals(reqName))
			if(requirement.getName().equals(reqName))
				return requirement;
		return null;
	}
	
	
	
	public CapabilityDef getCapability(String name){
		return capabilities.get(name);
	}

	public Map<String, InterfaceDef> getInterfaces() {return interfaces;}
	
	public List<InterfaceDef> getInterfaceList(){
		ArrayList<InterfaceDef> toReturn = new ArrayList<InterfaceDef>();
		for (InterfaceDef iface: interfaces.values()){
			toReturn.add(iface);
		}
		return toReturn;
	}

	public Map<String, ArtifactDef> getArtifacts() {return artifacts;}
	
	public List<ArtifactDef> getArtifactList(){
		ArrayList<ArtifactDef> toReturn = new ArrayList<ArtifactDef>();
		for (ArtifactDef artifact: artifacts.values()){
			toReturn.add(artifact);
		}
		return toReturn;
	}
	
	public void setPropertyValue(String name, DataTypeDef value){
		PropertyDef toSet = properties.get(name);
		toSet.setPropertyValue(value);
	}
	
	public PropertyDef getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
	public AttributeDef getAttribute(String attributeName){
		return attributes.get(attributeName);
	}
	
	public InterfaceDef getInterface(String interfaceName){
		return interfaces.get(interfaceName);
	}
	
	public ArtifactDef getArtifact(String artifactName){
		return artifacts.get(artifactName);
	}
	
	public void addCapabilitiy(CapabilityDef capability){
		this.capabilities.put(capability.getName(),capability);
	}
	
	public void addInterface(InterfaceDef iface){
		this.interfaces.put(iface.getName(), iface);
	}
	
	public void addArtifact(ArtifactDef artifact){
		this.artifacts.put(artifact.getName(), artifact);
	}
	
	public void validate(Representation representation){
		
//		switch(representation){
//		case PARSED:
//			//I should start resolving
//			break;
//		case RESOLVED:
//			//I should start linking
//			break;
//		}
	}
	
	
	/**
	 * toString used for testing 
	 */
	
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE)
										.appendToString("\n"+padding+"name: "+name)
										.appendToString("\n"+padding+"type: "+typeName)
										.appendToString("\n"+padding+"derived_from: "+derived_from)
										.append("\n"+padding+"properties: ");
										for(PropertyDef property: properties.values()){
											property.setTabNum(tabNum+1);
											builder.appendToString(padding+property.toString());
										}
										builder.append("\n"+padding+"capabilities: ");
										for(CapabilityDef capability: capabilities.values()){
											capability.setTabNum(tabNum+1);
											builder.appendToString(padding+capability.toString());
										}
										builder.append("\n"+padding+"requirements: ");
										for(RequirementDef requirement: requirements){
											requirement.setTabNum(tabNum+1);
											builder.appendToString(padding+requirement.toString());
										}
		return builder.toString();
	}

	
}
