/**
 */
package LedsCodeModel.LedsCodeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#getName <em>Name</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#getComposed <em>Composed</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#getStereotypeClass <em>Stereotype Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
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
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Composed</b></em>' reference list.
	 * The list contents are of type {@link LedsCodeModel.LedsCodeModel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' reference list.
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_Composed()
	 * @model
	 * @generated
	 */
	EList<Attribute> getComposed();

	/**
	 * Returns the value of the '<em><b>Stereotype Class</b></em>' attribute list.
	 * The list contents are of type {@link LedsCodeModel.LedsCodeModel.StereotypeClass}.
	 * The literals are from the enumeration {@link LedsCodeModel.LedsCodeModel.StereotypeClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype Class</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype Class</em>' attribute list.
	 * @see LedsCodeModel.LedsCodeModel.StereotypeClass
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_StereotypeClass()
	 * @model changeable="false"
	 * @generated
	 */
	EList<StereotypeClass> getStereotypeClass();

} // Class
