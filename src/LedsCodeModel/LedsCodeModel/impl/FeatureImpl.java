/**
 */
package LedsCodeModel.LedsCodeModel.impl;

import LedsCodeModel.LedsCodeModel.Feature;
import LedsCodeModel.LedsCodeModel.LedsCodeModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.FeatureImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.FeatureImpl#getDataBaseName <em>Data Base Name</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.FeatureImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.FeatureImpl#getOrm <em>Orm</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.FeatureImpl#getApplicationType <em>Application Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataBaseName() <em>Data Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_BASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataBaseName() <em>Data Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseName()
	 * @generated
	 * @ordered
	 */
	protected String dataBaseName = DATA_BASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected String engine = ENGINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrm() <em>Orm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrm()
	 * @generated
	 * @ordered
	 */
	protected static final String ORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrm() <em>Orm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrm()
	 * @generated
	 * @ordered
	 */
	protected String orm = ORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected String applicationType = APPLICATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedsCodeModelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.FEATURE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataBaseName() {
		return dataBaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBaseName(String newDataBaseName) {
		String oldDataBaseName = dataBaseName;
		dataBaseName = newDataBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.FEATURE__DATA_BASE_NAME, oldDataBaseName, dataBaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(String newEngine) {
		String oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.FEATURE__ENGINE, oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrm() {
		return orm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrm(String newOrm) {
		String oldOrm = orm;
		orm = newOrm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.FEATURE__ORM, oldOrm, orm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationType() {
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationType(String newApplicationType) {
		String oldApplicationType = applicationType;
		applicationType = newApplicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.FEATURE__APPLICATION_TYPE, oldApplicationType, applicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedsCodeModelPackage.FEATURE__LANGUAGE:
				return getLanguage();
			case LedsCodeModelPackage.FEATURE__DATA_BASE_NAME:
				return getDataBaseName();
			case LedsCodeModelPackage.FEATURE__ENGINE:
				return getEngine();
			case LedsCodeModelPackage.FEATURE__ORM:
				return getOrm();
			case LedsCodeModelPackage.FEATURE__APPLICATION_TYPE:
				return getApplicationType();
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
			case LedsCodeModelPackage.FEATURE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case LedsCodeModelPackage.FEATURE__DATA_BASE_NAME:
				setDataBaseName((String)newValue);
				return;
			case LedsCodeModelPackage.FEATURE__ENGINE:
				setEngine((String)newValue);
				return;
			case LedsCodeModelPackage.FEATURE__ORM:
				setOrm((String)newValue);
				return;
			case LedsCodeModelPackage.FEATURE__APPLICATION_TYPE:
				setApplicationType((String)newValue);
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
			case LedsCodeModelPackage.FEATURE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case LedsCodeModelPackage.FEATURE__DATA_BASE_NAME:
				setDataBaseName(DATA_BASE_NAME_EDEFAULT);
				return;
			case LedsCodeModelPackage.FEATURE__ENGINE:
				setEngine(ENGINE_EDEFAULT);
				return;
			case LedsCodeModelPackage.FEATURE__ORM:
				setOrm(ORM_EDEFAULT);
				return;
			case LedsCodeModelPackage.FEATURE__APPLICATION_TYPE:
				setApplicationType(APPLICATION_TYPE_EDEFAULT);
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
			case LedsCodeModelPackage.FEATURE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case LedsCodeModelPackage.FEATURE__DATA_BASE_NAME:
				return DATA_BASE_NAME_EDEFAULT == null ? dataBaseName != null : !DATA_BASE_NAME_EDEFAULT.equals(dataBaseName);
			case LedsCodeModelPackage.FEATURE__ENGINE:
				return ENGINE_EDEFAULT == null ? engine != null : !ENGINE_EDEFAULT.equals(engine);
			case LedsCodeModelPackage.FEATURE__ORM:
				return ORM_EDEFAULT == null ? orm != null : !ORM_EDEFAULT.equals(orm);
			case LedsCodeModelPackage.FEATURE__APPLICATION_TYPE:
				return APPLICATION_TYPE_EDEFAULT == null ? applicationType != null : !APPLICATION_TYPE_EDEFAULT.equals(applicationType);
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
		result.append(" (language: ");
		result.append(language);
		result.append(", dataBaseName: ");
		result.append(dataBaseName);
		result.append(", engine: ");
		result.append(engine);
		result.append(", orm: ");
		result.append(orm);
		result.append(", applicationType: ");
		result.append(applicationType);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
