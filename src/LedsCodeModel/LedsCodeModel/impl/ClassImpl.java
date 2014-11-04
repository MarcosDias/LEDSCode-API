/**
 */
package LedsCodeModel.LedsCodeModel.impl;

import LedsCodeModel.LedsCodeModel.Attribute;
import LedsCodeModel.LedsCodeModel.LedsCodeModelPackage;
import LedsCodeModel.LedsCodeModel.StereotypeClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#getComposed <em>Composed</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#getStereotypeClass <em>Stereotype Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements LedsCodeModel.LedsCodeModel.Class {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposed() <em>Composed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposed()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> composed;

	/**
	 * The cached value of the '{@link #getStereotypeClass() <em>Stereotype Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypeClass()
	 * @generated
	 * @ordered
	 */
	protected EList<StereotypeClass> stereotypeClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedsCodeModelPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.CLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getComposed() {
		if (composed == null) {
			composed = new EObjectResolvingEList<Attribute>(Attribute.class, this, LedsCodeModelPackage.CLASS__COMPOSED);
		}
		return composed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StereotypeClass> getStereotypeClass() {
		if (stereotypeClass == null) {
			stereotypeClass = new EDataTypeUniqueEList<StereotypeClass>(StereotypeClass.class, this, LedsCodeModelPackage.CLASS__STEREOTYPE_CLASS);
		}
		return stereotypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedsCodeModelPackage.CLASS__NAME:
				return getName();
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				return isAbstract();
			case LedsCodeModelPackage.CLASS__COMPOSED:
				return getComposed();
			case LedsCodeModelPackage.CLASS__STEREOTYPE_CLASS:
				return getStereotypeClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LedsCodeModelPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case LedsCodeModelPackage.CLASS__COMPOSED:
				getComposed().clear();
				getComposed().addAll((Collection<? extends Attribute>)newValue);
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
			case LedsCodeModelPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case LedsCodeModelPackage.CLASS__COMPOSED:
				getComposed().clear();
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
			case LedsCodeModelPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case LedsCodeModelPackage.CLASS__COMPOSED:
				return composed != null && !composed.isEmpty();
			case LedsCodeModelPackage.CLASS__STEREOTYPE_CLASS:
				return stereotypeClass != null && !stereotypeClass.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", stereotypeClass: ");
		result.append(stereotypeClass);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
