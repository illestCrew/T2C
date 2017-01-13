/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import java.io.Serializable;

import java.util.Map;

import kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.AttributeAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.AttributeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ConstraintModel;
import kr.ac.hanyang.tosca2camp.rest.model.DataModel;
import kr.ac.hanyang.tosca2camp.rest.model.DatatypeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.FunctionModel;
import kr.ac.hanyang.tosca2camp.rest.model.GroupDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.GroupTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.InterfaceTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelFactory;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.OperationDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ParameterDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.PolicyDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.PolicyTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.PropertyModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RelationshipTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.RepositoryDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.RequirementAssignmentModel;
import kr.ac.hanyang.tosca2camp.rest.model.RequirementDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.TopologyTemplateModel;
import kr.ac.hanyang.tosca2camp.rest.model.VersionModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactTypeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssignmentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityAssignmentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTypeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceTypeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTemplateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyTypeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAssignmentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTemplateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementAssignmentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTemplateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyTemplateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionModelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kr.ac.hanyang.tosca2camp.rest.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactDefinitionModel() {
		return artifactDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDefinitionModel_Type() {
		return (EAttribute)artifactDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDefinitionModel_File() {
		return (EAttribute)artifactDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDefinitionModel_Repository() {
		return (EAttribute)artifactDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDefinitionModel_Description() {
		return (EAttribute)artifactDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDefinitionModel_Deploy_path() {
		return (EAttribute)artifactDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactTypeModel() {
		return artifactTypeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeModel_TypeName() {
		return (EAttribute)artifactTypeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeModel_DerivedFrom() {
		return (EAttribute)artifactTypeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeModel_Version() {
		return (EAttribute)artifactTypeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeModel_Description() {
		return (EAttribute)artifactTypeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeModel_Mime_type() {
		return (EAttribute)artifactTypeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTypeModel_File_ext() {
		return (EAttribute)artifactTypeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactTypeModel_Properties() {
		return (EReference)artifactTypeModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssignmentModel() {
		return attributeAssignmentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeAssignmentModel_Name() {
		return (EAttribute)attributeAssignmentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeAssignmentModel_Description() {
		return (EAttribute)attributeAssignmentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignmentModel_Value() {
		return (EReference)attributeAssignmentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionModel() {
		return attributeDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinitionModel_Name() {
		return (EAttribute)attributeDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinitionModel_Type() {
		return (EAttribute)attributeDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinitionModel_Description() {
		return (EAttribute)attributeDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionModel_DataValue() {
		return (EReference)attributeDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinitionModel_Status() {
		return (EAttribute)attributeDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityAssignmentModel() {
		return capabilityAssignmentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityAssignmentModel_Name() {
		return (EAttribute)capabilityAssignmentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityAssignmentModel_Properties() {
		return (EReference)capabilityAssignmentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityAssignmentModel_Attributes() {
		return (EReference)capabilityAssignmentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityDefinitionModel() {
		return capabilityDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDefinitionModel_TypeName() {
		return (EAttribute)capabilityDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDefinitionModel_DerivedFrom() {
		return (EAttribute)capabilityDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDefinitionModel_Version() {
		return (EAttribute)capabilityDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDefinitionModel_Description() {
		return (EAttribute)capabilityDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinitionModel_Properties() {
		return (EReference)capabilityDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinitionModel_Attributes() {
		return (EReference)capabilityDefinitionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDefinitionModel_ValidSources() {
		return (EAttribute)capabilityDefinitionModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintModel() {
		return constraintModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintModel_Name() {
		return (EAttribute)constraintModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintModel_Value() {
		return (EReference)constraintModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModel() {
		return dataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataModel_Value() {
		return (EAttribute)dataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionModel() {
		return datatypeDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionModel_TypeName() {
		return (EAttribute)datatypeDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionModel_DerivedFrom() {
		return (EAttribute)datatypeDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionModel_Version() {
		return (EAttribute)datatypeDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionModel_Description() {
		return (EAttribute)datatypeDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinitionModel_Constraints() {
		return (EReference)datatypeDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinitionModel_Properties() {
		return (EReference)datatypeDefinitionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionModel() {
		return functionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionModel_TypeName() {
		return (EAttribute)functionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionModel_Parameters() {
		return (EReference)functionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupDefinitionModel() {
		return groupDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupDefinitionModel_Name() {
		return (EAttribute)groupDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupDefinitionModel_Type() {
		return (EAttribute)groupDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupDefinitionModel_Description() {
		return (EAttribute)groupDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupDefinitionModel_Properties() {
		return (EReference)groupDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupDefinitionModel_Members() {
		return (EReference)groupDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupDefinitionModel_Interfaces() {
		return (EReference)groupDefinitionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupTypeModel() {
		return groupTypeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTypeModel_TypeName() {
		return (EAttribute)groupTypeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTypeModel_DerivedFrom() {
		return (EAttribute)groupTypeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTypeModel_Version() {
		return (EAttribute)groupTypeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTypeModel_Description() {
		return (EAttribute)groupTypeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTypeModel_Properties() {
		return (EReference)groupTypeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTypeModel_Members() {
		return (EAttribute)groupTypeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTypeModel_Interfaces() {
		return (EReference)groupTypeModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportDefinitionModel() {
		return importDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportDefinitionModel_File() {
		return (EAttribute)importDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportDefinitionModel_Repository() {
		return (EAttribute)importDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportDefinitionModel_NamespaceUri() {
		return (EAttribute)importDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportDefinitionModel_NamespacePrefix() {
		return (EAttribute)importDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefinitionModel() {
		return interfaceDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDefinitionModel_Inputs() {
		return (EReference)interfaceDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceTypeModel() {
		return interfaceTypeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceTypeModel_TypeName() {
		return (EAttribute)interfaceTypeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceTypeModel_DerivedFrom() {
		return (EAttribute)interfaceTypeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceTypeModel_Version() {
		return (EAttribute)interfaceTypeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceTypeModel_Description() {
		return (EAttribute)interfaceTypeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceTypeModel_Inputs() {
		return (EReference)interfaceTypeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceTypeModel_Operations() {
		return (EReference)interfaceTypeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeDefinitionModel() {
		return nodeDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDefinitionModel_TypeName() {
		return (EAttribute)nodeDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDefinitionModel_DerivedFrom() {
		return (EAttribute)nodeDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDefinitionModel_Version() {
		return (EAttribute)nodeDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDefinitionModel_Description() {
		return (EAttribute)nodeDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDefinitionModel_Properties() {
		return (EReference)nodeDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDefinitionModel_Attributes() {
		return (EReference)nodeDefinitionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDefinitionModel_Requirements() {
		return (EReference)nodeDefinitionModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDefinitionModel_Capabilities() {
		return (EReference)nodeDefinitionModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDefinitionModel_Interfaces() {
		return (EReference)nodeDefinitionModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDefinitionModel_Artifacts() {
		return (EReference)nodeDefinitionModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeTemplateModel() {
		return nodeTemplateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeTemplateModel_Name() {
		return (EAttribute)nodeTemplateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeTemplateModel_Type() {
		return (EAttribute)nodeTemplateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeTemplateModel_Directives() {
		return (EAttribute)nodeTemplateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeTemplateModel_Description() {
		return (EAttribute)nodeTemplateModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTemplateModel_Properties() {
		return (EReference)nodeTemplateModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTemplateModel_Attributes() {
		return (EReference)nodeTemplateModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTemplateModel_Requirements() {
		return (EReference)nodeTemplateModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTemplateModel_Capabilities() {
		return (EReference)nodeTemplateModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTemplateModel_Interfaces() {
		return (EReference)nodeTemplateModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTemplateModel_Artifacts() {
		return (EReference)nodeTemplateModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionModel() {
		return operationDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDefinitionModel_Description() {
		return (EAttribute)operationDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDefinitionModel_Implementation() {
		return (EAttribute)operationDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionModel_Inputs_definitions() {
		return (EReference)operationDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionModel_Inputs_assignments() {
		return (EReference)operationDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDefinitionModel() {
		return parameterDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinitionModel_Name() {
		return (EAttribute)parameterDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinitionModel_Type() {
		return (EAttribute)parameterDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinitionModel_Description() {
		return (EAttribute)parameterDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDefinitionModel_DataValue() {
		return (EReference)parameterDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDefinitionModel_Value() {
		return (EReference)parameterDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinitionModel_Status() {
		return (EAttribute)parameterDefinitionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDefinitionModel_Constraint() {
		return (EReference)parameterDefinitionModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinitionModel_EntrySchema() {
		return (EAttribute)parameterDefinitionModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterDefinitionModel__GetRequired() {
		return parameterDefinitionModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyDefinitionModel() {
		return policyDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyDefinitionModel_Name() {
		return (EAttribute)policyDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyDefinitionModel_Type() {
		return (EAttribute)policyDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyDefinitionModel_Description() {
		return (EAttribute)policyDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyDefinitionModel_Properties() {
		return (EReference)policyDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyDefinitionModel_Targets() {
		return (EAttribute)policyDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyTypeModel() {
		return policyTypeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyTypeModel_TypeName() {
		return (EAttribute)policyTypeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyTypeModel_DerivedFrom() {
		return (EAttribute)policyTypeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyTypeModel_Version() {
		return (EAttribute)policyTypeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyTypeModel_Description() {
		return (EAttribute)policyTypeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyTypeModel_Properties() {
		return (EReference)policyTypeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyTypeModel_Targets() {
		return (EAttribute)policyTypeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAssignmentModel() {
		return propertyAssignmentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAssignmentModel_Name() {
		return (EAttribute)propertyAssignmentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAssignmentModel_Value() {
		return (EReference)propertyAssignmentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyModel() {
		return propertyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyModel_Name() {
		return (EAttribute)propertyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyModel_Type() {
		return (EAttribute)propertyModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyModel_Description() {
		return (EAttribute)propertyModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyModel_DataValue() {
		return (EReference)propertyModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyModel_Status() {
		return (EAttribute)propertyModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyModel_Constraint() {
		return (EReference)propertyModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyModel_EntrySchema() {
		return (EAttribute)propertyModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyModel_Value() {
		return (EReference)propertyModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyModel__GetRequired() {
		return propertyModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipDefinitionModel() {
		return relationshipDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipDefinitionModel_TypeName() {
		return (EAttribute)relationshipDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipDefinitionModel_DerivedFrom() {
		return (EAttribute)relationshipDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipDefinitionModel_Version() {
		return (EAttribute)relationshipDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipDefinitionModel_Description() {
		return (EAttribute)relationshipDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipDefinitionModel_Properties() {
		return (EReference)relationshipDefinitionModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipDefinitionModel_Attributes() {
		return (EReference)relationshipDefinitionModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipDefinitionModel_Interfaces() {
		return (EReference)relationshipDefinitionModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipDefinitionModel_ValidTargetTypes() {
		return (EAttribute)relationshipDefinitionModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipTemplateModel() {
		return relationshipTemplateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipTemplateModel_Name() {
		return (EAttribute)relationshipTemplateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipTemplateModel_TypeName() {
		return (EAttribute)relationshipTemplateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipTemplateModel_Description() {
		return (EAttribute)relationshipTemplateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipTemplateModel_Properties() {
		return (EReference)relationshipTemplateModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipTemplateModel_Attributes() {
		return (EReference)relationshipTemplateModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipTemplateModel_Interfaces() {
		return (EReference)relationshipTemplateModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipTemplateModel_Copy() {
		return (EAttribute)relationshipTemplateModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryDefinitionModel() {
		return repositoryDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDefinitionModel_Url() {
		return (EAttribute)repositoryDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDefinitionModel_Description() {
		return (EAttribute)repositoryDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDefinitionModel_Credential() {
		return (EAttribute)repositoryDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementAssignmentModel() {
		return requirementAssignmentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementAssignmentModel_Capability() {
		return (EAttribute)requirementAssignmentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementAssignmentModel_Node() {
		return (EAttribute)requirementAssignmentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementAssignmentModel_Relationship() {
		return (EAttribute)requirementAssignmentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementDefinitionModel() {
		return requirementDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDefinitionModel_Capability() {
		return (EAttribute)requirementDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDefinitionModel_Node() {
		return (EAttribute)requirementDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDefinitionModel_Relationship_type() {
		return (EAttribute)requirementDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDefinitionModel_Relationship_definition() {
		return (EReference)requirementDefinitionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTemplateModel() {
		return serviceTemplateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceTemplateModel_Version() {
		return (EAttribute)serviceTemplateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceTemplateModel_MetaData() {
		return (EAttribute)serviceTemplateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceTemplateModel_Description() {
		return (EAttribute)serviceTemplateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_Repositories() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_Imports() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_ArtifactTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_DataTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_CapabilityTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_InterfaceTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_RelationshipTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_NodeTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_GroupTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_PolicyTypes() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplateModel_TopologyTemplate() {
		return (EReference)serviceTemplateModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyTemplateModel() {
		return topologyTemplateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologyTemplateModel_Description() {
		return (EAttribute)topologyTemplateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTemplateModel_Inputs() {
		return (EReference)topologyTemplateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTemplateModel_NodeTemplates() {
		return (EReference)topologyTemplateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTemplateModel_RelationshipTemplates() {
		return (EReference)topologyTemplateModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTemplateModel_Groups() {
		return (EReference)topologyTemplateModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTemplateModel_Policies() {
		return (EReference)topologyTemplateModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTemplateModel_Outputs() {
		return (EReference)topologyTemplateModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializable() {
		return serializableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionModel() {
		return versionModelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringArray() {
		return stringArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		artifactDefinitionModelEClass = createEClass(ARTIFACT_DEFINITION_MODEL);
		createEAttribute(artifactDefinitionModelEClass, ARTIFACT_DEFINITION_MODEL__TYPE);
		createEAttribute(artifactDefinitionModelEClass, ARTIFACT_DEFINITION_MODEL__FILE);
		createEAttribute(artifactDefinitionModelEClass, ARTIFACT_DEFINITION_MODEL__REPOSITORY);
		createEAttribute(artifactDefinitionModelEClass, ARTIFACT_DEFINITION_MODEL__DESCRIPTION);
		createEAttribute(artifactDefinitionModelEClass, ARTIFACT_DEFINITION_MODEL__DEPLOY_PATH);

		artifactTypeModelEClass = createEClass(ARTIFACT_TYPE_MODEL);
		createEAttribute(artifactTypeModelEClass, ARTIFACT_TYPE_MODEL__TYPE_NAME);
		createEAttribute(artifactTypeModelEClass, ARTIFACT_TYPE_MODEL__DERIVED_FROM);
		createEAttribute(artifactTypeModelEClass, ARTIFACT_TYPE_MODEL__VERSION);
		createEAttribute(artifactTypeModelEClass, ARTIFACT_TYPE_MODEL__DESCRIPTION);
		createEAttribute(artifactTypeModelEClass, ARTIFACT_TYPE_MODEL__MIME_TYPE);
		createEAttribute(artifactTypeModelEClass, ARTIFACT_TYPE_MODEL__FILE_EXT);
		createEReference(artifactTypeModelEClass, ARTIFACT_TYPE_MODEL__PROPERTIES);

		attributeAssignmentModelEClass = createEClass(ATTRIBUTE_ASSIGNMENT_MODEL);
		createEAttribute(attributeAssignmentModelEClass, ATTRIBUTE_ASSIGNMENT_MODEL__NAME);
		createEAttribute(attributeAssignmentModelEClass, ATTRIBUTE_ASSIGNMENT_MODEL__DESCRIPTION);
		createEReference(attributeAssignmentModelEClass, ATTRIBUTE_ASSIGNMENT_MODEL__VALUE);

		attributeDefinitionModelEClass = createEClass(ATTRIBUTE_DEFINITION_MODEL);
		createEAttribute(attributeDefinitionModelEClass, ATTRIBUTE_DEFINITION_MODEL__NAME);
		createEAttribute(attributeDefinitionModelEClass, ATTRIBUTE_DEFINITION_MODEL__TYPE);
		createEAttribute(attributeDefinitionModelEClass, ATTRIBUTE_DEFINITION_MODEL__DESCRIPTION);
		createEReference(attributeDefinitionModelEClass, ATTRIBUTE_DEFINITION_MODEL__DATA_VALUE);
		createEAttribute(attributeDefinitionModelEClass, ATTRIBUTE_DEFINITION_MODEL__STATUS);

		capabilityAssignmentModelEClass = createEClass(CAPABILITY_ASSIGNMENT_MODEL);
		createEAttribute(capabilityAssignmentModelEClass, CAPABILITY_ASSIGNMENT_MODEL__NAME);
		createEReference(capabilityAssignmentModelEClass, CAPABILITY_ASSIGNMENT_MODEL__PROPERTIES);
		createEReference(capabilityAssignmentModelEClass, CAPABILITY_ASSIGNMENT_MODEL__ATTRIBUTES);

		capabilityDefinitionModelEClass = createEClass(CAPABILITY_DEFINITION_MODEL);
		createEAttribute(capabilityDefinitionModelEClass, CAPABILITY_DEFINITION_MODEL__TYPE_NAME);
		createEAttribute(capabilityDefinitionModelEClass, CAPABILITY_DEFINITION_MODEL__DERIVED_FROM);
		createEAttribute(capabilityDefinitionModelEClass, CAPABILITY_DEFINITION_MODEL__VERSION);
		createEAttribute(capabilityDefinitionModelEClass, CAPABILITY_DEFINITION_MODEL__DESCRIPTION);
		createEReference(capabilityDefinitionModelEClass, CAPABILITY_DEFINITION_MODEL__PROPERTIES);
		createEReference(capabilityDefinitionModelEClass, CAPABILITY_DEFINITION_MODEL__ATTRIBUTES);
		createEAttribute(capabilityDefinitionModelEClass, CAPABILITY_DEFINITION_MODEL__VALID_SOURCES);

		constraintModelEClass = createEClass(CONSTRAINT_MODEL);
		createEAttribute(constraintModelEClass, CONSTRAINT_MODEL__NAME);
		createEReference(constraintModelEClass, CONSTRAINT_MODEL__VALUE);

		dataModelEClass = createEClass(DATA_MODEL);
		createEAttribute(dataModelEClass, DATA_MODEL__VALUE);

		datatypeDefinitionModelEClass = createEClass(DATATYPE_DEFINITION_MODEL);
		createEAttribute(datatypeDefinitionModelEClass, DATATYPE_DEFINITION_MODEL__TYPE_NAME);
		createEAttribute(datatypeDefinitionModelEClass, DATATYPE_DEFINITION_MODEL__DERIVED_FROM);
		createEAttribute(datatypeDefinitionModelEClass, DATATYPE_DEFINITION_MODEL__VERSION);
		createEAttribute(datatypeDefinitionModelEClass, DATATYPE_DEFINITION_MODEL__DESCRIPTION);
		createEReference(datatypeDefinitionModelEClass, DATATYPE_DEFINITION_MODEL__CONSTRAINTS);
		createEReference(datatypeDefinitionModelEClass, DATATYPE_DEFINITION_MODEL__PROPERTIES);

		functionModelEClass = createEClass(FUNCTION_MODEL);
		createEAttribute(functionModelEClass, FUNCTION_MODEL__TYPE_NAME);
		createEReference(functionModelEClass, FUNCTION_MODEL__PARAMETERS);

		groupDefinitionModelEClass = createEClass(GROUP_DEFINITION_MODEL);
		createEAttribute(groupDefinitionModelEClass, GROUP_DEFINITION_MODEL__NAME);
		createEAttribute(groupDefinitionModelEClass, GROUP_DEFINITION_MODEL__TYPE);
		createEAttribute(groupDefinitionModelEClass, GROUP_DEFINITION_MODEL__DESCRIPTION);
		createEReference(groupDefinitionModelEClass, GROUP_DEFINITION_MODEL__PROPERTIES);
		createEReference(groupDefinitionModelEClass, GROUP_DEFINITION_MODEL__MEMBERS);
		createEReference(groupDefinitionModelEClass, GROUP_DEFINITION_MODEL__INTERFACES);

		groupTypeModelEClass = createEClass(GROUP_TYPE_MODEL);
		createEAttribute(groupTypeModelEClass, GROUP_TYPE_MODEL__TYPE_NAME);
		createEAttribute(groupTypeModelEClass, GROUP_TYPE_MODEL__DERIVED_FROM);
		createEAttribute(groupTypeModelEClass, GROUP_TYPE_MODEL__VERSION);
		createEAttribute(groupTypeModelEClass, GROUP_TYPE_MODEL__DESCRIPTION);
		createEReference(groupTypeModelEClass, GROUP_TYPE_MODEL__PROPERTIES);
		createEAttribute(groupTypeModelEClass, GROUP_TYPE_MODEL__MEMBERS);
		createEReference(groupTypeModelEClass, GROUP_TYPE_MODEL__INTERFACES);

		importDefinitionModelEClass = createEClass(IMPORT_DEFINITION_MODEL);
		createEAttribute(importDefinitionModelEClass, IMPORT_DEFINITION_MODEL__FILE);
		createEAttribute(importDefinitionModelEClass, IMPORT_DEFINITION_MODEL__REPOSITORY);
		createEAttribute(importDefinitionModelEClass, IMPORT_DEFINITION_MODEL__NAMESPACE_URI);
		createEAttribute(importDefinitionModelEClass, IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX);

		interfaceDefinitionModelEClass = createEClass(INTERFACE_DEFINITION_MODEL);
		createEReference(interfaceDefinitionModelEClass, INTERFACE_DEFINITION_MODEL__INPUTS);

		interfaceTypeModelEClass = createEClass(INTERFACE_TYPE_MODEL);
		createEAttribute(interfaceTypeModelEClass, INTERFACE_TYPE_MODEL__TYPE_NAME);
		createEAttribute(interfaceTypeModelEClass, INTERFACE_TYPE_MODEL__DERIVED_FROM);
		createEAttribute(interfaceTypeModelEClass, INTERFACE_TYPE_MODEL__VERSION);
		createEAttribute(interfaceTypeModelEClass, INTERFACE_TYPE_MODEL__DESCRIPTION);
		createEReference(interfaceTypeModelEClass, INTERFACE_TYPE_MODEL__INPUTS);
		createEReference(interfaceTypeModelEClass, INTERFACE_TYPE_MODEL__OPERATIONS);

		nodeDefinitionModelEClass = createEClass(NODE_DEFINITION_MODEL);
		createEAttribute(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__TYPE_NAME);
		createEAttribute(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__DERIVED_FROM);
		createEAttribute(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__VERSION);
		createEAttribute(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__DESCRIPTION);
		createEReference(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__PROPERTIES);
		createEReference(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__ATTRIBUTES);
		createEReference(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__REQUIREMENTS);
		createEReference(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__CAPABILITIES);
		createEReference(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__INTERFACES);
		createEReference(nodeDefinitionModelEClass, NODE_DEFINITION_MODEL__ARTIFACTS);

		nodeTemplateModelEClass = createEClass(NODE_TEMPLATE_MODEL);
		createEAttribute(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__NAME);
		createEAttribute(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__TYPE);
		createEAttribute(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__DIRECTIVES);
		createEAttribute(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__DESCRIPTION);
		createEReference(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__PROPERTIES);
		createEReference(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__ATTRIBUTES);
		createEReference(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__REQUIREMENTS);
		createEReference(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__CAPABILITIES);
		createEReference(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__INTERFACES);
		createEReference(nodeTemplateModelEClass, NODE_TEMPLATE_MODEL__ARTIFACTS);

		operationDefinitionModelEClass = createEClass(OPERATION_DEFINITION_MODEL);
		createEAttribute(operationDefinitionModelEClass, OPERATION_DEFINITION_MODEL__DESCRIPTION);
		createEAttribute(operationDefinitionModelEClass, OPERATION_DEFINITION_MODEL__IMPLEMENTATION);
		createEReference(operationDefinitionModelEClass, OPERATION_DEFINITION_MODEL__INPUTS_DEFINITIONS);
		createEReference(operationDefinitionModelEClass, OPERATION_DEFINITION_MODEL__INPUTS_ASSIGNMENTS);

		parameterDefinitionModelEClass = createEClass(PARAMETER_DEFINITION_MODEL);
		createEAttribute(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__NAME);
		createEAttribute(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__TYPE);
		createEAttribute(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__DESCRIPTION);
		createEReference(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__DATA_VALUE);
		createEReference(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__VALUE);
		createEAttribute(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__STATUS);
		createEReference(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__CONSTRAINT);
		createEAttribute(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL__ENTRY_SCHEMA);
		createEOperation(parameterDefinitionModelEClass, PARAMETER_DEFINITION_MODEL___GET_REQUIRED);

		policyDefinitionModelEClass = createEClass(POLICY_DEFINITION_MODEL);
		createEAttribute(policyDefinitionModelEClass, POLICY_DEFINITION_MODEL__NAME);
		createEAttribute(policyDefinitionModelEClass, POLICY_DEFINITION_MODEL__TYPE);
		createEAttribute(policyDefinitionModelEClass, POLICY_DEFINITION_MODEL__DESCRIPTION);
		createEReference(policyDefinitionModelEClass, POLICY_DEFINITION_MODEL__PROPERTIES);
		createEAttribute(policyDefinitionModelEClass, POLICY_DEFINITION_MODEL__TARGETS);

		policyTypeModelEClass = createEClass(POLICY_TYPE_MODEL);
		createEAttribute(policyTypeModelEClass, POLICY_TYPE_MODEL__TYPE_NAME);
		createEAttribute(policyTypeModelEClass, POLICY_TYPE_MODEL__DERIVED_FROM);
		createEAttribute(policyTypeModelEClass, POLICY_TYPE_MODEL__VERSION);
		createEAttribute(policyTypeModelEClass, POLICY_TYPE_MODEL__DESCRIPTION);
		createEReference(policyTypeModelEClass, POLICY_TYPE_MODEL__PROPERTIES);
		createEAttribute(policyTypeModelEClass, POLICY_TYPE_MODEL__TARGETS);

		propertyAssignmentModelEClass = createEClass(PROPERTY_ASSIGNMENT_MODEL);
		createEAttribute(propertyAssignmentModelEClass, PROPERTY_ASSIGNMENT_MODEL__NAME);
		createEReference(propertyAssignmentModelEClass, PROPERTY_ASSIGNMENT_MODEL__VALUE);

		propertyModelEClass = createEClass(PROPERTY_MODEL);
		createEAttribute(propertyModelEClass, PROPERTY_MODEL__NAME);
		createEAttribute(propertyModelEClass, PROPERTY_MODEL__TYPE);
		createEAttribute(propertyModelEClass, PROPERTY_MODEL__DESCRIPTION);
		createEReference(propertyModelEClass, PROPERTY_MODEL__DATA_VALUE);
		createEAttribute(propertyModelEClass, PROPERTY_MODEL__STATUS);
		createEReference(propertyModelEClass, PROPERTY_MODEL__CONSTRAINT);
		createEAttribute(propertyModelEClass, PROPERTY_MODEL__ENTRY_SCHEMA);
		createEReference(propertyModelEClass, PROPERTY_MODEL__VALUE);
		createEOperation(propertyModelEClass, PROPERTY_MODEL___GET_REQUIRED);

		relationshipDefinitionModelEClass = createEClass(RELATIONSHIP_DEFINITION_MODEL);
		createEAttribute(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__TYPE_NAME);
		createEAttribute(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__DERIVED_FROM);
		createEAttribute(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__VERSION);
		createEAttribute(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__DESCRIPTION);
		createEReference(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__PROPERTIES);
		createEReference(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__ATTRIBUTES);
		createEReference(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__INTERFACES);
		createEAttribute(relationshipDefinitionModelEClass, RELATIONSHIP_DEFINITION_MODEL__VALID_TARGET_TYPES);

		relationshipTemplateModelEClass = createEClass(RELATIONSHIP_TEMPLATE_MODEL);
		createEAttribute(relationshipTemplateModelEClass, RELATIONSHIP_TEMPLATE_MODEL__NAME);
		createEAttribute(relationshipTemplateModelEClass, RELATIONSHIP_TEMPLATE_MODEL__TYPE_NAME);
		createEAttribute(relationshipTemplateModelEClass, RELATIONSHIP_TEMPLATE_MODEL__DESCRIPTION);
		createEReference(relationshipTemplateModelEClass, RELATIONSHIP_TEMPLATE_MODEL__PROPERTIES);
		createEReference(relationshipTemplateModelEClass, RELATIONSHIP_TEMPLATE_MODEL__ATTRIBUTES);
		createEReference(relationshipTemplateModelEClass, RELATIONSHIP_TEMPLATE_MODEL__INTERFACES);
		createEAttribute(relationshipTemplateModelEClass, RELATIONSHIP_TEMPLATE_MODEL__COPY);

		repositoryDefinitionModelEClass = createEClass(REPOSITORY_DEFINITION_MODEL);
		createEAttribute(repositoryDefinitionModelEClass, REPOSITORY_DEFINITION_MODEL__URL);
		createEAttribute(repositoryDefinitionModelEClass, REPOSITORY_DEFINITION_MODEL__DESCRIPTION);
		createEAttribute(repositoryDefinitionModelEClass, REPOSITORY_DEFINITION_MODEL__CREDENTIAL);

		requirementAssignmentModelEClass = createEClass(REQUIREMENT_ASSIGNMENT_MODEL);
		createEAttribute(requirementAssignmentModelEClass, REQUIREMENT_ASSIGNMENT_MODEL__CAPABILITY);
		createEAttribute(requirementAssignmentModelEClass, REQUIREMENT_ASSIGNMENT_MODEL__NODE);
		createEAttribute(requirementAssignmentModelEClass, REQUIREMENT_ASSIGNMENT_MODEL__RELATIONSHIP);

		requirementDefinitionModelEClass = createEClass(REQUIREMENT_DEFINITION_MODEL);
		createEAttribute(requirementDefinitionModelEClass, REQUIREMENT_DEFINITION_MODEL__CAPABILITY);
		createEAttribute(requirementDefinitionModelEClass, REQUIREMENT_DEFINITION_MODEL__NODE);
		createEAttribute(requirementDefinitionModelEClass, REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_TYPE);
		createEReference(requirementDefinitionModelEClass, REQUIREMENT_DEFINITION_MODEL__RELATIONSHIP_DEFINITION);

		serviceTemplateModelEClass = createEClass(SERVICE_TEMPLATE_MODEL);
		createEAttribute(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__VERSION);
		createEAttribute(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__META_DATA);
		createEAttribute(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__DESCRIPTION);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__REPOSITORIES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__IMPORTS);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__DATA_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__NODE_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__GROUP_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__POLICY_TYPES);
		createEReference(serviceTemplateModelEClass, SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE);

		topologyTemplateModelEClass = createEClass(TOPOLOGY_TEMPLATE_MODEL);
		createEAttribute(topologyTemplateModelEClass, TOPOLOGY_TEMPLATE_MODEL__DESCRIPTION);
		createEReference(topologyTemplateModelEClass, TOPOLOGY_TEMPLATE_MODEL__INPUTS);
		createEReference(topologyTemplateModelEClass, TOPOLOGY_TEMPLATE_MODEL__NODE_TEMPLATES);
		createEReference(topologyTemplateModelEClass, TOPOLOGY_TEMPLATE_MODEL__RELATIONSHIP_TEMPLATES);
		createEReference(topologyTemplateModelEClass, TOPOLOGY_TEMPLATE_MODEL__GROUPS);
		createEReference(topologyTemplateModelEClass, TOPOLOGY_TEMPLATE_MODEL__POLICIES);
		createEReference(topologyTemplateModelEClass, TOPOLOGY_TEMPLATE_MODEL__OUTPUTS);

		serializableEClass = createEClass(SERIALIZABLE);

		// Create data types
		versionModelEDataType = createEDataType(VERSION_MODEL);
		stringArrayEDataType = createEDataType(STRING_ARRAY);
		mapEDataType = createEDataType(MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "T");
		addETypeParameter(mapEDataType, "T1");

		// Set bounds for type parameters

		// Add supertypes to classes
		artifactDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		artifactTypeModelEClass.getESuperTypes().add(this.getSerializable());
		attributeAssignmentModelEClass.getESuperTypes().add(this.getSerializable());
		attributeDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		capabilityAssignmentModelEClass.getESuperTypes().add(this.getSerializable());
		capabilityDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		constraintModelEClass.getESuperTypes().add(this.getSerializable());
		dataModelEClass.getESuperTypes().add(this.getSerializable());
		datatypeDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		functionModelEClass.getESuperTypes().add(this.getSerializable());
		groupDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		groupTypeModelEClass.getESuperTypes().add(this.getSerializable());
		importDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		interfaceDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		interfaceTypeModelEClass.getESuperTypes().add(this.getSerializable());
		nodeDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		nodeTemplateModelEClass.getESuperTypes().add(this.getSerializable());
		operationDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		parameterDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		policyDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		policyTypeModelEClass.getESuperTypes().add(this.getSerializable());
		propertyAssignmentModelEClass.getESuperTypes().add(this.getSerializable());
		propertyModelEClass.getESuperTypes().add(this.getSerializable());
		relationshipDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		relationshipTemplateModelEClass.getESuperTypes().add(this.getSerializable());
		repositoryDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		requirementAssignmentModelEClass.getESuperTypes().add(this.getSerializable());
		requirementDefinitionModelEClass.getESuperTypes().add(this.getSerializable());
		serviceTemplateModelEClass.getESuperTypes().add(this.getSerializable());
		topologyTemplateModelEClass.getESuperTypes().add(this.getSerializable());

		// Initialize classes, features, and operations; add parameters
		initEClass(artifactDefinitionModelEClass, ArtifactDefinitionModel.class, "ArtifactDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactDefinitionModel_Type(), ecorePackage.getEString(), "type", null, 0, 1, ArtifactDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactDefinitionModel_File(), ecorePackage.getEString(), "file", null, 0, 1, ArtifactDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactDefinitionModel_Repository(), ecorePackage.getEString(), "repository", null, 0, 1, ArtifactDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ArtifactDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactDefinitionModel_Deploy_path(), ecorePackage.getEString(), "deploy_path", null, 0, 1, ArtifactDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactTypeModelEClass, ArtifactTypeModel.class, "ArtifactTypeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactTypeModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ArtifactTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactTypeModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, ArtifactTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactTypeModel_Version(), this.getVersionModel(), "version", null, 0, 1, ArtifactTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactTypeModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ArtifactTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactTypeModel_Mime_type(), ecorePackage.getEString(), "mime_type", null, 0, 1, ArtifactTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactTypeModel_File_ext(), this.getStringArray(), "file_ext", null, 0, 1, ArtifactTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactTypeModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, ArtifactTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeAssignmentModelEClass, AttributeAssignmentModel.class, "AttributeAssignmentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeAssignmentModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeAssignmentModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, AttributeAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssignmentModel_Value(), this.getDataModel(), null, "value", null, 0, 1, AttributeAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefinitionModelEClass, AttributeDefinitionModel.class, "AttributeDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDefinitionModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDefinitionModel_Type(), ecorePackage.getEString(), "type", null, 0, 1, AttributeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, AttributeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeDefinitionModel_DataValue(), this.getDataModel(), null, "dataValue", null, 0, 1, AttributeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDefinitionModel_Status(), ecorePackage.getEString(), "status", null, 0, 1, AttributeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityAssignmentModelEClass, CapabilityAssignmentModel.class, "CapabilityAssignmentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapabilityAssignmentModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, CapabilityAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityAssignmentModel_Properties(), this.getPropertyAssignmentModel(), null, "properties", null, 0, -1, CapabilityAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityAssignmentModel_Attributes(), this.getAttributeAssignmentModel(), null, "attributes", null, 0, -1, CapabilityAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityDefinitionModelEClass, CapabilityDefinitionModel.class, "CapabilityDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapabilityDefinitionModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, CapabilityDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityDefinitionModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, CapabilityDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityDefinitionModel_Version(), this.getVersionModel(), "version", null, 0, 1, CapabilityDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, CapabilityDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityDefinitionModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, CapabilityDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityDefinitionModel_Attributes(), this.getAttributeDefinitionModel(), null, "attributes", null, 0, -1, CapabilityDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityDefinitionModel_ValidSources(), this.getStringArray(), "validSources", null, 0, 1, CapabilityDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintModelEClass, ConstraintModel.class, "ConstraintModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraintModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConstraintModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintModel_Value(), this.getDataModel(), null, "value", null, 0, 1, ConstraintModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataModelEClass, DataModel.class, "DataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataModel_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeDefinitionModelEClass, DatatypeDefinitionModel.class, "DatatypeDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, DatatypeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatypeDefinitionModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, DatatypeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatypeDefinitionModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, DatatypeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatypeDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, DatatypeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeDefinitionModel_Constraints(), this.getConstraintModel(), null, "constraints", null, 0, -1, DatatypeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeDefinitionModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, DatatypeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionModelEClass, FunctionModel.class, "FunctionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, FunctionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionModel_Parameters(), this.getPropertyModel(), null, "parameters", null, 0, -1, FunctionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupDefinitionModelEClass, GroupDefinitionModel.class, "GroupDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupDefinitionModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, GroupDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupDefinitionModel_Type(), ecorePackage.getEString(), "type", null, 0, 1, GroupDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, GroupDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupDefinitionModel_Properties(), this.getPropertyAssignmentModel(), null, "properties", null, 0, -1, GroupDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupDefinitionModel_Members(), this.getNodeTemplateModel(), null, "members", null, 0, -1, GroupDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupDefinitionModel_Interfaces(), this.getInterfaceTypeModel(), null, "interfaces", null, 0, -1, GroupDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupTypeModelEClass, GroupTypeModel.class, "GroupTypeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupTypeModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, GroupTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupTypeModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, GroupTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupTypeModel_Version(), this.getVersionModel(), "version", null, 0, 1, GroupTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupTypeModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, GroupTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupTypeModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, GroupTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupTypeModel_Members(), this.getStringArray(), "members", null, 0, 1, GroupTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupTypeModel_Interfaces(), this.getInterfaceTypeModel(), null, "interfaces", null, 0, -1, GroupTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importDefinitionModelEClass, ImportDefinitionModel.class, "ImportDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportDefinitionModel_File(), ecorePackage.getEString(), "file", null, 0, 1, ImportDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportDefinitionModel_Repository(), ecorePackage.getEString(), "repository", null, 0, 1, ImportDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportDefinitionModel_NamespaceUri(), ecorePackage.getEString(), "namespaceUri", null, 0, 1, ImportDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportDefinitionModel_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, ImportDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDefinitionModelEClass, InterfaceDefinitionModel.class, "InterfaceDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDefinitionModel_Inputs(), this.getPropertyModel(), null, "inputs", null, 0, -1, InterfaceDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceTypeModelEClass, InterfaceTypeModel.class, "InterfaceTypeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceTypeModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, InterfaceTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceTypeModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, InterfaceTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceTypeModel_Version(), this.getVersionModel(), "version", null, 0, 1, InterfaceTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceTypeModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, InterfaceTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceTypeModel_Inputs(), this.getPropertyModel(), null, "inputs", null, 0, -1, InterfaceTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceTypeModel_Operations(), this.getOperationDefinitionModel(), null, "operations", null, 0, -1, InterfaceTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeDefinitionModelEClass, NodeDefinitionModel.class, "NodeDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeDefinitionModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDefinitionModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDefinitionModel_Version(), this.getVersionModel(), "version", null, 0, 1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinitionModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinitionModel_Attributes(), this.getAttributeDefinitionModel(), null, "attributes", null, 0, -1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinitionModel_Requirements(), this.getRequirementDefinitionModel(), null, "requirements", null, 0, -1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinitionModel_Capabilities(), this.getCapabilityDefinitionModel(), null, "capabilities", null, 0, -1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinitionModel_Interfaces(), this.getInterfaceTypeModel(), null, "interfaces", null, 0, -1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinitionModel_Artifacts(), this.getArtifactTypeModel(), null, "artifacts", null, 0, -1, NodeDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeTemplateModelEClass, NodeTemplateModel.class, "NodeTemplateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeTemplateModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeTemplateModel_Type(), ecorePackage.getEString(), "type", null, 0, 1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeTemplateModel_Directives(), ecorePackage.getEString(), "directives", null, 0, 1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeTemplateModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeTemplateModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeTemplateModel_Attributes(), this.getAttributeAssignmentModel(), null, "attributes", null, 0, -1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeTemplateModel_Requirements(), this.getRequirementAssignmentModel(), null, "requirements", null, 0, -1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeTemplateModel_Capabilities(), this.getCapabilityAssignmentModel(), null, "capabilities", null, 0, -1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeTemplateModel_Interfaces(), this.getInterfaceDefinitionModel(), null, "interfaces", null, 0, -1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeTemplateModel_Artifacts(), this.getArtifactTypeModel(), null, "artifacts", null, 0, -1, NodeTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationDefinitionModelEClass, OperationDefinitionModel.class, "OperationDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, OperationDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDefinitionModel_Implementation(), ecorePackage.getEString(), "implementation", null, 0, 1, OperationDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDefinitionModel_Inputs_definitions(), this.getPropertyModel(), null, "inputs_definitions", null, 0, -1, OperationDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDefinitionModel_Inputs_assignments(), this.getPropertyAssignmentModel(), null, "inputs_assignments", null, 0, -1, OperationDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionModelEClass, ParameterDefinitionModel.class, "ParameterDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDefinitionModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinitionModel_Type(), ecorePackage.getEString(), "type", null, 0, 1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinitionModel_DataValue(), this.getDataModel(), null, "dataValue", null, 0, 1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinitionModel_Value(), this.getDataModel(), null, "value", null, 0, 1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinitionModel_Status(), ecorePackage.getEString(), "status", null, 0, 1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinitionModel_Constraint(), this.getConstraintModel(), null, "constraint", null, 0, -1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinitionModel_EntrySchema(), ecorePackage.getEString(), "entrySchema", null, 0, 1, ParameterDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameterDefinitionModel__GetRequired(), ecorePackage.getEBoolean(), "getRequired", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(policyDefinitionModelEClass, PolicyDefinitionModel.class, "PolicyDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDefinitionModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, PolicyDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDefinitionModel_Type(), ecorePackage.getEString(), "type", null, 0, 1, PolicyDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, PolicyDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyDefinitionModel_Properties(), this.getPropertyAssignmentModel(), null, "properties", null, 0, -1, PolicyDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDefinitionModel_Targets(), this.getStringArray(), "targets", null, 0, 1, PolicyDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyTypeModelEClass, PolicyTypeModel.class, "PolicyTypeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyTypeModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, PolicyTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyTypeModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, PolicyTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyTypeModel_Version(), this.getVersionModel(), "version", null, 0, 1, PolicyTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyTypeModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, PolicyTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyTypeModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, PolicyTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyTypeModel_Targets(), this.getStringArray(), "targets", null, 0, 1, PolicyTypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAssignmentModelEClass, PropertyAssignmentModel.class, "PropertyAssignmentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyAssignmentModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssignmentModel_Value(), this.getDataModel(), null, "value", null, 0, 1, PropertyAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyModelEClass, PropertyModel.class, "PropertyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyModel_Type(), ecorePackage.getEString(), "type", null, 0, 1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyModel_DataValue(), this.getDataModel(), null, "dataValue", null, 0, 1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyModel_Status(), ecorePackage.getEString(), "status", null, 0, 1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyModel_Constraint(), this.getConstraintModel(), null, "constraint", null, 0, -1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyModel_EntrySchema(), ecorePackage.getEString(), "entrySchema", null, 0, 1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyModel_Value(), this.getDataModel(), null, "value", null, 0, 1, PropertyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPropertyModel__GetRequired(), ecorePackage.getEBoolean(), "getRequired", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relationshipDefinitionModelEClass, RelationshipDefinitionModel.class, "RelationshipDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipDefinitionModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipDefinitionModel_DerivedFrom(), ecorePackage.getEString(), "derivedFrom", null, 0, 1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipDefinitionModel_Version(), this.getVersionModel(), "version", null, 0, 1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipDefinitionModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipDefinitionModel_Attributes(), this.getAttributeDefinitionModel(), null, "attributes", null, 0, -1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipDefinitionModel_Interfaces(), this.getInterfaceTypeModel(), null, "interfaces", null, 0, -1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipDefinitionModel_ValidTargetTypes(), this.getStringArray(), "validTargetTypes", null, 0, 1, RelationshipDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTemplateModelEClass, RelationshipTemplateModel.class, "RelationshipTemplateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipTemplateModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationshipTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipTemplateModel_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, RelationshipTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipTemplateModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, RelationshipTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipTemplateModel_Properties(), this.getPropertyModel(), null, "properties", null, 0, -1, RelationshipTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipTemplateModel_Attributes(), this.getAttributeAssignmentModel(), null, "attributes", null, 0, -1, RelationshipTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipTemplateModel_Interfaces(), this.getInterfaceDefinitionModel(), null, "interfaces", null, 0, -1, RelationshipTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipTemplateModel_Copy(), ecorePackage.getEString(), "copy", null, 0, 1, RelationshipTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryDefinitionModelEClass, RepositoryDefinitionModel.class, "RepositoryDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryDefinitionModel_Url(), ecorePackage.getEString(), "url", null, 0, 1, RepositoryDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, RepositoryDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryDefinitionModel_Credential(), ecorePackage.getEString(), "credential", null, 0, 1, RepositoryDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementAssignmentModelEClass, RequirementAssignmentModel.class, "RequirementAssignmentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementAssignmentModel_Capability(), ecorePackage.getEString(), "capability", null, 0, 1, RequirementAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementAssignmentModel_Node(), ecorePackage.getEString(), "node", null, 0, 1, RequirementAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementAssignmentModel_Relationship(), ecorePackage.getEString(), "relationship", null, 0, 1, RequirementAssignmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementDefinitionModelEClass, RequirementDefinitionModel.class, "RequirementDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementDefinitionModel_Capability(), ecorePackage.getEString(), "capability", null, 0, 1, RequirementDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDefinitionModel_Node(), ecorePackage.getEString(), "node", null, 0, 1, RequirementDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDefinitionModel_Relationship_type(), ecorePackage.getEString(), "relationship_type", null, 0, 1, RequirementDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDefinitionModel_Relationship_definition(), this.getRelationshipDefinitionModel(), null, "relationship_definition", null, 0, 1, RequirementDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTemplateModelEClass, ServiceTemplateModel.class, "ServiceTemplateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceTemplateModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getServiceTemplateModel_MetaData(), g1, "metaData", null, 0, 1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceTemplateModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_Repositories(), this.getRepositoryDefinitionModel(), null, "repositories", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_Imports(), this.getImportDefinitionModel(), null, "imports", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_ArtifactTypes(), this.getArtifactTypeModel(), null, "artifactTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_DataTypes(), this.getDatatypeDefinitionModel(), null, "dataTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_CapabilityTypes(), this.getCapabilityDefinitionModel(), null, "capabilityTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_InterfaceTypes(), this.getInterfaceTypeModel(), null, "interfaceTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_RelationshipTypes(), this.getRelationshipDefinitionModel(), null, "relationshipTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_NodeTypes(), this.getNodeDefinitionModel(), null, "nodeTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_GroupTypes(), this.getGroupDefinitionModel(), null, "groupTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_PolicyTypes(), this.getPolicyDefinitionModel(), null, "policyTypes", null, 0, -1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplateModel_TopologyTemplate(), this.getTopologyTemplateModel(), null, "topologyTemplate", null, 0, 1, ServiceTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyTemplateModelEClass, TopologyTemplateModel.class, "TopologyTemplateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopologyTemplateModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, TopologyTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTemplateModel_Inputs(), this.getParameterDefinitionModel(), null, "inputs", null, 0, -1, TopologyTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTemplateModel_NodeTemplates(), this.getNodeTemplateModel(), null, "nodeTemplates", null, 0, -1, TopologyTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTemplateModel_RelationshipTemplates(), this.getRelationshipTemplateModel(), null, "relationshipTemplates", null, 0, -1, TopologyTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTemplateModel_Groups(), this.getGroupDefinitionModel(), null, "groups", null, 0, -1, TopologyTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTemplateModel_Policies(), this.getPolicyDefinitionModel(), null, "policies", null, 0, -1, TopologyTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTemplateModel_Outputs(), this.getParameterDefinitionModel(), null, "outputs", null, 0, -1, TopologyTemplateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializableEClass, Serializable.class, "Serializable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(versionModelEDataType, VersionModel.class, "VersionModel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
