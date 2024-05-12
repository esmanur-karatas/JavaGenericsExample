class GenericClass{
	private Object x;
	
	public void setX(Object x) {
		this.x=x;
	}
	
	public Object getX() {
		return x;
	}
	
	@Override 
	public String toString () {
		return "Bu Bir Jeneric Sınıftır.";
	}
	
	public void xDegeriniSoyle() {
		System.out.println("\nx değeri : " + x);
	}
	public void xSinifiniSoyle() {
		System.out.println("x' in tipi: " + x.getClass().getName());
	}
}

public class GenericClasses {

	public static void main(String[] args) {
		GenericClass g1 = new GenericClass();
		GenericClass g2 = new GenericClass();
		// System.out.println(g1);
		System.out.println(g1.toString());
		
		g1.setX(150);
		//System.out.println("g1 in değeri: " + g1.getX());
		//System.out.println("g1 in tipi: " + g1.getX().getClass().getName());
        
		g2.setX(150.4);
        //System.out.println("g2 nin değeri: " + g2.getX());
        //System.out.println("g2 nin tipi: " + g2.getX().getClass().getName());
		
        g1.xDegeriniSoyle();
        g1.xSinifiniSoyle();
        
        
        g2.xDegeriniSoyle();
        g2.xSinifiniSoyle();
        
        GenericClass g3 = new GenericClass();
        g3.setX("Esmanur Karataş");
        g3.xDegeriniSoyle();
        g3.xSinifiniSoyle();
	}

}
