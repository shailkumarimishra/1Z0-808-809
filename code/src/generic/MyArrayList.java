package generic;

import java.util.ArrayList;

public class MyArrayList <T> {
	public T add(T t) {
		return t;
	}
	public  void m1(ArrayList <? super I> e  ) {
		
		
	}
	public <D extends Number> void m2(D d) {
		
	}
//	1. public void methodOne(ArrayList<String> l){} // 1&2 cannot be used concurrently
//	2. public void methodOne(ArrayList<Number> l){} 


}
