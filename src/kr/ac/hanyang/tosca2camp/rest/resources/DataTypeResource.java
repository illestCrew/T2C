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

public class DataTypeResource {

	public static DatatypeDefinitionModel getDataTypeDefinition(String typeName){
		DataTypeDef dDef = Tosca2CampLauncher.getPlatform().loadDataType(typeName);
		return DatatypeDefinitionModel.of().typeName(dDef.getTypeName())
									   .description(dDef.getDescription())
									   .derived_from(dDef.getDerived_from())
									   .properties(getPropertyDefinitions(dDef.getPropertiesList()))
									   .constraints(getConstraintDefinitions(dDef.getConstraints()));
	}
	
	
	public static List<PropertyModel> getPropertyDefinitions(List<PropertyDef> properties){
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for (PropertyDef property: properties)
			toReturn.add(PropertyModel.of().name(property.getName())
													 .type(property.getType())
													 .description(property.getDescription())
													 .status(property.getStatus())
													 .constraints(getConstraintDefinitions(property.getConstraints()))
													 .required(property.isRequired())
		                                    	     .defaultValue(DataModel.of().value(property.getActualValue()))
												   );
			
		return toReturn;
	}
	
	public static List<ConstraintModel> getConstraintDefinitions(List<ConstraintDef> constraints){
		List<ConstraintModel> toReturn = new ArrayList<ConstraintModel>();
		for (ConstraintDef constraint: constraints){
			toReturn.add(ConstraintModel.of().operator(constraint.getOperator())
											 .defaultValue(DataModel.of().value(constraint.getValue())));
		}
		return toReturn;
	}
	
	
	
}
