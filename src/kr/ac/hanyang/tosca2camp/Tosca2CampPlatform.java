package kr.ac.hanyang.tosca2camp;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import kr.ac.hanyang.tosca2camp.definitiontypes.ArtifactDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.AttributeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.EntrySchemaDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.GroupDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.InterfaceDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.NodeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RelationshipDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RequirementDef;
import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.templates.DataType;
import kr.ac.hanyang.tosca2camp.templates.Function;
import kr.ac.hanyang.tosca2camp.templates.ImplementationArtifact;
import kr.ac.hanyang.tosca2camp.templates.OperationDef;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;
import kr.ac.hanyang.tosca2camp.templates.TopologyTemplate;


public class Tosca2CampPlatform{
	
	private static final Logger log = LoggerFactory.getLogger(Tosca2CampPlatform.class);
	
	private Map<String, NodeDef> nodeDefinitions;
	private Map<String, CapabilityDef> capDefinitions; 
	private Map<String, RelationshipDef> relDefinitions;
	private Map<String, DataTypeDef> dataDefinitions;
	private Map<String, ArtifactDef> artifactDefinitions;
	private Map<String, ConstraintDef> constraintDefinitions;
	private Map<String, Function> functionDefinitions;
	private Map<String, PolicyDef> policyDefinitions;
	private Map<String, InterfaceDef> interfaceDefinitions;
	private Map<String, GroupDef> groupDefinitions;

	private Map<String, ServiceTemplate> serviceTemplates;

	
	public Tosca2CampPlatform(){
		nodeDefinitions = new LinkedHashMap<String, NodeDef>();
		capDefinitions = new LinkedHashMap<String, CapabilityDef>(); 
		relDefinitions = new LinkedHashMap<String, RelationshipDef>();
		dataDefinitions = new LinkedHashMap<String, DataTypeDef>();
		constraintDefinitions = new LinkedHashMap<String, ConstraintDef>();
		artifactDefinitions =new LinkedHashMap<String, ArtifactDef>();
		functionDefinitions = new LinkedHashMap<String, Function>();
		policyDefinitions = new LinkedHashMap<String, PolicyDef>();
		interfaceDefinitions = new LinkedHashMap<String, InterfaceDef>();
		groupDefinitions = new LinkedHashMap<String, GroupDef>();
		
		serviceTemplates =new LinkedHashMap<String, ServiceTemplate>();
		
		
	}
	
	public static Tosca2CampPlatform newPlatform(){	
			log.info("Loading Tosca type definitions...");
			Tosca2CampPlatform app = new Tosca2CampPlatform();
			// load the datatypes
			log.info("Loading datatypes ...");
			for(String typeName: ToscaConstants.DTYPEDEF_FILENAMES){
				app.loadDataType(typeName);
			}
			// load the constraints
			log.info("Loading constraints ...");
			for(String typeName: ToscaConstants.CONSTDEF_FILENAMES){
				app.loadConstraint(typeName);
			}
			// load the constraints
			log.info("Loading functions ...");
			for(String typeName: ToscaConstants.FUNCT_FILENAMES){
				app.loadFunction(typeName);
			}
			//load the artifact types
			log.info("Loading artifact types ...");
			for(String typeName: ToscaConstants.ARTDEF_FILENAMES){
				app.loadArtifact(typeName);
			}
			//load the interface types
			log.info("Loading interface types ...");
			for(String typeName: ToscaConstants.INTDEF_FILENAMES){
				app.loadInterface(typeName);
			}
			//load the capability types
			log.info("Loading capability types ...");
			for(String typeName: ToscaConstants.CAPDEF_FILENAMES){
				app.loadCapability(typeName);
			}
			//load the relationship types
			log.info("Loading relationship types ...");
			for(String typeName: ToscaConstants.RELDEF_FILENAMES){
				app.loadRelationship(typeName);
			}
			//load the nodetypes
			log.info("Loading node types ...");
			for(String typeName: ToscaConstants.NODEDEF_FILENAMES){
				app.loadDefinition(typeName);
			}
			//load policytypes
			log.info("Loading policy types ...");
			for(String typeName: ToscaConstants.PTYPEDEF_FILENAMES){
				app.loadPolicy(typeName);
			}
			//load groups
			log.info("Loading group types ...");
			for(String typeName: ToscaConstants.GROUPDEF_FILENAMES){
				app.loadGroup(typeName);
			}
			
			return app;			
	}
	
	

