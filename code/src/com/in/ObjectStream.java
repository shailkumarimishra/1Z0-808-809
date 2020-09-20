package com.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectStream {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "ambe");
		map.put(2, "amit");
		map.put(3, "shradha");
		map.put(4, "shail");
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.data"))){
			oos.writeObject(map);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	}
	try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.data"))){
		try {
			Map<Integer,String> readObject =(Map<Integer,String>) ois.readObject();
			readObject.forEach((k,v)->System.out.println(k+" "+v));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
