package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerializationExample {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	MyAccount acc=new MyAccount(101,"shail","sh@il123");
	System.out.println("data before serialization: "+acc.getId()+", "+acc.getUsername()+", "+acc.getPwd());
	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("xyz.data"))){
		oos.writeObject(acc);
		System.out.println("data has been serialized");
		/*
		 * Note:-
		 * 		here static data member(id) and transient(pwd) get saved via customized 
		 * 		serialization so their will be no loss of original data after deserializing acc
		 */
		acc.setUsername("anu");
		acc.setId(110);
	}
	try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("xyz.data"))){
		MyAccount acc2=(MyAccount)ois.readObject();
		System.out.println("data has been deserialized\ndata after deserialization: "+acc.getId()+", "+acc2.getUsername()+", "+acc2.getPwd());
	}
}
}
