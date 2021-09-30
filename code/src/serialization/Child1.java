package serialization;

import java.io.Serializable;

public class Child1 extends Parent1 implements Serializable{
private int j;

public Child1(int i, int j) {
	super(i);
	this.j = j;
}

public int getJ() {
	return j;
}

}
