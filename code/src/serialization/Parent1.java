package serialization;

public class Parent1 {
private int i;

public Parent1(int i) {
	super();
	this.i = i;
}

public Parent1() {
	super();
//	this.i=30;
	System.out.println("Parent1 class constructor");
}

public int getI() {
	return i;
}

}
