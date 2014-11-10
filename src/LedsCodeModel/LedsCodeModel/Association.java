/**
 */
package LedsCodeModel.LedsCodeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Association#getName <em>Name</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Association#getTarget <em>Target</em>}</li>
 *   <li>{@link LedsCodeModel.LedsCodeModel.Association#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
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
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getAssociation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LedsCodeModel.LedsCodeModel.Class)
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getAssociation_Target()
	 * @model required="true"
	 * @generated
	 */
	LedsCodeModel.LedsCodeModel.Class getTarget();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LedsCodeModel.LedsCodeModel.Class value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LedsCodeModel.LedsCodeModel.Class)
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getAssociation_Source()
	 * @model required="true"
	 * @generated
	 */
	LedsCodeModel.LedsCodeModel.Class getSource();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.Association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LedsCodeModel.LedsCodeModel.Class value);

} // Association
