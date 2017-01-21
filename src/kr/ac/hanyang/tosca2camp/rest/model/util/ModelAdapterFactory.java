/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.util;

import kr.ac.hanyang.tosca2camp.rest.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kr.ac.hanyang.tosca2camp.rest.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseArtifactDefinitionModel(ArtifactDefinitionModel object) {
				return createArtifactDefinitionModelAdapter();
			}
			@Override
			public Adapter caseArtifactTypeModel(ArtifactTypeModel object) {
				return createArtifactTypeModelAdapter();
			}
			@Override
			public Adapter caseAttributeAssignmentModel(AttributeAssignmentModel object) {
				return createAttributeAssignmentModelAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionModel(AttributeDefinitionModel object) {
				return createAttributeDefinitionModelAdapter();
			}
			@Override
			public Adapter caseCapabilityAssignmentModel(CapabilityAssignmentModel object) {
				return createCapabilityAssignmentModelAdapter();
			}
			@Override
			public Adapter caseCapabilityDefinitionModel(CapabilityDefinitionModel object) {
				return createCapabilityDefinitionModelAdapter();
			}
			@Override
			public Adapter caseConstraintModel(ConstraintModel object) {
				return createConstraintModelAdapter();
			}
			@Override
			public Adapter caseDataModel(DataModel object) {
				return createDataModelAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionModel(DatatypeDefinitionModel object) {
				return createDatatypeDefinitionModelAdapter();
			}
			@Override
			public Adapter caseFunctionModel(FunctionModel object) {
				return createFunctionModelAdapter();
			}
			@Override
			public Adapter caseGroupDefinitionModel(GroupDefinitionModel object) {
				return createGroupDefinitionModelAdapter();
			}
			@Override
			public Adapter caseGroupTypeModel(GroupTypeModel object) {
				return createGroupTypeModelAdapter();
			}
			@Override
			public Adapter caseImportDefinitionModel(ImportDefinitionModel object) {
				return createImportDefinitionModelAdapter();
			}
			@Override
			public Adapter caseInterfaceDefinitionModel(InterfaceDefinitionModel object) {
				return createInterfaceDefinitionModelAdapter();
			}
			@Override
			public Adapter caseInterfaceTypeModel(InterfaceTypeModel object) {
				return createInterfaceTypeModelAdapter();
			}
			@Override
			public Adapter caseNodeDefinitionModel(NodeDefinitionModel object) {
				return createNodeDefinitionModelAdapter();
			}
			@Override
			public Adapter caseNodeTemplateModel(NodeTemplateModel object) {
				return createNodeTemplateModelAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionModel(OperationDefinitionModel object) {
				return createOperationDefinitionModelAdapter();
			}
			@Override
			public Adapter caseParameterDefinitionModel(ParameterDefinitionModel object) {
				return createParameterDefinitionModelAdapter();
			}
			@Override
			public Adapter casePolicyDefinitionModel(PolicyDefinitionModel object) {
				return createPolicyDefinitionModelAdapter();
			}
			@Override
			public Adapter casePolicyTypeModel(PolicyTypeModel object) {
				return createPolicyTypeModelAdapter();
			}
			@Override
			public Adapter casePropertyAssignmentModel(PropertyAssignmentModel object) {
				return createPropertyAssignmentModelAdapter();
			}
			@Override
			public Adapter casePropertyModel(PropertyModel object) {
				return createPropertyModelAdapter();
			}
			@Override
			public Adapter caseRelationshipDefinitionModel(RelationshipDefinitionModel object) {
				return createRelationshipDefinitionModelAdapter();
			}
			@Override
			public Adapter caseRelationshipTemplateModel(RelationshipTemplateModel object) {
				return createRelationshipTemplateModelAdapter();
			}
			@Override
			public Adapter caseRepositoryDefinitionModel(RepositoryDefinitionModel object) {
				return createRepositoryDefinitionModelAdapter();
			}
			@Override
			public Adapter caseRequirementAssignmentModel(RequirementAssignmentModel object) {
				return createRequirementAssignmentModelAdapter();
			}
			@Override
			public Adapter caseRequirementDefinitionModel(RequirementDefinitionModel object) {
				return createRequirementDefinitionModelAdapter();
			}
			@Override
			public Adapter caseServiceTemplateModel(ServiceTemplateModel object) {
				return createServiceTemplateModelAdapter();
			}
			@Override
			public Adapter caseTopologyTemplateModel(TopologyTemplateModel object) {
				return createTopologyTemplateModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel <em>Artifact Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel
	 * @generated
	 */
	public Adapter createArtifactDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel <em>Artifact Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel
	 * @generated
	 */
	public Adapter createArtifactTypeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel <em>Attribute Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel
	 * @generated
	 */
	public Adapter createAttributeAssignmentModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel <em>Attribute Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel
	 * @generated
	 */
	public Adapter createAttributeDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel <em>Capability Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel
	 * @generated
	 */
	public Adapter createCapabilityAssignmentModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel <em>Capability Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel
	 * @generated
	 */
	public Adapter createCapabilityDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel <em>Constraint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel
	 * @generated
	 */
	public Adapter createConstraintModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DataModel
	 * @generated
	 */
	public Adapter createDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel <em>Datatype Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel
	 * @generated
	 */
	public Adapter createDatatypeDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.FunctionModel <em>Function Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.FunctionModel
	 * @generated
	 */
	public Adapter createFunctionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel <em>Group Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel
	 * @generated
	 */
	public Adapter createGroupDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel <em>Group Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel
	 * @generated
	 */
	public Adapter createGroupTypeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel <em>Import Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel
	 * @generated
	 */
	public Adapter createImportDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel <em>Interface Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel
	 * @generated
	 */
	public Adapter createInterfaceDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel <em>Interface Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel
	 * @generated
	 */
	public Adapter createInterfaceTypeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel <em>Node Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel
	 * @generated
	 */
	public Adapter createNodeDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel <em>Node Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel
	 * @generated
	 */
	public Adapter createNodeTemplateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel <em>Operation Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel
	 * @generated
	 */
	public Adapter createOperationDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel <em>Parameter Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel
	 * @generated
	 */
	public Adapter createParameterDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel <em>Policy Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel
	 * @generated
	 */
	public Adapter createPolicyDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel <em>Policy Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel
	 * @generated
	 */
	public Adapter createPolicyTypeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel <em>Property Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel
	 * @generated
	 */
	public Adapter createPropertyAssignmentModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel <em>Property Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel
	 * @generated
	 */
	public Adapter createPropertyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel <em>Relationship Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel
	 * @generated
	 */
	public Adapter createRelationshipDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel <em>Relationship Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel
	 * @generated
	 */
	public Adapter createRelationshipTemplateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel <em>Repository Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel
	 * @generated
	 */
	public Adapter createRepositoryDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel <em>Requirement Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel
	 * @generated
	 */
	public Adapter createRequirementAssignmentModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel <em>Requirement Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel
	 * @generated
	 */
	public Adapter createRequirementDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel <em>Service Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel
	 * @generated
	 */
	public Adapter createServiceTemplateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel <em>Topology Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel
	 * @generated
	 */
	public Adapter createTopologyTemplateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
