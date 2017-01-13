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
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES, getArtifactsTypes(st));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__DATA_TYPES, getDataTypes(st));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES, getCapabilityTypes(st));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES, getInterfaceTypes(st.getInterfaceTypes()));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES, getRelationshipTypes(st));
		stm.eSet(ModelPackage.SERVICE_TEMPLATE_MODEL__NODE_TYPES, getNodeTypes(st));
		return stm;
	}
	
	public static TopologyTemplateModel getTopologyTemplate(ServiceTemplate st){
		TopologyTemplate temp = st.getTopologyTemplate();
		return TopologyTemplateModel.of().description(temp.getDescription())
										 //.inputs(temp.getInputs())
										 .nodeTemplates(getNodeTemplates(st))
										 .relationshipTemplates(getRelationshipTemplates(st))
										 //.groups(groups)
										 //.policies(policies)
				 						 //.outputs(outputs)
											;
	}

	public static List<NodeTemplateModel> getNodeTemplates(ServiceTemplate st){
		List<NodeTemplateModel> toReturn = new ArrayList<NodeTemplateModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (NodeDef nDef: st.getTopologyTemplate().getNodes())
			toReturn.add(NodeTemplateModel.of().name(nDef.getName())
											   .typeName(nDef.getTypeName())
											   .description(nDef.getDescription())
											   .properties(getPropertyAssignments(nDef.getProperties()))
											   //.attributes(nDef.getAttributes())
											   //.requirements()
											   .capabilities(getCapabilityAssignments(nDef.getCapabilities()))
											   //.interfaces(getInterfaceDefs(nDef.getInterfaceList()))
											   //.artifacts(artifacts)
											   );
		return toReturn;
	}
	
	public static List<RelationshipTemplateModel> getRelationshipTemplates(ServiceTemplate st){
		List<RelationshipTemplateModel> toReturn = new ArrayList<RelationshipTemplateModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (RelationshipDef rDef: st.getTopologyTemplate().getRelationships())
			toReturn.add(RelationshipTemplateModel.of().name(rDef.getName())
											   .typeName(rDef.getType())
											   .description(rDef.getDescription())
											   .properties(getPropertyAssignments(rDef.getProperties()))
											   //.attributes(nDef.getAttributes())
											   .interfaces(getInterfaceDefs(rDef.getInterfaceList()))	
											   );
		return toReturn;
	}
	
	public static List<ArtifactTypeModel> getArtifactsTypes(ServiceTemplate st){
		List<ArtifactTypeModel> toReturn = new ArrayList<ArtifactTypeModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (ArtifactDef artDef: st.getArtifacts())
			toReturn.add(ArtifactTypeModel.of().typeName(artDef.getType())
											   .description(artDef.getDescription())
											   .derived_from(artDef.getDerivedFrom())
											   .file_ext((String[])artDef.getFileExtentions().toArray())
											   .mime_type(artDef.getMimeType()));
											   //.properties(artDef.getProperties().toArray()));
		return toReturn;
	}
	
	public static List<DatatypeDefinitionModel> getDataTypes(ServiceTemplate st){
		List<DatatypeDefinitionModel> toReturn = new ArrayList<DatatypeDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (DataTypeDef dataType: st.getDataTypes())
			toReturn.add(DatatypeDefinitionModel.of().typeName(dataType.getTypeName())
										   			//.version(dataType.)
										   			.derived_from(dataType.getDerived_from())
										   			.description(dataType.getDescription())
										   			//.properties(dataType.getP)
										   			//.constraints(constraints)
											);
		return toReturn;
	}
	
	public static List<CapabilityDefinitionModel> getCapabilityTypes(ServiceTemplate st){
		List<CapabilityDefinitionModel> toReturn = new ArrayList<CapabilityDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (CapabilityDef capDef: st.getCapabilityTypes())
			toReturn.add(CapabilityDefinitionModel.of().typeName(capDef.getType())
											   //.version(VersionModel.)
											   .description(capDef.getDescription())
											   .derived_from(capDef.getDerived_from())
											   //.attributes(attributes))
											   //.properties(artDef.getProperties().toArray())
											   //.validSources(valid_sources)
											   );
		return toReturn;
	}
	
	public static List<NodeDefinitionModel> getNodeTypes(ServiceTemplate st){
		List<NodeDefinitionModel> toReturn = new ArrayList<NodeDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (NodeDef nDef: st.getNodeTypes())
			toReturn.add(NodeDefinitionModel.of().typeName(nDef.getTypeName())
											   .description(nDef.getDescription())
											   .derived_from(nDef.getDerived_from())
											   //.version(nDef.ge)
											   //.properties(artDef.getProperties().toArray())
											   //.attributes(attributes)
											   //.requirements(requirements)
											   //.capabilities(capabilities)
											   //.interfaces(interfaces)
											   //.artifacts(artifacts)
											   );
		return toReturn;
	}
	
	public static List<RelationshipDefinitionModel> getRelationshipTypes(ServiceTemplate st){
		List<RelationshipDefinitionModel> toReturn = new ArrayList<RelationshipDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (RelationshipDef rDef: st.getRelationshipTypes())
			toReturn.add(RelationshipDefinitionModel.of().typeName(rDef.getType())
											   .description(rDef.getDescription())
											   .derived_from(rDef.getDerived_from())
											   //.version(nDef.ge)
											   //.properties(artDef.getProperties().toArray())
											   //.attributes(attributes)
											   //.requirements(requirements)
											   //.capabilities(capabilities)
											   //.interfaces(interfaces)
											   //.artifacts(artifacts)
											   );
		return toReturn;
	}
	
	public static List<PropertyModel> getPropertyAssignments(List<PropertyDef> properties){
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for (PropertyDef property: properties)
			if (property.hasValue()){
				toReturn.add(PropertyModel.of().name(property.getName())
												   			 .value(getData(property.getPropertyValue()))
												    );
			}
		return toReturn;
	}
	
	public static List<AttributeAssignmentModel> getAttributeAssignments(List<AttributeDef> attributes){
		List<AttributeAssignmentModel> toReturn = new ArrayList<AttributeAssignmentModel>();
		for (AttributeDef attribute: attributes)
			//if (attribute.getPropertyValue() != null){
				toReturn.add(AttributeAssignmentModel.of().name(attribute.getName())
												   //.defaultValue(DataModel.of().value(attribute.getDefaultVal()))
												   );
			//}
		return toReturn;
	}
	
	public static List<CapabilityAssignmentModel> getCapabilityAssignments(List<CapabilityDef> capabilities){
		List<CapabilityAssignmentModel> toReturn = new ArrayList<CapabilityAssignmentModel>();
		for (CapabilityDef capability: capabilities)
				toReturn.add(CapabilityAssignmentModel.of().name(capability.getName())
														   //.properties(getPropertyAssignments(capability.getProperties()))
														   //.attributes(getAttributeAssignments(capability.getAttributes()))
												   
												   );
		return toReturn;
	}
	
		
	public static DataModel getData(DataTypeDef data){
		switch(data.getTypeStored()){
		case COMPLEX: return null; //TODO FIXME
		case FUNCTION: return DataModel.of().value(getFunction(data.getFunction()));
		case VALUE: return DataModel.of().value(data.getPrimitiveValue());
		}
		return null;
	}
	
	public static FunctionModel getFunction(Function function){
		return FunctionModel.of().typeName(function.getName())
								 .parameters(getPropertyAssignments(function.getParameters()));
	}
	
	public static ConstraintModel getConstraintClause(ConstraintDef constraint){
		return ConstraintModel.of().operator(constraint.getOperator())
								   .defaultValue(DataModel.of().value(constraint.getValue()));
	}
	
	public static List<ImportDefinitionModel> getImports(List<ImportDef> imports){
		List<ImportDefinitionModel> toReturn = new ArrayList<ImportDefinitionModel>();
		for(ImportDef iport: imports){
		    toReturn.add(ImportDefinitionModel.of().file(iport.getName())
	     							 .repository(iport.getRepository())
									 .namespace_uri(iport.getNamespaceUri())
									 .namespace_prefix(iport.getNamespacePrefix()));
		}
		return toReturn;
	}
	
	public static List<InterfaceTypeModel> getInterfaceTypes(List<InterfaceDef> interfaces){
		List<InterfaceTypeModel> toReturn = new ArrayList<InterfaceTypeModel>();
		for(InterfaceDef iface: interfaces){
		    toReturn.add(InterfaceResource.getInterfaceTypeDefinition(iface.getType()));
		}
		return toReturn;
	}
	
	public static List<InterfaceDefinitionModel> getInterfaceDefs(List<InterfaceDef> interfaces){
		List<InterfaceDefinitionModel> toReturn = new ArrayList<InterfaceDefinitionModel>();
		for(InterfaceDef iface: interfaces){
		    toReturn.add(InterfaceDefinitionModel.of().inputs(getInputs(iface.getInputs())));
		}
		return toReturn;
	}
	
	public static List<PropertyModel> getInputs(List<PropertyDef> inputs){
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for(PropertyDef input: inputs){
		    toReturn.add(PropertyModel.of().name(input.getName())
		    						       .value(DataModel.of().value(input.getActualValue())));
		}
		return toReturn;
	}
	
}
