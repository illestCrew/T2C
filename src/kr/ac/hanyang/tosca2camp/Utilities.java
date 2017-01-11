package kr.ac.hanyang.tosca2camp;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;
import kr.ac.hanyang.tosca2camp.templates.DataType;
import kr.ac.hanyang.tosca2camp.templates.Function;

public class Utilities {
	
	private static final Logger log = LoggerFactory.getLogger(Utilities.class);
	
	public static Object loadData(Object data, DataTypeDef objectContainer){
		String type;
		DataTypeDef.Builder dBuilder;
		Matcher matcher;
		Pattern pattern;
		Function funct;
		type = ((DataTypeDef) objectContainer).getTypeName();
		switch (type) {
			case "tosca.datatypes.version":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				pattern = Pattern.compile("^((\\d+)\\.(\\d+)(\\.(\\d+)(\\.(\\w+)(-(\\d+))))*)$");
				matcher = pattern.matcher(data.toString());
				matcher.matches();
				try{
					DataTypeDef majorVersion = (DataTypeDef) dBuilder.peek().getProperty("major_version").getPropertyValue();  majorVersion.setData(Integer.parseInt(matcher.group(2)));
					DataTypeDef minorVersion = (DataTypeDef) dBuilder.peek().getProperty("minor_version").getPropertyValue();  minorVersion.setData(Integer.parseInt(matcher.group(3)));
					DataTypeDef fixVersion = (DataTypeDef) dBuilder.peek().getProperty("fix_version").getPropertyValue();      fixVersion.setData(Integer.parseInt(matcher.group(5)));
					DataTypeDef qualifier = (DataTypeDef) dBuilder.peek().getProperty("qualifier").getPropertyValue();         qualifier.setData(matcher.group(7));
					DataTypeDef buildVersion = (DataTypeDef) dBuilder.peek().getProperty("build_version").getPropertyValue();  buildVersion.setData(Integer.parseInt(matcher.group(9)));
									
					dBuilder.addProperty(new PropertyDef.Builder("major_version").propertyValue(majorVersion).build());
	            	dBuilder.addProperty(new PropertyDef.Builder("minor_version").propertyValue(minorVersion).build());
	            	dBuilder.addProperty(new PropertyDef.Builder("fix_version").propertyValue(fixVersion).build());
	            	dBuilder.addProperty(new PropertyDef.Builder("qualifier").propertyValue(qualifier).build());
	            	dBuilder.addProperty(new PropertyDef.Builder("build_version").propertyValue(buildVersion).build());
	            }
	            catch(Exception e){
	            	log.warn("Exception when parsing version string. Returned value: "+e.getMessage());
	            }
				return dBuilder.dataStored(DataType.COMPLEX).build();
			case "tosca.datatypes.range":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				Pattern rangePattern = Pattern.compile("^\\[ *(\\d+) *+\\, *(\\d+|UNBOUNDED) *\\]$");
				matcher = rangePattern.matcher(data.toString());
				matcher.matches();
				try{
					
					DataTypeDef lowerBound = (DataTypeDef) dBuilder.peek().getProperty("lower_bound").getPropertyValue(); lowerBound.setData(Integer.parseInt(matcher.group(1)));
					DataTypeDef upperBound = (DataTypeDef) dBuilder.peek().getProperty("upper_bound").getPropertyValue(); 
					Object upperBoundValue = matcher.group(3);
	            	if (upperBoundValue == "UNBOUNDED")
	            		upperBound.setData(matcher.group(2));
	            	else
	            		upperBound.setData(Integer.parseInt(matcher.group(2)));	
	            	
	            	dBuilder.addProperty(new PropertyDef.Builder("lower_bound").propertyValue(lowerBound).build());
	            	dBuilder.addProperty(new PropertyDef.Builder("upper_bound").propertyValue(upperBound).build());
	            }
	            catch(Exception e){
	            	log.warn("Exception when parsing range. Returned value: "+e.getMessage());
	            }
				return dBuilder.dataStored(DataType.COMPLEX).build();
			case "tosca.datatypes.string":
			case "tosca.datatypes.integer":
			case "tosca.datatypes.float":
			case "tosca.datatypes.boolean":
			case "tosca.datatypes.scalar":	
			case "tosca.datatypes.map":
			case "tosca.datatypes.list":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				dBuilder.primitiveValue(data).dataStored(DataType.VALUE); 
				objectContainer = dBuilder.build();
				return objectContainer;
			case "concat":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
//				int start = 0;
//				for(PropertyDef property: ((DataTypeDef)objectContainer).getProperties().values()){
//					DataTypeDef dataDef = (DataTypeDef) dBuilder.peek().getProperty(property.getName()).getPropertyValue();
//					pattern = Pattern.compile(getPattern(normalizeTypeName(property.getType(),"datatype")));
//					Matcher defaultMatcher = pattern.matcher(data.toString());
//					defaultMatcher.region(start, data.toString().length()-1); 
//					if (defaultMatcher.find(start)){
//						String value = defaultMatcher.group(0);  dataDef.setData(value);
//						dBuilder.addProperty(new PropertyDef.Builder(property.getName()).propertyValue(dataDef).build());
//						start = defaultMatcher.end(); 
//					}
//				}
				return dBuilder.build();
			case "token":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				pattern = Pattern.compile("^\\[(\\w+)(, *(\\w+))(, *(\\d+))]$");
				matcher = pattern.matcher(data.toString());
				matcher.matches();
				try{
					funct = dBuilder.peek().getFunction();
					DataTypeDef string_with_tokens = funct.getParameter("string_with_tokens").getPropertyValue();  	   	 string_with_tokens.setData(matcher.group(1));
					DataTypeDef string_of_token_chars = funct.getParameter("string_of_token_chars").getPropertyValue();  string_of_token_chars.setData(matcher.group(3));
					DataTypeDef substring_index = funct.getParameter("substring_index").getPropertyValue();      		 substring_index.setData(matcher.group(5));
									
					funct.addParameter(new PropertyDef.Builder("string_with_tokens").propertyValue(string_with_tokens).build());
					funct.addParameter(new PropertyDef.Builder("string_of_token_chars").propertyValue(string_of_token_chars).build());
					funct.addParameter(new PropertyDef.Builder("substring_index").propertyValue(substring_index).build());
	            }
				catch(Exception e){
	            	log.warn("Exception when parsing version string. Returned value: "+e.getMessage());
				}
				return dBuilder.dataStored(DataType.FUNCTION).build();
			case "get_input":
				//dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				//funct = dBuilder.peek().getFunction();
				funct = ((DataTypeDef)objectContainer).getFunction();
				DataTypeDef input_property_name = funct.getParameter("input_property_name").getPropertyValue();  
				input_property_name = (DataTypeDef) loadData((String) data, input_property_name);
			
				funct.addParameter(new PropertyDef.Builder("input_property_name").propertyValue(input_property_name).build());
				return ((DataTypeDef)objectContainer).getBuilder()
													 .function(funct)
													 .dataStored(DataType.FUNCTION)
													 .build();
				//return null;//dBuilder.dataStored(DataType.FUNCTION).build();
			case "get_property":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				pattern = Pattern.compile("^\\[(\\w+)(, *\\w+)?(, *\\w+)(, *\\w+|, *\\d+)?\\]$");
				matcher = pattern.matcher(data.toString());
				matcher.matches();
				try{
					funct = dBuilder.peek().getFunction();
					DataTypeDef modelable_entity_name = funct.getParameter("modelable_entity_name").getPropertyValue();  				modelable_entity_name.setData(matcher.group(1));
					DataTypeDef optional_req_or_cap_name = funct.getParameter("optional_req_or_cap_name").getPropertyValue();  			optional_req_or_cap_name.setData(matcher.group(2));
					DataTypeDef property_name = funct.getParameter("property_name").getPropertyValue();      							property_name.setData(matcher.group(3));
					DataTypeDef nested_property_name_or_index = funct.getParameter("nested_property_name_or_index").getPropertyValue(); nested_property_name_or_index.setData(matcher.group(4));
									
					funct.addParameter(new PropertyDef.Builder("modelable_entity_name").propertyValue(modelable_entity_name).build());
					funct.addParameter(new PropertyDef.Builder("optional_req_or_cap_name").propertyValue(optional_req_or_cap_name).build());
					funct.addParameter(new PropertyDef.Builder("property_name").propertyValue(property_name).build());
					funct.addParameter(new PropertyDef.Builder("nested_property_name_or_index").propertyValue(nested_property_name_or_index).build()); // this can be a list so requires more parsing
	            }
	            catch(Exception e){
	            	log.warn("Exception getting property valueg. Returned value: "+e.getMessage());
	            }
				return dBuilder.dataStored(DataType.FUNCTION).build();
			case "get_attribute":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				pattern = Pattern.compile("^\\[(\\w+)(, *\\w+)?(, *\\w+)(, *\\w+|, *\\d+)?\\]$");
				matcher = pattern.matcher(data.toString());
				matcher.matches();
				try{
					funct = dBuilder.peek().getFunction();
					DataTypeDef modelable_entity_name = funct.getParameter("modelable_entity_name").getPropertyValue();  				modelable_entity_name.setData(matcher.group(1));
					DataTypeDef optional_req_or_cap_name = funct.getParameter("optional_req_or_cap_name").getPropertyValue();  			optional_req_or_cap_name.setData(matcher.group(2));
					DataTypeDef attribute_name = funct.getParameter("attribute_name").getPropertyValue();      							attribute_name.setData(matcher.group(3));
					DataTypeDef nested_attribute_name_or_index = funct.getParameter("nested_attribute_name_or_index").getPropertyValue(); nested_attribute_name_or_index.setData(matcher.group(4));
									
					funct.addParameter(new PropertyDef.Builder("modelable_entity_name").propertyValue(modelable_entity_name).build());
					funct.addParameter(new PropertyDef.Builder("optional_req_or_cap_name").propertyValue(optional_req_or_cap_name).build());
					funct.addParameter(new PropertyDef.Builder("attribute_name").propertyValue(attribute_name).build());
					funct.addParameter(new PropertyDef.Builder("nested_attribute_name_or_index").propertyValue(nested_attribute_name_or_index).build()); // this can be a list so requires more parsing
	            }
	            catch(Exception e){
	            	log.warn("Exception getting attribute. Returned value: "+e.getMessage());
	            }
				return dBuilder.dataStored(DataType.FUNCTION).build();
			case "get_operation_input":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				pattern = Pattern.compile("^\\[(\\w+)(, *(\\w+))(, *(\\w+))(, *(\\w+))]$");
				matcher = pattern.matcher(data.toString());
				matcher.matches();
				try{
					funct = dBuilder.peek().getFunction();
					DataTypeDef modelable_entity_name = funct.getParameter("modelable_entity_name").getPropertyValue();	modelable_entity_name.setData(matcher.group(1));
					DataTypeDef interface_name = funct.getParameter("interface_name").getPropertyValue();  			    interface_name.setData(matcher.group(2));
					DataTypeDef operation_name = funct.getParameter("operation_name").getPropertyValue();      			operation_name.setData(matcher.group(3));
					DataTypeDef output_variable_name = funct.getParameter("output_variable_name").getPropertyValue();   output_variable_name.setData(matcher.group(4));
									
					funct.addParameter(new PropertyDef.Builder("modelable_entity_name").propertyValue(modelable_entity_name).build());
					funct.addParameter(new PropertyDef.Builder("interface_name").propertyValue(interface_name).build());
					funct.addParameter(new PropertyDef.Builder("operation_name").propertyValue(operation_name).build());
					funct.addParameter(new PropertyDef.Builder("output_variable_name").propertyValue(output_variable_name).build()); // this can be a list so requires more parsing
	            }
				catch(Exception e){
	            	log.warn("Exception when parsing version string. Returned value: "+e.getMessage());
				}
				return dBuilder.dataStored(DataType.FUNCTION).build();
			case "get_nodes_of_type":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				funct = dBuilder.peek().getFunction();
				DataTypeDef node_type_name = funct.getParameter("node_type_name").getPropertyValue();  node_type_name.setData((String) data);
				funct.addParameter(new PropertyDef.Builder("node_type_name").propertyValue(node_type_name).build());
				return dBuilder.dataStored(DataType.FUNCTION).build();
			case "get_artifact":
				dBuilder = ((DataTypeDef)objectContainer).getBuilder();
				pattern = Pattern.compile("^\\[(\\w+)(, *(\\w+))(, *(\\w+))?(, *((true|false)|(TRUE|FALSE)))?]$");
				matcher = pattern.matcher(data.toString());
				matcher.matches();
				try{
					funct = dBuilder.peek().getFunction();
					DataTypeDef modelable_entity_name = funct.getParameter("modelable_entity_name").getPropertyValue();  modelable_entity_name.setData(matcher.group(1));
					DataTypeDef artifact_name = funct.getParameter("artifact_name").getPropertyValue();  			     artifact_name.setData(matcher.group(2));
					DataTypeDef location = funct.getParameter("location").getPropertyValue();      						 location.setData(matcher.group(3));
					DataTypeDef remove = funct.getParameter("remove").getPropertyValue();                                remove.setData(matcher.group(4));
									
					funct.addParameter(new PropertyDef.Builder("modelable_entity_name").propertyValue(modelable_entity_name).build());
					funct.addParameter(new PropertyDef.Builder("artifact_name").propertyValue(artifact_name).build());
					funct.addParameter(new PropertyDef.Builder("location").propertyValue(location).build());
					funct.addParameter(new PropertyDef.Builder("remove").propertyValue(remove).build()); // this can be a list so requires more parsing
	            }
	            catch(Exception e){
	            	log.warn("Exception when parsing version string. Returned value: "+e.getMessage());
	            }
				return dBuilder.dataStored(DataType.FUNCTION).build();
			default:
					//parse the custom datatype
					dBuilder = ((DataTypeDef)objectContainer).getBuilder().dataStored(DataType.COMPLEX);
					int start = 0;
					for(PropertyDef property: ((DataTypeDef)objectContainer).getProperties().values()){
						DataTypeDef dataDef = (DataTypeDef) dBuilder.peek().getProperty(property.getName()).getPropertyValue();
						pattern = Pattern.compile(getPattern(normalizeTypeName(property.getType(),"datatype")));
						Matcher defaultMatcher = pattern.matcher(data.toString());
						defaultMatcher.region(start, data.toString().length()-1); 
						if (defaultMatcher.find(start)){
							String value = defaultMatcher.group(0);  dataDef.setData(value);
							dBuilder.addProperty(new PropertyDef.Builder(property.getName()).propertyValue(dataDef).build());
							start = defaultMatcher.end(); 
						}
					}
				
				return objectContainer;
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	public static Object isPrimative(String typeName) {
		try{
			//String fullName = normalizeTypeName(typeName, "datatype");
			switch (typeName){
			case "java.lang.String": case "tosca.datatypes.string":return new String();
			case "java.lang.Integer": case "tosca.datatypes.integer":return new Integer("0");
			case "java.lang.Float": case "tosca.datatypes.float":return new Float("0");
			case "java.lang.Boolean": case "tosca.datatypes.boolean":return new Boolean("false");
			case "java.util.Date": case "tosca.datatypes.timestamp":return new Date();
			case "java.util.LinkedHashMap": case "tosca.datatypes.map":return new LinkedHashMap();
			case "java.util.ArrayList": case "tosca.datatypes.list":return new ArrayList();
			case "java.lang.Object": case "tosca.datatypes.scalar":return new Object();
			default:
				return null;
			}
		}catch(Exception e){
			return null;
		}
	}
	
	public static boolean isaFunction(String type){
		switch (type){
		case "concat":
		case "token": 
		case "get_input": 
		case "get_property":
		case "get_attribute":
		case "get_operation_input":
		case "get_nodes_of_type":
		case "get_artifact": return true;
		default:
			return false;
		}
	}
	
	public static String isFunction(Object value){
		if (value instanceof Map){
			String functionName = ((Map<String, Object>) value).keySet().iterator().next();
			switch(functionName){
			case "concat":
			case "token":
			case "get_input":
			case "get_property":
			case "get_attribute":
			case "get_operation_input":
			case "get_nodes_of_type":
			case "get_artifact":
				return functionName;
			default: return null;
			}
		}else
			return null;
	}
	

	public static String getPattern(String type){
		switch(type){
		case "tosca.datatypes.scalar": return "(\\d+)(\\.\\d+)?";
		case "tosca.datatypes.string": return "(\\w+) *";
		case "tosca.datatypes.integer": return "(\\d+)";
		case "tosca.datatypes.float": return "(\\d+)(\\.\\d+)?";
		case "tosca.datatypes.boolean": return "((true|false)|(TRUE|FALSE))"; 
		default: return "^[ A-Za-z0-9_@,./#&+-]*$"; //generally accepted regex
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object clonePrimitive(Object toClone){
		switch(toClone.getClass().getName()){
		case "java.lang.String": return new String((String)toClone);
		case "java.lang.Integer": return new Integer(((Integer)toClone).intValue());
		case "java.lang.Float": return new Float(((Float)toClone).floatValue());
		case "java.lang.Boolean": return new Boolean(((Boolean)toClone).booleanValue());
		case "java.util.Data": return ((Date)toClone).clone();
		case "java.util.LinkedHashMap": 
			LinkedHashMap map = new LinkedHashMap();
			for(Object key: ((LinkedHashMap)toClone).keySet())
				map.put(key, ((LinkedHashMap)toClone).get(key));
			return map;
		case "java.util.ArrayList": 
			ArrayList arrayList = new ArrayList();
			for(Object obj: (ArrayList)toClone)
				arrayList.add(obj);
			return arrayList;
		default: return toClone;
		}
	}
	
	public static String normalizeTypeName(String shortTypeName, String type){
		switch(type){
		case "node":
			switch(shortTypeName){
			case "Root": return "tosca.nodes.Root"; 
			case "Compute": return "tosca.nodes.Compute";
			case "SoftwareComponent": return "tosca.nodes.SoftwareComponent"; 
			case "WebServer": return "tosca.nodes.WebServer";
			case "WebApplication": return "tosca.nodes.WebApplication"; 
			case "DBMS": return "tosca.nodes.DBMS";
			case "Database": return "tosca.nodes.Database"; 
			case "ObjectStorage": return "tosca.nodes.ObjectStorage"; 
			case "BlockStorage": return "tosca.nodes.BlockStorage";
			case "Container.Runtime": return "tosca.nodes.Container.Runtime"; 
			case "Container.Application": return "tosca.nodes.Container.Application";
			case "LoadBalancer": return "tosca.nodes.LoadBalancer";
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "capability": case "requirement":
			switch(shortTypeName){
			case "Attachment": case "attachment": return "tosca.capabilities.Attachment"; 
			case "Bindable": case "bindable": return "tosca.capabilities.Bindable";
			case "Container": case "container": return "tosca.capabilities.Container"; 
			case "Endpoint.Admin": case "endpoint.admin": return "tosca.capabilities.Endpoint.Admin";
			case "Endpoint.Database": case "endpoint.database": return "tosca.capabilities.Endpoint.Database"; 
			case "Endpoint.Public": case "endpoint.public": return "tosca.capabilities.Endpoint.Public";
			case "Endpoint": case "endpoint": return "tosca.capabilities.Endpoint"; 
			case "Node": case "node": return "tosca.capabilities.Node"; 
			case "OperatingSystem": case "operatingSystem": return "tosca.capabilities.OperatingSystem";
			case "Root": case "root": return "tosca.capabilities.Root"; 
			case "Scalable": case "scalable": return "tosca.capabilities.Scalable";
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "artifact":
			switch(shortTypeName){
			case "Root": return "tosca.artifacts.Root"; 
			case "File": return "tosca.artifacts.File";
			case "Deployment": return "tosca.artifacts.Deployment"; 
			case "Deployment.Image": return "tosca.artifacts.Deployment.Image";
			case "Deployment.Image.VM": return "tosca.artifacts.Deployment.Image.VM"; 
			case "Implementation": return "tosca.artifacts.Implementation";
			case "Implementation.Bash": return "tosca.artifacst.Implementation.Bash"; 
			case "Implementation.Python": case"host": return "tosca.artifacts.Implementation.Python"; 
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "interface":
			switch(shortTypeName){
			case "Root": return "tosca.interfaces.Root"; 
			case "Standard": return "tosca.interfaces.node.lifecycle.Standard";
			case "Configure": return "tosca.interfaces.relationship.Configure"; 
			default: return shortTypeName;//test if the type is not empty then its long type
			}	
		case "relationship":
			switch(shortTypeName){
			case "Root": return "tosca.relationships.Root"; 
			case "HostedOn": return "tosca.relationships.HostedOn"; 
			case "DependsOn": return "tosca.relationships.DependsOn"; 
			case "ConnectsTo": return "tosca.relationships.ConnectsTo"; 
			case "AttachesTo": return "tosca.relationships.AttachesTo"; 
			case "RoutesTo": return "tosca.relationships.RoutesTo"; 
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "constraint":
			switch(shortTypeName){
			case "equal": return "tosca.constraints.equal"; 
			case "greater_or_equal": return "tosca.constraints.greater_or_equal"; 
			case "greater_than": return "tosca.constraints.greater_than"; 
			case "in_range": return "tosca.constraints.in_range"; 
			case "length": return "tosca.constraints.length"; 
			case "less_or_equal": return "tosca.constraints.less_or_equal"; 
			case "less_than": return "tosca.constraints.less_than"; 
			case "max_length": return "tosca.constraints.max_length"; 
			case "min_length": return "tosca.constraints.min_length"; 
			case "valid_values": return "tosca.constraints.valid_values";
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "function":
			switch(shortTypeName){
			case "concat": return "tosca.functions.concat"; 
			case "get_artifact": return "tosca.functions.get_artifact"; 
			case "get_attribute": return "tosca.functions.get_attribute"; 
			case "get_input": return "tosca.functions.get_input"; 
			case "get_nodes_of_type": return "tosca.functions.get_nodes_of_type"; 
			case "get_operation_output": return "tosca.functions.get_operation_output"; 
			case "get_property": return "tosca.functions.get_property"; 
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "datatype":
			switch(shortTypeName){
			case "Root": return "tosca.datatypes.Root"; 
			case "boolean": case "java.lang.Boolean": return "tosca.datatypes.Boolean"; 
			case "Credential": return "tosca.datatypes.Credential";
			case "float": case "java.lang.Float": return "tosca.datatypes.float"; 
			case "integer": case "java.lang.Integer": return "tosca.datatypes.integer"; //return "java.lang.Integer"; 
			case "list": case "java.util.ArrayList": return "tosca.datatypes.list"; 
			case "map": case "java.util.LinkedHashMap": return "tosca.datatypes.map"; 
			case "network.PortInfo": return "tosca.datatypes.network.PortInfo";
			case "network.NetworkInfo": return "tosca.datatypes.network.NetworkInfo"; 
			case "network.PortDef": case "PortDef": return "tosca.datatypes.network.PortDef"; 
			case "network.PortSpec": return "tosca.datatypes.network.PortSpec"; 
			case "range": return "tosca.datatypes.range";  
			case "scalar-unit.frequency": return "tosca.datatypes.scalar-unit.frequency"; 
			case "scalar-unit.size": return "tosca.datatypes.scalar-unit.size"; 
			case "scalar-unit.time": return "tosca.datatypes.scalar-unit.time"; 
			case "scalar-unit": return "tosca.datatypes.scalar-unit"; 
			case "scalar": return "tosca.datatypes.scalar";
			case "string": case"java.lang.String": return "tosca.datatypes.string"; 
			case "timestamp": case "java.util.Date": return "tosca.datatypes.timestamp"; 
			case "version": return "tosca.datatypes.version"; 
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "policy":
			switch(shortTypeName){
			case "Root": return "tosca.policies.Root"; 
			case "Placement": return "tosca.policies.Placement";
			case "Update": return "tosca.policies.Update"; 
			case "Scaling": return "tosca.policies.Scaling";
			case "Performance": return "tosca.policies.Performance"; 
			default: return shortTypeName;//test if the type is not empty then its long type
			}
		case "group":
			switch(shortTypeName){
			case "Root": return "tosca.groups.Root"; 
			default: return shortTypeName;
			}
		default: return shortTypeName;
		}
	}
	
}
