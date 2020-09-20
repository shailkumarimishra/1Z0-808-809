package com.nio;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) throws IOException {
//		How can we create an object of Path?
		Path path = Paths.get("C:\\homeworkjava\\addition.java");
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getNameCount());// 2(i.e;it does'nt include root.)
		System.out.println(path.getName(1));// index starts from 0 excluding root therefore o/p->
											// addition.java
		System.out.println(path.subpath(0, 2));// if increase by range then IllegalArgumentException
	    System.out.println(path.normalize());//remove redundant element & returns full path
	    System.out.println(path.isAbsolute());
	    System.out.println(path.toAbsolutePath());//throw an I/O error if the file system is not accessible
	    										  //& returns an object as path.
	    System.out.println(path.startsWith("C:\\"));
	    System.out.println(path.toUri());//returns URI hierarchical to root path 
	    System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));//returns absolute path(it validate the path)
	    Path path2 = Paths.get("additon.java");
	    System.out.println(path.compareTo(path2));//if 0 means equal,if +ve value means path>path2,
	    System.out.println(path2.compareTo(path));//if -ve value means path2<path.
	    System.out.println(path.equals(path2));//false
	    System.out.println(path.equals(path2.isAbsolute()));
	    System.out.println(path.toAbsolutePath().equals(path2));
	    System.out.println(path.toAbsolutePath().equals(path2.toAbsolutePath()));
	    												
	    
	}

}
