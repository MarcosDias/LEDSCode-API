/**
 */
package LedsCodeModel.LedsCodeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.ClassDiagram#getName <em>Name</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.ClassDiagram#getComposed <em>Composed</em>}</li>
 * </ul>
 * </p>
 *
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClassDiagram()
 * @model
 * @generated
 */
public interface ClassDiagram extends Model {
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
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClassDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.ClassDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Composed</b></em>' containment reference list.
	 * The list contents are of type {@link LedsCodeModel.LedsCodeModel.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' containment reference list.
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getClassDiagram_Composed()
	 * @model containment="true"
	 * @generated
	 */
	EList<LedsCodeModel.LedsCodeModel.Class> getComposed();

} // ClassDiagram
