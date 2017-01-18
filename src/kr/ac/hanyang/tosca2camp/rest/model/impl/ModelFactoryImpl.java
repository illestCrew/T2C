/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.util.Map;

import kr.ac.hanyang.tosca2camp.rest.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.ARTIFACT_DEFINITION_MODEL: return createArtifactDefinitionModel();
			case ModelPackage.ARTIFACT_TYPE_MODEL: return createArtifactTypeModel();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT_MODEL: return createAttributeAssignmentModel();
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL: return createAttributeDefinitionModel();
			case ModelPackage.CAPABILITY_ASSIGNMENT_MODEL: return createCapabilityAssignmentModel();
			case ModelPackage.CAPABILITY_DEFINITION_MODEL: return createCapabilityDefinitionModel();
			case ModelPackage.CONSTRAINT_MODEL: return createConstraintModel();
			case ModelPackage.DATA_MODEL: return createDataModel();
			case ModelPackage.DATATYPE_DEFINITION_MODEL: return createDatatypeDefinitionModel();
			case ModelPackage.FUNCTION_MODEL: return createFunctionModel();
			case ModelPackage.GROUP_DEFINITION_MODEL: return createGroupDefinitionModel();
			case ModelPackage.GROUP_TYPE_MODEL: return createGroupTypeModel();
			case ModelPackage.IMPORT_DEFINITION_MODEL: return createImportDefinitionModel();
			case ModelPackage.INTERFACE_DEFINITION_MODEL: return createInterfaceDefinitionModel();
			case ModelPackage.INTERFACE_TYPE_MODEL: return createInterfaceTypeModel();
			case ModelPackage.NODE_DEFINITION_MODEL: return createNodeDefinitionModel();
			case ModelPackage.NODE_TEMPLATE_MODEL: return createNodeTemplateModel();
			case ModelPackage.OPERATION_DEFINITION_MODEL: return createOperationDefinitionModel();
			case ModelPackage.PARAMETER_DEFINITION_MODEL: return createParameterDefinitionModel();
			case ModelPackage.POLICY_DEFINITION_MODEL: return createPolicyDefinitionModel();
			case ModelPackage.POLICY_TYPE_MODEL: return createPolicyTypeModel();
			case ModelPackage.PROPERTY_ASSIGNMENT_MODEL: return createPropertyAssignmentModel();
			case ModelPackage.PROPERTY_MODEL: return createPropertyModel();
			case ModelPackage.RELATIONSHIP_DEFINITION_MODEL: return createRelationshipDefinitionModel();
			case ModelPackage.RELATIONSHIP_TEMPLATE_MODEL: return createRelationshipTemplateModel();
			case ModelPackage.REPOSITORY_DEFINITION_MODEL: return createRepositoryDefinitionModel();
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL: return createRequirementAssignmentModel();
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL: return createRequirementDefinitionModel();
			case ModelPackage.SERVICE_TEMPLATE_MODEL: return createServiceTemplateModel();
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL: return createTopologyTemplateModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.VERSION_MODEL:
				return createVersionModelFromString(eDataType, initialValue);
			case ModelPackage.STRING_ARRAY:
				return createStringArrayFromString(eDataType, initialValue);
//			case ModelPackage.MAP:
//				return createMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.VERSION_MODEL:
				return convertVersionModelToString(eDataType, instanceValue);
			case ModelPackage.STRING_ARRAY:
				return convertStringArrayToString(eDataType, instanceValue);
