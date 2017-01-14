package kr.ac.hanyang.tosca2camp.rest.resources;

import java.util.ArrayList;
import java.util.List;

import kr.ac.hanyang.tosca2camp.Tosca2CampLauncher;
import kr.ac.hanyang.tosca2camp.definitiontypes.ArtifactDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.AttributeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.InterfaceDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.NodeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RelationshipDef;
import kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel;
import kr.ac.hanyang.tosca2camp.rest.model.DataModel;
import kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.FunctionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelFactory;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.impl.ModelFactoryImpl;
import kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl;
import kr.ac.hanyang.tosca2camp.templates.Function;
import kr.ac.hanyang.tosca2camp.templates.ImportDef;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;
import kr.ac.hanyang.tosca2camp.templates.TopologyTemplate;

public class ServiceTemplateResource {
	
	public static ServiceTemplateModel getServiceTemplate(ServiceTemplate st){
		ModelFactory factory = ModelFactory.eINSTANCE; 
		ServiceTemplateModel stm = factory.createServiceTemplateModel();
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__VERSION, st.getVersion());
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__META_DATA, st.getMetaData());
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__DESCRIPTION, st.getDescription());
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__IMPORTS, st.getImports());
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES, getArtifactsTypes(st.getArtifacts()));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__DATA_TYPES, getDataTypes(st.getDataTypes()));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES, getCapabilityTypes(st.getCapabilityTypes()));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES, getInterfaceTypes(st.getInterfaceTypes()));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES, getRelationshipTypes(st.getRelationshipTypes()));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__NODE_TYPES, getNodeTypes(st.getNodeTypes()));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE, getTopologyTemplate(st.getTopologyTemplate()));
		return stm;
	}
	
	public static TopologyTemplateModel getTopologyTemplate(TopologyTemplate temp){
		ModelFactory factory = ModelFactory.eINSTANCE; 
		TopologyTemplateModel ttm = factory.createTopologyTemplateModel();
		ttm.eSet(ModelPackage.TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION, ttm.getDescription());
		ttm.eSet(ModelPackage.TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES, getNodeTemplates(temp.getNodes()));
		ttm.eSet(ModelPackage.TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES, getRelationshipTemplates(temp.getRelationships()));
		return ttm;
//		return TopologyTemplateModel.of().description(temp.getDescription())
//										 //.inputs(temp.getInputs())
//										 .nodeTemplates(getNodeTemplates(st))
//										 .relationshipTemplates(getRelationshipTemplates(st))
//										 //.groups(groups)
//										 //.policies(policies)
//				 						 //.outputs(outputs)
//											;
	}

	public static List<NodeTemplateModel> getNodeTemplates(List<NodeDef> nodes){
		ModelFactory factory = ModelFactory.eINSTANCE; 
		List<NodeTemplateModel> toReturn = new ArrayList<NodeTemplateModel>();
		
		for (NodeDef nDef: nodes){
			NodeTemplateModel ntm = factory.createNodeTemplateModel();
			ntm.eSet(ModelPackage.NODE_TEMPLATE_MODEL__NAME, nDef.getName());
			ntm.eSet(ModelPackage.NODE_TEMPLATE_MODEL__TYPE, nDef.getTypeName());
			ntm.eSet(ModelPackage.NODE_TEMPLATE_MODEL__DESCRIPTION, nDef.getDescription());
			ntm.eSet(ModelPackage.NODE_TEMPLATE_MODEL__PROPERTIES, getPropertyAssignments(nDef.getProperties()));
			ntm.eSet(ModelPackage.NODE_TEMPLATE_MODEL__CAPABILITIES, getCapabilityAssignments(nDef.getCapabilities()));
			toReturn.add(ntm);
		}
			
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		
//			toReturn.add(NodeTemplateModel.of().name(nDef.getName())
//											   .typeName(nDef.getTypeName())
//											   .description(nDef.getDescription())
//											   .properties(getPropertyAssignments(nDef.getProperties()))
//											   //.attributes(nDef.getAttributes())
//											   //.requirements()
//											   .capabilities(getCapabilityAssignments(nDef.getCapabilities()))
//											   //.interfaces(getInterfaceDefs(nDef.getInterfaceList()))
//											   //.artifacts(artifacts)
//											   );
		return toReturn;
	}
	
	public static List<RelationshipTemplateModel> getRelationshipTemplates(List<RelationshipDef> rels){
		ModelFactory factory = ModelFactory.eINSTANCE; 
		List<RelationshipTemplateModel> toReturn = new ArrayList<RelationshipTemplateModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (RelationshipDef rDef: rels){
			RelationshipTemplateModel rtm = factory.createRelationshipTemplateModel();
			rtm.eSet(ModelPackage.RELATIONSHIP_TEMPLATE_MODEL__NAME, rDef.getName());
			rtm.eSet(ModelPackage.RELATIONSHIP_TEMPLATE_MODEL__TYPE_NAME, rDef.getType());
			rtm.eSet(ModelPackage.RELATIONSHIP_TEMPLATE_MODEL__DESCRIPTION, rDef.getDescription());
			rtm.eSet(ModelPackage.RELATIONSHIP_TEMPLATE_MODEL__PROPERTIES, getPropertyAssignments(rDef.getProperties()));
			rtm.eSet(ModelPackage.RELATIONSHIP_TEMPLATE_MODEL__INTERFACES, getInterfaceDefs(rDef.getInterfaceList()));
			toReturn.add(rtm);
		}
//			toReturn.add(RelationshipTemplateModel.of().name(rDef.getName())
//											   .typeName(rDef.getType())
//											   .description(rDef.getDescription())
//											   .properties(getPropertyAssignments(rDef.getProperties()))
//											   //.attributes(nDef.getAttributes())
//											   .interfaces(getInterfaceDefs(rDef.getInterfaceList()))	
//											   );
		return toReturn;
	}
	
	public static List<ArtifactTypeModel> getArtifactsTypes(List<ArtifactDef> arts){
		ModelFactory factory = ModelFactory.eINSTANCE; 
		List<ArtifactTypeModel> toReturn = new ArrayList<ArtifactTypeModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (ArtifactDef artDef: arts){
			ArtifactTypeModel atm = factory.createArtifactTypeModel();
			atm.eSet(ModelPackage.ARTIFACT_TYPE_MODEL__TYPE_NAME, artDef.getType());
			atm.eSet(ModelPackage.ARTIFACT_TYPE_MODEL__DESCRIPTION, artDef.getDescription());
			atm.eSet(ModelPackage.ARTIFACT_TYPE_MODEL__DERIVED_FROM, artDef.getDerivedFrom());
			atm.eSet(ModelPackage.ARTIFACT_TYPE_MODEL__FILE_EXT, (String[])artDef.getFileExtentions().toArray());
			atm.eSet(ModelPackage.ARTIFACT_TYPE_MODEL__MIME_TYPE, artDef.getMimeType());
			toReturn.add(atm);
		}
//			toReturn.add(ArtifactTypeModel.of().typeName(artDef.getType())
//											   .description(artDef.getDescription())
//											   .derived_from(artDef.getDerivedFrom())
//											   .file_ext((String[])artDef.getFileExtentions().toArray())
//											   .mime_type(artDef.getMimeType()));
//											   //.properties(artDef.getProperties().toArray()));
		return toReturn;
	}
	
	public static List<DatatypeDefinitionModel> getDataTypes(List<DataTypeDef> data){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<DatatypeDefinitionModel> toReturn = new ArrayList<DatatypeDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (DataTypeDef dataType: data){
			DatatypeDefinitionModel dtdm = factory.createDatatypeDefinitionModel();
			dtdm.eSet(ModelPackage.DATATYPE_DEFINITION_MODEL__TYPE_NAME, dataType.getTypeName());
			dtdm.eSet(ModelPackage.DATATYPE_DEFINITION_MODEL__TYPE_NAME, dataType.getDerived_from());
			dtdm.eSet(ModelPackage.DATATYPE_DEFINITION_MODEL__TYPE_NAME, dataType.getDescription());
			toReturn.add(dtdm);
		}
//			toReturn.add(DatatypeDefinitionModel.of().typeName(dataType.getTypeName())
//										   			//.version(dataType.)
//										   			.derived_from(dataType.getDerived_from())
//										   			.description(dataType.getDescription())
//										   			//.properties(dataType.getP)
//										   			//.constraints(constraints)
//											);
		return toReturn;
	}
	
	public static List<CapabilityDefinitionModel> getCapabilityTypes(List<CapabilityDef> caps){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<CapabilityDefinitionModel> toReturn = new ArrayList<CapabilityDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (CapabilityDef capDef: caps){
			CapabilityDefinitionModel cdm = factory.createCapabilityDefinitionModel();
			cdm.eSet(ModelPackage.CAPABILITY_DEFINITION_MODEL__TYPE_NAME, capDef.getType());
			cdm.eSet(ModelPackage.CAPABILITY_DEFINITION_MODEL__DESCRIPTION, capDef.getDescription());
			cdm.eSet(ModelPackage.CAPABILITY_DEFINITION_MODEL__DERIVED_FROM, capDef.getDerived_from());
			toReturn.add(cdm);
		}
//			toReturn.add(CapabilityDefinitionModel.of().typeName(capDef.getType())
//											   //.version(VersionModel.)
//											   .description(capDef.getDescription())
//											   .derived_from(capDef.getDerived_from())
//											   //.attributes(attributes))
//											   //.properties(artDef.getProperties().toArray())
//											   //.validSources(valid_sources)
//											   );
		return toReturn;
	}
	
	public static List<NodeDefinitionModel> getNodeTypes(List<NodeDef> nodes){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<NodeDefinitionModel> toReturn = new ArrayList<NodeDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (NodeDef nDef: nodes){
			NodeDefinitionModel ndm = factory.createNodeDefinitionModel();
			ndm.eSet(ModelPackage.NODE_DEFINITION_MODEL__TYPE_NAME, nDef.getTypeName() );
			ndm.eSet(ModelPackage.NODE_DEFINITION_MODEL__DESCRIPTION, nDef.getDescription() );
			ndm.eSet(ModelPackage.NODE_DEFINITION_MODEL__DERIVED_FROM, nDef.getDerived_from());
			toReturn.add(ndm);
		}
//			toReturn.add(NodeDefinitionModel.of().typeName(nDef.getTypeName())
//											   .description(nDef.getDescription())
//											   .derived_from(nDef.getDerived_from())
//											   //.version(nDef.ge)
//											   //.properties(artDef.getProperties().toArray())
//											   //.attributes(attributes)
//											   //.requirements(requirements)
//											   //.capabilities(capabilities)
//											   //.interfaces(interfaces)
//											   //.artifacts(artifacts)
//											   );
		return toReturn;
	}
	
	public static List<RelationshipDefinitionModel> getRelationshipTypes(List<RelationshipDef> rels){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<RelationshipDefinitionModel> toReturn = new ArrayList<RelationshipDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (RelationshipDef rDef: rels){
			RelationshipDefinitionModel rdm = factory.createRelationshipDefinitionModel();
			rdm.eSet(ModelPackage.RELATIONSHIP_DEFINITION_MODEL__TYPE_NAME, rDef.getType());
			rdm.eSet(ModelPackage.RELATIONSHIP_DEFINITION_MODEL__DESCRIPTION, rDef.getDescription());
			rdm.eSet(ModelPackage.RELATIONSHIP_DEFINITION_MODEL__DERIVED_FROM, rDef.getDerived_from());
			toReturn.add(rdm);
		}
//			toReturn.add(RelationshipDefinitionModel.of().typeName(rDef.getType())
//											   .description(rDef.getDescription())
//											   .derived_from(rDef.getDerived_from())
//											   //.version(nDef.ge)
//											   //.properties(artDef.getProperties().toArray())
//											   //.attributes(attributes)
//											   //.requirements(requirements)
//											   //.capabilities(capabilities)
//											   //.interfaces(interfaces)
//											   //.artifacts(artifacts)
//											   );
		return toReturn;
	}
	
	public static List<PropertyModel> getPropertyAssignments(List<PropertyDef> properties){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for (PropertyDef property: properties){
			PropertyModel pm = factory.createPropertyModel();
			pm.eSet(ModelPackage.PROPERTY_MODEL__NAME, property.getName());
			pm.eSet(ModelPackage.PROPERTY_MODEL__VALUE, getData(property.getPropertyValue()));
			toReturn.add(pm);
			
//			if (property.hasValue()){
//				toReturn.add(PropertyModel.of().name(property.getName())
//												   			 .value(getData(property.getPropertyValue()))
//												    );
//			}
		}
		return toReturn;
	}
	
	public static List<AttributeAssignmentModel> getAttributeAssignments(List<AttributeDef> attributes){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<AttributeAssignmentModel> toReturn = new ArrayList<AttributeAssignmentModel>();
		for (AttributeDef attribute: attributes){
			AttributeAssignmentModel aam = factory.createAttributeAssignmentModel();
			aam.eSet(ModelPackage.ATTRIBUTE_ASSIGNMENT_MODEL__NAME, attribute.getName());
			toReturn.add(aam);
			
			//if (attribute.getPropertyValue() != null){
//				toReturn.add(AttributeAssignmentModel.of().name(attribute.getName())
//												   //.defaultValue(DataModel.of().value(attribute.getDefaultVal()))
//												   );
			//}
		}
		return toReturn;
	}
	
	public static List<CapabilityAssignmentModel> getCapabilityAssignments(List<CapabilityDef> capabilities){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<CapabilityAssignmentModel> toReturn = new ArrayList<CapabilityAssignmentModel>();
		for (CapabilityDef capability: capabilities){
			CapabilityAssignmentModel cam = factory.createCapabilityAssignmentModel();
			cam.eSet(ModelPackage.CAPABILITY_ASSIGNMENT_MODEL__NAME, capability.getName());
			toReturn.add(cam);
//			
//				toReturn.add(CapabilityAssignmentModel.of().name(capability.getName())
//														   //.properties(getPropertyAssignments(capability.getProperties()))
//														   //.attributes(getAttributeAssignments(capability.getAttributes()))
//												   
//												   );
		}
		return toReturn;
	}
	
		
	public static DataModel getData(DataTypeDef data){
		ModelFactory factory = ModelFactory.eINSTANCE;
		DataModel dm = factory.createDataModel();
		
		switch(data.getTypeStored()){
		case COMPLEX: return null; //TODO FIXME
		case FUNCTION: 
			dm.eSet(ModelPackage.DATA_MODEL__VALUE, getFunction(data.getFunction()));
			return dm;
		case VALUE: 
			dm.eSet(ModelPackage.DATA_MODEL__VALUE, data.getPrimitiveValue());
			return dm;
		}
		return null;
	}
	
	public static FunctionModel getFunction(Function function){
		ModelFactory factory = ModelFactory.eINSTANCE;
		FunctionModel fm = factory.createFunctionModel();
		fm.eSet(ModelPackage.FUNCTION_MODEL__TYPE_NAME, function.getName());
		fm.eSet(ModelPackage.FUNCTION_MODEL__PARAMETERS, getPropertyAssignments(function.getParameters()));
		return fm;
//		return FunctionModel.of().typeName(function.getName())
//								 .parameters(getPropertyAssignments(function.getParameters()));
	}
	
	public static ConstraintModel getConstraintClause(ConstraintDef constraint){
		ModelFactory factory = ModelFactory.eINSTANCE;
		ConstraintModel cm = factory.createConstraintModel();
		cm.eSet(ModelPackage.CONSTRAINT_MODEL_OPERATION_COUNT, constraint.getOperator());
		cm.eSet(ModelPackage.CONSTRAINT_MODEL__VALUE, getData(constraint.getValue()));
		return cm;
//		return ConstraintModel.of().operator(constraint.getOperator())
//								   .defaultValue(DataModel.of().value(constraint.getValue()));
	}
	
	public static List<ImportDefinitionModel> getImports(List<ImportDef> imports){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<ImportDefinitionModel> toReturn = new ArrayList<ImportDefinitionModel>();
		for(ImportDef iport: imports){
			ImportDefinitionModel idf = factory.createImportDefinitionModel();
			idf.eSet(ModelPackage.IMPORT_DEFINITION_MODEL__FILE, iport.getName());
			idf.eSet(ModelPackage.IMPORT_DEFINITION_MODEL__REPOSITORY, iport.getRepository());
			idf.eSet(ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_URI, iport.getNamespaceUri());
			idf.eSet(ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX, iport.getNamespacePrefix());
			toReturn.add(idf);
			
//		    toReturn.add(ImportDefinitionModel.of().file(iport.getName())
//	     							 .repository(iport.getRepository())
//									 .namespace_uri(iport.getNamespaceUri())
//									 .namespace_prefix(iport.getNamespacePrefix()));
		}
		return toReturn;
	}
	
	public static List<InterfaceTypeModel> getInterfaceTypes(List<InterfaceDef> interfaces){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<InterfaceTypeModel> toReturn = new ArrayList<InterfaceTypeModel>();
		for(InterfaceDef iface: interfaces){
			InterfaceTypeModel itf = factory.createInterfaceTypeModel();
			itf.eSet(ModelPackage.INTERFACE_TYPE_MODEL__TYPE_NAME, iface.getType());
			toReturn.add(itf);
			
			
		    //toReturn.add(InterfaceResource.getInterfaceTypeDefinition(iface.getType()));
		}
		return toReturn;
	}
	
	public static List<InterfaceDefinitionModel> getInterfaceDefs(List<InterfaceDef> interfaces){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<InterfaceDefinitionModel> toReturn = new ArrayList<InterfaceDefinitionModel>();
		for(InterfaceDef iface: interfaces){
			InterfaceDefinitionModel idf = factory.createInterfaceDefinitionModel();
			idf.eSet(ModelPackage.INTERFACE_DEFINITION_MODEL__INPUTS, iface.getInputs());
			toReturn.add(idf);
			
		   // toReturn.add(InterfaceDefinitionModel.of().inputs(getInputs(iface.getInputs())));
		}
		return toReturn;
	}
	
	public static List<PropertyModel> getInputs(List<PropertyDef> inputs){
		ModelFactory factory = ModelFactory.eINSTANCE;
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for(PropertyDef input: inputs){
			PropertyModel pm = factory.createPropertyModel();
			pm.eSet(ModelPackage.PROPERTY_MODEL__NAME, input.getName());
			pm.eSet(ModelPackage.PROPERTY_MODEL__VALUE, getData(input.getPropertyValue()));
			toReturn.add(pm);
			
			
//		    toReturn.add(PropertyModel.of().name(input.getName())
//		    						       .value(DataModel.of().value(input.getActualValue())));
		}
		return toReturn;
	}
	
}
