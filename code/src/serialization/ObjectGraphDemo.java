package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Note:- object graph:-
 * 			when we serialize any object and if it contains any other object reference then
 * 			JVM serializes the object and as well as its object references.(only if the object 
 * 			which contains reference to them is serialized.)
 * 	
 * 		   In object graph every object should be serializable. If at-least one object is not 
 *         serializable then we will get runtime exeception saying NonSerializableExeception.
 */

public class ObjectGraphDemo {

	public static void main(String[] args) throws Exception {
		A obj = new A();
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dcf.str"))) {
			oos.writeObject(obj);
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dcf.str"))) {
			A a1 = (A) ois.readObject();
			System.out.println("values of a,b,c,d after deserialization: " + a1.b.c.getA() + ", " + a1.b.c.getB() + ", "
					+ a1.b.c.getC() + ", " + a1.b.c.getD());
		}
	}
}
