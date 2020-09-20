package multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//Q what is fail fast ?
//Ans:- Whenever you trying to iterate values from ArrayList and at the same time you or 
//or other thread try to modify the list then you will get ConcurrentModificationException
//(run time), this is b/c ArrayList is not thread safe. This activity is known as fail fast
//exception. To overcome the above problem we have to use CopyOnWriteArrayList, which is 
//thread safe and you will not get any ConcurrentModificationException.This activity is 
//known as fail safe.
public class CopyOnWriteArrayListDemo {
public static void main(String[] args) {
	List<Integer> list=new CopyOnWriteArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	Iterator<Integer> iterator = list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		list.add(60);
	}
	System.out.println(list);
}
}
