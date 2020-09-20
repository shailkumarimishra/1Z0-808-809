package streamapi;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamapi.Dish.Type;
/*
 Q1. select vegetarians menu?
 Q2. select all non vegetarians menu?
 Q3. sort menu by calories?
 Q4. group menu by type?
 Q5. select highest calories meal?
 Q6. select lowest calories meal?
 Q7. select highest calories vegetarian meal?
 Q8. select highest calories non vegetarian meal?
 Q9. select first three dishes that have more than 300 calories?
 Q10. find out whether the menu is healthy (all dishes are below 100 calories)?
 Q11. find out whether the menu is not healthy(calories>=100)?
 Q12. find a dish that is vegetarian?
 Q13. group menu by type having more than 500 calories?
 */

public class StreamPractice {
	public static List<Dish> getMenu() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		return menu;
	}
	enum Caloriclevel{
		DIET,NORMAL,FAT;
	}

	public static void main(String[] args) {
//		Q1. select vegetarians menu?
//		getMenu().stream().filter(Dish::isVegetarian).collect(toList()).forEach(System.out::println);
//		Q2. select all non vegetarians menu?
//		getMenu().stream().filter(p->!p.isVegetarian()).collect(toList()).forEach(System.out::println);
//		Q4. group menu by type?
		Map<Type, Long> collect = getMenu().stream().collect(groupingBy(Dish::getType, counting()));
		collect.forEach((k, v) -> System.out.println(k + " " + v));
		
		LinkedHashMap<Type, Long> collect2 = collect.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Type::toString)))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		collect2.forEach((k, v) -> System.out.println(k + " " + v));
		
		LinkedHashMap<Type, Long> collect3 = collect.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		collect3.forEach((k, v) -> System.out.println(k + " " + v));
		Map<Type, Map<Caloriclevel, List<Dish>>> collect4 = getMenu().stream().collect(Collectors.groupingBy(Dish::getType,groupingBy(p->{
			if(p.getCalories()<=400)return Caloriclevel.DIET;
			else if(p.getCalories()<=700)return Caloriclevel.NORMAL;
			else return Caloriclevel.FAT;
		})));
		System.out.println(collect4);
		
		/*if(p.getCalories()<=400)return Caloriclevel.DIET;
		else if(p.getCalories()<=700)return Caloriclevel.NORMAL;
		else return Caloriclevel.FAT;*/
//		Q13. group menu by type having more than 500 calories?
        Map<Boolean, Map<Type, List<Dish>>> collect5 = getMenu().stream().collect(Collectors.partitioningBy(p->{return p.getCalories()>500;},Collectors.groupingBy(Dish::getType)));
        //		collect5.forEach((k,v)->System.out.println(k+" "+v));
		/*for(Map.Entry<Boolean, Map<Type,List<Dish>>> e:collect5.entrySet()) {
			for(Map.Entry<Type, List<Dish>> e1:e.getValue().entrySet()) {
				System.out.println("is calories>500: "+e.getKey()+" "+"Type: "+e1.getKey()+" "+"menu: "+e1.getValue());
			}
		}*/
		Map<Type, Map<Boolean, List<Dish>>> collect6 = getMenu().stream().collect(Collectors.groupingBy(Dish::getType,Collectors.groupingBy(Dish::isVegetarian)));
//		collect6.forEach((k,v)->v.forEach((k1,v1)->System.out.println(k+" "+k1+" "+v1)));
	/*	for(Map.Entry<Type, Map<Boolean,List<Dish>>> e:collect6.entrySet()) {
			for(Map.Entry<Boolean, List<Dish>>e1:e.getValue().entrySet()) {
				System.out.println("Type: "+e.getKey()+" "+"is vegetarian: "+e1.getKey()+" "+"Dish: "+e1.getValue());
			}
		}*/
		getMenu().stream().filter(p->{return p.getCalories()>500;}).peek(System.out::println).collect(Collectors.toList());//peek function is to debug the code
		Map<Type, Long> collect7 = getMenu().stream().collect(Collectors.groupingBy(Dish::getType,Collectors.counting()));
		collect7.forEach((k,v)->System.out.println(k+" "+v));
		String [] s= {"hello","world","java","servelet","jsp"};
		Arrays.stream(s).map(w->w.length()).collect(Collectors.toList()).forEach(System.out::println);
