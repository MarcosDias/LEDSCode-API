/**
 */
package LedsCodeModel.LedsCodeModel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Specification#getName <em>Name</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Specification#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Specification#getHas <em>Has</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Specification#getDescribed <em>Described</em>}</li>
 * </ul>
 * </p>
 *
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Specification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getSpecification_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Specification#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link LedsCodeModel.LedsCodeModel.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getSpecification_Has()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Model> getHas();

	/**
	 * Returns the value of the '<em><b>Described</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described</em>' reference.
	 * @see #setDescribed(Feature)
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getSpecification_Described()
	 * @model
	 * @generated
	 */
	Feature getDescribed();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Specification#getDescribed <em>Described</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described</em>' reference.
	 * @see #getDescribed()
	 * @generated
	 */
	void setDescribed(Feature value);

} // Specification
