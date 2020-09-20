package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributeDemo {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("E:\\cproject\\");
		BasicFileAttributes bfa = Files.readAttributes(path,BasicFileAttributes.class);
		System.out.println(bfa.size());
		System.out.println(bfa.lastAccessTime());
		System.out.println(bfa.creationTime());
	}

}
