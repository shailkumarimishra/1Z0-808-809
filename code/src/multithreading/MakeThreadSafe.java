package multithreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MakeThreadSafe {

	public static void main(String[] args) {
//Q. How you can make List, Set, Map and Collection thread safe?
		List<Integer> list = new ArrayList<>();
		List<Integer> threadSafeList = Collections.synchronizedList(list);
		Set<Integer> set=new HashSet<>();
		Set<Integer> threadSafeSet  = Collections.synchronizedSet(set);
		Map<Integer,String> map=new HashMap<>();
		Map<Integer, String> threadSafeMap = Collections.synchronizedMap(map);
		Collection<Integer> collection= new ArrayList<>();
		Collection<Integer> threadSafeCollection = Collections.synchronizedCollection(collection);
		

	}

}
