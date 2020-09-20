package com.in;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) {
//		Try opening the file with file reader
		try(FileReader fr=new FileReader("log.txt")){
			int val=0;
			while((val=fr.read())!=-1) {
				System.out.print((char)val);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception occured while opening the file!!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
