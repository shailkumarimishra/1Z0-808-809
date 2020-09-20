package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsOnFile {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("E:\\cproject\\test.txt");
//		writing files
		String s="Hey!! iam learning to code in java \n what technology are you learning ?\n shail \n shradha";
		//Files.write(path1, s.getBytes());
//		read files
		byte[] read = Files.readAllBytes(path1);
		//System.out.println(new String(read));
		//2nd approach
		List<String> readline = Files.readAllLines(path1);
		//readline.forEach(System.out::println);
		Stream<String> lines = Files.lines(path1);
		lines.collect(Collectors.toList()).forEach(System.out::println);
//		copy files
		Path path2 = Paths.get("E:\\cproject\\main.txt");
	  //Path copy = Files.copy(path1,path2);
	  //System.out.println(copy);
//      move files
		Path path3 = Paths.get("E:\\software\\movefile.txt");
	  //Files.move(path2,path3,StandardCopyOption.REPLACE_EXISTING);
//		Delete files
//		Files.delete(path3);
		System.out.println("File deleted...");
		
		

	}

}
