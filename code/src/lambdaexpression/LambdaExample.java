package lambdaexpression;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

//Q. Difference b/w ArrayList and vector?
//Q.Write hierarchy of the Collection?
public class LambdaExample {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		l1.add(90);
		l1.add(100);
		// In how many ways you can Iterate/fetch the record from list?
		// 1.
		/*for (int i = 0; i < l1.size(); i++) {
			Integer value = l1.get(i);
			System.out.println(value);
		}*/
		//2.using while loop
		int i=0;
		while(i<l1.size()) {
			System.out.println(l1.get(i++));
		}
		//3. using enhance for loop
		for(int j:l1) {
			System.out.println(j);
		}
	//4. using iterator
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	//5. using list iterator	
		ListIterator<Integer> lt = l1.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
   //6. using ennumeration
		Enumeration<Integer> eit = Collections.enumeration(l1);
		while(eit.hasMoreElements()) {
			System.out.println(eit.nextElement());
		}
//Q. Difference b/w iterator and listiterator?
//Q. Difference b/w iterator and ennumeration?
	//7. using for each method
		l1.forEach(System.out::println);
		l1.forEach(k->System.out.println(k));
		l1.stream().forEach(System.out::println);
		l1.stream().forEach(k->System.out.println(k));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
