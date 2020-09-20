package com.in;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		try(BufferedReader bf=new BufferedReader(new FileReader("log.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("lognew1.txt"))){
			String word=null;
			Map<String,Integer> map=new HashMap<>();
			while((word=bf.readLine())!=null) {
				if(map.containsKey(word)) {
					int count=map.get(word);
					count++;
					map.put(word,count);
				}
				else
					map.put(word, 1);
			}
			
			
			bw.write("word"+"\t"+"count"+"\n");
			for(Map.Entry<String, Integer> w:map.entrySet()) {
				bw.write(w.getKey()+"\t"+w.getValue()+"\n");
			}

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
