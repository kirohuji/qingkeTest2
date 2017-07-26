package t20170711;

public class Animal {
	public AnimalClass animalClass;
	public String name,species,habiat,food,temperament;
	public Double weight;
	public FoodRecipe foodRecipe;
	public String toString(){
		return name+"("+animalClass+","+species+")";
	}
}
