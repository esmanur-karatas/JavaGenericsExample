
public class GenericTypesClassExample {

	public static void main(String[] args) {
		Person person1 = new Person("Ahmet", 1.82,82);
		Person person2 = new Person("Esmanur", 1.70,70);
		Person person3 = new Person("Feyza", 1.67,62);
		Person person4 = new Person("Ali", 1.78,75);
		Person person5 = new Person("Aslı", 1.62,55);
		Person person6 = new Person("Sıla", 1.52,50);
		
		System.out.println("Kişi Sınıfını Değerleri ve Tipi: ");
		person1.giveInformation();
		
		Student s1 = new Student("12345", "Ahmet Domurcuk", "2007");
		Student s2 = new Student <Integer, String, Integer>(564738, "Esmanur Karataş", 2009);
		System.out.println("\nÖğrenci Sınıfının Değerleri ve Tipi");
		s1.giveInformation2();
	}

}
