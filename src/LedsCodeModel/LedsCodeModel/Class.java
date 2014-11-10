/**
 */
package LedsCodeModel.LedsCodeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#getStereotypeClass <em>Stereotype Class</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Class#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends AbstractClass {
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
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link LedsCodeModel.LedsCodeModel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link LedsCodeModel.LedsCodeModel.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClass_Parent()
	 * @model extendedMetaData="kind='simple'"
	 * @generated
	 */
	EList<Class> getParent();

} // Class
