/**
 */
package kr.ac.hanyang.tosca2camp.rest.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kr.ac.hanyang.tosca2camp.rest.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///kr/ac/hanyang/tosca2camp/rest/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kr.ac.hanyang.tosca2camp.rest.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.io.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 30;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactDefinitionModelImpl <em>Artifact Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getArtifactDefinitionModel()
	 * @generated
	 */
	int ARTIFACT_DEFINITION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_MODEL__TYPE = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_MODEL__FILE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_MODEL__REPOSITORY = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deploy path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_MODEL__DEPLOY_PATH = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Artifact Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Artifact Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactTypeModelImpl <em>Artifact Type Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactTypeModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getArtifactTypeModel()
	 * @generated
	 */
	int ARTIFACT_TYPE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mime type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL__MIME_TYPE = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL__FILE_EXT = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Artifact Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Artifact Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeAssignmentModelImpl <em>Attribute Assignment Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeAssignmentModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getAttributeAssignmentModel()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_MODEL__VALUE = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl <em>Attribute Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getAttributeDefinitionModel()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_MODEL__TYPE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_MODEL__STATUS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Attribute Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityAssignmentModelImpl <em>Capability Assignment Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityAssignmentModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getCapabilityAssignmentModel()
	 * @generated
	 */
	int CAPABILITY_ASSIGNMENT_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSIGNMENT_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSIGNMENT_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSIGNMENT_MODEL__ATTRIBUTES = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSIGNMENT_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Capability Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ASSIGNMENT_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl <em>Capability Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getCapabilityDefinitionModel()
	 * @generated
	 */
	int CAPABILITY_DEFINITION_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL__ATTRIBUTES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Valid Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL__VALID_SOURCES = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Capability Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Capability Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ConstraintModelImpl <em>Constraint Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ConstraintModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getConstraintModel()
	 * @generated
	 */
	int CONSTRAINT_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MODEL__VALUE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraint Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.DataModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__VALUE = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.DatatypeDefinitionModelImpl <em>Datatype Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.DatatypeDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getDatatypeDefinitionModel()
	 * @generated
	 */
	int DATATYPE_DEFINITION_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL__CONSTRAINTS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Datatype Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Datatype Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.FunctionModelImpl <em>Function Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.FunctionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getFunctionModel()
	 * @generated
	 */
	int FUNCTION_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MODEL__PARAMETERS = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupDefinitionModelImpl <em>Group Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.GroupDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getGroupDefinitionModel()
	 * @generated
	 */
	int GROUP_DEFINITION_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL__TYPE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL__MEMBERS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL__INTERFACES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Group Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Group Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl <em>Group Type Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getGroupTypeModel()
	 * @generated
	 */
	int GROUP_TYPE_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Members</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL__MEMBERS = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL__INTERFACES = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Group Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Group Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl <em>Import Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getImportDefinitionModel()
	 * @generated
	 */
	int IMPORT_DEFINITION_MODEL = 12;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION_MODEL__FILE = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION_MODEL__REPOSITORY = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION_MODEL__NAMESPACE_URI = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Import Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Import Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceDefinitionModelImpl <em>Interface Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getInterfaceDefinitionModel()
	 * @generated
	 */
	int INTERFACE_DEFINITION_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION_MODEL__INPUTS = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceTypeModelImpl <em>Interface Type Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceTypeModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getInterfaceTypeModel()
	 * @generated
	 */
	int INTERFACE_TYPE_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL__INPUTS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL__OPERATIONS = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interface Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Interface Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl <em>Node Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getNodeDefinitionModel()
	 * @generated
	 */
	int NODE_DEFINITION_MODEL = 15;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__ATTRIBUTES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__REQUIREMENTS = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__CAPABILITIES = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__INTERFACES = SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL__ARTIFACTS = SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Node Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Node Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl <em>Node Template Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getNodeTemplateModel()
	 * @generated
	 */
	int NODE_TEMPLATE_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__TYPE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__DIRECTIVES = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__ATTRIBUTES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__REQUIREMENTS = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__CAPABILITIES = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__INTERFACES = SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL__ARTIFACTS = SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Node Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Node Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TEMPLATE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl <em>Operation Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getOperationDefinitionModel()
	 * @generated
	 */
	int OPERATION_DEFINITION_MODEL = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_MODEL__IMPLEMENTATION = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operation Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl <em>Parameter Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getParameterDefinitionModel()
	 * @generated
	 */
	int PARAMETER_DEFINITION_MODEL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__TYPE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__DATA_VALUE = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__VALUE = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__STATUS = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__CONSTRAINT = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Entry Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Parameter Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL___GET_REQUIRED = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyDefinitionModelImpl <em>Policy Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPolicyDefinitionModel()
	 * @generated
	 */
	int POLICY_DEFINITION_MODEL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEFINITION_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEFINITION_MODEL__TYPE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEFINITION_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEFINITION_MODEL__TARGETS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Policy Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Policy Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl <em>Policy Type Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPolicyTypeModel()
	 * @generated
	 */
	int POLICY_TYPE_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL__TARGETS = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Policy Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Policy Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_TYPE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyAssignmentModelImpl <em>Property Assignment Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyAssignmentModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPropertyAssignmentModel()
	 * @generated
	 */
	int PROPERTY_ASSIGNMENT_MODEL = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_MODEL__VALUE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyModelImpl <em>Property Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPropertyModel()
	 * @generated
	 */
	int PROPERTY_MODEL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__TYPE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__DATA_VALUE = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__STATUS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__CONSTRAINT = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entry Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__ENTRY_SCHEMA = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__VALUE = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Property Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL___GET_REQUIRED = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipDefinitionModelImpl <em>Relationship Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRelationshipDefinitionModel()
	 * @generated
	 */
	int RELATIONSHIP_DEFINITION_MODEL = 23;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__DERIVED_FROM = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__ATTRIBUTES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__INTERFACES = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Valid Target Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL__VALID_TARGET_TYPES = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Relationship Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Relationship Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipTemplateModelImpl <em>Relationship Template Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipTemplateModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRelationshipTemplateModel()
	 * @generated
	 */
	int RELATIONSHIP_TEMPLATE_MODEL = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL__NAME = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL__TYPE_NAME = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL__PROPERTIES = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL__ATTRIBUTES = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL__INTERFACES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL__COPY = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Relationship Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Relationship Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TEMPLATE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RepositoryDefinitionModelImpl <em>Repository Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RepositoryDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRepositoryDefinitionModel()
	 * @generated
	 */
	int REPOSITORY_DEFINITION_MODEL = 25;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION_MODEL__URL = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION_MODEL__CREDENTIAL = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repository Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Repository Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementAssignmentModelImpl <em>Requirement Assignment Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementAssignmentModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRequirementAssignmentModel()
	 * @generated
	 */
	int REQUIREMENT_ASSIGNMENT_MODEL = 26;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSIGNMENT_MODEL__NODE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSIGNMENT_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Requirement Assignment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSIGNMENT_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl <em>Requirement Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRequirementDefinitionModel()
	 * @generated
	 */
	int REQUIREMENT_DEFINITION_MODEL = 27;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITION_MODEL__CAPABILITY = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITION_MODEL__NODE = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relationship definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Requirement Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITION_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Requirement Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITION_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl <em>Service Template Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getServiceTemplateModel()
	 * @generated
	 */
	int SERVICE_TEMPLATE_MODEL = 28;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__VERSION = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__META_DATA = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__REPOSITORIES = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__IMPORTS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Artifact Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__DATA_TYPES = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capability Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES = SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Relationship Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES = SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__NODE_TYPES = SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Group Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__GROUP_TYPES = SERIALIZABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Policy Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__POLICY_TYPES = SERIALIZABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Topology Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE = SERIALIZABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Service Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Service Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl <em>Topology Template Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getTopologyTemplateModel()
	 * @generated
	 */
	int TOPOLOGY_TEMPLATE_MODEL = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL__INPUTS = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Templates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relationship Templates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL__GROUPS = SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL__POLICIES = SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL__OUTPUTS = SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Topology Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Topology Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TEMPLATE_MODEL_OPERATION_COUNT = SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Version Model</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.VersionModel
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getVersionModel()
	 * @generated
	 */
	int VERSION_MODEL = 31;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 32;

