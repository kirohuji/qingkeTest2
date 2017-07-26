package t20170712;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBText {
	public static void main(String[] args){
		Inventory inventory=new Inventory();
		FoodRecipe recipe=new FoodRecipe();
		recipe.name="Gorilla Chow";
		recipe.ingredient.addAll(Arrays.asList("Leaves","insects","fruit"));
		Animal animal=new Animal(Animal.AnimalClass.mammal,"Song Fang","Giant Panda","China","Bamboo","Friendly",45.0,recipe);
		inventory.animal.add(animal);
		try {
			marshall(inventory);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void marshall(Object jaxbObject) throws JAXBException, FileNotFoundException{
		JAXBContext context=JAXBContext.newInstance(jaxbObject.getClass());
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(jaxbObject, new FileOutputStream("a.xml"));
	}
}
