/**
 */
package LedsCodeModel.LedsCodeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENUM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.ENUM#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getENUM()
 * @model
 * @generated
 */
public interface ENUM extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getENUM_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

} // ENUM
