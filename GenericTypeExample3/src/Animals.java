import java.util.List;

public class Animals {
private String name;

public Animals(String name) {
	setName(name);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override 
public String toString() {
	return name;
}

public static void getAnimals(List<? extends Animals> liste) {
	for(Object animals: liste) {
		System.out.println(animals);
	}
}
}
