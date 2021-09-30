package serialization;

public class Child extends Parent{
private int j;

public Child(int i, int j) {
	super(i);
	this.j = j;
}

public int getJ() {
	return j;
}

}
