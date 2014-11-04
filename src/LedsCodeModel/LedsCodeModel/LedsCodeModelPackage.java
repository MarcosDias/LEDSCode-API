/**
 */
package LedsCodeModel.LedsCodeModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LedsCodeModel.LedsCodeModel.LedsCodeModelFactory
 * @model kind="package"
 * @generated
 */
public interface LedsCodeModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LedsCodeModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "LedsCodeModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LedsCodeModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LedsCodeModelPackage eINSTANCE = LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.impl.SpecificationImpl
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CREATED_DATE = 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__HAS = 2;

	/**
	 * The feature id for the '<em><b>Described</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DESCRIBED = 3;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.impl.ModelImpl
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.impl.FeatureImpl
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Data Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DATA_BASE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ENGINE = 2;

	/**
	 * The feature id for the '<em><b>Orm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ORM = 3;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__APPLICATION_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.impl.ClassDiagramImpl
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getClassDiagram()
	 * @generated
	 */
	int CLASS_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__NAME = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__COMPOSED = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.impl.ClassImpl
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPOSED = 2;

	/**
	 * The feature id for the '<em><b>Stereotype Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STEREOTYPE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.impl.AttributeImpl
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.StereotypeClass <em>Stereotype Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.StereotypeClass
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getStereotypeClass()
	 * @generated
	 */
	int STEREOTYPE_CLASS = 6;

	/**
	 * The meta object id for the '{@link LedsCodeModel.LedsCodeModel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LedsCodeModel.LedsCodeModel.Type
	 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;


	/**
	 * Returns the meta object for class '{@link LedsCodeModel.LedsCodeModel.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Specification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Specification#getName()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Name();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Specification#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Specification#getCreatedDate()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_CreatedDate();

	/**
	 * Returns the meta object for the containment reference list '{@link LedsCodeModel.LedsCodeModel.Specification#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Specification#getHas()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Has();

	/**
	 * Returns the meta object for the reference '{@link LedsCodeModel.LedsCodeModel.Specification#getDescribed <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Described</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Specification#getDescribed()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Described();

	/**
	 * Returns the meta object for class '{@link LedsCodeModel.LedsCodeModel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link LedsCodeModel.LedsCodeModel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Feature#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Feature#getLanguage()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Language();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Feature#getDataBaseName <em>Data Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base Name</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Feature#getDataBaseName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_DataBaseName();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Feature#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Feature#getEngine()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Engine();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Feature#getOrm <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Feature#getOrm()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Orm();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Feature#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Feature#getApplicationType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_ApplicationType();

	/**
	 * Returns the meta object for class '{@link LedsCodeModel.LedsCodeModel.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram</em>'.
	 * @see LedsCodeModel.LedsCodeModel.ClassDiagram
	 * @generated
	 */
	EClass getClassDiagram();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.ClassDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LedsCodeModel.LedsCodeModel.ClassDiagram#getName()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EAttribute getClassDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link LedsCodeModel.LedsCodeModel.ClassDiagram#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed</em>'.
	 * @see LedsCodeModel.LedsCodeModel.ClassDiagram#getComposed()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_Composed();

	/**
	 * Returns the meta object for class '{@link LedsCodeModel.LedsCodeModel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Class#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

	/**
	 * Returns the meta object for the reference list '{@link LedsCodeModel.LedsCodeModel.Class#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composed</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Class#getComposed()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Composed();

	/**
	 * Returns the meta object for the attribute list '{@link LedsCodeModel.LedsCodeModel.Class#getStereotypeClass <em>Stereotype Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stereotype Class</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Class#getStereotypeClass()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_StereotypeClass();

	/**
	 * Returns the meta object for class '{@link LedsCodeModel.LedsCodeModel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link LedsCodeModel.LedsCodeModel.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for enum '{@link LedsCodeModel.LedsCodeModel.StereotypeClass <em>Stereotype Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stereotype Class</em>'.
	 * @see LedsCodeModel.LedsCodeModel.StereotypeClass
	 * @generated
	 */
	EEnum getStereotypeClass();

	/**
	 * Returns the meta object for enum '{@link LedsCodeModel.LedsCodeModel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see LedsCodeModel.LedsCodeModel.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LedsCodeModelFactory getLedsCodeModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.impl.SpecificationImpl
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__CREATED_DATE = eINSTANCE.getSpecification_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__HAS = eINSTANCE.getSpecification_Has();

		/**
		 * The meta object literal for the '<em><b>Described</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__DESCRIBED = eINSTANCE.getSpecification_Described();

		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.impl.ModelImpl
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.impl.FeatureImpl
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__LANGUAGE = eINSTANCE.getFeature_Language();

		/**
		 * The meta object literal for the '<em><b>Data Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DATA_BASE_NAME = eINSTANCE.getFeature_DataBaseName();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ENGINE = eINSTANCE.getFeature_Engine();

		/**
		 * The meta object literal for the '<em><b>Orm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ORM = eINSTANCE.getFeature_Orm();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__APPLICATION_TYPE = eINSTANCE.getFeature_ApplicationType();

		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.impl.ClassDiagramImpl
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getClassDiagram()
		 * @generated
		 */
		EClass CLASS_DIAGRAM = eINSTANCE.getClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM__NAME = eINSTANCE.getClassDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__COMPOSED = eINSTANCE.getClassDiagram_Composed();

		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.impl.ClassImpl
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__COMPOSED = eINSTANCE.getClass_Composed();

		/**
		 * The meta object literal for the '<em><b>Stereotype Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__STEREOTYPE_CLASS = eINSTANCE.getClass_StereotypeClass();

		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.impl.AttributeImpl
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.StereotypeClass <em>Stereotype Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.StereotypeClass
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getStereotypeClass()
		 * @generated
		 */
		EEnum STEREOTYPE_CLASS = eINSTANCE.getStereotypeClass();

		/**
		 * The meta object literal for the '{@link LedsCodeModel.LedsCodeModel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LedsCodeModel.LedsCodeModel.Type
		 * @see LedsCodeModel.LedsCodeModel.impl.LedsCodeModelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //LedsCodeModelPackage
