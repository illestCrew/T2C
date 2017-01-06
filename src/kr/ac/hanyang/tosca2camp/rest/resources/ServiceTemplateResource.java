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
import kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel;
import kr.ac.hanyang.tosca2camp.templates.ImportDef;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;
import kr.ac.hanyang.tosca2camp.templates.TopologyTemplate;

public class ServiceTemplateResource {
	
	public static ServiceTemplateModel getServiceTemplate(String serviceTemplateID){
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		ServiceTemplateModel stm = ServiceTemplateModel.of()
										.toscaDefinition(st.getVersion())
										.metadata(st.getMetaData())
										.description(st.getDescription())
										.imports(getImports(st.getImports()))
										.artifactTypes(getArtifactsTypes(serviceTemplateID))
										.dataTypes(getDataTypes(serviceTemplateID))
										.capabilityTypes(getCapabilityTypes(serviceTemplateID))
										.interfaceTypes(getInterfaceTypes(st.getInterfaceTypes()))
										.relationshipTypes(getRelationshipTypes(serviceTemplateID))
										.nodeTypes(getNodeTypes(serviceTemplateID))
										//.groupTypes(group_types)
										//.policyTypes(policy_types)
										.topologyTemplates(getTopologyTemplate(serviceTemplateID));
		return stm;
	}
	
	public static TopologyTemplateModel getTopologyTemplate(String serviceTemplateID){
		TopologyTemplate temp = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID).getTopologyTemplate();
		return TopologyTemplateModel.of().description(temp.getDescription())
										 //.inputs(temp.getInputs())
										 .nodeTemplates(getNodeTemplates(serviceTemplateID))
										 .relationshipTemplates(getRelationshipTemplates(serviceTemplateID))
										 //.groups(groups)
										 //.policies(policies)
				 						 //.outputs(outputs)
											;
	}

	public static List<NodeTemplateModel> getNodeTemplates(String serviceTemplateID){
		List<NodeTemplateModel> toReturn = new ArrayList<NodeTemplateModel>();
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (NodeDef nDef: st.getTopologyTemplate().getNodes())
			toReturn.add(NodeTemplateModel.of().name(nDef.getName())
											   .typeName(nDef.getTypeName())
											   .description(nDef.getDescription())
											   .properties(getPropertyAssignments(nDef.getProperties()))
											   //.attributes(nDef.getAttributes())
											   //.requirements()
											   .capabilities(getCapabilityAssignments(nDef.getCapabilities()))
											   .interfaces(getInterfaceDefs(nDef.getInterfaceList()))
											   //.artifacts(artifacts)
											   );
		return toReturn;
	}
	
	public static List<RelationshipTemplateModel> getRelationshipTemplates(String serviceTemplateID){
		List<RelationshipTemplateModel> toReturn = new ArrayList<RelationshipTemplateModel>();
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
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
	
	public static List<ArtifactTypeModel> getArtifactsTypes(String serviceTemplateID){
		List<ArtifactTypeModel> toReturn = new ArrayList<ArtifactTypeModel>();
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (ArtifactDef artDef: st.getArtifacts())
			toReturn.add(ArtifactTypeModel.of().typeName(artDef.getType())
											   .description(artDef.getDescription())
											   .derived_from(artDef.getDerivedFrom())
											   .file_ext((String[])artDef.getFileExtentions().toArray())
											   .mime_type(artDef.getMimeType()));
											   //.properties(artDef.getProperties().toArray()));
		return toReturn;
	}
	
	public static List<DatatypeDefinitionModel> getDataTypes(String serviceTemplateID){
		List<DatatypeDefinitionModel> toReturn = new ArrayList<DatatypeDefinitionModel>();
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
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
	
	public static List<CapabilityDefinitionModel> getCapabilityTypes(String serviceTemplateID){
		List<CapabilityDefinitionModel> toReturn = new ArrayList<CapabilityDefinitionModel>();
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
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
	
	public static List<NodeDefinitionModel> getNodeTypes(String serviceTemplateID){
		List<NodeDefinitionModel> toReturn = new ArrayList<NodeDefinitionModel>();
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
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
	
	public static List<RelationshipDefinitionModel> getRelationshipTypes(String serviceTemplateID){
		List<RelationshipDefinitionModel> toReturn = new ArrayList<RelationshipDefinitionModel>();
		ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
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
			if (property.getPropertyValue() != null){
				toReturn.add(PropertyModel.of().name(property.getName())
												   .defaultValue(DataModel.of().value(property.getActualValue()))
												   );
			}
		return toReturn;
	}
	
	public static List<AttributeAssignmentModel> getAttributeAssignments(List<AttributeDef> attributes){
		List<AttributeAssignmentModel> toReturn = new ArrayList<AttributeAssignmentModel>();
		for (AttributeDef attribute: attributes)
			//if (attribute.getPropertyValue() != null){
				toReturn.add(AttributeAssignmentModel.of().name(attribute.getName())
												   .defaultValue(DataModel.of().value(attribute.getDefaultVal()))
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
		return DataModel.of().value(data.getPrimitiveValue());
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
