package oops.pack1;
/*
 * Polymorphism:- If the same object behaves differently depending on which side 
 * 				of that object you are looking at, then that object is polymorphic.
 * 				e.g; Suppose an Apple class extends a Fruit class, then an apple can
 * 				behave as an apple as well as fruit.Later on a RedApple class that extends
 * 				the Apple class, then a RedApple will behave as an Apple and a Fruit besides
 * 				behaving as a RedApple.
 * Note:-   Actual object does not change at all.The object itself always remain the same.
 * 			A RedApple will always be a RedApple it does not suddenly morph into an Apple or
 * 			a Fruit. It has always been an Apple and a Fruit besides being a RedApple.
 * 			It follows that if an object doesn't already support a particular behavior,
 * 			it wouldn't suddenly start supporting that behavior. A RedApple will never morph
 * 			into a GreenApple no matter what you do.
 * 
 * Note:-   Polymorphism allows components to be switched only at compile time but also at 
 * 			run time.
 *Polymorphism happens at runtime i.e at a time of execution of the code, but the code that 
 *makes it happen is written at compile time
 */
public class PolymorphismProblem {
	public static void main(String[] args) {
		Apple apple=new Apple();
		Grapes grape=new Grapes();
		Orange1 orange1=new Orange1();
		Person person =new Person();
		person.eatFruit(apple);
		person.eatFruit(grape);
		person.eatFruit(orange1);
		
	}

}
abstract class Fruit{
	abstract void consume();
}
class Apple extends Fruit{

	@Override
	void consume() {
		System.out.println("Consuming Apple");
	}
	
}
class Grapes extends Fruit{

	@Override
	void consume() {
		System.out.println("consuming Grapes");
	}
	
}
class Orange1 extends Fruit{

	@Override
	void consume() {
		System.out.println("consuming Orange");
	}
	
}
class Person{
	public void eatFruit(Fruit fruit) {
		fruit.consume();
	}
}


