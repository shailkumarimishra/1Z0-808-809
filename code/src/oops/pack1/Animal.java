package oops.pack1;

public class Animal {
public String name="Heera";
public static int leg=4;
public Animal(String name) {
	super();
	this.name = name;
//	System.out.println(name);
}
/*public Animal() {
	
}*/
public static void getSound() {
	System.out.println("static getSound()");
}
public String getName() {
	System.out.println(" instance getName() ");
	return name;
}
}
