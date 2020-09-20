package streamapi;

import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
//Q1. select vegetarians menu? && Q12. find a dish that is vegetarian?
//getMenu().stream().filter((p)->{return p.isVegetarian()==true;}).collect(Collectors.toList()).forEach(System.out::println);
//Q2. select all non vegetarians menu?
//getMenu().stream().filter((p)->{return p.isVegetarian()==false;}).collect(Collectors.toList()).forEach(System.out::println);
//Q3. sort menu by calories?
/*	List<Dish> sortCalories = getMenu().stream().sorted(Comparator.comparing(Dish::getCalories)).collect(Collectors.toList());
sortCalories.forEach(System.out::println);*/
//Q4. group menu by type?
/*	Map<Type, List<Dish>> groupMenu = getMenu().stream().collect(Collectors.groupingBy(Dish::getType));
groupMenu.forEach((k,v)->{System.out.println(k+" "+v);});*/
//Q5. select highest calories meal?
/*	Dish maxCalories = getMenu().stream().max(Comparator.comparing(Dish::getCalories)).get();
System.out.println(maxCalories);*/
//Q6. select lowest calories meal?
/*	Dish minCalories = getMenu().stream().min(Comparator.comparing(Dish::getCalories)).get();
System.out.println(minCalories);*/
//Q7. select highest calories vegetarian meal?
/*Dish highestVegCaloriesMeal = getMenu().stream().filter((p)->{return p.isVegetarian();}).max(Comparator.comparing(Dish::getCalories)).get();
System.out.println(highestVegCaloriesMeal);*/
//Q8. select highest calories non vegetarian meal?
/*Dish highestNonVegCaloriesMeal = getMenu().stream().filter((p)->{return p.isVegetarian()==false;}).max(Comparator.comparing(Dish::getCalories)).get();
System.out.println(highestNonVegCaloriesMeal);*/
//Q9. select first three dishes that have more than 300 calories?
//getMenu().stream().filter((p)->{return p.getCalories()>300;}).limit(3).collect(Collectors.toList()).forEach(System.out::println);
//Q10. find out whether the menu is healthy (all dishes are below 100 calories)? && Q11. find out whether the menu is not healthy(calories>=100)?
/*List<Dish> collect = getMenu().stream().filter((p)->{return p.getCalories()<=100;}).collect(Collectors.toList());
boolean empty = collect.isEmpty();
if(empty==true)
System.out.println("not healthy menu");
else
System.out.println("healthy menu");*/
	}

}
