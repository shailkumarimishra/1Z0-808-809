package serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class PythonSerObjectToJava {
	 

	public static void main(String[] args) {
		try {
			File file=new File("E:\\Desktop files\\web-projects\\Js workshop\\Day3\\ser_demo.py");
			ProcessBuilder pb=new ProcessBuilder("python","E:\\Desktop files\\web-projects\\Js workshop\\Day3\\ser_demo.py");
			Process p=pb.start();
			BufferedReader in=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String readLine = in.readLine();
			System.out.println(readLine);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
