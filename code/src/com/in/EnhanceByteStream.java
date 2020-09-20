package com.in;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EnhanceByteStream {

	public static void main(String[] args) {
		try(BufferedInputStream bs=new BufferedInputStream(new FileInputStream("AddTwoNumbers.class"))){
			int val=0;
			while((val=bs.read())!=-1) {
				System.out.print((char)val);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
