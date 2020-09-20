package api;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		boolean b=list.add(10);
		System.out.println(b);
		list.add("Anjali");
		list.add(10.0);
		list.add(129);
		list.add("Shail");
		boolean b1=list.add(null);
		System.out.println(b1);
		/*for(int i=0;i<list.size();i++) {
		int a=(int)list.get(i);
		System.out.println(a);
		
		}*/
//		List<Integer> list2=new ArrayList<>();//polymorphism
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		String s="whizlab";
		Predicate<String> p=s1->s1.indexOf("i")>0;
		System.out.println(p.and(s2->s2.length()>4).negate().test(s));
		System.out.println(p.negate().or(s2->s2.length()>4).test(s));
		/*for(int i=0;i<list2.size();i++) {
			int a=list2.get(i);
			System.out.println(a);
		}*/
		/*while(i<list2.size()) {
			int a=list2.get(i);
			System.out.println(a);
			i++;
		}*/
		/*for(int a : list2) {
			System.out.println(a);
		}*/
		/*Iterator<Integer> iterator = list2.iterator();
		while(iterator.hasNext()) {
			int next=iterator.next();
			System.out.println(next);
		}*/
		/*ListIterator<Integer> listIterator = list2.listIterator();
		while(listIterator.hasNext()) {
			int next=listIterator.next();
			System.out.println(next);
		}*/
		/*Enumeration<Integer> enumeration = Collections.enumeration(list2);
		while(enumeration.hasMoreElements()) {
			int next=enumeration.nextElement();
			System.out.println(next);
		}*/
//		list2.forEach(j->System.out.println(j));
//		list2.stream().forEach(System.out::println);
//		list2.forEach(System.out::println);
		
	}

}
