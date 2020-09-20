package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
remove
get
put
equals
values
hashCode
clear
isEmpty
replace
replaceAll
size
entrySet
putAll
putIfAbsent
forEach
keySet
compute
computeIfAbsent
computeIfPresent
containsKey
containsValue
getOrDefault
merge

Q String [] str={"A","B","A","C","B","A"}
print duplicate words with i) count
and ii) without count?

Q How HashMap internally work?

 */

public class HashMapExample {
	
	public static void main(String[] args) {
		Map <Integer,String> map= new HashMap<>();
		map.put(25,"A");
		map.put(33,"B");
		map.put(32, "C");
		map.put(34, "D");
		map.put(5, "E");
		map.put(33,"F");
		map.put(null,"G");
		String value = map.get(3);
		System.out.println(value);
		for(Map.Entry<Integer, String>e:map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		Set<Integer>keys = map.keySet();
		for(Integer key:keys) {
			System.out.println(key);
		}
		String [] str={"A","B","A","C","B","A"};
		Stream<String> stream = Arrays.stream(str);
		Map<String, Long> collect = stream.collect(Collectors.groupingBy(String::toString,Collectors.counting()));
		collect.forEach((k,v)->System.out.println(k+" "+v));
	}
	
	
	
	
	
	
	

}