	//---------------------Type Definition Parsers---------------------------------
	@SuppressWarnings({ "unchecked" })
	public NodeDef loadDefinition(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "node");
		if (nodeDefinitions.containsKey(normalTypeName))
			return (NodeDef) nodeDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			nodeDefinitions.put(defName,parseNodeDef(defName,(Map<String, Object>)map.get(defName)));
			return (NodeDef) nodeDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load node type "+typeName+". Error returned: "+e.getMessage());
			return null;
		}

	}
	
	@SuppressWarnings("unchecked")
	public ConstraintDef loadConstraint(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "constraint");
		if (constraintDefinitions.containsKey(normalTypeName))
			return (ConstraintDef) constraintDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			constraintDefinitions.put(defName,parseConstraint(defName,(Map<String, Object>)map.get(defName)));
			return (ConstraintDef) constraintDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load constraint "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArtifactDef loadArtifact(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "artifact");
		if (artifactDefinitions.containsKey(normalTypeName))
			return (ArtifactDef) artifactDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			artifactDefinitions.put(defName,parseArtifactDef(defName,(Map<String, Object>)map.get(defName)));
			return (ArtifactDef) artifactDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load artifact "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public InterfaceDef loadInterface(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "interface");
		if (interfaceDefinitions.containsKey(normalTypeName))
			return (InterfaceDef) interfaceDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			interfaceDefinitions.put(defName,parseInterfaceDef(defName,(Map<String, Object>)map.get(defName)));
			return (InterfaceDef) interfaceDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load artifact "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Function loadFunction(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "function");
		if (functionDefinitions.containsKey(normalTypeName))
			return (Function) functionDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			functionDefinitions.put(defName,parseFunction(defName,(Map<String, Object>)map.get(defName)));
			return (Function) functionDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load function "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings({ "unchecked" })
	public CapabilityDef loadCapability(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "capability");
		if (capDefinitions.containsKey(normalTypeName))
			return (CapabilityDef) capDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			capDefinitions.put(defName,parseCapDef(defName,(Map<String, Object>)map.get(defName)));
			return (CapabilityDef) capDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load capability type "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public RelationshipDef loadRelationship(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "relationship");
		if (relDefinitions.containsKey(normalTypeName))
			return (RelationshipDef) relDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			relDefinitions.put(defName,parseRelDef(defName,(Map<String, Object>)map.get(defName)));
			return (RelationshipDef) relDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load relationship type "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public DataTypeDef loadDataType(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "datatype");
		if (dataDefinitions.containsKey(normalTypeName))
			return (DataTypeDef) dataDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			dataDefinitions.put(defName,parseDataTypeDef(defName,(Map<String, Object>)map.get(defName)));
			return (DataTypeDef) dataDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load datatype "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public PolicyDef loadPolicy(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "policy");
		if (policyDefinitions.containsKey(normalTypeName))
			return (PolicyDef) policyDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			policyDefinitions.put(defName,parsePolicyTypeDef(defName,(Map<String, Object>)map.get(defName)));
			return (PolicyDef) policyDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load policy type "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public GroupDef loadGroup(String typeName){
		String normalTypeName = Utilities.normalizeTypeName(typeName, "group");
		if (groupDefinitions.containsKey(normalTypeName))
			return (GroupDef) groupDefinitions.get(normalTypeName).clone();
		try{
			String fileName = ToscaConstants.FILEPATH+normalTypeName+".yml";
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String,Object>) yaml.load(new FileInputStream(new File(fileName)));
			String defName = map.keySet().iterator().next();
			groupDefinitions.put(defName,parseGroupDef(defName,(Map<String, Object>)map.get(defName)));
			return (GroupDef) groupDefinitions.get(defName).clone();
		}catch(Exception e){
			log.error("Unable to load group type "+typeName+". Error returned: "+e.getMessage());
			return null;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public NodeDef parseNodeDef(String typeName, Map<String, Object>nodeMap){
		
		NodeDef.Builder nodeDefBuilder;
		NodeDef thisDef = (NodeDef) getNodeDef(Utilities.normalizeTypeName(typeName, "node"), (String)nodeMap.get("derived_from"));
		if (thisDef != null){
			nodeDefBuilder = thisDef.getBuilder().type(typeName);	
		}else
			nodeDefBuilder = new NodeDef.Builder(typeName);
		
		for(String key: nodeMap.keySet()){
			switch(key){
			case "derived_from": nodeDefBuilder.derived_from((String)nodeMap.get("derived_from"));
				break;
			case "properties":
				Map<String,Object> propDefMap = (Map<String,Object>)nodeMap.get(key);
				for(String propName:propDefMap.keySet()){
					nodeDefBuilder.addProperty(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
				}
				break;
			case "attributes":
				Map<String,Object> attrDefMap = (Map<String,Object>)nodeMap.get(key);
				for(String attrName:attrDefMap.keySet()){
					nodeDefBuilder.addAttribute(parseAttrDef(attrName,(Map<String, Object>)attrDefMap.get(attrName)));
				}
				break;
			case "requirements":
				List<Map<String,Object>> reqDefList = (List<Map<String,Object>>)nodeMap.get(key);
				for(Map<String, Object> reqMap:reqDefList){					
					String reqName = reqMap.keySet().iterator().next();
					nodeDefBuilder.addRequirement(parseReqDef(reqName,(Map<String, Object>)reqMap.get(reqName)));
				}
				break;
			case "capabilities":
				Map<String,Object> capDefMap = (Map<String,Object>)nodeMap.get(key);
				for(String capName:capDefMap.keySet()){
					nodeDefBuilder.addCapabilitiy(parseCapDef(capName,(Map<String, Object>)capDefMap.get(capName)));
				}
				break;
			case "interfaces":
				Map<String,Object> interfaceDefMap = (Map<String,Object>)nodeMap.get(key);
				for(String propName:interfaceDefMap.keySet()){
					nodeDefBuilder.addInterface(parseInterfaceDef(propName,(Map<String, Object>)interfaceDefMap.get(propName)));
				}
				break;
			case "artifacts":
//				Map<String,Object> artiFactDefMap = (Map<String,Object>)nodeMap.get(key);
//				for(String artifactName:artiFactDefMap.keySet()){
//					nodeDefBuilder.addArtifact(parseArtifactDef(artifactName,(Map<String, Object>)artiFactDefMap.get(artifactName)));
//				}
				break;
			default:
				break;
			}
		}		
		return nodeDefBuilder.build();
	}

	
	@SuppressWarnings("unchecked")
	public ConstraintDef parseConstraint(String typeName, Map<String, Object>constMap){		
		ConstraintDef.Builder constBuilder;
		ConstraintDef thisDef = (ConstraintDef) getConstraintDef(Utilities.normalizeTypeName(typeName, "constraint"),null); // no parent
		if (thisDef != null){
			constBuilder = thisDef.getBuilder();	
		}else
			constBuilder = new ConstraintDef.Builder(typeName);
		
		for(Map.Entry<String, Object> item :constMap.entrySet()){
			switch(item.getKey()){
			case "value":
				String value = (String) item.getValue();
				DataTypeDef dataDef = loadDataType(value);
				constBuilder.value(dataDef);//.addProperty(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
				break;
			case "value_type":
				List<String> valueTypes = (List<String>) item.getValue();
				constBuilder.valueTypes(valueTypes);
				break;
			default:
				break;
			}
		}		
		return constBuilder.build();
	}
	
	
	@SuppressWarnings("unchecked")
	public ArtifactDef parseArtifactDef(String typeName, Map<String, Object>artMap){		
		ArtifactDef.Builder artBuilder;
		ArtifactDef thisDef = (ArtifactDef) getArtifactDef(Utilities.normalizeTypeName(typeName, "artifact"),(String)artMap.get("derived_from")); // no parent
		if (thisDef != null){
			//artBuilder = thisDef.getBuilder().name(typeName);	
			artBuilder = thisDef.getBuilder().type(typeName);	
		}else
			//artBuilder = new ArtifactDef.Builder().name(typeName);
			artBuilder = new ArtifactDef.Builder().type(typeName);
		
		for(String key: artMap.keySet()){
			switch(key){
			case "derived_from": artBuilder.derived_from((String)artMap.get(key));
				break;
			case "version":
				DataTypeDef version = loadDataType(key);
				version.setData((String)artMap.get(key));
				artBuilder.version(version);
				break;
			case "description":	artBuilder.description((String)artMap.get(key));
				break;
			case "mime_type":artBuilder.mime_type((String)artMap.get(key));
				break;
			case "file_ext":artBuilder.file_ext((List<String>)artMap.get(key));
				break;
			case "properties":
				Map<String,Object> propDefMap = (Map<String,Object>)artMap.get(key);
				for(String propName:propDefMap.keySet()){
					artBuilder.property(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
				}
				break;
			default:
				break;
			}
		}		
		return artBuilder.build();
	}
	
	@SuppressWarnings("unchecked")
	public InterfaceDef parseInterfaceDef(String typeName, Map<String, Object>intMap){		
		InterfaceDef.Builder intBuilder;
		InterfaceDef thisDef = (InterfaceDef) getInterfaceDef(Utilities.normalizeTypeName(typeName, "interface"),(String)intMap.get("derived_from")); // no parent
		if (thisDef != null){
			intBuilder = thisDef.getBuilder().name(typeName);	
		}else
			intBuilder = new InterfaceDef.Builder().name(typeName);
		
		for(String key: intMap.keySet()){
			switch(key){
			case "type": intBuilder.derived_from((String)intMap.get(key));
				break;
			case "derived_from": intBuilder.derived_from((String)intMap.get(key));
				break;
			case "version":
				DataTypeDef version = loadDataType(key);
				version.setData((String)intMap.get(key));
				intBuilder.version(version);
				break;
			case "description":	intBuilder.description((String)intMap.get(key));
				break;
			case "inputs":
				Map<String,Object> propDefMap = (Map<String,Object>)intMap.get(key);
				for(String propName:propDefMap.keySet()){
					intBuilder.addInput(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
				}
				break;
			default: // this is an operation
				Map<String,Object> operationMap = (Map<String,Object>)intMap.get(key);
				intBuilder.addOperation(parseOperation(key,operationMap));
				break;
			}
		}		
		return intBuilder.build();
	}
	
	
	@SuppressWarnings("unchecked")
	public Function parseFunction(String typeName, Map<String, Object>functMap){
		
		Function.Builder functionBuilder;
		Function thisDef = (Function) getFunction(Utilities.normalizeTypeName(typeName, "function"), null);
		if (thisDef != null){
			functionBuilder = thisDef.getBuilder().typeName(typeName);	
		}else
			functionBuilder = new Function.Builder().typeName(typeName);	
		for(String key: functMap.keySet()){
			switch(key){
			case "parameters":
				Map<String,Object> propDefMap = (Map<String,Object>)functMap.get(key);
				for(String propName:propDefMap.keySet()){
					functionBuilder.parameter(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
				}
				break;
			default:
				break;
			}
		}		
		return functionBuilder.build();
	}
	
	@SuppressWarnings("unchecked")
	public EntrySchemaDef parseEntrySchema(Map<String, Object> propMap){

		EntrySchemaDef.Builder entrySchemaBuilder = new EntrySchemaDef.Builder();	
		for(String mapItem:propMap.keySet()){
			switch(mapItem){
			case "type":
				String dataType = (String)propMap.get("type");
				try{
					Object primitive = Utilities.isPrimative(dataType);
					if (primitive == null){
						DataTypeDef dataDef = loadDataType(dataType); 
						if (dataDef != null)
							entrySchemaBuilder.type(dataDef);
					}else
						entrySchemaBuilder.type(primitive);
				}catch(Exception e){
					
				}
	
			case "description":
				entrySchemaBuilder.description((String)propMap.get(mapItem));
				break;
			case "constraints":
				List<Map<String,Object>> conList = (List<Map<String, Object>>) propMap.get(mapItem);
				for(Map<String,Object> constraint:conList){
					String constraintType = constraint.keySet().iterator().next();
					Object constraintValue = constraint.get(constraintType);
					ConstraintDef constDefinition = loadConstraint(constraintType);
					entrySchemaBuilder.addConstraint(ServiceTemplateUtilities.parseConstraintAssignment(constraintValue, constDefinition));
				}

				break;
			}
		}
		return entrySchemaBuilder.build();
	}
		
	@SuppressWarnings("unchecked")
	public PropertyDef parsePropDef(String name, Map<String, Object> propMap){
		
		PropertyDef.Builder propBuilder = new PropertyDef.Builder(name);
		for(String mapItem:propMap.keySet()){
			switch(mapItem){
			case "type":
				String type = (String) propMap.get("type");
				propBuilder.type(Utilities.normalizeTypeName(type,"datatype"));
				DataTypeDef dataDef = loadDataType(type); 
				propBuilder.propertyValue(dataDef);
				break;
			case "description":
				propBuilder.description((String)propMap.get(mapItem));
				break;
			case "required":
				propBuilder.required((Boolean)propMap.get(mapItem));
				break;
			case "default_value":
				Object value =  propMap.get(mapItem); 
				DataTypeDef data = propBuilder.peek().getDefaultVal();
				data = (DataTypeDef) Utilities.loadData(value, data);
				propBuilder.defaultValue(data);
				break;
			case "status":
				propBuilder.status((String)propMap.get(mapItem));
				break;
			case "constraints":
				List<Map<String,Object>> conList = (List<Map<String, Object>>) propMap.get(mapItem);
				for(Map<String,Object> constraint:conList){
					String constraintType = constraint.keySet().iterator().next();
					Object constraintValue = constraint.get(constraintType);
					ConstraintDef constDefinition = loadConstraint(constraintType);
					propBuilder.addConstraint(ServiceTemplateUtilities.parseConstraintAssignment(constraintValue, constDefinition));
				}
				break;
			case "entry_schema":
				propBuilder.entry_schema(parseEntrySchema((Map<String, Object>)propMap.get(mapItem)));
				break;
			}
		}
		return propBuilder.build();
	}
	
	@SuppressWarnings("unchecked")
	public AttributeDef parseAttrDef(String name, Map<String, Object> attrMap){
		AttributeDef.Builder attrBuilder = new AttributeDef.Builder(name);
		for(String mapItem:attrMap.keySet()){
			switch(mapItem){
			case "type":
				String type = (String) attrMap.get("type");
				attrBuilder.type(Utilities.normalizeTypeName(type,"datatype"));
				DataTypeDef dataDef = loadDataType(type); 
				attrBuilder.defaultVal(dataDef);
				break;
			case "description":
				attrBuilder.description((String)attrMap.get(mapItem));
				break;
			case "default_value":
				Object value =  attrMap.get(mapItem); 
				DataTypeDef data = attrBuilder.peek().getDefaultVal();
				data = (DataTypeDef) Utilities.loadData(value, data);
				attrBuilder.defaultVal(data);
				break;
			case "status":
				attrBuilder.status((String)attrMap.get(mapItem));
				break;
			case "entry_schema":
				attrBuilder.entry_schema(parseEntrySchema((Map<String, Object>)attrMap.get(mapItem)));
				break;
			}
		}
		return attrBuilder.build();
	}
	
	public RequirementDef parseReqDef(String name, Map<String, Object> reqMap){
		RequirementDef.Builder reqBuilder = new RequirementDef.Builder(name);
		for(String mapItem:reqMap.keySet()){
			switch(mapItem){
			case "node":		
				reqBuilder.node(((String)reqMap.get(mapItem)));
				break;
			case "relationship":		
				Object relItem = reqMap.get(mapItem);
				if (relItem instanceof String){
					reqBuilder.relationshipDef(new RelationshipDef.Builder(name,name).build());
				}else{
					Map<String, Object> relMap = (Map<String, Object>) relItem;
					String relName = relMap.keySet().iterator().next();
					Map<String, Object> relValues = (Map<String, Object>) relMap.get(relName); 
					reqBuilder.relationshipDef(parseRelDef(relName, relValues));
				}
				break;
			case "capability":			
				reqBuilder.capability((String)reqMap.get(mapItem));
				break;
			case "occurence":
				//TODO reqBuilder.occurence((String)reqMap.get(mapItem));
				break;
			}
		}
		return reqBuilder.build();
	}
	
	@SuppressWarnings({ "unchecked"})
	public CapabilityDef parseCapDef(String name, Map<String, Object> capMap){
		CapabilityDef.Builder capBuilder;
		CapabilityDef thisDef;
		String type = (String)capMap.get("type");
		if (type == null) type = name;
			thisDef = (CapabilityDef) getCapabilityDef(Utilities.normalizeTypeName(type, "capability"), (String)capMap.get("derived_from"));		
		if (thisDef != null){
			capBuilder = thisDef.getBuilder();
		}else
			capBuilder = new CapabilityDef.Builder();
		
		capBuilder.name(name).type(type);
		for(String mapItem:capMap.keySet()){
			switch(mapItem){
			case "type": capBuilder.type((String)capMap.get(mapItem));
				break;
			case "description":
				capBuilder.description((String)capMap.get(mapItem));
				break;
			case "derived_from":
				capBuilder.derived_from((String)capMap.get("derived_from"));
				break;
			case "properties":
				Map<String, Object> propMap = (Map<String, Object>) capMap.get(mapItem);
				for(String propName:propMap.keySet()){
					capBuilder.addProperty(parsePropDef(propName,(Map<String, Object>)propMap.get(propName)));	
				}
				break;
			case "attributes":
				Map<String, Object> attrMap = (Map<String, Object>) capMap.get(mapItem);
				for(String attrName:attrMap.keySet()){
					capBuilder.addAttribute(parseAttrDef(attrName,(Map<String, Object>)attrMap.get(attrName)));	
				}
				break;
			case "valid_source_types":
				List<String> sourcesList = (List<String>) capMap.get(mapItem);
				for(String attrName:sourcesList){
					capBuilder.addValid_source_types(attrName);	
				}
				break;
			}
		}
		return capBuilder.build();
	}
        
	
	
	@SuppressWarnings("unchecked")
	public RelationshipDef parseRelDef(String typeName, Map<String, Object> relMap){

		RelationshipDef.Builder relBuilder;
		RelationshipDef thisDef = (RelationshipDef) getRelationshipDef(Utilities.normalizeTypeName(typeName, "relationship"), (String)relMap.get("derived_from"));
		if (thisDef != null){
			relBuilder = thisDef.getBuilder().type(typeName);
		}else
			relBuilder = new RelationshipDef.Builder();
		relBuilder.type(typeName);
		for(String mapItem:relMap.keySet()){
			switch(mapItem){
			case "derived_from": relBuilder.derived_from((String)relMap.get("derived_from"));
				break;
			case "description":
				relBuilder.description((String)relMap.get(mapItem));
				break;
			case "properties":
				Map<String, Object> propMap = (Map<String, Object>) relMap.get(mapItem);
				for(String propName:propMap.keySet()){
					relBuilder.addProperty(parsePropDef(propName,(Map<String, Object>)propMap.get(propName)));	
				}
				break;
			case "attributes":
				Map<String, Object> attrMap = (Map<String, Object>) relMap.get(mapItem);
				for(String attrName:attrMap.keySet()){
					relBuilder.addAttribute(parseAttrDef(attrName,(Map<String, Object>)attrMap.get(attrName)));	
				}
				break;
			case "valid_target_types":
				List<String> sourcesList = (List<String>) relMap.get(mapItem);
				for(String attrName:sourcesList){
					relBuilder.addValid_target_types(attrName);	
				}
				break;
			case "interfaces":
				Map<String,Object> interfaceDefMap = (Map<String,Object>)relMap.get(mapItem);
				for(String propName:interfaceDefMap.keySet()){
					relBuilder.addInterface(parseInterfaceDef(propName,(Map<String, Object>)interfaceDefMap.get(propName)));
				}

				break;
			}
		}
		return relBuilder.build();
	}
		
	@SuppressWarnings("unchecked")
	public DataTypeDef parseDataTypeDef(String name, Map<String, Object> dataMap){
		DataTypeDef.Builder dataDefBuilder;	
		DataTypeDef thisDef = (DataTypeDef) getDataTypeDef(Utilities.normalizeTypeName(name, "datatype"), (String)dataMap.get("derived_from"));
		if (thisDef != null){
			dataDefBuilder = thisDef.getBuilder().typeName(name);
		}else
			dataDefBuilder = new DataTypeDef.Builder().typeName(name);
//		dataDefBuilder.typeName(name);
		Object primitiveValue = Utilities.isPrimative(Utilities.normalizeTypeName(name, "datatype"));
		if ( primitiveValue != null){
			dataDefBuilder.primitiveValue(primitiveValue);
			dataDefBuilder.dataStored(DataType.VALUE);
		}else{
			String function = Utilities.isFunction(Utilities.normalizeTypeName(name, "datatype"));
			if ( function != null){
				//dataDefBuilder.function(function).primitiveValue(primitiveValue);
				dataDefBuilder.dataStored(DataType.FUNCTION);
			}else
				dataDefBuilder.dataStored(DataType.COMPLEX);
		}
		for(String key: dataMap.keySet()){
			switch(key){
			case "derived_from": 
				try{	
					String parent = (String)dataMap.get("derived_from");
					dataDefBuilder.derived_from(parent); 
					
				}catch(Exception e){
					//TODO log something here
				}
				break;
			case "properties":
				Map<String,Object> propDefMap = (Map<String,Object>)dataMap.get(key);
				for(String propName:propDefMap.keySet()){
					dataDefBuilder.addProperty(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
				}
				break;
			case "constraints":
				List<Map<String,Object>> conList = (List<Map<String, Object>>) dataMap.get(key);
				for(Map<String,Object> constraint:conList){
					String constraintType = constraint.keySet().iterator().next();
					Object constraintValue = constraint.get(constraintType);
					ConstraintDef constDefinition = loadConstraint(constraintType);
					dataDefBuilder.addConstraint(ServiceTemplateUtilities.parseConstraintAssignment(constraintValue, constDefinition));
				}
				break;	
			default: 
				break;
			}
		}
		return dataDefBuilder.build();
	}
	
	
	@SuppressWarnings("unchecked")
	public PolicyDef parsePolicyTypeDef(String name, Map<String, Object> dataMap){
		PolicyDef.Builder policyDefBuilder;	 
		PolicyDef thisDef = (PolicyDef) getPolicyDef(Utilities.normalizeTypeName(name, "policy"), (String)dataMap.get("derived_from"));
		if (thisDef != null){
			policyDefBuilder = thisDef.getBuilder().typeName(name);
		}else
			policyDefBuilder = new PolicyDef.Builder();
		policyDefBuilder.typeName(name);
		if (dataMap != null){
			for(String key: dataMap.keySet()){
				switch(key){
				case "derived_from": policyDefBuilder.derived_from((String)dataMap.get("derived_from")); 
					break;
				case "properties":
					Map<String,Object> propDefMap = (Map<String,Object>)dataMap.get(key);
					for(String propName:propDefMap.keySet()){
						policyDefBuilder.addProperty(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
					}
					break;
				case "targets":
					List<String> tList = (List<String>) dataMap.get(key);
					for(String target:tList){
						policyDefBuilder.addTargets(target);	
					}
					break;	
				default: 
					break;
				}
			}
		}
		return policyDefBuilder.build();
	}
	
	
	@SuppressWarnings("unchecked")
	public GroupDef parseGroupDef(String name, Map<String, Object> dataMap){
		GroupDef.Builder groupDefBuilder;
		GroupDef thisDef = (GroupDef) getGroupDef(Utilities.normalizeTypeName(name, "group"), (String)dataMap.get("derived_from"));
		if (thisDef != null){
			groupDefBuilder = thisDef.getBuilder(name);
		}else
			groupDefBuilder = new GroupDef.Builder(name);

		if (dataMap != null){
			for(String key: dataMap.keySet()){
				switch(key){
				case "properties":
					Map<String,Object> propDefMap = (Map<String,Object>)dataMap.get(key);
					for(String propName:propDefMap.keySet()){
						groupDefBuilder.addProperty(parsePropDef(propName,(Map<String, Object>)propDefMap.get(propName)));
					}
					break;
				case "members":
					List<String> membersDefList = (List<String>)dataMap.get(key);
					groupDefBuilder.addMembers(membersDefList);
					break;
				case "interfaces":
					Map<String,Object> interfaceDefMap = (Map<String,Object>)dataMap.get(key);
					for(String propName:interfaceDefMap.keySet()){
						groupDefBuilder.addInterface(parseInterfaceDef(propName,(Map<String, Object>)interfaceDefMap.get(propName)));
					}
					break;
				default: 
					break;
				}
			}
		}
		return groupDefBuilder.build();
	}
	
	@SuppressWarnings("unchecked")
	public OperationDef parseOperation(String name, Map<String, Object> opMap){
		OperationDef.Builder opBuilder = new OperationDef.Builder(name);
		if (opMap != null){
			for(String key: opMap.keySet()){
				switch(key){
				case "description": opBuilder.description((String)opMap.get(key));
					break;
				case "implementation": 
						opBuilder.implementation(new ImplementationArtifact((String)opMap.get(key)));
					break;
				case "inputs":
					Map<String,Object> inputDefMap = (Map<String,Object>)opMap.get(key);
					for(String propName:inputDefMap.keySet()){
						opBuilder.input(parsePropDef(propName,(Map<String, Object>)inputDefMap.get(propName)));
					}
					break;
				default: 
					break;
				}
			}
		}
		return opBuilder.build();
	}
	
	
	public NodeDef getNodeDef(String typeName, String parent){
		log.info("Attempting to get the node type "+typeName);
		if (typeName != null){
			NodeDef dataDefinition = (NodeDef) nodeDefinitions.get(Utilities.normalizeTypeName(typeName,"node"));
			if(dataDefinition == null){
				if (parent != null){
					NodeDef parentDef = loadDefinition(parent);
					return parentDef;
				}else				
					return new NodeDef.Builder(typeName).build();
			}else
				return (NodeDef) dataDefinition.clone();
		}else
			log.error("Unable to get the node type. No type name was given.");
			return null;
	}
	
	public ArtifactDef getArtifactDef(String typeName, String parent){
		log.info("Attempting to get the artifact type "+typeName);
		if (typeName != null){
			ArtifactDef dataDefinition = (ArtifactDef) artifactDefinitions.get(Utilities.normalizeTypeName(typeName,"artifact"));
			if(dataDefinition == null){
				if (parent != null){
					ArtifactDef parentDef = loadArtifact(parent);
					return parentDef;
				}else				
					return new ArtifactDef.Builder().name(typeName).build();
			}else
				return (ArtifactDef) dataDefinition.clone();
		}else
			log.error("Unable to get the artifact type. No type name was given.");
			return null;
	}
	
	public InterfaceDef getInterfaceDef(String typeName, String parent){
		log.info("Attempting to get the artifact type "+typeName);
		if (typeName != null){
			InterfaceDef dataDefinition = (InterfaceDef) interfaceDefinitions.get(Utilities.normalizeTypeName(typeName,"interface"));
			if(dataDefinition == null){
				if (parent != null){
					InterfaceDef parentDef = loadInterface(parent);
					return parentDef;
				}else				
					return new InterfaceDef.Builder().name(typeName).build();
			}else
				return (InterfaceDef) dataDefinition.clone();
		}else
			log.error("Unable to get the intercface type. No type name was given.");
			return null;
	}
	
	public ConstraintDef getConstraintDef(String typeName, String parent){
		log.info("Attempting to get the constraint type "+typeName);
		if (typeName != null){
			ConstraintDef dataDefinition = (ConstraintDef) constraintDefinitions.get(Utilities.normalizeTypeName(typeName,"constraint"));
			if(dataDefinition == null){
				if (parent != null){
					ConstraintDef parentDef = loadConstraint(parent);
					return parentDef;
				}else				
					return new ConstraintDef.Builder(typeName).build();
			}else
				return (ConstraintDef) dataDefinition.clone();
		}else
			log.error("Unable to get the constraint type. No type name was given.");
			return null;
	}
	
	public Function getFunction(String typeName, String parent){
		log.info("Attempting to get the function type "+typeName);
		if (typeName != null){
			Function dataDefinition = (Function) functionDefinitions.get(Utilities.normalizeTypeName(typeName,"function"));
			if(dataDefinition == null){
				if (parent != null){
					Function parentDef = loadFunction(parent);
					return parentDef;
				}else				
					return new Function.Builder().typeName(typeName).build();
			}else
				return (Function) dataDefinition.clone();
		}else
			log.error("Unable to get the function type. No type name was given.");
			return null;
	}
	
	public RelationshipDef getRelationshipDef(String typeName, String parent){
		log.info("Attempting to get the relationship type "+typeName);
		if (typeName != null){
			RelationshipDef dataDefinition = (RelationshipDef) relDefinitions.get(Utilities.normalizeTypeName(typeName,"relationship"));
			if(dataDefinition == null){
				if (parent != null){
					RelationshipDef parentDef = loadRelationship(parent);
					return parentDef;
				}else
					
					return new RelationshipDef.Builder().build();
			}else
				return (RelationshipDef) dataDefinition.clone();
		}else
			log.error("Unable to get the relationship type. No type name was given.");
			return null;
	}
	
	
	public CapabilityDef getCapabilityDef(String typeName, String parent){
		log.info("Attempting to get the capability type "+typeName);
		if (typeName != null){
			CapabilityDef dataDefinition = (CapabilityDef) capDefinitions.get(Utilities.normalizeTypeName(typeName,"capability"));
			if(dataDefinition == null){
				if (parent != null){
					CapabilityDef parentDef = loadCapability(parent);
					return parentDef;
				}else
					
					return new CapabilityDef.Builder().build();
			}else
				return (CapabilityDef) dataDefinition.clone();
		}else
			log.error("Unable to get the capability type. No type name was given.");
			return null;
	}
	
	public DataTypeDef getDataTypeDef(String typeName, String parent){
		log.info("Attempting to get the datatype type "+typeName);
		if (typeName != null){
			DataTypeDef dataDefinition = (DataTypeDef) dataDefinitions.get(Utilities.normalizeTypeName(typeName,"datatype"));
			if(dataDefinition == null){
				try{
				if (parent != null && Utilities.isPrimative(parent) == null){
					DataTypeDef parentDef = loadDataType(parent);
					return parentDef;
				}else
					return new DataTypeDef.Builder().build();
				}catch(Exception e){
					log.error("Unable to get the datatype "+typeName+". Error returned: "+e.getMessage());
					return null;
				}
			}else
				return (DataTypeDef) dataDefinition.clone();
		}else
			log.error("Unable to get the datatype. No type name was given.");
			return null;
	}
	
	public PolicyDef getPolicyDef(String typeName, String parent){
		log.info("Attempting to get the policy type "+typeName);
		if (typeName != null){
			PolicyDef dataDefinition = (PolicyDef) policyDefinitions.get(Utilities.normalizeTypeName(typeName,"policy"));
			if(dataDefinition == null){
				if (parent != null){
					PolicyDef parentDef = loadPolicy(parent);
					return parentDef;
				}else
					
					return new PolicyDef.Builder().build();
			}else
				return (PolicyDef) dataDefinition.clone();
		}else
			log.error("Unable to get the policy type. No type name was given.");
			return null;
	}
	
	public GroupDef getGroupDef(String typeName, String parent){
		log.info("Attempting to get the policy type "+typeName);
		if (typeName != null){
			GroupDef dataDefinition = (GroupDef) groupDefinitions.get(Utilities.normalizeTypeName(typeName,"group"));
			if(dataDefinition == null){
				if (parent != null){
					GroupDef parentDef = loadGroup(parent);
					return parentDef;
				}else
					
					return new GroupDef.Builder(typeName).build();
			}else
				return (GroupDef) dataDefinition.clone();
		}else
			log.error("Unable to get the policy type. No type name was given.");
			return null;
	}
	
	public Map<String, NodeDef> getNodeDefs(){
		return nodeDefinitions;
	}
	
	public Map<String, RelationshipDef> getRelationshipDefs(){
		return relDefinitions;
	}
	
	public Map<String, CapabilityDef> getCapabilityDefs(){
		return capDefinitions;
	}
	
	public Map<String, DataTypeDef> getDatatypeDefs(){
		return dataDefinitions;
	}

	public ServiceTemplate createServiceTemplate(Map<String, Object> toscaMap){
		ServiceTemplate st = ServiceTemplateUtilities.parseServiceTemplate(toscaMap, this);
		serviceTemplates.put(st.getId(), st);
		return st;
	}
//	
	@SuppressWarnings("unchecked")
	public ServiceTemplate createServiceTemplate(File file){
		Yaml yaml = new Yaml();
        Map<String, Object> toscaMap;
		try {
			toscaMap = (Map<String,Object>) yaml.load(new FileInputStream(file));
			return createServiceTemplate(toscaMap);
		} catch (FileNotFoundException e) {
			log.error("Unable to create the Service Template. Error returned: "+e.getMessage());
			return null;
		}
		
	
	}
	
	@SuppressWarnings("unchecked")
	public ServiceTemplate createServiceTemplate(String fileName){
		try {
			File yamlFile = new File(ToscaConstants.BASE_FILEPATH+fileName);
			return createServiceTemplate(yamlFile);
		} catch (Exception e) {
			log.error("Unable to create the Service Template. Error returned: "+e.getMessage());
			return null;
		}
		
	
	}
	
	/**
	 * returns the service template.
	 * @param id
	 * @return ServiceTemplate
	 */
	public ServiceTemplate getServiceTemplate(String id){
		return serviceTemplates.get(id);   
	}
	
	/**
	 * returns the topology template of a service template
	 * @param serviceId
	 * @return TopolgyTemplate
	 */
	public TopologyTemplate getTopolgyTemplate(String serviceId){
		return serviceTemplates.get(serviceId).getTopologyTemplate();
	}
	
	//public String toString(){
	//	return nodeDefinitions.toString();
	//}
	
	
	
//	
//	
//	public List<ServiceTemplateUtilities> getServiceTemplates(){
//		return (List<ServiceTemplateUtilities>) serviceTemplates.values();
//	}
	
}
//Yaml yaml = new Yaml(new RangeConstructor(),new RangeRepresenter(), new DumperOptions());
//	    yaml.addImplicitResolver(new Tag("!range"), Pattern.compile("^\\[ * (\\d+) *, *(\\d+) *\\]$"), "[");
//		Map<String, Range> map = (Map<String,Range>) yaml.load(new FileInputStream(new File("C:/Users/Kena/Git/tosca2camp-0.0.1-SNAPSHOT/src/main/java/kr/ac/hanyang/tosca2camp/Sample.yml")));
//		System.out.println(map.get("tosca_definitions_version"));		
