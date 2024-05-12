package GenericTypesMethodsExample2;

import java.util.*;

class Helper {
	public static String OldGetType(Object o) {
		return o.getClass().getName();
	}
	// Generic Method Type Tipi Parametre Olarak Alan Method
	public static <T> String getType(T value) {
		String[] kelimeler =  value.getClass().getName().split("\\.");
		String className = kelimeler[kelimeler.length-1];
		return className;
	}
	
	public static <T> void butunDegerleriEkle(List<T> liste, T[] array) {
		for(T eleman:array) {
			liste.add(eleman);
		}
	}
	
//	elimizde farklı tiplerde listeler olunca tüm tipleri basmak için oluşturduk bu metodu:
	public static <T> void listeyiBas1(List <T> liste) {
		for(T values:liste) {
		System.out.print(values + " ");
	}
  }
	
	public static void listeyiYazdır(List <?> liste) {
		for(Object values:liste) {
		System.out.print(values + " ");
	}
  }
}

public class GenericTypesMethodsExample2 {

	public static void main(String[] args) {

		int number = 5;
		String name = "Esmanur Karataş";
		System.out.println("OldGetType");
		System.out.println("Number'ın Tipi: " + Helper.OldGetType(number));
		System.out.println("Name' in Tipi: " + Helper.OldGetType(name));
		
		System.out.println("\ngetType");
		System.out.println("Number'ın Tipi: " + Helper.getType(number));
		System.out.println("Name' in Tipi: " + Helper.getType(name));
		
		Integer[] numbers1 = {5,4,43,2,1,7,8,9,0};
		List<Integer> numbers2 = new ArrayList<>();
		List<String> names = new ArrayList<>() {
			{
			add("Esmanur");
			add("Ahmet");
			add("Ali");
			add("Esra");
			}
		};
		
//		for(Integer sayi: numbers1) {
//			numbers2.add(sayi);
//		}
		
		System.out.println("\nnumbers2 dizisindeki elemanlar: ");
		Helper.butunDegerleriEkle(numbers2, numbers1);
		for(int i = 0; i<numbers2.size(); i++) {	
			System.out.print(numbers2.get(i) + " ");
		}
		
		System.out.println("\n\nforEach ile numbers1 içindeki elemanlar: ");
		for(Integer s: numbers1) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n\nMetotla listeyi yazdırma");
		Helper.listeyiBas1(numbers2);
		
		System.out.println("\n\nString Listesi Elemanları: ");
		Helper.listeyiBas1(names);
		
		System.out.println("\n\nListeyiYazdır() Metodu ile listeyi yazdırma");
		Helper.listeyiYazdır(numbers2);
		
		System.out.println("\n\nListeyiYazdır() Metodu ile String Listesi Elemanları: ");
		Helper.listeyiYazdır(names);
	}

}
