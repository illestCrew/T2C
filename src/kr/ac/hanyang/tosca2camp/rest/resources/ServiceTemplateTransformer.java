package kr.ac.hanyang.tosca2camp.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

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

public class ServiceTemplateTransformer {
	
	private ModelPackage ePackage;
	private Resource resource;
	
	private ServiceTemplateTransformer(ModelPackage ePackage, Resource resource){
		this.ePackage = ePackage;
		this.resource = resource;
	}
	
	public static ServiceTemplateTransformer of(ModelPackage ePackage, Resource resource){
		return new ServiceTemplateTransformer(ePackage, resource);
	}
	
	public EPackage getEPackage(){ return ePackage;}
	
	public ServiceTemplateModel getServiceTemplate(ServiceTemplate st){
		EFactory factory = ePackage.getEFactoryInstance();
		ServiceTemplateModel stm = (ServiceTemplateModel) factory.create(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL);//.createServiceTemplateModel();
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__VERSION, st.getVersion());
		//stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__META_DATA, st.getMetaData());
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__DESCRIPTION, st.getDescription());
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__IMPORTS, st.getImports());
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES, getArtifactsTypes(st.getArtifacts()));
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__DATA_TYPES, getDataTypes(st.getDataTypes()));
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES, getCapabilityTypes(st.getCapabilityTypes()));
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES, getInterfaceTypes(st.getInterfaceTypes()));
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES, getRelationshipTypes(st.getRelationshipTypes()));
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__NODE_TYPES, getNodeTypes(st.getNodeTypes()));
		stm.eSet(ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE, getTopologyTemplate(st.getTopologyTemplate()));
		return stm;
	}
	
	public TopologyTemplateModel getTopologyTemplate(TopologyTemplate temp){
		EFactory factory = ePackage.getEFactoryInstance();
		TopologyTemplateModel ttm = (TopologyTemplateModel) factory.create(ModelPackage.Literals.TOPOLOGY_TEMPLATE_MODEL);
		ttm.eSet(ModelPackage.Literals.TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION, ttm.getDescription());
		ttm.eSet(ModelPackage.Literals.TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES, getNodeTemplates(temp.getNodes()));
		ttm.eSet(ModelPackage.Literals.TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES, getRelationshipTemplates(temp.getRelationships()));
		resource.getContents().add(ttm);
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

	public List<NodeTemplateModel> getNodeTemplates(List<NodeDef> nodes){
		EFactory factory = ePackage.getEFactoryInstance();
		List<NodeTemplateModel> toReturn = new ArrayList<NodeTemplateModel>();
		
		for (NodeDef nDef: nodes){
			NodeTemplateModel ntm = (NodeTemplateModel) factory.create(ModelPackage.Literals.NODE_TEMPLATE_MODEL);
			ntm.eSet(ModelPackage.Literals.NODE_TEMPLATE_MODEL__NAME, nDef.getName());
			ntm.eSet(ModelPackage.Literals.NODE_TEMPLATE_MODEL__TYPE, nDef.getTypeName());
			ntm.eSet(ModelPackage.Literals.NODE_TEMPLATE_MODEL__DESCRIPTION, nDef.getDescription());
			ntm.eSet(ModelPackage.Literals.NODE_TEMPLATE_MODEL__PROPERTIES, getPropertyAssignments(nDef.getProperties()));
			ntm.eSet(ModelPackage.Literals.NODE_TEMPLATE_MODEL__CAPABILITIES, getCapabilityAssignments(nDef.getCapabilities()));
			resource.getContents().add(ntm);
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
	
	public List<RelationshipTemplateModel> getRelationshipTemplates(List<RelationshipDef> rels){
		EFactory factory = ePackage.getEFactoryInstance();
		List<RelationshipTemplateModel> toReturn = new ArrayList<RelationshipTemplateModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (RelationshipDef rDef: rels){
			RelationshipTemplateModel rtm = (RelationshipTemplateModel) factory.create(ModelPackage.Literals.RELATIONSHIP_TEMPLATE_MODEL);
			rtm.eSet(ModelPackage.Literals.RELATIONSHIP_TEMPLATE_MODEL__NAME, rDef.getName());
			rtm.eSet(ModelPackage.Literals.RELATIONSHIP_TEMPLATE_MODEL__TYPE_NAME, rDef.getType());
			rtm.eSet(ModelPackage.Literals.RELATIONSHIP_TEMPLATE_MODEL__DESCRIPTION, rDef.getDescription());
			rtm.eSet(ModelPackage.Literals.RELATIONSHIP_TEMPLATE_MODEL__PROPERTIES, getPropertyAssignments(rDef.getProperties()));
			rtm.eSet(ModelPackage.Literals.RELATIONSHIP_TEMPLATE_MODEL__INTERFACES, getInterfaceDefs(rDef.getInterfaceList()));
			resource.getContents().add(rtm);
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
	
	public List<ArtifactTypeModel> getArtifactsTypes(List<ArtifactDef> arts){
		EFactory factory = ePackage.getEFactoryInstance();
		List<ArtifactTypeModel> toReturn = new ArrayList<ArtifactTypeModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (ArtifactDef artDef: arts){
			ArtifactTypeModel atm = (ArtifactTypeModel) factory.create(ModelPackage.Literals.ARTIFACT_TYPE_MODEL);
			atm.eSet(ModelPackage.Literals.ARTIFACT_TYPE_MODEL__TYPE_NAME, artDef.getType());
			atm.eSet(ModelPackage.Literals.ARTIFACT_TYPE_MODEL__DESCRIPTION, artDef.getDescription());
			atm.eSet(ModelPackage.Literals.ARTIFACT_TYPE_MODEL__DERIVED_FROM, artDef.getDerivedFrom());
			atm.eSet(ModelPackage.Literals.ARTIFACT_TYPE_MODEL__FILE_EXT, (String[])artDef.getFileExtentions().toArray());
			atm.eSet(ModelPackage.Literals.ARTIFACT_TYPE_MODEL__MIME_TYPE, artDef.getMimeType());
			resource.getContents().add(atm);
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
	
	public List<DatatypeDefinitionModel> getDataTypes(List<DataTypeDef> data){
		EFactory factory = ePackage.getEFactoryInstance();
		List<DatatypeDefinitionModel> toReturn = new ArrayList<DatatypeDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (DataTypeDef dataType: data){
			DatatypeDefinitionModel dtdm = (DatatypeDefinitionModel) factory.create(ModelPackage.Literals.DATATYPE_DEFINITION_MODEL);
			dtdm.eSet(ModelPackage.Literals.DATATYPE_DEFINITION_MODEL__TYPE_NAME, dataType.getTypeName());
			dtdm.eSet(ModelPackage.Literals.DATATYPE_DEFINITION_MODEL__TYPE_NAME, dataType.getDerived_from());
			dtdm.eSet(ModelPackage.Literals.DATATYPE_DEFINITION_MODEL__TYPE_NAME, dataType.getDescription());
			resource.getContents().add(dtdm);
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
	
	public List<CapabilityDefinitionModel> getCapabilityTypes(List<CapabilityDef> caps){
		EFactory factory = ePackage.getEFactoryInstance();
		List<CapabilityDefinitionModel> toReturn = new ArrayList<CapabilityDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (CapabilityDef capDef: caps){
			CapabilityDefinitionModel cdm = (CapabilityDefinitionModel) factory.create(ModelPackage.Literals.CAPABILITY_DEFINITION_MODEL);
			cdm.eSet(ModelPackage.Literals.CAPABILITY_DEFINITION_MODEL__TYPE_NAME, capDef.getType());
			cdm.eSet(ModelPackage.Literals.CAPABILITY_DEFINITION_MODEL__DESCRIPTION, capDef.getDescription());
			cdm.eSet(ModelPackage.Literals.CAPABILITY_DEFINITION_MODEL__DERIVED_FROM, capDef.getDerived_from());
			resource.getContents().add(cdm);
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
	
	public List<NodeDefinitionModel> getNodeTypes(List<NodeDef> nodes){
		EFactory factory = ePackage.getEFactoryInstance();
		List<NodeDefinitionModel> toReturn = new ArrayList<NodeDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (NodeDef nDef: nodes){
			NodeDefinitionModel ndm = (NodeDefinitionModel) factory.create(ModelPackage.Literals.NODE_DEFINITION_MODEL);
			ndm.eSet(ModelPackage.Literals.NODE_DEFINITION_MODEL__TYPE_NAME, nDef.getTypeName() );
			ndm.eSet(ModelPackage.Literals.NODE_DEFINITION_MODEL__DESCRIPTION, nDef.getDescription() );
			ndm.eSet(ModelPackage.Literals.NODE_DEFINITION_MODEL__DERIVED_FROM, nDef.getDerived_from());
			resource.getContents().add(ndm);
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
	
	public List<RelationshipDefinitionModel> getRelationshipTypes(List<RelationshipDef> rels){
		EFactory factory = ePackage.getEFactoryInstance();
		List<RelationshipDefinitionModel> toReturn = new ArrayList<RelationshipDefinitionModel>();
		//ServiceTemplate st = Tosca2CampLauncher.getPlatform().getServiceTemplate(serviceTemplateID);
		for (RelationshipDef rDef: rels){
			RelationshipDefinitionModel rdm = (RelationshipDefinitionModel) factory.create(ModelPackage.Literals.RELATIONSHIP_DEFINITION_MODEL);
			rdm.eSet(ModelPackage.Literals.RELATIONSHIP_DEFINITION_MODEL__TYPE_NAME, rDef.getType());
			rdm.eSet(ModelPackage.Literals.RELATIONSHIP_DEFINITION_MODEL__DESCRIPTION, rDef.getDescription());
			rdm.eSet(ModelPackage.Literals.RELATIONSHIP_DEFINITION_MODEL__DERIVED_FROM, rDef.getDerived_from());
			resource.getContents().add(rdm);
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
	
	public List<PropertyModel> getPropertyAssignments(List<PropertyDef> properties){
		EFactory factory = ePackage.getEFactoryInstance();
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for (PropertyDef property: properties){
			PropertyModel pm = (PropertyModel) factory.create(ModelPackage.Literals.PROPERTY_MODEL);
			pm.eSet(ModelPackage.Literals.PROPERTY_MODEL__NAME, property.getName());
			pm.eSet(ModelPackage.Literals.PROPERTY_MODEL__VALUE, getData(property.getPropertyValue()));
			resource.getContents().add(pm);
			toReturn.add(pm);
			
//			if (property.hasValue()){
//				toReturn.add(PropertyModel.of().name(property.getName())
//												   			 .value(getData(property.getPropertyValue()))
//												    );
//			}
		}
		return toReturn;
	}
	
	public List<AttributeAssignmentModel> getAttributeAssignments(List<AttributeDef> attributes){
		EFactory factory = ePackage.getEFactoryInstance();
		List<AttributeAssignmentModel> toReturn = new ArrayList<AttributeAssignmentModel>();
		for (AttributeDef attribute: attributes){
			AttributeAssignmentModel aam = (AttributeAssignmentModel) factory.create(ModelPackage.Literals.ATTRIBUTE_ASSIGNMENT_MODEL);
			aam.eSet(ModelPackage.Literals.ATTRIBUTE_ASSIGNMENT_MODEL__NAME, attribute.getName());
			resource.getContents().add(aam);
			toReturn.add(aam);
			
			//if (attribute.getPropertyValue() != null){
//				toReturn.add(AttributeAssignmentModel.of().name(attribute.getName())
//												   //.defaultValue(DataModel.of().value(attribute.getDefaultVal()))
//												   );
			//}
		}
		return toReturn;
	}
	
	public List<CapabilityAssignmentModel> getCapabilityAssignments(List<CapabilityDef> capabilities){
		EFactory factory = ePackage.getEFactoryInstance();
		List<CapabilityAssignmentModel> toReturn = new ArrayList<CapabilityAssignmentModel>();
		for (CapabilityDef capability: capabilities){
			CapabilityAssignmentModel cam = (CapabilityAssignmentModel) factory.create(ModelPackage.Literals.CAPABILITY_ASSIGNMENT_MODEL);
			cam.eSet(ModelPackage.Literals.CAPABILITY_ASSIGNMENT_MODEL__NAME, capability.getName());
			resource.getContents().add(cam);
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
	
		
	public DataModel getData(DataTypeDef data){
		EFactory factory = ePackage.getEFactoryInstance();
		DataModel dm = (DataModel) factory.create(ModelPackage.Literals.DATA_MODEL);
		
		switch(data.getTypeStored()){
		case COMPLEX: return null; //TODO FIXME
		case FUNCTION: 
			dm.eSet(ModelPackage.Literals.DATA_MODEL__VALUE, getFunction(data.getFunction()));
			resource.getContents().add(dm);
			return dm;
		case VALUE: 
			dm.eSet(ModelPackage.Literals.DATA_MODEL__VALUE, data.getPrimitiveValue());
			resource.getContents().add(dm);
			return dm;
		}
		return null;
	}
	
	public FunctionModel getFunction(Function function){
		EFactory factory = ePackage.getEFactoryInstance();
		FunctionModel fm = (FunctionModel) factory.create(ModelPackage.Literals.FUNCTION_MODEL);
		fm.eSet(ModelPackage.Literals.FUNCTION_MODEL__TYPE_NAME, function.getName());
		fm.eSet(ModelPackage.Literals.FUNCTION_MODEL__PARAMETERS, getPropertyAssignments(function.getParameters()));
		resource.getContents().add(fm);
		return fm;
//		return FunctionModel.of().typeName(function.getName())
//								 .parameters(getPropertyAssignments(function.getParameters()));
	}
	
	public ConstraintModel getConstraintClause(ConstraintDef constraint){
		EFactory factory = ePackage.getEFactoryInstance();
		ConstraintModel cm = (ConstraintModel) factory.create(ModelPackage.Literals.CONSTRAINT_MODEL);
		cm.eSet(ModelPackage.Literals.CONSTRAINT_MODEL__NAME, constraint.getOperator());
		cm.eSet(ModelPackage.Literals.CONSTRAINT_MODEL__VALUE, getData(constraint.getValue()));
		resource.getContents().add(cm);
		return cm;
//		return ConstraintModel.of().operator(constraint.getOperator())
//								   .defaultValue(DataModel.of().value(constraint.getValue()));
	}
	
	public List<ImportDefinitionModel> getImports(List<ImportDef> imports){
		EFactory factory = ePackage.getEFactoryInstance();
		List<ImportDefinitionModel> toReturn = new ArrayList<ImportDefinitionModel>();
		for(ImportDef iport: imports){
			ImportDefinitionModel idf = (ImportDefinitionModel) factory.create(ModelPackage.Literals.IMPORT_DEFINITION_MODEL);
			idf.eSet(ModelPackage.Literals.IMPORT_DEFINITION_MODEL__FILE, iport.getName());
			idf.eSet(ModelPackage.Literals.IMPORT_DEFINITION_MODEL__REPOSITORY, iport.getRepository());
			idf.eSet(ModelPackage.Literals.IMPORT_DEFINITION_MODEL__NAMESPACE_URI, iport.getNamespaceUri());
			idf.eSet(ModelPackage.Literals.IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX, iport.getNamespacePrefix());
			resource.getContents().add(idf);
			toReturn.add(idf);
			
//		    toReturn.add(ImportDefinitionModel.of().file(iport.getName())
//	     							 .repository(iport.getRepository())
//									 .namespace_uri(iport.getNamespaceUri())
//									 .namespace_prefix(iport.getNamespacePrefix()));
		}
		return toReturn;
	}
	
	public List<InterfaceTypeModel> getInterfaceTypes(List<InterfaceDef> interfaces){
		EFactory factory = ePackage.getEFactoryInstance();
		List<InterfaceTypeModel> toReturn = new ArrayList<InterfaceTypeModel>();
		for(InterfaceDef iface: interfaces){
			InterfaceTypeModel itf = (InterfaceTypeModel) factory.create(ModelPackage.Literals.INTERFACE_TYPE_MODEL);
			itf.eSet(ModelPackage.Literals.INTERFACE_TYPE_MODEL__TYPE_NAME, iface.getType());
			resource.getContents().add(itf);
			toReturn.add(itf);
			
			
		    //toReturn.add(InterfaceResource.getInterfaceTypeDefinition(iface.getType()));
		}
		return toReturn;
	}
	
	public List<InterfaceDefinitionModel> getInterfaceDefs(List<InterfaceDef> interfaces){
		EFactory factory = ePackage.getEFactoryInstance();
		List<InterfaceDefinitionModel> toReturn = new ArrayList<InterfaceDefinitionModel>();
		for(InterfaceDef iface: interfaces){
			InterfaceDefinitionModel idf = (InterfaceDefinitionModel) factory.create(ModelPackage.Literals.INTERFACE_DEFINITION_MODEL);
			idf.eSet(ModelPackage.Literals.INTERFACE_DEFINITION_MODEL__INPUTS, iface.getInputs());
			resource.getContents().add(idf);
			toReturn.add(idf);
			
		   // toReturn.add(InterfaceDefinitionModel.of().inputs(getInputs(iface.getInputs())));
		}
		return toReturn;
	}
	
	public List<PropertyModel> getInputs(List<PropertyDef> inputs){
		EFactory factory = ePackage.getEFactoryInstance();
		List<PropertyModel> toReturn = new ArrayList<PropertyModel>();
		for(PropertyDef input: inputs){
			PropertyModel pm = (PropertyModel) factory.create(ModelPackage.Literals.PROPERTY_MODEL);
			pm.eSet(ModelPackage.Literals.PROPERTY_MODEL__NAME, input.getName());
			pm.eSet(ModelPackage.Literals.PROPERTY_MODEL__VALUE, getData(input.getPropertyValue()));
			resource.getContents().add(pm);
			toReturn.add(pm);
			
			
//		    toReturn.add(PropertyModel.of().name(input.getName())
//		    						       .value(DataModel.of().value(input.getActualValue())));
		}
		return toReturn;
	}
	
}
