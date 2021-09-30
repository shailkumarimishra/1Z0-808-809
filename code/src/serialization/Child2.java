package serialization;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Child2 extends Parent{
private int j;

public Child2(int i, int j) {
	super(i);
	this.j = j;
}

public int getJ() {
	return j;
}
private void writeObject(ObjectOutputStream oos) throws NotSerializableException {
	throw new NotSerializableException();
}
private void readObject(ObjectInputStream ois) throws NotSerializableException {
	throw new NotSerializableException();
}
}
