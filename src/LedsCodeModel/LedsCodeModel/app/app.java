package LedsCodeModel.LedsCodeModel.app;
import java.io.IOException;
import java.util.Date;

import LedsCodeModel.LedsCodeModel.Attribute;
import LedsCodeModel.LedsCodeModel.ClassDiagram;
import LedsCodeModel.LedsCodeModel.Feature;
import LedsCodeModel.LedsCodeModel.LedsCodeModelFactory;
import LedsCodeModel.LedsCodeModel.PrimitiveData;
import LedsCodeModel.LedsCodeModel.PrimitiveDataType;
import LedsCodeModel.LedsCodeModel.Specification;
import LedsCodeModel.LedsCodeModel.StereotypeClass;


public class app {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		LedsCodeModelFactory factory = LedsCodeModelFactory.eINSTANCE;
		
		Specification specification = factory.createSpecification();
		specification.setName("teste");
		specification.setCreatedDate(new Date());
		
		Feature	 features = factory.createFeature();
		features.setLanguage("JAVA");
		features.setDataBaseName("Hypersonic");
		features.setEngine("SPRINGROO");
		features.setOrm("HIBERNATE");
		features.setApplicationType("WEB");
		
		specification.setDescribed(features);
		
		ClassDiagram classDiagram = factory.createClassDiagram();
		classDiagram.setName("Boliche");
		
		specification.getHas().add(classDiagram);
		
	 	LedsCodeModel.LedsCodeModel.Class jogador = factory.createClass();
	 	
	 	classDiagram.getComposed().add(jogador);
	 	
	 	jogador.setName("Jogador");
	 	jogador.setAbstract(false);
	 	jogador.getStereotypeClass().add(StereotypeClass.ENTITY);
	 	jogador.getStereotypeClass().add(StereotypeClass.VIEW);
	 	
	 	Attribute nome = factory.createAttribute();
	 	nome.setName("nome");
	 	
	 	PrimitiveDataType primitiveDataType = factory.createPrimitiveDataType();
	 	primitiveDataType.setType(PrimitiveData.STRING);
	 	nome.setType(primitiveDataType);
	 	
	 	jogador.getAttributes().add(nome);
	 	
		
	}

}
