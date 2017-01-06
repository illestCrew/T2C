package kr.ac.hanyang.tosca2camp.rest.resources;

import java.util.ArrayList;
import java.util.List;

import kr.ac.hanyang.tosca2camp.Tosca2CampLauncher;
import kr.ac.hanyang.tosca2camp.definitiontypes.ArtifactDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.AttributeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.DataTypeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.NodeDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RelationshipDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.RequirementDef;
import kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel;
import kr.ac.hanyang.tosca2camp.rest.model.DataModel;
import kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel;
import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;
import kr.ac.hanyang.tosca2camp.templates.TopologyTemplate;

public class NodeTypeResource {

	
	public static List<NodeDefinitionModel> getNodeDefinitions(){
		List<NodeDefinitionModel> toReturn = new ArrayList<NodeDefinitionModel>();
		for(NodeDef nDef: Tosca2CampLauncher.getPlatform().getNodeDefs().values()){
			toReturn.add(getNodeDefinition(nDef.getTypeName()));
		}
		return toReturn;
	}
	
	
	public static NodeDefinitionModel getNodeDefinition(String typeName){
		NodeDef nDef = Tosca2CampLauncher.getPlatform().loadDefinition(typeName);
		return NodeDefinitionModel.of().typeName(nDef.getTypeName())
									   .description(nDef.getDescription())
									   .properties(getPropertyDefinitions(nDef.getProperties()))
									   //.attributes(nDef.getAttributes())
									   .requirements(getRequirements(nDef.getRequirements()))
									   .capabilities(getCapabilityDefinitions(nDef.getCapabilities()))
									   //.interfaces(getInterfaceDefinitions(nDef.getInterfaces()))
									   .artifacts(getArtifactDefinitions(nDef.getArtifactList())
									);
	}
	
	public static List<ArtifactTypeModel> getArtifactDefinitions(List<ArtifactDef> artifacts){
		List<ArtifactTypeModel> toReturn = new ArrayList<ArtifactTypeModel>();
		for (ArtifactDef artDef: artifacts)
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
	
	public static List<CapabilityDefinitionModel> getCapabilityDefinitions(List<CapabilityDef> capabilities){
		List<CapabilityDefinitionModel> toReturn = new ArrayList<CapabilityDefinitionModel>();
		for (CapabilityDef capDef: capabilities)
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
	
	public static List<PropertyModel> getPropertyDefinitions(List<PropertyDef> properties){
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for (PropertyDef property: properties)
			toReturn.add(PropertyModel.of().name(property.getName())
													 .type(property.getType())
													 .description(property.getDescription())
													 .status(property.getStatus())
													 .constraints(getConstraints(property.getConstraints()))
													 .required(property.isRequired())
		                                    	     .defaultValue(DataModel.of().value(property.getActualValue()))
												   );
			
		return toReturn;
	}
	
	public static List<RequirementDefinitionModel> getRequirements(List<RequirementDef> requirements){
		List<RequirementDefinitionModel> toReturn = new ArrayList<RequirementDefinitionModel>();
		for (RequirementDef requirement: requirements){
			toReturn.add(RequirementDefinitionModel.of().capability(requirement.getCapability())
													 .node(requirement.getNode())
													 //.relationship_definition(getRelationshipDefinition())
												   );
		}
		return toReturn;
	}
	
	public static List<ConstraintModel> getConstraints(List<ConstraintDef> constraints){
		List<ConstraintModel> toReturn = new ArrayList<ConstraintModel>();
		for (ConstraintDef constraint: constraints){
			toReturn.add(ConstraintModel.of().operator(constraint.getOperator())
											 .defaultValue(DataModel.of().value(constraint.getValue())));
		}
		return toReturn;
	}
	
	
	
}
