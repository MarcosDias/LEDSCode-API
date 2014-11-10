/**
 */
package LedsCodeModel.LedsCodeModel.impl;

import LedsCodeModel.LedsCodeModel.Association;
import LedsCodeModel.LedsCodeModel.Attribute;
import LedsCodeModel.LedsCodeModel.ClassDiagram;
import LedsCodeModel.LedsCodeModel.ENUM;
import LedsCodeModel.LedsCodeModel.Feature;
import LedsCodeModel.LedsCodeModel.LedsCodeModelFactory;
import LedsCodeModel.LedsCodeModel.LedsCodeModelPackage;
import LedsCodeModel.LedsCodeModel.PrimitiveData;
import LedsCodeModel.LedsCodeModel.PrimitiveDataType;
import LedsCodeModel.LedsCodeModel.Specification;
import LedsCodeModel.LedsCodeModel.StereotypeAttribute;
import LedsCodeModel.LedsCodeModel.StereotypeClass;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LedsCodeModelFactoryImpl extends EFactoryImpl implements LedsCodeModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LedsCodeModelFactory init() {
		try {
			LedsCodeModelFactory theLedsCodeModelFactory = (LedsCodeModelFactory)EPackage.Registry.INSTANCE.getEFactory(LedsCodeModelPackage.eNS_URI);
			if (theLedsCodeModelFactory != null) {
				return theLedsCodeModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LedsCodeModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedsCodeModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LedsCodeModelPackage.SPECIFICATION: return createSpecification();
			case LedsCodeModelPackage.FEATURE: return createFeature();
			case LedsCodeModelPackage.CLASS_DIAGRAM: return createClassDiagram();
			case LedsCodeModelPackage.CLASS: return createClass();
			case LedsCodeModelPackage.ATTRIBUTE: return createAttribute();
			case LedsCodeModelPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case LedsCodeModelPackage.ASSOCIATION: return createAssociation();
			case LedsCodeModelPackage.ENUM: return createENUM();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LedsCodeModelPackage.STEREOTYPE_CLASS:
				return createStereotypeClassFromString(eDataType, initialValue);
			case LedsCodeModelPackage.PRIMITIVE_DATA:
				return createPrimitiveDataFromString(eDataType, initialValue);
			case LedsCodeModelPackage.STEREOTYPE_ATTRIBUTE:
				return createStereotypeAttributeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LedsCodeModelPackage.STEREOTYPE_CLASS:
				return convertStereotypeClassToString(eDataType, instanceValue);
			case LedsCodeModelPackage.PRIMITIVE_DATA:
				return convertPrimitiveDataToString(eDataType, instanceValue);
			case LedsCodeModelPackage.STEREOTYPE_ATTRIBUTE:
				return convertStereotypeAttributeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram createClassDiagram() {
		ClassDiagramImpl classDiagram = new ClassDiagramImpl();
		return classDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedsCodeModel.LedsCodeModel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM createENUM() {
		ENUMImpl enum_ = new ENUMImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeClass createStereotypeClassFromString(EDataType eDataType, String initialValue) {
		StereotypeClass result = StereotypeClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStereotypeClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveData createPrimitiveDataFromString(EDataType eDataType, String initialValue) {
		PrimitiveData result = PrimitiveData.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeAttribute createStereotypeAttributeFromString(EDataType eDataType, String initialValue) {
		StereotypeAttribute result = StereotypeAttribute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStereotypeAttributeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedsCodeModelPackage getLedsCodeModelPackage() {
		return (LedsCodeModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LedsCodeModelPackage getPackage() {
		return LedsCodeModelPackage.eINSTANCE;
	}

} //LedsCodeModelFactoryImpl
