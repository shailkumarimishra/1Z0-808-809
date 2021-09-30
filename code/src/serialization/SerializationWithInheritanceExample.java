package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Note:- Serialization w.r.t Inheritance
 * 1. If a superclass is serializable then subclass is automatically serializable.
 * 2. If a superclass is not serializable then subclass can still be serialized.
 *
 * 		->Serialization: Any instance variable inheriting from non-serializable superclass,then
 * 						 JVM ignores original value and save default value.
	    ->DeSerialization:Any non-serializable superclass is present, then JVM execute instance
	                      control flow in the superclass by invoking default(no-arg)constructor
	                      So every non-serializable superclass must contain default constructor
	                      otherwise we will get runtime-exception.
	                      
 * 3. If the superclass is serializable but we don’t want the subclass to be serialized.
 * 		By implementing the writeObject() and readObject() methods in the subclass and throw
 * 		NotSerializableException from these methods.
 */

public class SerializationWithInheritanceExample {

	public static void main(String[] args) throws Exception{
// Case1:  If superclass is serializable then subclass is automatically serializable
		Child child=new Child(10,20);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("shail.txt"))){
			oos.writeObject(child);
			System.out.println("Child class object has been Serialized.");
			System.out.println("data before deserialization: "+child.getI()+", "+child.getJ());
		}
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("shail.txt"))){
		Child child1=(Child)ois.readObject();
		System.out.println("Child class object has been deserialized.");
		System.out.println("data after deserialization: "+child1.getI()+", "+child1.getJ());
		}
// Case2: If a superclass is not serializable then subclass can still be serialized 
		Child1 ch=new Child1(100,200);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("shail.txt"))){
			oos.writeObject(ch);
			System.out.println("Child1 class object has been Serialized.");
			System.out.println("data before deserialization: "+ch.getI()+", "+ch.getJ());
		}
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("shail.txt"))){
			Child1 ch1=(Child1)ois.readObject();
			System.out.println("Child1 class object has been deserialized.");
			System.out.println("data after deserialization: "+ch1.getI()+", "+ch1.getJ());
			}
// Case3: If the superclass is serializable but we don’t want the subclass to be serialized
		Child2 c=new Child2(1000,3000);
		System.out.println("data before serialization: "+c.getI()+", "+c.getJ());
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("shail.txt"))){
			oos.writeObject(c);
			System.out.println("Child2 class object has been Serialized.");
//			System.out.println("data before deserialization: "+c.getI()+", "+c.getJ());
		}
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("shail.txt"))){
			Child2 c1=(Child2)ois.readObject();
			System.out.println("Child2 class object has been deserialized.");
			System.out.println("data after deserialization: "+c1.getI()+", "+c1.getJ());
			}
	}

}
