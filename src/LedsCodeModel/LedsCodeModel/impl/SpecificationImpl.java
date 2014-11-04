/**
 */
package LedsCodeModel.LedsCodeModel.impl;

import LedsCodeModel.LedsCodeModel.Feature;
import LedsCodeModel.LedsCodeModel.LedsCodeModelPackage;
import LedsCodeModel.LedsCodeModel.Model;
import LedsCodeModel.LedsCodeModel.Specification;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.SpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.SpecificationImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.SpecificationImpl#getHas <em>Has</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.impl.SpecificationImpl#getDescribed <em>Described</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification {
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
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> has;

	/**
	 * The cached value of the '{@link #getDescribed() <em>Described</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribed()
	 * @generated
	 * @ordered
	 */
	protected Feature described;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedsCodeModelPackage.Literals.SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.SPECIFICATION__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<Model>(Model.class, this, LedsCodeModelPackage.SPECIFICATION__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getDescribed() {
		if (described != null && described.eIsProxy()) {
			InternalEObject oldDescribed = (InternalEObject)described;
			described = (Feature)eResolveProxy(oldDescribed);
			if (described != oldDescribed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedsCodeModelPackage.SPECIFICATION__DESCRIBED, oldDescribed, described));
			}
		}
		return described;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetDescribed() {
		return described;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribed(Feature newDescribed) {
		Feature oldDescribed = described;
		described = newDescribed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeModelPackage.SPECIFICATION__DESCRIBED, oldDescribed, described));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LedsCodeModelPackage.SPECIFICATION__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
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
			case LedsCodeModelPackage.SPECIFICATION__NAME:
				return getName();
			case LedsCodeModelPackage.SPECIFICATION__CREATED_DATE:
				return getCreatedDate();
			case LedsCodeModelPackage.SPECIFICATION__HAS:
				return getHas();
			case LedsCodeModelPackage.SPECIFICATION__DESCRIBED:
				if (resolve) return getDescribed();
				return basicGetDescribed();
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
			case LedsCodeModelPackage.SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case LedsCodeModelPackage.SPECIFICATION__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case LedsCodeModelPackage.SPECIFICATION__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Model>)newValue);
				return;
			case LedsCodeModelPackage.SPECIFICATION__DESCRIBED:
				setDescribed((Feature)newValue);
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
			case LedsCodeModelPackage.SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LedsCodeModelPackage.SPECIFICATION__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case LedsCodeModelPackage.SPECIFICATION__HAS:
				getHas().clear();
				return;
			case LedsCodeModelPackage.SPECIFICATION__DESCRIBED:
				setDescribed((Feature)null);
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
			case LedsCodeModelPackage.SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LedsCodeModelPackage.SPECIFICATION__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case LedsCodeModelPackage.SPECIFICATION__HAS:
				return has != null && !has.isEmpty();
			case LedsCodeModelPackage.SPECIFICATION__DESCRIBED:
				return described != null;
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
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
