/**
 */
package LedsCodeModel.LedsCodeModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LedsCodeModel.LedsCodeModel.PrimitiveDataType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link LedsCodeModel.LedsCodeModel.PrimitiveData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see LedsCodeModel.LedsCodeModel.PrimitiveData
	 * @see #setType(PrimitiveData)
	 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelPackage#getPrimitiveDataType_Type()
	 * @model
	 * @generated
	 */
	PrimitiveData getType();

	/**
	 * Sets the value of the '{@link LedsCodeModel.LedsCodeModel.PrimitiveDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see LedsCodeModel.LedsCodeModel.PrimitiveData
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveData value);

} // PrimitiveDataType
