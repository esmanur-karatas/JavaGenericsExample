interface Donusum<T1, T2>{
	T1 cevir(T2 x);
	T2 tersCevir(T1 x);
}

class Helper implements Donusum<String, Integer>{

	@Override
	public String cevir(Integer x) {
		return x.toString();
	}

	@Override
	public Integer tersCevir(String x) {
		return Integer.parseInt(x);
	}
	
}
public class GenericTypeInterfaceExample {

	public static void main(String[] args) {
		Helper h1 = new Helper();
	    String string1 = "546";
	    int number1 = 478;
	    
	    System.out.println("INTEGER'I STRİNG'E ÇEVİR : " + h1.cevir(number1) + " tipi: " + h1.cevir(number1).getClass().getName());
	    System.out.println("STRİNG'İ INTEGER'A ÇEVİR: " + h1.tersCevir(string1) + " tipi: " + h1.tersCevir(string1).getClass().getName());
	}

}
