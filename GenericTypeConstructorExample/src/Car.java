
public class Car<T> {
	private T brand;
	private T model;
	private T year;
	
	public Car(T brand, T model, T year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Marka: " + brand + " Model: " + model + " Yıl: " + year; 
	}
}
