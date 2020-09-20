package map;

import java.util.HashMap;
import java.util.Map; 

public class Practise {

	public static void main(String[] args) {
		String [] str={"A","B","A","C","B","A"};
		Map<String,Integer> map=new HashMap<>();
		for(String s:str) {
			if(map.containsKey(s)) {
				int count=map.get(s);
				count++;
				map.put(s,count);
			}
			else {
				map.put(s,1);
			}
		}
map.forEach((k,v)->System.out.println(k+" "+v));
	}

}
