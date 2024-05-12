import java.util.*;

public class GenericTypeEcample3Class {

	public static void main(String[] args) {
		
		ArrayList<Cat> cats = new ArrayList<>() {
			{
				add(new Cat("Boncuk"));
				add(new Cat("Tekir"));
			}
		};
		
		ArrayList<Dog> dogs = new ArrayList<>() {
			{
				add(new Dog("Mosi Mosi"));
				add(new Dog("Arigato"));
			}
		};
		
		Animals.getAnimals(dogs);
		Animals.getAnimals(cats);
	

	}

}
