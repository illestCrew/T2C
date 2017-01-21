package kr.ac.hanyang.tosca2camp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.ac.hanyang.tosca2camp.definitiontypes.ArtifactDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.AttributeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.GroupDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.InterfaceDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.NodeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef.Builder;
import kr.ac.hanyang.tosca2camp.templates.Function;
import kr.ac.hanyang.tosca2camp.templates.ImplementationArtifact;
import kr.ac.hanyang.tosca2camp.templates.OperationDef;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;
import kr.ac.hanyang.tosca2camp.templates.TopologyTemplate;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RelationshipDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RequirementDef;


public class ServiceTemplateUtilities {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceTemplateUtilities.class);
	
	
		//-------------------------- Template Parsers--------------------------------------
		
		@SuppressWarnings({ "unchecked" })
		protected static NodeDef parseNodeTemplate(String name, Map<String, Object>nodeMap, NodeDef nodeDefinition, Tosca2CampPlatform platform){			 
			String type = (String) nodeMap.get("type");
				for(String key: nodeMap.keySet()){
					switch(key){
					case "description" : nodeDefinition.getBuilder().description((String)nodeMap.get(key)).build();
						break;
					case "directives" :
						break;
					case "properties":
						Map<String, Object> propMaps = (Map<String,Object>) nodeMap.get(key);
						for(String propName: propMaps.keySet()){
							PropertyDef propDef = nodeDefinition.getProperty(propName);
							Object value = propMaps.get(propName);
							propDef = parsePropertyAssignment(value ,propDef,platform);
							nodeDefinition.getBuilder().addProperty(propDef).build();
						}
						break;
					case "attributes" :
						Map<String, Object> attrMaps = (Map<String,Object>) nodeMap.get(key);
						for(String attrName: attrMaps.keySet()){
							AttributeDef attrDef = nodeDefinition.getAttribute(attrName);
							Object value = attrMaps.get(attrName);
							parseAttributeAssignment(value ,attrDef);
						}
						break;
					case "requirements" :
						for(Map<String, Object> reqItem: (List <Map<String, Object>>) nodeMap.get(key)){
							String reqName = reqItem.keySet().iterator().next();
							RequirementDef reqDef = nodeDefinition.getRequirement(Utilities.normalizeTypeName(reqName,"requirement"));
							if (reqDef != null){ 
								reqDef.getBuilder().name(reqName);
								Map<String, Object> reqMap = (Map<String, Object>) reqItem.get(reqName);
								parseRequirementAssignment(reqMap ,reqDef, platform);
							}
						}
						break;
					case "capabilities":
						Map<String, Object> capMaps = (Map<String,Object>) nodeMap.get(key);
						for(String capName: ((Map<String, Object>) nodeMap.get(key)).keySet()){
							//Map<String, Object> capDef = (Map<String, Object>) nodeMap.get(key);
							//String capName = capItem.keySet().iterator().next();
							CapabilityDef capDef = nodeDefinition.getCapability(capName);
							Map<String, Object> capMap = (Map<String, Object>) capMaps.get(capName);
							parseCapabilityAssignment(capName,capMap ,capDef,platform);
						}
						
//						for(Object obj:  ((Map<String, Object>) nodeMap.get(key)).values()){
//							Map<String, Object> capItem = (Map<String, Object>) obj;
//							String capName = capItem.keySet().iterator().next();
//							CapabilityDef capDef = nodeDefinition.getCapability(capName);
//							Map<String, Object> capMap = (Map<String, Object>) capItem.get(capName);
//							parseCapabilityAssignment(capName,capMap ,capDef,platform);
//						}
						break;
					case "interfaces" :
						Map<String, Object> ifaceMap = (Map<String, Object>) nodeMap.get(key);
						for( String ifaceName: ifaceMap.keySet()){
							InterfaceDef iDef = nodeDefinition.getInterface(ifaceName);
							if (iDef != null){
								Map<String, Object> ifaceItem = (Map<String, Object>) ifaceMap.get(ifaceName);
								parseInterface(ifaceItem, iDef, platform);
								//nodeDefinition.addInterface(platform.parseInterfaceDef(ifaceName, ifaceItem));
							}
						}
						
						break;
					case "artifacts" :
						for(Map<String, Object> artItem: (List <Map<String, Object>>) nodeMap.get(key)){
							nodeDefinition.addArtifact(platform.parseArtifactDef(name, artItem));
						}
						break;
					case "node_filter" :
						break;
					default:
						break;
					}
				}
				return nodeDefinition.getBuilder().name(name).build();
		}
		
		
		@SuppressWarnings({ "unchecked" })
		protected static PropertyDef parsePropertyAssignment(Object value, PropertyDef propDefinition, Tosca2CampPlatform platform){			
			PropertyDef.Builder propertyBuilder = propDefinition.getBuilder();
			if (Utilities.isFunction(value)!=null){			
				String functionName = Utilities.isFunction(value);
				Object functionParams = ((Map<String, Object>)value).get(functionName);
				DataTypeDef data = new DataTypeDef.Builder().typeName(functionName)
															.function(platform.getFunction(functionName, null))
															.build();
			
				data = (DataTypeDef)Utilities.loadData(functionParams, data);
				return propertyBuilder.propertyValue(data)
									  .hasValue(true)
		   					   		  .build();
				//return propertyBuilder.build();
			}else{
				DataTypeDef dataDef = propDefinition.getPropertyValue();
				dataDef = (DataTypeDef) Utilities.loadData(value, dataDef);
				propertyBuilder.propertyValue(dataDef);
				return propertyBuilder.hasValue(true)
									.build(); 
			}
		}
		
		protected static AttributeDef parseAttributeAssignment(Object value, AttributeDef attrDefinition){			
			//Object value =  propMap.getValue(); // TODO need to add logic to evaluate expressions. i.e. if the value is an expression then evaluate it. 
			AttributeDef.Builder attrBuilder = attrDefinition.getBuilder();
			DataTypeDef dataDef = attrDefinition.getAttributeValue();
			dataDef = (DataTypeDef) Utilities.loadData(value, dataDef);
			attrBuilder.defaultVal(dataDef);
			return attrBuilder.build(); 
		}
		
		protected static ConstraintDef parseConstraintAssignment(Object value, ConstraintDef constDefinition){			
			//Object value =  propMap.getValue(); // TODO need to add logic to evaluate expressions. i.e. if the value is an expression then evaluate it. 
			ConstraintDef.Builder constBuilder = constDefinition.getBuilder();
			DataTypeDef dataDef = (DataTypeDef) constDefinition.getValue();
			dataDef = (DataTypeDef) Utilities.loadData(value, dataDef);
			constBuilder.value(dataDef);
			return constBuilder.build(); 
		}
		
		@SuppressWarnings({ "unchecked" })
		protected static RequirementDef parseRequirementAssignment(Map<String, Object>reqMap, RequirementDef reqDefinition, Tosca2CampPlatform platform){			
			for(String mapItem:reqMap.keySet()){
				switch(mapItem){
				case "node":		
					reqDefinition.setNodeVal((String)reqMap.get(mapItem));
					break;
				case "relationship":
 
					Object relItem = reqMap.get(mapItem);
					if (relItem instanceof String){
						reqDefinition.setRelValue((String) relItem);
					}else{
						reqDefinition.setRelValue(parseRelTemplate((Map<String, Object>)relItem, reqDefinition.getRelationship(),platform));
					}

					break;
				case "capability":			
					reqDefinition.setCapValue((String)reqMap.get(mapItem));
					break;
				case "occurence":
					//TODO reqBuilder.occurence((String)reqMap.get(mapItem));
					break;
				}
			}
			reqDefinition.setConfigured(true);
			return reqDefinition;
		}
		
		
		@SuppressWarnings("unchecked")
		protected static RelationshipDef parseRelTemplate( Map<String,Object>relMap, RelationshipDef relDefinition, Tosca2CampPlatform platform){
			//String type = (String) relMap.get("type");
			for(String key: relMap.keySet()){
				switch(key){
				case "properties":
					Map<String, Object> propMaps = (Map<String,Object>) relMap.get(key);
					for(String propName: propMaps.keySet()){
						PropertyDef propDef = relDefinition.getProperty(propName);
						Object value = propMaps.get(propName);
						parsePropertyAssignment(value ,propDef,platform);
					}
					break;
				case "attributes":
					Map<String, Object> attrMaps = (Map<String,Object>) relMap.get(key);
					for(String attrName: attrMaps.keySet()){
						AttributeDef attrDef = relDefinition.getAttribute(attrName);
						Object value = attrMaps.get(attrName);
						parseAttributeAssignment(value ,attrDef);
					}
					break;
				case "interfaces":
					for(Map<String, Object> ifaceItem: (List <Map<String, Object>>) relMap.get(key)){
						relDefinition.addInterface(platform.parseInterfaceDef(ifaceItem.keySet().iterator().next(), ifaceItem));
					}
					break;
				default:
					break;
				}
			}
				return relDefinition;
				
		}
		
		@SuppressWarnings("unchecked")
		protected static GroupDef parseGroupTemplate( Map<String,Object>groupMap, GroupDef groupDefinition, Tosca2CampPlatform platform){
			//String type = (String) relMap.get("type");
			for(String key: groupMap.keySet()){
				switch(key){
				case "properties":
					Map<String, Object> propMaps = (Map<String,Object>) groupMap.get(key);
					for(String propName: propMaps.keySet()){
						PropertyDef propDef = groupDefinition.getProperty(propName);
						Object value = propMaps.get(propName);
						parsePropertyAssignment(value ,propDef, platform);
					}
					break;
				case "members":
					List<String> membersDefList = (List<String>)groupMap.get(key);
					groupDefinition.addMembers(membersDefList);
					break;
				case "interfaces":
					for(Map<String, Object> ifaceItem: (List <Map<String, Object>>) groupMap.get(key)){
						groupDefinition.addInterface(platform.parseInterfaceDef(ifaceItem.keySet().iterator().next(), ifaceItem));
					}
					break;
				default:
					break;
				}
			}
				return groupDefinition;
				
		}
		
		@SuppressWarnings("unchecked")
		protected static CapabilityDef parseCapabilityAssignment( String name, Map<String, Object>capMap, CapabilityDef capDefinition, Tosca2CampPlatform platform){
			//Map<String, Object> value =  (Map<String, Object>)capMap.getValue();
			//String type = (String) capMap.get("type");
			for(String key: capMap.keySet()){
				switch(key){
				case "properties":
					Map<String, Object> propMaps = (Map<String,Object>) capMap.get(key);
					for(String propName: propMaps.keySet()){
						PropertyDef propDef = capDefinition.getProperty(propName);
						Object value = propMaps.get(propName);
						parsePropertyAssignment(value ,propDef, platform);
					}
					break;
				case "attributes":
					Map<String, Object> attrMaps = (Map<String,Object>) capMap.get(key);
					for(String attrName: attrMaps.keySet()){
						AttributeDef attrDef = capDefinition.getAttribute(attrName);
						Object value = attrMaps.get(attrName);
						parseAttributeAssignment(value ,attrDef);
					}
					break;
				default:
					break;
				}
			}
			capDefinition.setConfigured(true);
			return capDefinition;
		}
		
		@SuppressWarnings("unchecked")
		protected static InterfaceDef parseInterface(Map<String, Object> interfaceMap, InterfaceDef intDef, Tosca2CampPlatform platform){
			for(String key: interfaceMap.keySet()){
				switch(key){
				case "inputs":
					Map<String,Object> inputMap = (Map<String,Object>)interfaceMap.get(key);
					if (inputMap != null){
						for(String propertyName:inputMap.keySet()){
							Object value = inputMap.get(propertyName);
							PropertyDef.Builder propertyBuilder = new PropertyDef.Builder(propertyName);
							if (Utilities.isFunction(value)!=null){
								String functionName = Utilities.isFunction(value);
								Object functionParams = ((Map<String, Object>)value).get(functionName);
								DataTypeDef data = new DataTypeDef.Builder().typeName(functionName)
																			.function(platform.getFunction(functionName, null))
																			.build();
								data = (DataTypeDef)Utilities.loadData(functionParams, data);
								propertyBuilder.propertyValue(data)
						   					   .build();
								intDef.addInput(propertyBuilder.build());
							}else{
								PropertyDef property = propertyBuilder.build();
								property.setPropertyValue(value);
								intDef.addInput(property);
							}
						}
					}
					
					/*Map<String,Object> inputMap = (Map<String,Object>)interfaceMap.get(key);
					if (inputMap != null){
						for(String propertyName:inputMap.keySet()){
							Object value = inputMap.get(propertyName);
							//PropertyDef propDef = intDef.getProperty(propName);
							//parsePropertyAssignment(value ,propDef);
						}
					}*/
					break;
				default:
					//the default is an operation. only the short version should be here
					OperationDef operation = intDef.getOperation(key);
					Object operationImplementation = interfaceMap.get(key);
					parseOperation(operationImplementation, operation, platform);
					break;
				}
			}
			return intDef;
		}
		
		
		@SuppressWarnings("unchecked")
		protected static OperationDef parseOperation(Object obj, OperationDef opDef, Tosca2CampPlatform platform){
			if (obj instanceof String){
				opDef.addImplementation(new ImplementationArtifact((String)obj));
				return opDef;
			}else{
				Map<String, Object> opMap = (Map<String, Object>) obj;
				for(String key: opMap.keySet()){
					switch(key){
					case "implementation":
						if (opMap.get(key) instanceof String){
							opDef.addImplementation(new ImplementationArtifact((String)opMap.get(key)));
						}else{
							Map<String, Object> implementationMap = (Map<String, Object>) opMap.get(key);
							ImplementationArtifact intArt = new ImplementationArtifact((String)implementationMap.get("primary"));
							List<String> dependencies = (List<String>) implementationMap.get("dependencies"); 
							for (String impDependency: dependencies){
								intArt.addDependency(impDependency);	
							}
						}
						break;
					case "inputs":
						Map<String,Object> inputMap = (Map<String,Object>)opMap.get(key);
						if (inputMap != null){
							for(String propertyName:inputMap.keySet()){
								Object value = inputMap.get(propertyName);
								PropertyDef.Builder propertyBuilder = new PropertyDef.Builder(propertyName);
								if (Utilities.isFunction(value)!=null){
									String functionName = Utilities.isFunction(value);
									Object functionParams = ((Map<String, Object>)value).get(functionName);
									DataTypeDef data = new DataTypeDef.Builder().typeName(functionName)
																				.function(platform.getFunction(functionName, null))
																				.build();
									data = (DataTypeDef)Utilities.loadData(functionParams, data);
									propertyBuilder.propertyValue(data)
							   					   .build();
									opDef.addInput(propertyBuilder.build());
								}else{
									PropertyDef property = propertyBuilder.build();
									property.setPropertyValue(value);
									opDef.addInput(property);
								}
							}
						}
						break;
					default:
						break;
					}
				}
				return opDef;
			}
		}
		
		
		@SuppressWarnings("unchecked")
		@Deprecated
		protected static ArtifactDef parseArtifactAssignment(Map<String, Object> artifactMap, ArtifactDef artDef){
			for(String key: artifactMap.keySet()){
				switch(key){
				case "inputs":
					Map<String,Object> inputMap = (Map<String,Object>)artifactMap.get(key);
					if (inputMap != null){
						for(String propertyName:inputMap.keySet()){
							Object value = inputMap.get(propertyName);
							//intDef.setInputValue(propertyName, value);
						}
					}
					break;
				default:
					//the default is an operation
					break;
				}
			}
			return artDef;
		}
		
		
		
		
		@SuppressWarnings("unchecked")
		public static PolicyDef parsePolicyTemplate( Map<String, Object>policyMap, PolicyDef policyDefinition, Tosca2CampPlatform platform){
			String type = (String) policyMap.get("type");
				for(String key: policyMap.keySet()){
					switch(key){
					case "properties":
						Map<String, Object> polMaps = (Map<String,Object>) policyMap.get(key);
						for(String propName: polMaps.keySet()){
							PropertyDef propDef = policyDefinition.getProperty(propName);
							Object value = polMaps.get(propName);
							parsePropertyAssignment(value ,propDef, platform);
						}
						break;
					case "targets":
						List<String> targetMap = (ArrayList<String>)policyMap.get(key);
						if (targetMap != null){
							Builder policyBuilder = policyDefinition.getBuilder().typeName(type);
							for(String target:targetMap){
								policyBuilder.addTargets(target);
							}
							policyBuilder.build();
						}
						break;
					default:
						break;
					}
				}
				return policyDefinition;
		}
		
		
		
		@SuppressWarnings("unchecked")
		public static ServiceTemplate parseServiceTemplate(Map<String, Object> toscaMap, Tosca2CampPlatform platform){
			kr.ac.hanyang.tosca2camp.templates.ServiceTemplate.Builder serviceTemplateBuilder = new ServiceTemplate.Builder();
			log.info("Parsing Service template...");
			for (String key:toscaMap.keySet()){
				switch (key){
				case "tosca_definitions_version":
					serviceTemplateBuilder.version((String)toscaMap.get(key));
					break;
				case "metadata":
					Map<String, String> metaMap = (Map<String,String>) toscaMap.get(key);
					serviceTemplateBuilder.metaData(metaMap);
				break;
				case "description":
						serviceTemplateBuilder.description((String)toscaMap.get(key));
					break;
				
				case "imports":
					//TODO add detail here
					break;
				case "artifact_types":
					Map<String, Object> artifactsMap = (Map<String,Object>) toscaMap.get(key);
					for (String typeName:artifactsMap.keySet()){
						ArtifactDef dataDefinition = platform.parseArtifactDef(typeName,(Map<String,Object>) artifactsMap.get(typeName));
						if (dataDefinition != null){
							serviceTemplateBuilder.addArtifactType(dataDefinition);
						}
					}
					break;		
				case "data_types":
					Map<String, Object> dataTypesMap = (Map<String,Object>) toscaMap.get(key);
					for (String dataTypeName:dataTypesMap.keySet()){
						DataTypeDef dataDefinition = platform.parseDataTypeDef(dataTypeName,(Map<String,Object>) dataTypesMap.get(dataTypeName));
						if (dataDefinition != null){
							serviceTemplateBuilder.addDataType(dataDefinition);
						}
					}
					break;	
				
				case "capability_types":
					Map<String, Object> capTypesMap = (Map<String,Object>) toscaMap.get(key);
					for (String capTypeName:capTypesMap.keySet()){
						CapabilityDef capDefinition = platform.parseCapDef(capTypeName,(Map<String,Object>) capTypesMap.get(capTypeName));
						if (capDefinition != null){
							serviceTemplateBuilder.addCapabilityType(capDefinition);
						}
					}
					break;	
				
				case "interface_types":
					Map<String, Object> interfaceTypesMap = (Map<String,Object>) toscaMap.get(key);
					for (String interfaceTypeName:interfaceTypesMap.keySet()){
						InterfaceDef interfaceDefinition = platform.parseInterfaceDef(interfaceTypeName,(Map<String,Object>) interfaceTypesMap.get(interfaceTypeName));
						if (interfaceDefinition != null){
							serviceTemplateBuilder.addInterfaceType(interfaceDefinition);
						}
					}
					break;	
					
				case "relationship_types":
					Map<String, Object> relTypesMap = (Map<String,Object>) toscaMap.get(key);
					for (String relTypeName:relTypesMap.keySet()){
						RelationshipDef relDefinition = platform.parseRelDef(relTypeName,(Map<String,Object>) relTypesMap.get(relTypeName));
						if (relDefinition != null){
							serviceTemplateBuilder.addRelationshipType(relDefinition);
						}
					}
					break;
				
				case "node_types":
					Map<String, Object> nodeTypesMap = (Map<String,Object>) toscaMap.get(key);
					for (String nodeTypeName:nodeTypesMap.keySet()){
						NodeDef nodeTypeDefinition = platform.parseNodeDef(nodeTypeName,(Map<String,Object>) nodeTypesMap.get(nodeTypeName));
						if (nodeTypeDefinition != null){
							serviceTemplateBuilder.addNodeType(nodeTypeDefinition);
						}
					}
					break;
					
				case "group_types":
					Map<String, Object> groupTypesMap = (Map<String,Object>) toscaMap.get(key);
					for (String groupTypeName:groupTypesMap.keySet()){
						GroupDef groupTypeDefinition = platform.parseGroupDef(groupTypeName,(Map<String,Object>) groupTypesMap.get(groupTypeName));
						if (groupTypeDefinition != null){
							serviceTemplateBuilder.addGroupType(groupTypeDefinition);
						}
					}
					break;
					
				case "policy_types":
					//load custom policy types
					Map<String, Object> polTypesMap = (Map<String,Object>) toscaMap.get(key);
					for (String polTypeName:polTypesMap.keySet()){
						PolicyDef polDefinition = platform.parsePolicyTypeDef(polTypeName,(Map<String,Object>) polTypesMap.get(polTypeName));
						if (polDefinition != null){
							serviceTemplateBuilder.addPolicyType(polDefinition);
						}
					}
					break;
					
				case "topology_template":
					TopologyTemplate.Builder topologyBuilder = new TopologyTemplate.Builder("topologyTemplate");
					Map<String, Object> topologyTemplateMap = (Map<String,Object>) toscaMap.get(key);
					for (String topologyItem:topologyTemplateMap.keySet()){
						switch (topologyItem){
						case "inputs":
							Map<String, Object> inputTemplateMap = (Map<String, Object>) topologyTemplateMap.get(topologyItem);
							for(String inputName: inputTemplateMap.keySet()){
								topologyBuilder.addInput(platform.parsePropDef(inputName, (Map<String, Object>) inputTemplateMap.get(inputName)));
							}
							break;
						case "node_templates":
							Map<String, Object> nodeTemplateMap = (Map<String, Object>) topologyTemplateMap.get(topologyItem);
							for(String nodeTemplate:nodeTemplateMap.keySet()){
								String nodeType = (String)((Map<String, Object>) nodeTemplateMap.get(nodeTemplate)).get("type");
								NodeDef nodeDefinition = platform.loadDefinition(nodeType);
								if (nodeDefinition == null || nodeDefinition.getTypeName() == null)
									nodeDefinition = serviceTemplateBuilder.peek().getNodeType(nodeType);
								if (nodeDefinition != null)
									topologyBuilder.addNode(parseNodeTemplate(nodeTemplate,(Map<String,Object>)nodeTemplateMap.get(nodeTemplate), nodeDefinition, platform));
								else
									log.error("ERROR cannot find a type for the Node template: "+nodeType);
							}
							break;
						case "relationship_templates":
							Map<String, Object> relTemplateMap = (Map<String, Object>) topologyTemplateMap.get(topologyItem);
							for(String relTemplate:relTemplateMap.keySet()){
								String relType = (String)((Map<String, Object>) relTemplateMap.get(relTemplate)).get("type");
								RelationshipDef relDefinition = platform.loadRelationship(relType);
								if (relDefinition == null || relDefinition.getType() == null)
									relDefinition = serviceTemplateBuilder.peek().getRelationshipType(relType);
								if (relDefinition != null)
									topologyBuilder.addRelationship(parseRelTemplate((Map<String,Object>)relTemplateMap.get(relTemplate), relDefinition, platform));
								else
									log.error("Unable to load the type definition "+ relType);
							}
							break;
						case "groups":
							Map<String, Object> groupTemplateMap = (Map<String, Object>) topologyTemplateMap.get(topologyItem);
							for(String groupName: groupTemplateMap.keySet()){
								String groupType = (String)((Map<String, Object>) groupTemplateMap.get(groupName)).get("type");
								GroupDef groupDef = platform.loadGroup(groupType);
								if (groupDef == null || groupDef.getType() == null)
									groupDef = serviceTemplateBuilder.peek().getGroupType(groupType);
								if (groupDef != null)
									topologyBuilder.addGroup(parseGroupTemplate((Map<String,Object>)groupTemplateMap.get(groupName), groupDef, platform));
								else
									log.error("Unable to load the type definition "+ groupType);
							}
							break;
						case "policies":
							Map<String, Object> policyTemplateMap = (Map<String, Object>) topologyTemplateMap.get(topologyItem);
							for(String policyName:policyTemplateMap.keySet()){
								String polType = (String)((Map<String, Object>) policyTemplateMap.get(policyName)).get("type");
								PolicyDef policyDef = platform.loadPolicy(polType);
								if (policyDef == null || policyDef.getTypeName() == null)
									policyDef = serviceTemplateBuilder.peek().getPolicyType(polType);
								if (policyDef != null)
									topologyBuilder.addPolicy(parsePolicyTemplate((Map<String,Object>)policyTemplateMap.get(policyName), policyDef, platform));
								else
									log.error("Unable to load the type definition "+ polType);
							}
							break;
						case "outputs":	break;
						default:
							break;
						}
					}
					serviceTemplateBuilder.addTopologyTemplate(topologyBuilder.build());
					break;
				default:
					break;
			
				}
			}
			return serviceTemplateBuilder.build();
		}
		
		public static void resolveServiceTemplate(ServiceTemplate st){
			st.resolve();
		}

}
