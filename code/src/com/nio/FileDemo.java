package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//Steps to create file in given directory:-
//		1. firstly, set directories
		Path path = Paths.get("E:\\cproject\\");
		Path cr = Files.createDirectories(path);
		System.out.println("File created at path "+cr);
		
//		one can also check whether directory is correct or not.
		if(Files.isDirectory(path,LinkOption.NOFOLLOW_LINKS))
			System.out.println("true");
		else
			System.out.println("false");
		
//		one can also check the attributes of the file
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isExecutable(path));
		
//		2. now create file in that directory
//		Path path1 = Paths.get("E:\\cproject\\test.txt");
		Path path1 = Paths.get("E:\\cproject\\main.txt");
		Path cf = Files.createFile(path1);
		System.out.println(cf);
	}

}
