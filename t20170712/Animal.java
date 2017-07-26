package t20170712;

import t20170712.Animal.AnimalClass;

public class Animal {
	static public enum AnimalClass {
		mammal, reptile, bird, fish, amphibian, invertebrate
	}

	public AnimalClass animalClass;
	public String name, species, habiat, food, temperament;
	public Double weight;
	public FoodRecipe foodRecipe;

	public Animal(AnimalClass animalClass, String name, String species, String habiat, String food, String temperament,
			Double weight, FoodRecipe foodRecipe) {
		super();
		this.animalClass = animalClass;
		this.name = name;
		this.species = species;
		this.habiat = habiat;
		this.food = food;
		this.temperament = temperament;
		this.weight = weight;
		this.foodRecipe = foodRecipe;
	}

	public String toString() {
		return name + "(" + animalClass + "," + species + ")";
	}
}
