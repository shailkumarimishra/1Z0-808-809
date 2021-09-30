package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		Demo demo=new Demo(1,"shail");
		//serialization of object of a class
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("test.data"))){
			oos.writeObject(demo);
			System.out.println("data before serialization: "+demo.getA()+" "+demo.getS());
			System.out.println("Demo class Object has been Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//deserialization of object of a class
		Demo demo1=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test.data"))){
			demo1=(Demo)ois.readObject();
			System.out.println("Demo Class Object has been DeSerialized");
			System.out.println("data after deserialization: "+demo1.getA()+" "+demo1.getS());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
