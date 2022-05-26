package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CMTTest {

	public static void main(String[] args) throws Exception{
		String s="rO0ABXNyADpjb20uYWxzdG9tLnBvd2VyLnR0dC5yZC5jb3JyZWxhdGlvbi5Db3JyZWxhdGlvbK1hdHJpeFRhYmxlraHFJLY3qxQCAAFbAAttYXRyaXhUYWJsZXQAFFtbTGphdmEvbGFuZy9PYmplY3Q7eHB1cgAUW1tMamF2YS5sYW5nLK9iamVjdDsYv/tT5GvbyglAAHhwAAAAAA==";
		CMT cmt=new CMT(s);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("cmttest.ser"))){
			oos.writeObject(cmt);
			System.out.println("before deserialization: "+cmt.getDataSerialized());
		}
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("cmttest.ser"))){
		CMT cmt1=(CMT)ois.readObject();
		System.out.println("after deserialization: "+cmt1.getDataSerialized());
		}
	}

}
