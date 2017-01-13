/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.util;

import java.io.Serializable;

import kr.ac.hanyang.tosca2camp.rest.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kr.ac.hanyang.tosca2camp.rest.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ARTIFACT_DEFINITION_MODEL: {
				ArtifactDefinitionModel artifactDefinitionModel = (ArtifactDefinitionModel)theEObject;
				T result = caseArtifactDefinitionModel(artifactDefinitionModel);
				if (result == null) result = caseSerializable(artifactDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARTIFACT_TYPE_MODEL: {
				ArtifactTypeModel artifactTypeModel = (ArtifactTypeModel)theEObject;
				T result = caseArtifactTypeModel(artifactTypeModel);
				if (result == null) result = caseSerializable(artifactTypeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATTRIBUTE_ASSIGNMENT_MODEL: {
				AttributeAssignmentModel attributeAssignmentModel = (AttributeAssignmentModel)theEObject;
				T result = caseAttributeAssignmentModel(attributeAssignmentModel);
				if (result == null) result = caseSerializable(attributeAssignmentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATTRIBUTE_DEFINITION_MODEL: {
				AttributeDefinitionModel attributeDefinitionModel = (AttributeDefinitionModel)theEObject;
				T result = caseAttributeDefinitionModel(attributeDefinitionModel);
				if (result == null) result = caseSerializable(attributeDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CAPABILITY_ASSIGNMENT_MODEL: {
				CapabilityAssignmentModel capabilityAssignmentModel = (CapabilityAssignmentModel)theEObject;
				T result = caseCapabilityAssignmentModel(capabilityAssignmentModel);
				if (result == null) result = caseSerializable(capabilityAssignmentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CAPABILITY_DEFINITION_MODEL: {
				CapabilityDefinitionModel capabilityDefinitionModel = (CapabilityDefinitionModel)theEObject;
				T result = caseCapabilityDefinitionModel(capabilityDefinitionModel);
				if (result == null) result = caseSerializable(capabilityDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONSTRAINT_MODEL: {
				ConstraintModel constraintModel = (ConstraintModel)theEObject;
				T result = caseConstraintModel(constraintModel);
				if (result == null) result = caseSerializable(constraintModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_MODEL: {
				DataModel dataModel = (DataModel)theEObject;
				T result = caseDataModel(dataModel);
				if (result == null) result = caseSerializable(dataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATATYPE_DEFINITION_MODEL: {
				DatatypeDefinitionModel datatypeDefinitionModel = (DatatypeDefinitionModel)theEObject;
				T result = caseDatatypeDefinitionModel(datatypeDefinitionModel);
				if (result == null) result = caseSerializable(datatypeDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FUNCTION_MODEL: {
				FunctionModel functionModel = (FunctionModel)theEObject;
				T result = caseFunctionModel(functionModel);
				if (result == null) result = caseSerializable(functionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GROUP_DEFINITION_MODEL: {
				GroupDefinitionModel groupDefinitionModel = (GroupDefinitionModel)theEObject;
				T result = caseGroupDefinitionModel(groupDefinitionModel);
				if (result == null) result = caseSerializable(groupDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GROUP_TYPE_MODEL: {
				GroupTypeModel groupTypeModel = (GroupTypeModel)theEObject;
				T result = caseGroupTypeModel(groupTypeModel);
				if (result == null) result = caseSerializable(groupTypeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPORT_DEFINITION_MODEL: {
				ImportDefinitionModel importDefinitionModel = (ImportDefinitionModel)theEObject;
				T result = caseImportDefinitionModel(importDefinitionModel);
				if (result == null) result = caseSerializable(importDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEFINITION_MODEL: {
				InterfaceDefinitionModel interfaceDefinitionModel = (InterfaceDefinitionModel)theEObject;
				T result = caseInterfaceDefinitionModel(interfaceDefinitionModel);
				if (result == null) result = caseSerializable(interfaceDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_TYPE_MODEL: {
				InterfaceTypeModel interfaceTypeModel = (InterfaceTypeModel)theEObject;
				T result = caseInterfaceTypeModel(interfaceTypeModel);
				if (result == null) result = caseSerializable(interfaceTypeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NODE_DEFINITION_MODEL: {
				NodeDefinitionModel nodeDefinitionModel = (NodeDefinitionModel)theEObject;
				T result = caseNodeDefinitionModel(nodeDefinitionModel);
				if (result == null) result = caseSerializable(nodeDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NODE_TEMPLATE_MODEL: {
				NodeTemplateModel nodeTemplateModel = (NodeTemplateModel)theEObject;
				T result = caseNodeTemplateModel(nodeTemplateModel);
				if (result == null) result = caseSerializable(nodeTemplateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OPERATION_DEFINITION_MODEL: {
				OperationDefinitionModel operationDefinitionModel = (OperationDefinitionModel)theEObject;
				T result = caseOperationDefinitionModel(operationDefinitionModel);
				if (result == null) result = caseSerializable(operationDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PARAMETER_DEFINITION_MODEL: {
				ParameterDefinitionModel parameterDefinitionModel = (ParameterDefinitionModel)theEObject;
				T result = caseParameterDefinitionModel(parameterDefinitionModel);
				if (result == null) result = caseSerializable(parameterDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POLICY_DEFINITION_MODEL: {
				PolicyDefinitionModel policyDefinitionModel = (PolicyDefinitionModel)theEObject;
				T result = casePolicyDefinitionModel(policyDefinitionModel);
				if (result == null) result = caseSerializable(policyDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POLICY_TYPE_MODEL: {
				PolicyTypeModel policyTypeModel = (PolicyTypeModel)theEObject;
				T result = casePolicyTypeModel(policyTypeModel);
				if (result == null) result = caseSerializable(policyTypeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROPERTY_ASSIGNMENT_MODEL: {
				PropertyAssignmentModel propertyAssignmentModel = (PropertyAssignmentModel)theEObject;
				T result = casePropertyAssignmentModel(propertyAssignmentModel);
				if (result == null) result = caseSerializable(propertyAssignmentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROPERTY_MODEL: {
				PropertyModel propertyModel = (PropertyModel)theEObject;
				T result = casePropertyModel(propertyModel);
				if (result == null) result = caseSerializable(propertyModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATIONSHIP_DEFINITION_MODEL: {
				RelationshipDefinitionModel relationshipDefinitionModel = (RelationshipDefinitionModel)theEObject;
				T result = caseRelationshipDefinitionModel(relationshipDefinitionModel);
				if (result == null) result = caseSerializable(relationshipDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATIONSHIP_TEMPLATE_MODEL: {
				RelationshipTemplateModel relationshipTemplateModel = (RelationshipTemplateModel)theEObject;
				T result = caseRelationshipTemplateModel(relationshipTemplateModel);
				if (result == null) result = caseSerializable(relationshipTemplateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REPOSITORY_DEFINITION_MODEL: {
				RepositoryDefinitionModel repositoryDefinitionModel = (RepositoryDefinitionModel)theEObject;
				T result = caseRepositoryDefinitionModel(repositoryDefinitionModel);
				if (result == null) result = caseSerializable(repositoryDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REQUIREMENT_ASSIGNMENT_MODEL: {
				RequirementAssignmentModel requirementAssignmentModel = (RequirementAssignmentModel)theEObject;
				T result = caseRequirementAssignmentModel(requirementAssignmentModel);
				if (result == null) result = caseSerializable(requirementAssignmentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REQUIREMENT_DEFINITION_MODEL: {
				RequirementDefinitionModel requirementDefinitionModel = (RequirementDefinitionModel)theEObject;
				T result = caseRequirementDefinitionModel(requirementDefinitionModel);
				if (result == null) result = caseSerializable(requirementDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SERVICE_TEMPLATE_MODEL: {
				ServiceTemplateModel serviceTemplateModel = (ServiceTemplateModel)theEObject;
				T result = caseServiceTemplateModel(serviceTemplateModel);
				if (result == null) result = caseSerializable(serviceTemplateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TOPOLOGY_TEMPLATE_MODEL: {
				TopologyTemplateModel topologyTemplateModel = (TopologyTemplateModel)theEObject;
				T result = caseTopologyTemplateModel(topologyTemplateModel);
				if (result == null) result = caseSerializable(topologyTemplateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SERIALIZABLE: {
				Serializable serializable = (Serializable)theEObject;
				T result = caseSerializable(serializable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactDefinitionModel(ArtifactDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Type Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Type Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactTypeModel(ArtifactTypeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Assignment Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Assignment Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAssignmentModel(AttributeAssignmentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionModel(AttributeDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Assignment Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Assignment Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityAssignmentModel(CapabilityAssignmentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDefinitionModel(CapabilityDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintModel(ConstraintModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataModel(DataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionModel(DatatypeDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionModel(FunctionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupDefinitionModel(GroupDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupTypeModel(GroupTypeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDefinitionModel(ImportDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefinitionModel(InterfaceDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Type Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Type Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceTypeModel(InterfaceTypeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeDefinitionModel(NodeDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Template Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Template Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeTemplateModel(NodeTemplateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionModel(OperationDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinitionModel(ParameterDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyDefinitionModel(PolicyDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Type Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Type Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyTypeModel(PolicyTypeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Assignment Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Assignment Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAssignmentModel(PropertyAssignmentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyModel(PropertyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipDefinitionModel(RelationshipDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Template Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Template Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipTemplateModel(RelationshipTemplateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryDefinitionModel(RepositoryDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Assignment Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Assignment Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementAssignmentModel(RequirementAssignmentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementDefinitionModel(RequirementDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Template Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Template Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTemplateModel(ServiceTemplateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Template Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Template Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyTemplateModel(TopologyTemplateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serializable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serializable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializable(Serializable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