//			case ModelPackage.MAP:
//				return convertMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDefinitionModel createArtifactDefinitionModel() {
		ArtifactDefinitionModelImpl artifactDefinitionModel = new ArtifactDefinitionModelImpl();
		return artifactDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactTypeModel createArtifactTypeModel() {
		ArtifactTypeModelImpl artifactTypeModel = new ArtifactTypeModelImpl();
		return artifactTypeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentModel createAttributeAssignmentModel() {
		AttributeAssignmentModelImpl attributeAssignmentModel = new AttributeAssignmentModelImpl();
		return attributeAssignmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionModel createAttributeDefinitionModel() {
		AttributeDefinitionModelImpl attributeDefinitionModel = new AttributeDefinitionModelImpl();
		return attributeDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityAssignmentModel createCapabilityAssignmentModel() {
		CapabilityAssignmentModelImpl capabilityAssignmentModel = new CapabilityAssignmentModelImpl();
		return capabilityAssignmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinitionModel createCapabilityDefinitionModel() {
		CapabilityDefinitionModelImpl capabilityDefinitionModel = new CapabilityDefinitionModelImpl();
		return capabilityDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintModel createConstraintModel() {
		ConstraintModelImpl constraintModel = new ConstraintModelImpl();
		return constraintModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionModel createDatatypeDefinitionModel() {
		DatatypeDefinitionModelImpl datatypeDefinitionModel = new DatatypeDefinitionModelImpl();
		return datatypeDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionModel createFunctionModel() {
		FunctionModelImpl functionModel = new FunctionModelImpl();
		return functionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupDefinitionModel createGroupDefinitionModel() {
		GroupDefinitionModelImpl groupDefinitionModel = new GroupDefinitionModelImpl();
		return groupDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeModel createGroupTypeModel() {
		GroupTypeModelImpl groupTypeModel = new GroupTypeModelImpl();
		return groupTypeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDefinitionModel createImportDefinitionModel() {
		ImportDefinitionModelImpl importDefinitionModel = new ImportDefinitionModelImpl();
		return importDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinitionModel createInterfaceDefinitionModel() {
		InterfaceDefinitionModelImpl interfaceDefinitionModel = new InterfaceDefinitionModelImpl();
		return interfaceDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTypeModel createInterfaceTypeModel() {
		InterfaceTypeModelImpl interfaceTypeModel = new InterfaceTypeModelImpl();
		return interfaceTypeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDefinitionModel createNodeDefinitionModel() {
		NodeDefinitionModelImpl nodeDefinitionModel = new NodeDefinitionModelImpl();
		return nodeDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTemplateModel createNodeTemplateModel() {
		NodeTemplateModelImpl nodeTemplateModel = new NodeTemplateModelImpl();
		return nodeTemplateModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionModel createOperationDefinitionModel() {
		OperationDefinitionModelImpl operationDefinitionModel = new OperationDefinitionModelImpl();
		return operationDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitionModel createParameterDefinitionModel() {
		ParameterDefinitionModelImpl parameterDefinitionModel = new ParameterDefinitionModelImpl();
		return parameterDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyDefinitionModel createPolicyDefinitionModel() {
		PolicyDefinitionModelImpl policyDefinitionModel = new PolicyDefinitionModelImpl();
		return policyDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyTypeModel createPolicyTypeModel() {
		PolicyTypeModelImpl policyTypeModel = new PolicyTypeModelImpl();
		return policyTypeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAssignmentModel createPropertyAssignmentModel() {
		PropertyAssignmentModelImpl propertyAssignmentModel = new PropertyAssignmentModelImpl();
		return propertyAssignmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyModel createPropertyModel() {
		PropertyModelImpl propertyModel = new PropertyModelImpl();
		return propertyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDefinitionModel createRelationshipDefinitionModel() {
		RelationshipDefinitionModelImpl relationshipDefinitionModel = new RelationshipDefinitionModelImpl();
		return relationshipDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTemplateModel createRelationshipTemplateModel() {
		RelationshipTemplateModelImpl relationshipTemplateModel = new RelationshipTemplateModelImpl();
		return relationshipTemplateModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDefinitionModel createRepositoryDefinitionModel() {
		RepositoryDefinitionModelImpl repositoryDefinitionModel = new RepositoryDefinitionModelImpl();
		return repositoryDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementAssignmentModel createRequirementAssignmentModel() {
		RequirementAssignmentModelImpl requirementAssignmentModel = new RequirementAssignmentModelImpl();
		return requirementAssignmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinitionModel createRequirementDefinitionModel() {
		RequirementDefinitionModelImpl requirementDefinitionModel = new RequirementDefinitionModelImpl();
		return requirementDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplateModel createServiceTemplateModel() {
		ServiceTemplateModelImpl serviceTemplateModel = new ServiceTemplateModelImpl();
		return serviceTemplateModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTemplateModel createTopologyTemplateModel() {
		TopologyTemplateModelImpl topologyTemplateModel = new TopologyTemplateModelImpl();
		return topologyTemplateModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionModel createVersionModelFromString(EDataType eDataType, String initialValue) {
		return (VersionModel)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionModelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
		return (String[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
//		return (Map<?, ?>)super.createFromString(initialValue);
//	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public String convertMapToString(EDataType eDataType, Object instanceValue) {
//		return super.convertToString(instanceValue);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
