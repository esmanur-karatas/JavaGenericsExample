class Helper {
	public static String OldGetType(Object o) {
		return o.getClass().getName();
	}
	// Generic Method Type Tipi Parametre Olarak Alan Method
	public static <T> String getType(T value) {
		return value.getClass().getName();
	}
}
public class GenericTypeMethodExample {

	public static void main(String[] args) {
		int number = 5;
		String name = "Esmanur Karataş";
		System.out.println("OldGetType");
		System.out.println("Number'ın Tipi: " + Helper.OldGetType(number));
		System.out.println("Name' in Tipi: " + Helper.OldGetType(name));
		
		System.out.println("\ngetType");
		System.out.println("Number'ın Tipi: " + Helper.getType(number));
		System.out.println("Name' in Tipi: " + Helper.getType(name));
	}

}
