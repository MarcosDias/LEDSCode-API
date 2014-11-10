/**
 */
package LedsCodeModel.LedsCodeModel.impl;

import LedsCodeModel.LedsCodeModel.Attribute;
import LedsCodeModel.LedsCodeModel.LedsCodeModelPackage;
import LedsCodeModel.LedsCodeModel.StereotypeClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#getStereotypeClass <em>Stereotype Class</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends AbstractClassImpl implements LedsCodeModel.LedsCodeModel.Class {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<LedsCodeModel.LedsCodeModel.Class> parent;

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
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, LedsCodeModelPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
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
	public EList<LedsCodeModel.LedsCodeModel.Class> getParent() {
		if (parent == null) {
			parent = new EObjectResolvingEList<LedsCodeModel.LedsCodeModel.Class>(LedsCodeModel.LedsCodeModel.Class.class, this, LedsCodeModelPackage.CLASS__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LedsCodeModelPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				return isAbstract();
			case LedsCodeModelPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case LedsCodeModelPackage.CLASS__STEREOTYPE_CLASS:
				return getStereotypeClass();
			case LedsCodeModelPackage.CLASS__PARENT:
				return getParent();
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
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case LedsCodeModelPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case LedsCodeModelPackage.CLASS__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends LedsCodeModel.LedsCodeModel.Class>)newValue);
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
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case LedsCodeModelPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case LedsCodeModelPackage.CLASS__PARENT:
				getParent().clear();
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
			case LedsCodeModelPackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case LedsCodeModelPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case LedsCodeModelPackage.CLASS__STEREOTYPE_CLASS:
				return stereotypeClass != null && !stereotypeClass.isEmpty();
			case LedsCodeModelPackage.CLASS__PARENT:
				return parent != null && !parent.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", stereotypeClass: ");
		result.append(stereotypeClass);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
