
public class Student<T,U,V> {
	private T okulNo;
	private U name;
	private V girisYili;
	
	public Student(T okulNo, U name, V girisYili) {
		this.okulNo = okulNo;
		this.name = name;
		this.girisYili = girisYili;
	}
	
	public void giveInformation2() {
		System.out.println("Okul No: " + okulNo + " Tip: " + name.getClass().getName());
		System.out.println("İsim: " + name + " Tip: " + name.getClass().getName());
		System.out.println("Giriş Yılı: " + girisYili + " Tip: " + girisYili.getClass().getName());
	}
}