//		Arrays.stream(s).map(String::length).collect(Collectors.toList()).forEach(System.out::println);
		String str[]= {"hello","world"};
		Stream<String> stream = Arrays.stream(str);
		Stream<String[]> map = Arrays.stream(str).map(d->d.split(""));
		Stream<String> flatMap = map.flatMap(Arrays::stream);
//		List<Stream<String>> collect8 = map.map(Arrays::stream).distinct().collect(Collectors.toList());
//		List<String> collect9 = map.flatMap(Arrays::stream).distinct().collect(Collectors.toList());
//		System.out.println(collect9);
//		stream.flatMap(w->w.split(""));
		/*
		 Difference b/w map & flatMap:-
		 map transforms into a separate streams every time but flatMap transforms into single stream 
		 */
		
	/**
	 Q1. int[] a={1,2,3,4,5}
	 o/p:- 1,4,9,16,25
	 Q2.you have 2 list , list1 contains 1,2,3 and list2 contains 3,4. you should return pairs of numbers.
	 like:-  {[1,3],[1,4],[2,3],[2,4],[3,3],[3,4]}
	 Q3. extract all those pairs whose sum is multiple of 3?
	 */
//		Q1. solution
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> collect11 = list.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(collect11);
//		Q2. solution
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(3,4);
		List<int[]> collect8 = list1.stream().flatMap(i->list2.stream().map(j->new int[] {i,j})).collect(Collectors.toList());
		collect8.stream().forEach(k->System.out.print("("+k[0]+","+k[1]+")"));
//		Q3. solution
		List<int[]> collect10 = list1.stream().flatMap(i->list2.stream().filter(j->(i+j)%3==0).map(j->new int[] {i,j})).collect(Collectors.toList());
		System.out.println();
		collect10.stream().forEach(k->System.out.print("("+k[0]+","+k[1]+")"));
		
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper);
//		<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
		
//		Q. check all dish having calories less than 1000?
		System.out.println();
		boolean allMatch = getMenu().stream().allMatch(d->d.getCalories()<1000);
		System.out.println(allMatch);
		
//		Q. check none of the dish having calories greater than equal to 1000?
		boolean noneMatch = getMenu().stream().noneMatch(d->d.getCalories()>=1000);
		System.out.println(noneMatch);
		
//		Q. Any dish having calories less than 500?
		boolean anyMatch = getMenu().stream().anyMatch(d->d.getCalories()<500);
		System.out.println(anyMatch);
		
//		Q. find any vegetarian dish?
		Dish dish = getMenu().stream().filter(d->d.isVegetarian()).findAny().get();
		System.out.println(dish);
		
//		Q. sum all of the calories of the dishes?
//		T reduce(T identity, BinaryOperator<T> accumulator);
		Integer reduce = getMenu().stream().map(Dish::getCalories).reduce(0,(a,b)->(a+b));
		System.out.println(reduce);
//		 or 
		Integer reduce2 = getMenu().stream().map(Dish::getCalories).reduce(1,(a,b)->a+b);
		System.out.println(reduce2);// increases value by 1; working similar to other prog. lang ex-> int sum=0; sum=sum+a;
//		or
		Optional<Integer> reduce3 = getMenu().stream().map(Dish::getCalories).reduce(Integer::sum);
		System.out.println(reduce3.get());
		
//		 or we can use other methods also ,like:-
		Optional<Integer> reduce4 = getMenu().stream().map(Dish::getCalories).reduce(Integer::min);
		System.out.println(reduce4.get());
		
		// NUMERIC API
		
		int sum = getMenu().stream().mapToInt(Dish::getCalories).sum();
		System.out.println(sum);	
		OptionalDouble average = getMenu().stream().mapToInt(Dish::getCalories).average();
		System.out.println(average.getAsDouble());
		
	}

}






