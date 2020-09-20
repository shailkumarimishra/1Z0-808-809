package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NioStream {
	public static void main(String[] args) {
		Path path = Paths.get("E:\\cproject\\test.txt");
		try(Stream<String> lines = Files.lines(path)) {
			Map<String, Long> collect = lines.collect(Collectors.groupingBy(String::toString,Collectors.counting()));
//			collect.forEach((k,v)->System.out.println(k+" "+v));
		} catch (IOException e) {
			e.printStackTrace();
		}
//		to see all folders inside a given directory or path (it is non-recursive)
		Path path2 = Paths.get("E:\\");
		try(Stream<Path>entry=Files.list(path2)){
//			entry.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		to see all folders inside folder of a given path or directory (it is recursive)
		Path path3 = Paths.get("E:\\cproject");
		try(Stream<Path> walk=Files.walk(path3)){
			walk.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
