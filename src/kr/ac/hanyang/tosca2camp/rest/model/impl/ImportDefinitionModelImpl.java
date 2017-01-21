/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.impl;

import kr.ac.hanyang.tosca2camp.rest.model.ImportDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl#getFile <em>File</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link kr.ac.hanyang.tosca2camp.rest.model.impl.ImportDefinitionModelImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 * </ul>
 *
 * 
 */
public class ImportDefinitionModelImpl extends MinimalEObjectImpl.Container implements ImportDefinitionModel, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4217406862990473717L;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected String repository = REPOSITORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected String namespaceUri = NAMESPACE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected String namespacePrefix = NAMESPACE_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.IMPORT_DEFINITION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPORT_DEFINITION_MODEL__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(String newRepository) {
		String oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPORT_DEFINITION_MODEL__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceUri() {
		return namespaceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceUri(String newNamespaceUri) {
		String oldNamespaceUri = namespaceUri;
		namespaceUri = newNamespaceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_URI, oldNamespaceUri, namespaceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespacePrefix() {
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespacePrefix(String newNamespacePrefix) {
		String oldNamespacePrefix = namespacePrefix;
		namespacePrefix = newNamespacePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.IMPORT_DEFINITION_MODEL__FILE:
				return getFile();
			case ModelPackage.IMPORT_DEFINITION_MODEL__REPOSITORY:
				return getRepository();
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_URI:
				return getNamespaceUri();
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX:
				return getNamespacePrefix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.IMPORT_DEFINITION_MODEL__FILE:
				setFile((String)newValue);
				return;
			case ModelPackage.IMPORT_DEFINITION_MODEL__REPOSITORY:
				setRepository((String)newValue);
				return;
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_URI:
				setNamespaceUri((String)newValue);
				return;
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX:
				setNamespacePrefix((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.IMPORT_DEFINITION_MODEL__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case ModelPackage.IMPORT_DEFINITION_MODEL__REPOSITORY:
				setRepository(REPOSITORY_EDEFAULT);
				return;
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_URI:
				setNamespaceUri(NAMESPACE_URI_EDEFAULT);
				return;
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX:
				setNamespacePrefix(NAMESPACE_PREFIX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.IMPORT_DEFINITION_MODEL__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case ModelPackage.IMPORT_DEFINITION_MODEL__REPOSITORY:
				return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_URI:
				return NAMESPACE_URI_EDEFAULT == null ? namespaceUri != null : !NAMESPACE_URI_EDEFAULT.equals(namespaceUri);
			case ModelPackage.IMPORT_DEFINITION_MODEL__NAMESPACE_PREFIX:
				return NAMESPACE_PREFIX_EDEFAULT == null ? namespacePrefix != null : !NAMESPACE_PREFIX_EDEFAULT.equals(namespacePrefix);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (file: ");
		result.append(file);
		result.append(", repository: ");
		result.append(repository);
		result.append(", namespaceUri: ");
		result.append(namespaceUri);
		result.append(", namespacePrefix: ");
		result.append(namespacePrefix);
		result.append(')');
		return result.toString();
	}

} //ImportDefinitionModelImpl