//	/**
//	 * The meta object id for the '<em>Map</em>' data type.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see java.util.Map
//	 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getMap()
//	 * @generated
//	 */
//	int MAP = 33;


	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel <em>Artifact Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel
	 * @generated
	 */
	EClass getArtifactDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getType()
	 * @see #getArtifactDefinitionModel()
	 * @generated
	 */
	EAttribute getArtifactDefinitionModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getFile()
	 * @see #getArtifactDefinitionModel()
	 * @generated
	 */
	EAttribute getArtifactDefinitionModel_File();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getRepository()
	 * @see #getArtifactDefinitionModel()
	 * @generated
	 */
	EAttribute getArtifactDefinitionModel_Repository();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDescription()
	 * @see #getArtifactDefinitionModel()
	 * @generated
	 */
	EAttribute getArtifactDefinitionModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDeploy_path <em>Deploy path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy path</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDeploy_path()
	 * @see #getArtifactDefinitionModel()
	 * @generated
	 */
	EAttribute getArtifactDefinitionModel_Deploy_path();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel <em>Artifact Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Type Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel
	 * @generated
	 */
	EClass getArtifactTypeModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getTypeName()
	 * @see #getArtifactTypeModel()
	 * @generated
	 */
	EAttribute getArtifactTypeModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getDerivedFrom()
	 * @see #getArtifactTypeModel()
	 * @generated
	 */
	EAttribute getArtifactTypeModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getVersion()
	 * @see #getArtifactTypeModel()
	 * @generated
	 */
	EAttribute getArtifactTypeModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getDescription()
	 * @see #getArtifactTypeModel()
	 * @generated
	 */
	EAttribute getArtifactTypeModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getMime_type <em>Mime type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getMime_type()
	 * @see #getArtifactTypeModel()
	 * @generated
	 */
	EAttribute getArtifactTypeModel_Mime_type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getFile_ext <em>File ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File ext</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getFile_ext()
	 * @see #getArtifactTypeModel()
	 * @generated
	 */
	EAttribute getArtifactTypeModel_File_ext();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel#getProperties()
	 * @see #getArtifactTypeModel()
	 * @generated
	 */
	EReference getArtifactTypeModel_Properties();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel <em>Attribute Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel
	 * @generated
	 */
	EClass getAttributeAssignmentModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getName()
	 * @see #getAttributeAssignmentModel()
	 * @generated
	 */
	EAttribute getAttributeAssignmentModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getDescription()
	 * @see #getAttributeAssignmentModel()
	 * @generated
	 */
	EAttribute getAttributeAssignmentModel_Description();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel#getValue()
	 * @see #getAttributeAssignmentModel()
	 * @generated
	 */
	EReference getAttributeAssignmentModel_Value();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel <em>Attribute Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel
	 * @generated
	 */
	EClass getAttributeDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getName()
	 * @see #getAttributeDefinitionModel()
	 * @generated
	 */
	EAttribute getAttributeDefinitionModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getType()
	 * @see #getAttributeDefinitionModel()
	 * @generated
	 */
	EAttribute getAttributeDefinitionModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getDescription()
	 * @see #getAttributeDefinitionModel()
	 * @generated
	 */
	EAttribute getAttributeDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getDataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getDataValue()
	 * @see #getAttributeDefinitionModel()
	 * @generated
	 */
	EReference getAttributeDefinitionModel_DataValue();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel#getStatus()
	 * @see #getAttributeDefinitionModel()
	 * @generated
	 */
	EAttribute getAttributeDefinitionModel_Status();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel <em>Capability Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Assignment Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel
	 * @generated
	 */
	EClass getCapabilityAssignmentModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel#getName()
	 * @see #getCapabilityAssignmentModel()
	 * @generated
	 */
	EAttribute getCapabilityAssignmentModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel#getProperties()
	 * @see #getCapabilityAssignmentModel()
	 * @generated
	 */
	EReference getCapabilityAssignmentModel_Properties();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel#getAttributes()
	 * @see #getCapabilityAssignmentModel()
	 * @generated
	 */
	EReference getCapabilityAssignmentModel_Attributes();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel <em>Capability Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel
	 * @generated
	 */
	EClass getCapabilityDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getTypeName()
	 * @see #getCapabilityDefinitionModel()
	 * @generated
	 */
	EAttribute getCapabilityDefinitionModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getDerivedFrom()
	 * @see #getCapabilityDefinitionModel()
	 * @generated
	 */
	EAttribute getCapabilityDefinitionModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getVersion()
	 * @see #getCapabilityDefinitionModel()
	 * @generated
	 */
	EAttribute getCapabilityDefinitionModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getDescription()
	 * @see #getCapabilityDefinitionModel()
	 * @generated
	 */
	EAttribute getCapabilityDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getProperties()
	 * @see #getCapabilityDefinitionModel()
	 * @generated
	 */
	EReference getCapabilityDefinitionModel_Properties();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getAttributes()
	 * @see #getCapabilityDefinitionModel()
	 * @generated
	 */
	EReference getCapabilityDefinitionModel_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getValidSources <em>Valid Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Sources</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel#getValidSources()
	 * @see #getCapabilityDefinitionModel()
	 * @generated
	 */
	EAttribute getCapabilityDefinitionModel_ValidSources();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel <em>Constraint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel
	 * @generated
	 */
	EClass getConstraintModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel#getName()
	 * @see #getConstraintModel()
	 * @generated
	 */
	EAttribute getConstraintModel_Name();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel#getValue()
	 * @see #getConstraintModel()
	 * @generated
	 */
	EReference getConstraintModel_Value();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.DataModel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DataModel#getValue()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_Value();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel <em>Datatype Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel
	 * @generated
	 */
	EClass getDatatypeDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getTypeName()
	 * @see #getDatatypeDefinitionModel()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getDerivedFrom()
	 * @see #getDatatypeDefinitionModel()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getVersion()
	 * @see #getDatatypeDefinitionModel()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getDescription()
	 * @see #getDatatypeDefinitionModel()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getConstraints()
	 * @see #getDatatypeDefinitionModel()
	 * @generated
	 */
	EReference getDatatypeDefinitionModel_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel#getProperties()
	 * @see #getDatatypeDefinitionModel()
	 * @generated
	 */
	EReference getDatatypeDefinitionModel_Properties();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.FunctionModel <em>Function Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.FunctionModel
	 * @generated
	 */
	EClass getFunctionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.FunctionModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.FunctionModel#getTypeName()
	 * @see #getFunctionModel()
	 * @generated
	 */
	EAttribute getFunctionModel_TypeName();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.FunctionModel#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.FunctionModel#getParameters()
	 * @see #getFunctionModel()
	 * @generated
	 */
	EReference getFunctionModel_Parameters();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel <em>Group Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel
	 * @generated
	 */
	EClass getGroupDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getName()
	 * @see #getGroupDefinitionModel()
	 * @generated
	 */
	EAttribute getGroupDefinitionModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getType()
	 * @see #getGroupDefinitionModel()
	 * @generated
	 */
	EAttribute getGroupDefinitionModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getDescription()
	 * @see #getGroupDefinitionModel()
	 * @generated
	 */
	EAttribute getGroupDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getProperties()
	 * @see #getGroupDefinitionModel()
	 * @generated
	 */
	EReference getGroupDefinitionModel_Properties();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getMembers()
	 * @see #getGroupDefinitionModel()
	 * @generated
	 */
	EReference getGroupDefinitionModel_Members();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel#getInterfaces()
	 * @see #getGroupDefinitionModel()
	 * @generated
	 */
	EReference getGroupDefinitionModel_Interfaces();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel <em>Group Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel
	 * @generated
	 */
	EClass getGroupTypeModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getTypeName()
	 * @see #getGroupTypeModel()
	 * @generated
	 */
	EAttribute getGroupTypeModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getDerivedFrom()
	 * @see #getGroupTypeModel()
	 * @generated
	 */
	EAttribute getGroupTypeModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getVersion()
	 * @see #getGroupTypeModel()
	 * @generated
	 */
	EAttribute getGroupTypeModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getDescription()
	 * @see #getGroupTypeModel()
	 * @generated
	 */
	EAttribute getGroupTypeModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getProperties()
	 * @see #getGroupTypeModel()
	 * @generated
	 */
	EReference getGroupTypeModel_Properties();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Members</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getMembers()
	 * @see #getGroupTypeModel()
	 * @generated
	 */
	EAttribute getGroupTypeModel_Members();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel#getInterfaces()
	 * @see #getGroupTypeModel()
	 * @generated
	 */
	EReference getGroupTypeModel_Interfaces();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel <em>Import Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel
	 * @generated
	 */
	EClass getImportDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getFile()
	 * @see #getImportDefinitionModel()
	 * @generated
	 */
	EAttribute getImportDefinitionModel_File();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getRepository()
	 * @see #getImportDefinitionModel()
	 * @generated
	 */
	EAttribute getImportDefinitionModel_Repository();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getNamespaceUri <em>Namespace Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Uri</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getNamespaceUri()
	 * @see #getImportDefinitionModel()
	 * @generated
	 */
	EAttribute getImportDefinitionModel_NamespaceUri();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel#getNamespacePrefix()
	 * @see #getImportDefinitionModel()
	 * @generated
	 */
	EAttribute getImportDefinitionModel_NamespacePrefix();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel <em>Interface Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel
	 * @generated
	 */
	EClass getInterfaceDefinitionModel();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel#getInputs()
	 * @see #getInterfaceDefinitionModel()
	 * @generated
	 */
	EReference getInterfaceDefinitionModel_Inputs();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel <em>Interface Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel
	 * @generated
	 */
	EClass getInterfaceTypeModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getTypeName()
	 * @see #getInterfaceTypeModel()
	 * @generated
	 */
	EAttribute getInterfaceTypeModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getDerivedFrom()
	 * @see #getInterfaceTypeModel()
	 * @generated
	 */
	EAttribute getInterfaceTypeModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getVersion()
	 * @see #getInterfaceTypeModel()
	 * @generated
	 */
	EAttribute getInterfaceTypeModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getDescription()
	 * @see #getInterfaceTypeModel()
	 * @generated
	 */
	EAttribute getInterfaceTypeModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getInputs()
	 * @see #getInterfaceTypeModel()
	 * @generated
	 */
	EReference getInterfaceTypeModel_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel#getOperations()
	 * @see #getInterfaceTypeModel()
	 * @generated
	 */
	EReference getInterfaceTypeModel_Operations();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel <em>Node Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel
	 * @generated
	 */
	EClass getNodeDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getTypeName()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EAttribute getNodeDefinitionModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getDerivedFrom()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EAttribute getNodeDefinitionModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getVersion()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EAttribute getNodeDefinitionModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getDescription()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EAttribute getNodeDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getProperties()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EReference getNodeDefinitionModel_Properties();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getAttributes()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EReference getNodeDefinitionModel_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getRequirements()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EReference getNodeDefinitionModel_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getCapabilities()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EReference getNodeDefinitionModel_Capabilities();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getInterfaces()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EReference getNodeDefinitionModel_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifacts</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel#getArtifacts()
	 * @see #getNodeDefinitionModel()
	 * @generated
	 */
	EReference getNodeDefinitionModel_Artifacts();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel <em>Node Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Template Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel
	 * @generated
	 */
	EClass getNodeTemplateModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getName()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EAttribute getNodeTemplateModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getType()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EAttribute getNodeTemplateModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directives</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getDirectives()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EAttribute getNodeTemplateModel_Directives();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getDescription()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EAttribute getNodeTemplateModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getProperties()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EReference getNodeTemplateModel_Properties();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getAttributes()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EReference getNodeTemplateModel_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getRequirements()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EReference getNodeTemplateModel_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getCapabilities()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EReference getNodeTemplateModel_Capabilities();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getInterfaces()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EReference getNodeTemplateModel_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifacts</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel#getArtifacts()
	 * @see #getNodeTemplateModel()
	 * @generated
	 */
	EReference getNodeTemplateModel_Artifacts();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel <em>Operation Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel
	 * @generated
	 */
	EClass getOperationDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getDescription()
	 * @see #getOperationDefinitionModel()
	 * @generated
	 */
	EAttribute getOperationDefinitionModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getImplementation()
	 * @see #getOperationDefinitionModel()
	 * @generated
	 */
	EAttribute getOperationDefinitionModel_Implementation();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getInputs_definitions <em>Inputs definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs definitions</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getInputs_definitions()
	 * @see #getOperationDefinitionModel()
	 * @generated
	 */
	EReference getOperationDefinitionModel_Inputs_definitions();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getInputs_assignments <em>Inputs assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs assignments</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel#getInputs_assignments()
	 * @see #getOperationDefinitionModel()
	 * @generated
	 */
	EReference getOperationDefinitionModel_Inputs_assignments();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel <em>Parameter Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel
	 * @generated
	 */
	EClass getParameterDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getName()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EAttribute getParameterDefinitionModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getType()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EAttribute getParameterDefinitionModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getDescription()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EAttribute getParameterDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getDataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getDataValue()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EReference getParameterDefinitionModel_DataValue();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getValue()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EReference getParameterDefinitionModel_Value();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getStatus()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EAttribute getParameterDefinitionModel_Status();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getConstraint()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EReference getParameterDefinitionModel_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getEntrySchema <em>Entry Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Schema</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getEntrySchema()
	 * @see #getParameterDefinitionModel()
	 * @generated
	 */
	EAttribute getParameterDefinitionModel_EntrySchema();

	/**
	 * Returns the meta object for the '{@link kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getRequired() <em>Get Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Required</em>' operation.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel#getRequired()
	 * @generated
	 */
	EOperation getParameterDefinitionModel__GetRequired();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel <em>Policy Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel
	 * @generated
	 */
	EClass getPolicyDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getName()
	 * @see #getPolicyDefinitionModel()
	 * @generated
	 */
	EAttribute getPolicyDefinitionModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getType()
	 * @see #getPolicyDefinitionModel()
	 * @generated
	 */
	EAttribute getPolicyDefinitionModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getDescription()
	 * @see #getPolicyDefinitionModel()
	 * @generated
	 */
	EAttribute getPolicyDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getProperties()
	 * @see #getPolicyDefinitionModel()
	 * @generated
	 */
	EReference getPolicyDefinitionModel_Properties();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targets</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel#getTargets()
	 * @see #getPolicyDefinitionModel()
	 * @generated
	 */
	EAttribute getPolicyDefinitionModel_Targets();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel <em>Policy Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Type Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel
	 * @generated
	 */
	EClass getPolicyTypeModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getTypeName()
	 * @see #getPolicyTypeModel()
	 * @generated
	 */
	EAttribute getPolicyTypeModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getDerivedFrom()
	 * @see #getPolicyTypeModel()
	 * @generated
	 */
	EAttribute getPolicyTypeModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getVersion()
	 * @see #getPolicyTypeModel()
	 * @generated
	 */
	EAttribute getPolicyTypeModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getDescription()
	 * @see #getPolicyTypeModel()
	 * @generated
	 */
	EAttribute getPolicyTypeModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getProperties()
	 * @see #getPolicyTypeModel()
	 * @generated
	 */
	EReference getPolicyTypeModel_Properties();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targets</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel#getTargets()
	 * @see #getPolicyTypeModel()
	 * @generated
	 */
	EAttribute getPolicyTypeModel_Targets();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel <em>Property Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Assignment Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel
	 * @generated
	 */
	EClass getPropertyAssignmentModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel#getName()
	 * @see #getPropertyAssignmentModel()
	 * @generated
	 */
	EAttribute getPropertyAssignmentModel_Name();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel#getValue()
	 * @see #getPropertyAssignmentModel()
	 * @generated
	 */
	EReference getPropertyAssignmentModel_Value();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel <em>Property Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel
	 * @generated
	 */
	EClass getPropertyModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getName()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EAttribute getPropertyModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getType()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EAttribute getPropertyModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getDescription()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EAttribute getPropertyModel_Description();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getDataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getDataValue()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EReference getPropertyModel_DataValue();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getStatus()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EAttribute getPropertyModel_Status();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getConstraint()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EReference getPropertyModel_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getEntrySchema <em>Entry Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Schema</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getEntrySchema()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EAttribute getPropertyModel_EntrySchema();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getValue()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EReference getPropertyModel_Value();

	/**
	 * Returns the meta object for the '{@link kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getRequired() <em>Get Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Required</em>' operation.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.PropertyModel#getRequired()
	 * @generated
	 */
	EOperation getPropertyModel__GetRequired();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel <em>Relationship Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel
	 * @generated
	 */
	EClass getRelationshipDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getTypeName()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EAttribute getRelationshipDefinitionModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getDerivedFrom()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EAttribute getRelationshipDefinitionModel_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getVersion()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EAttribute getRelationshipDefinitionModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getDescription()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EAttribute getRelationshipDefinitionModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getProperties()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EReference getRelationshipDefinitionModel_Properties();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getAttributes()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EReference getRelationshipDefinitionModel_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getInterfaces()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EReference getRelationshipDefinitionModel_Interfaces();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getValidTargetTypes <em>Valid Target Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Target Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel#getValidTargetTypes()
	 * @see #getRelationshipDefinitionModel()
	 * @generated
	 */
	EAttribute getRelationshipDefinitionModel_ValidTargetTypes();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel <em>Relationship Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Template Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel
	 * @generated
	 */
	EClass getRelationshipTemplateModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getName()
	 * @see #getRelationshipTemplateModel()
	 * @generated
	 */
	EAttribute getRelationshipTemplateModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getTypeName()
	 * @see #getRelationshipTemplateModel()
	 * @generated
	 */
	EAttribute getRelationshipTemplateModel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getDescription()
	 * @see #getRelationshipTemplateModel()
	 * @generated
	 */
	EAttribute getRelationshipTemplateModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getProperties()
	 * @see #getRelationshipTemplateModel()
	 * @generated
	 */
	EReference getRelationshipTemplateModel_Properties();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getAttributes()
	 * @see #getRelationshipTemplateModel()
	 * @generated
	 */
	EReference getRelationshipTemplateModel_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getInterfaces()
	 * @see #getRelationshipTemplateModel()
	 * @generated
	 */
	EReference getRelationshipTemplateModel_Interfaces();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel#getCopy()
	 * @see #getRelationshipTemplateModel()
	 * @generated
	 */
	EAttribute getRelationshipTemplateModel_Copy();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel <em>Repository Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel
	 * @generated
	 */
	EClass getRepositoryDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getUrl()
	 * @see #getRepositoryDefinitionModel()
	 * @generated
	 */
	EAttribute getRepositoryDefinitionModel_Url();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getDescription()
	 * @see #getRepositoryDefinitionModel()
	 * @generated
	 */
	EAttribute getRepositoryDefinitionModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credential</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel#getCredential()
	 * @see #getRepositoryDefinitionModel()
	 * @generated
	 */
	EAttribute getRepositoryDefinitionModel_Credential();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel <em>Requirement Assignment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Assignment Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel
	 * @generated
	 */
	EClass getRequirementAssignmentModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getCapability()
	 * @see #getRequirementAssignmentModel()
	 * @generated
	 */
	EAttribute getRequirementAssignmentModel_Capability();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getNode()
	 * @see #getRequirementAssignmentModel()
	 * @generated
	 */
	EAttribute getRequirementAssignmentModel_Node();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel#getRelationship()
	 * @see #getRequirementAssignmentModel()
	 * @generated
	 */
	EAttribute getRequirementAssignmentModel_Relationship();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel <em>Requirement Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Definition Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel
	 * @generated
	 */
	EClass getRequirementDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getCapability()
	 * @see #getRequirementDefinitionModel()
	 * @generated
	 */
	EAttribute getRequirementDefinitionModel_Capability();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getNode()
	 * @see #getRequirementDefinitionModel()
	 * @generated
	 */
	EAttribute getRequirementDefinitionModel_Node();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getRelationship_type <em>Relationship type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship type</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getRelationship_type()
	 * @see #getRequirementDefinitionModel()
	 * @generated
	 */
	EAttribute getRequirementDefinitionModel_Relationship_type();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getRelationship_definition <em>Relationship definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship definition</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel#getRelationship_definition()
	 * @see #getRequirementDefinitionModel()
	 * @generated
	 */
	EReference getRequirementDefinitionModel_Relationship_definition();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel <em>Service Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Template Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel
	 * @generated
	 */
	EClass getServiceTemplateModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getVersion()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EAttribute getServiceTemplateModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getMetaData()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EAttribute getServiceTemplateModel_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getDescription()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EAttribute getServiceTemplateModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repositories</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getRepositories()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_Repositories();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getImports()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_Imports();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getArtifactTypes <em>Artifact Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifact Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getArtifactTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_ArtifactTypes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getDataTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_DataTypes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getCapabilityTypes <em>Capability Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capability Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getCapabilityTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_CapabilityTypes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getInterfaceTypes <em>Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getInterfaceTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_InterfaceTypes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getRelationshipTypes <em>Relationship Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getRelationshipTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_RelationshipTypes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getNodeTypes <em>Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getNodeTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_NodeTypes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getGroupTypes <em>Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getGroupTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_GroupTypes();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getPolicyTypes <em>Policy Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Policy Types</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getPolicyTypes()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_PolicyTypes();

	/**
	 * Returns the meta object for the reference '{@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getTopologyTemplate <em>Topology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology Template</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel#getTopologyTemplate()
	 * @see #getServiceTemplateModel()
	 * @generated
	 */
	EReference getServiceTemplateModel_TopologyTemplate();

	/**
	 * Returns the meta object for class '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel <em>Topology Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Template Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel
	 * @generated
	 */
	EClass getTopologyTemplateModel();

	/**
	 * Returns the meta object for the attribute '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getDescription()
	 * @see #getTopologyTemplateModel()
	 * @generated
	 */
	EAttribute getTopologyTemplateModel_Description();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getInputs()
	 * @see #getTopologyTemplateModel()
	 * @generated
	 */
	EReference getTopologyTemplateModel_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getNodeTemplates <em>Node Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Templates</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getNodeTemplates()
	 * @see #getTopologyTemplateModel()
	 * @generated
	 */
	EReference getTopologyTemplateModel_NodeTemplates();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getRelationshipTemplates <em>Relationship Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship Templates</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getRelationshipTemplates()
	 * @see #getTopologyTemplateModel()
	 * @generated
	 */
	EReference getTopologyTemplateModel_RelationshipTemplates();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getGroups()
	 * @see #getTopologyTemplateModel()
	 * @generated
	 */
	EReference getTopologyTemplateModel_Groups();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Policies</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getPolicies()
	 * @see #getTopologyTemplateModel()
	 * @generated
	 */
	EReference getTopologyTemplateModel_Policies();

	/**
	 * Returns the meta object for the reference list '{@link kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel#getOutputs()
	 * @see #getTopologyTemplateModel()
	 * @generated
	 */
	EReference getTopologyTemplateModel_Outputs();

	/**
	 * Returns the meta object for class '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the meta object for data type '{@link kr.ac.hanyang.tosca2camp.rest.model.VersionModel <em>Version Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Model</em>'.
	 * @see kr.ac.hanyang.tosca2camp.rest.model.VersionModel
	 * @model instanceClass="kr.ac.hanyang.tosca2camp.rest.model.VersionModel"
	 * @generated
	 */
	EDataType getVersionModel();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getStringArray();

