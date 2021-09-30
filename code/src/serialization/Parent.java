package serialization;

import java.io.Serializable;

public class Parent implements Serializable{
private int i;

public Parent(int i) {
	super();
	this.i=i;
}

public int getI() {
	return i;
}

}
