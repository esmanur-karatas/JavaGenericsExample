
public class Person <T,U> {
	private String name;
	private T length;
	private U kilo;
	
//	Constructor 
	public Person(String name, T length, U kilo) {
		this.name = name;
		this.length = length;
		this.kilo = kilo;
	}
	
	public void giveInformation() {
		System.out.println("İsim: " + name + " Tip: " + name.getClass().getName());
		System.out.println("Boy: " + length + " Tip: " + length.getClass().getName());
		System.out.println("Kilo: " + kilo + " Tip: " + kilo.getClass().getName());
	}

}