//	/**
//	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @return the meta object for data type '<em>Map</em>'.
//	 * @see java.util.Map
//	 * @model instanceClass="java.util.Map" typeParameters="T T1"
//	 * @generated
//	 */
//	EDataType getMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactDefinitionModelImpl <em>Artifact Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getArtifactDefinitionModel()
		 * @generated
		 */
		EClass ARTIFACT_DEFINITION_MODEL = eINSTANCE.getArtifactDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DEFINITION_MODEL__TYPE = eINSTANCE.getArtifactDefinitionModel_Type();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DEFINITION_MODEL__FILE = eINSTANCE.getArtifactDefinitionModel_File();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DEFINITION_MODEL__REPOSITORY = eINSTANCE.getArtifactDefinitionModel_Repository();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getArtifactDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Deploy path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DEFINITION_MODEL__DEPLOY_PATH = eINSTANCE.getArtifactDefinitionModel_Deploy_path();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactTypeModelImpl <em>Artifact Type Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ArtifactTypeModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getArtifactTypeModel()
		 * @generated
		 */
		EClass ARTIFACT_TYPE_MODEL = eINSTANCE.getArtifactTypeModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE_MODEL__TYPE_NAME = eINSTANCE.getArtifactTypeModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE_MODEL__DERIVED_FROM = eINSTANCE.getArtifactTypeModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE_MODEL__VERSION = eINSTANCE.getArtifactTypeModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE_MODEL__DESCRIPTION = eINSTANCE.getArtifactTypeModel_Description();

		/**
		 * The meta object literal for the '<em><b>Mime type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE_MODEL__MIME_TYPE = eINSTANCE.getArtifactTypeModel_Mime_type();

		/**
		 * The meta object literal for the '<em><b>File ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE_MODEL__FILE_EXT = eINSTANCE.getArtifactTypeModel_File_ext();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_TYPE_MODEL__PROPERTIES = eINSTANCE.getArtifactTypeModel_Properties();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeAssignmentModelImpl <em>Attribute Assignment Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeAssignmentModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getAttributeAssignmentModel()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT_MODEL = eINSTANCE.getAttributeAssignmentModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ASSIGNMENT_MODEL__NAME = eINSTANCE.getAttributeAssignmentModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ASSIGNMENT_MODEL__DESCRIPTION = eINSTANCE.getAttributeAssignmentModel_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT_MODEL__VALUE = eINSTANCE.getAttributeAssignmentModel_Value();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl <em>Attribute Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.AttributeDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getAttributeDefinitionModel()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_MODEL = eINSTANCE.getAttributeDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_MODEL__NAME = eINSTANCE.getAttributeDefinitionModel_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_MODEL__TYPE = eINSTANCE.getAttributeDefinitionModel_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getAttributeDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Data Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE = eINSTANCE.getAttributeDefinitionModel_DataValue();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_MODEL__STATUS = eINSTANCE.getAttributeDefinitionModel_Status();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityAssignmentModelImpl <em>Capability Assignment Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityAssignmentModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getCapabilityAssignmentModel()
		 * @generated
		 */
		EClass CAPABILITY_ASSIGNMENT_MODEL = eINSTANCE.getCapabilityAssignmentModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_ASSIGNMENT_MODEL__NAME = eINSTANCE.getCapabilityAssignmentModel_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_ASSIGNMENT_MODEL__PROPERTIES = eINSTANCE.getCapabilityAssignmentModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_ASSIGNMENT_MODEL__ATTRIBUTES = eINSTANCE.getCapabilityAssignmentModel_Attributes();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl <em>Capability Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.CapabilityDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getCapabilityDefinitionModel()
		 * @generated
		 */
		EClass CAPABILITY_DEFINITION_MODEL = eINSTANCE.getCapabilityDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEFINITION_MODEL__TYPE_NAME = eINSTANCE.getCapabilityDefinitionModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEFINITION_MODEL__DERIVED_FROM = eINSTANCE.getCapabilityDefinitionModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEFINITION_MODEL__VERSION = eINSTANCE.getCapabilityDefinitionModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getCapabilityDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DEFINITION_MODEL__PROPERTIES = eINSTANCE.getCapabilityDefinitionModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DEFINITION_MODEL__ATTRIBUTES = eINSTANCE.getCapabilityDefinitionModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>Valid Sources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEFINITION_MODEL__VALID_SOURCES = eINSTANCE.getCapabilityDefinitionModel_ValidSources();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ConstraintModelImpl <em>Constraint Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ConstraintModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getConstraintModel()
		 * @generated
		 */
		EClass CONSTRAINT_MODEL = eINSTANCE.getConstraintModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_MODEL__NAME = eINSTANCE.getConstraintModel_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_MODEL__VALUE = eINSTANCE.getConstraintModel_Value();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.DataModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__VALUE = eINSTANCE.getDataModel_Value();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.DatatypeDefinitionModelImpl <em>Datatype Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.DatatypeDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getDatatypeDefinitionModel()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_MODEL = eINSTANCE.getDatatypeDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_MODEL__TYPE_NAME = eINSTANCE.getDatatypeDefinitionModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_MODEL__DERIVED_FROM = eINSTANCE.getDatatypeDefinitionModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_MODEL__VERSION = eINSTANCE.getDatatypeDefinitionModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getDatatypeDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION_MODEL__CONSTRAINTS = eINSTANCE.getDatatypeDefinitionModel_Constraints();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION_MODEL__PROPERTIES = eINSTANCE.getDatatypeDefinitionModel_Properties();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.FunctionModelImpl <em>Function Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.FunctionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getFunctionModel()
		 * @generated
		 */
		EClass FUNCTION_MODEL = eINSTANCE.getFunctionModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MODEL__TYPE_NAME = eINSTANCE.getFunctionModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_MODEL__PARAMETERS = eINSTANCE.getFunctionModel_Parameters();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupDefinitionModelImpl <em>Group Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.GroupDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getGroupDefinitionModel()
		 * @generated
		 */
		EClass GROUP_DEFINITION_MODEL = eINSTANCE.getGroupDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_DEFINITION_MODEL__NAME = eINSTANCE.getGroupDefinitionModel_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_DEFINITION_MODEL__TYPE = eINSTANCE.getGroupDefinitionModel_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getGroupDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_DEFINITION_MODEL__PROPERTIES = eINSTANCE.getGroupDefinitionModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_DEFINITION_MODEL__MEMBERS = eINSTANCE.getGroupDefinitionModel_Members();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_DEFINITION_MODEL__INTERFACES = eINSTANCE.getGroupDefinitionModel_Interfaces();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl <em>Group Type Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.GroupTypeModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getGroupTypeModel()
		 * @generated
		 */
		EClass GROUP_TYPE_MODEL = eINSTANCE.getGroupTypeModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE_MODEL__TYPE_NAME = eINSTANCE.getGroupTypeModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE_MODEL__DERIVED_FROM = eINSTANCE.getGroupTypeModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE_MODEL__VERSION = eINSTANCE.getGroupTypeModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE_MODEL__DESCRIPTION = eINSTANCE.getGroupTypeModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE_MODEL__PROPERTIES = eINSTANCE.getGroupTypeModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE_MODEL__MEMBERS = eINSTANCE.getGroupTypeModel_Members();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE_MODEL__INTERFACES = eINSTANCE.getGroupTypeModel_Interfaces();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl <em>Import Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getImportDefinitionModel()
		 * @generated
		 */
		EClass IMPORT_DEFINITION_MODEL = eINSTANCE.getImportDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DEFINITION_MODEL__FILE = eINSTANCE.getImportDefinitionModel_File();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DEFINITION_MODEL__REPOSITORY = eINSTANCE.getImportDefinitionModel_Repository();

		/**
		 * The meta object literal for the '<em><b>Namespace Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DEFINITION_MODEL__NAMESPACE_URI = eINSTANCE.getImportDefinitionModel_NamespaceUri();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX = eINSTANCE.getImportDefinitionModel_NamespacePrefix();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceDefinitionModelImpl <em>Interface Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getInterfaceDefinitionModel()
		 * @generated
		 */
		EClass INTERFACE_DEFINITION_MODEL = eINSTANCE.getInterfaceDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DEFINITION_MODEL__INPUTS = eINSTANCE.getInterfaceDefinitionModel_Inputs();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceTypeModelImpl <em>Interface Type Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.InterfaceTypeModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getInterfaceTypeModel()
		 * @generated
		 */
		EClass INTERFACE_TYPE_MODEL = eINSTANCE.getInterfaceTypeModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TYPE_MODEL__TYPE_NAME = eINSTANCE.getInterfaceTypeModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TYPE_MODEL__DERIVED_FROM = eINSTANCE.getInterfaceTypeModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TYPE_MODEL__VERSION = eINSTANCE.getInterfaceTypeModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TYPE_MODEL__DESCRIPTION = eINSTANCE.getInterfaceTypeModel_Description();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE_MODEL__INPUTS = eINSTANCE.getInterfaceTypeModel_Inputs();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE_MODEL__OPERATIONS = eINSTANCE.getInterfaceTypeModel_Operations();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl <em>Node Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.NodeDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getNodeDefinitionModel()
		 * @generated
		 */
		EClass NODE_DEFINITION_MODEL = eINSTANCE.getNodeDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEFINITION_MODEL__TYPE_NAME = eINSTANCE.getNodeDefinitionModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEFINITION_MODEL__DERIVED_FROM = eINSTANCE.getNodeDefinitionModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEFINITION_MODEL__VERSION = eINSTANCE.getNodeDefinitionModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getNodeDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION_MODEL__PROPERTIES = eINSTANCE.getNodeDefinitionModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION_MODEL__ATTRIBUTES = eINSTANCE.getNodeDefinitionModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION_MODEL__REQUIREMENTS = eINSTANCE.getNodeDefinitionModel_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION_MODEL__CAPABILITIES = eINSTANCE.getNodeDefinitionModel_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION_MODEL__INTERFACES = eINSTANCE.getNodeDefinitionModel_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION_MODEL__ARTIFACTS = eINSTANCE.getNodeDefinitionModel_Artifacts();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl <em>Node Template Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.NodeTemplateModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getNodeTemplateModel()
		 * @generated
		 */
		EClass NODE_TEMPLATE_MODEL = eINSTANCE.getNodeTemplateModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TEMPLATE_MODEL__NAME = eINSTANCE.getNodeTemplateModel_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TEMPLATE_MODEL__TYPE = eINSTANCE.getNodeTemplateModel_Type();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TEMPLATE_MODEL__DIRECTIVES = eINSTANCE.getNodeTemplateModel_Directives();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TEMPLATE_MODEL__DESCRIPTION = eINSTANCE.getNodeTemplateModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TEMPLATE_MODEL__PROPERTIES = eINSTANCE.getNodeTemplateModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TEMPLATE_MODEL__ATTRIBUTES = eINSTANCE.getNodeTemplateModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TEMPLATE_MODEL__REQUIREMENTS = eINSTANCE.getNodeTemplateModel_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TEMPLATE_MODEL__CAPABILITIES = eINSTANCE.getNodeTemplateModel_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TEMPLATE_MODEL__INTERFACES = eINSTANCE.getNodeTemplateModel_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TEMPLATE_MODEL__ARTIFACTS = eINSTANCE.getNodeTemplateModel_Artifacts();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl <em>Operation Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.OperationDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getOperationDefinitionModel()
		 * @generated
		 */
		EClass OPERATION_DEFINITION_MODEL = eINSTANCE.getOperationDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getOperationDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEFINITION_MODEL__IMPLEMENTATION = eINSTANCE.getOperationDefinitionModel_Implementation();

		/**
		 * The meta object literal for the '<em><b>Inputs definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS = eINSTANCE.getOperationDefinitionModel_Inputs_definitions();

		/**
		 * The meta object literal for the '<em><b>Inputs assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS = eINSTANCE.getOperationDefinitionModel_Inputs_assignments();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl <em>Parameter Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ParameterDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getParameterDefinitionModel()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION_MODEL = eINSTANCE.getParameterDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION_MODEL__NAME = eINSTANCE.getParameterDefinitionModel_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION_MODEL__TYPE = eINSTANCE.getParameterDefinitionModel_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getParameterDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Data Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION_MODEL__DATA_VALUE = eINSTANCE.getParameterDefinitionModel_DataValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION_MODEL__VALUE = eINSTANCE.getParameterDefinitionModel_Value();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION_MODEL__STATUS = eINSTANCE.getParameterDefinitionModel_Status();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION_MODEL__CONSTRAINT = eINSTANCE.getParameterDefinitionModel_Constraint();

		/**
		 * The meta object literal for the '<em><b>Entry Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA = eINSTANCE.getParameterDefinitionModel_EntrySchema();

		/**
		 * The meta object literal for the '<em><b>Get Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_DEFINITION_MODEL___GET_REQUIRED = eINSTANCE.getParameterDefinitionModel__GetRequired();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyDefinitionModelImpl <em>Policy Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPolicyDefinitionModel()
		 * @generated
		 */
		EClass POLICY_DEFINITION_MODEL = eINSTANCE.getPolicyDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DEFINITION_MODEL__NAME = eINSTANCE.getPolicyDefinitionModel_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DEFINITION_MODEL__TYPE = eINSTANCE.getPolicyDefinitionModel_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getPolicyDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_DEFINITION_MODEL__PROPERTIES = eINSTANCE.getPolicyDefinitionModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DEFINITION_MODEL__TARGETS = eINSTANCE.getPolicyDefinitionModel_Targets();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl <em>Policy Type Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PolicyTypeModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPolicyTypeModel()
		 * @generated
		 */
		EClass POLICY_TYPE_MODEL = eINSTANCE.getPolicyTypeModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE_MODEL__TYPE_NAME = eINSTANCE.getPolicyTypeModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE_MODEL__DERIVED_FROM = eINSTANCE.getPolicyTypeModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE_MODEL__VERSION = eINSTANCE.getPolicyTypeModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE_MODEL__DESCRIPTION = eINSTANCE.getPolicyTypeModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_TYPE_MODEL__PROPERTIES = eINSTANCE.getPolicyTypeModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_TYPE_MODEL__TARGETS = eINSTANCE.getPolicyTypeModel_Targets();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyAssignmentModelImpl <em>Property Assignment Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyAssignmentModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPropertyAssignmentModel()
		 * @generated
		 */
		EClass PROPERTY_ASSIGNMENT_MODEL = eINSTANCE.getPropertyAssignmentModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ASSIGNMENT_MODEL__NAME = eINSTANCE.getPropertyAssignmentModel_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGNMENT_MODEL__VALUE = eINSTANCE.getPropertyAssignmentModel_Value();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyModelImpl <em>Property Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.PropertyModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getPropertyModel()
		 * @generated
		 */
		EClass PROPERTY_MODEL = eINSTANCE.getPropertyModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MODEL__NAME = eINSTANCE.getPropertyModel_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MODEL__TYPE = eINSTANCE.getPropertyModel_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MODEL__DESCRIPTION = eINSTANCE.getPropertyModel_Description();

		/**
		 * The meta object literal for the '<em><b>Data Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MODEL__DATA_VALUE = eINSTANCE.getPropertyModel_DataValue();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MODEL__STATUS = eINSTANCE.getPropertyModel_Status();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MODEL__CONSTRAINT = eINSTANCE.getPropertyModel_Constraint();

		/**
		 * The meta object literal for the '<em><b>Entry Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MODEL__ENTRY_SCHEMA = eINSTANCE.getPropertyModel_EntrySchema();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MODEL__VALUE = eINSTANCE.getPropertyModel_Value();

		/**
		 * The meta object literal for the '<em><b>Get Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_MODEL___GET_REQUIRED = eINSTANCE.getPropertyModel__GetRequired();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipDefinitionModelImpl <em>Relationship Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRelationshipDefinitionModel()
		 * @generated
		 */
		EClass RELATIONSHIP_DEFINITION_MODEL = eINSTANCE.getRelationshipDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_DEFINITION_MODEL__TYPE_NAME = eINSTANCE.getRelationshipDefinitionModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_DEFINITION_MODEL__DERIVED_FROM = eINSTANCE.getRelationshipDefinitionModel_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_DEFINITION_MODEL__VERSION = eINSTANCE.getRelationshipDefinitionModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getRelationshipDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_DEFINITION_MODEL__PROPERTIES = eINSTANCE.getRelationshipDefinitionModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_DEFINITION_MODEL__ATTRIBUTES = eINSTANCE.getRelationshipDefinitionModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_DEFINITION_MODEL__INTERFACES = eINSTANCE.getRelationshipDefinitionModel_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Valid Target Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_DEFINITION_MODEL__VALID_TARGET_TYPES = eINSTANCE.getRelationshipDefinitionModel_ValidTargetTypes();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipTemplateModelImpl <em>Relationship Template Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RelationshipTemplateModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRelationshipTemplateModel()
		 * @generated
		 */
		EClass RELATIONSHIP_TEMPLATE_MODEL = eINSTANCE.getRelationshipTemplateModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TEMPLATE_MODEL__NAME = eINSTANCE.getRelationshipTemplateModel_Name();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TEMPLATE_MODEL__TYPE_NAME = eINSTANCE.getRelationshipTemplateModel_TypeName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TEMPLATE_MODEL__DESCRIPTION = eINSTANCE.getRelationshipTemplateModel_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TEMPLATE_MODEL__PROPERTIES = eINSTANCE.getRelationshipTemplateModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TEMPLATE_MODEL__ATTRIBUTES = eINSTANCE.getRelationshipTemplateModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TEMPLATE_MODEL__INTERFACES = eINSTANCE.getRelationshipTemplateModel_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TEMPLATE_MODEL__COPY = eINSTANCE.getRelationshipTemplateModel_Copy();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RepositoryDefinitionModelImpl <em>Repository Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RepositoryDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRepositoryDefinitionModel()
		 * @generated
		 */
		EClass REPOSITORY_DEFINITION_MODEL = eINSTANCE.getRepositoryDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEFINITION_MODEL__URL = eINSTANCE.getRepositoryDefinitionModel_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getRepositoryDefinitionModel_Description();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEFINITION_MODEL__CREDENTIAL = eINSTANCE.getRepositoryDefinitionModel_Credential();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementAssignmentModelImpl <em>Requirement Assignment Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementAssignmentModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRequirementAssignmentModel()
		 * @generated
		 */
		EClass REQUIREMENT_ASSIGNMENT_MODEL = eINSTANCE.getRequirementAssignmentModel();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY = eINSTANCE.getRequirementAssignmentModel_Capability();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ASSIGNMENT_MODEL__NODE = eINSTANCE.getRequirementAssignmentModel_Node();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP = eINSTANCE.getRequirementAssignmentModel_Relationship();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl <em>Requirement Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.RequirementDefinitionModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getRequirementDefinitionModel()
		 * @generated
		 */
		EClass REQUIREMENT_DEFINITION_MODEL = eINSTANCE.getRequirementDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DEFINITION_MODEL__CAPABILITY = eINSTANCE.getRequirementDefinitionModel_Capability();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DEFINITION_MODEL__NODE = eINSTANCE.getRequirementDefinitionModel_Node();

		/**
		 * The meta object literal for the '<em><b>Relationship type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE = eINSTANCE.getRequirementDefinitionModel_Relationship_type();

		/**
		 * The meta object literal for the '<em><b>Relationship definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION = eINSTANCE.getRequirementDefinitionModel_Relationship_definition();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl <em>Service Template Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ServiceTemplateModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getServiceTemplateModel()
		 * @generated
		 */
		EClass SERVICE_TEMPLATE_MODEL = eINSTANCE.getServiceTemplateModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE_MODEL__VERSION = eINSTANCE.getServiceTemplateModel_Version();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE_MODEL__META_DATA = eINSTANCE.getServiceTemplateModel_MetaData();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE_MODEL__DESCRIPTION = eINSTANCE.getServiceTemplateModel_Description();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__REPOSITORIES = eINSTANCE.getServiceTemplateModel_Repositories();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__IMPORTS = eINSTANCE.getServiceTemplateModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Artifact Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES = eINSTANCE.getServiceTemplateModel_ArtifactTypes();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__DATA_TYPES = eINSTANCE.getServiceTemplateModel_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Capability Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES = eINSTANCE.getServiceTemplateModel_CapabilityTypes();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES = eINSTANCE.getServiceTemplateModel_InterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Relationship Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES = eINSTANCE.getServiceTemplateModel_RelationshipTypes();

		/**
		 * The meta object literal for the '<em><b>Node Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__NODE_TYPES = eINSTANCE.getServiceTemplateModel_NodeTypes();

		/**
		 * The meta object literal for the '<em><b>Group Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__GROUP_TYPES = eINSTANCE.getServiceTemplateModel_GroupTypes();

		/**
		 * The meta object literal for the '<em><b>Policy Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__POLICY_TYPES = eINSTANCE.getServiceTemplateModel_PolicyTypes();

		/**
		 * The meta object literal for the '<em><b>Topology Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE = eINSTANCE.getServiceTemplateModel_TopologyTemplate();

		/**
		 * The meta object literal for the '{@link kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl <em>Topology Template Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.TopologyTemplateModelImpl
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getTopologyTemplateModel()
		 * @generated
		 */
		EClass TOPOLOGY_TEMPLATE_MODEL = eINSTANCE.getTopologyTemplateModel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION = eINSTANCE.getTopologyTemplateModel_Description();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TEMPLATE_MODEL__INPUTS = eINSTANCE.getTopologyTemplateModel_Inputs();

		/**
		 * The meta object literal for the '<em><b>Node Templates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES = eINSTANCE.getTopologyTemplateModel_NodeTemplates();

		/**
		 * The meta object literal for the '<em><b>Relationship Templates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES = eINSTANCE.getTopologyTemplateModel_RelationshipTemplates();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TEMPLATE_MODEL__GROUPS = eINSTANCE.getTopologyTemplateModel_Groups();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TEMPLATE_MODEL__POLICIES = eINSTANCE.getTopologyTemplateModel_Policies();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TEMPLATE_MODEL__OUTPUTS = eINSTANCE.getTopologyTemplateModel_Outputs();

		/**
		 * The meta object literal for the '{@link java.io.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '<em>Version Model</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.VersionModel
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getVersionModel()
		 * @generated
		 */
		EDataType VERSION_MODEL = eINSTANCE.getVersionModel();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

//		/**
//		 * The meta object literal for the '<em>Map</em>' data type.
//		 * <!-- begin-user-doc -->
//		 * <!-- end-user-doc -->
//		 * @see java.util.Map
//		 * @see kr.ac.hanyang.tosca2camp.rest.model.impl.ModelPackageImpl#getMap()
//		 * @generated
//		 */
//		EDataType MAP = eINSTANCE.getMap();

	}

} //ModelPackage
