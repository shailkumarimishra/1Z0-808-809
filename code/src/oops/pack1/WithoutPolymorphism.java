package oops.pack1;

public class WithoutPolymorphism {
	public static void main(String[] args) {
		Apple1 apple =new Apple1();
		Grapes1 grape=new Grapes1();
		Person1 person=new Person1();
		Orange orange=new Orange();
		person.eatApple(apple);
		person.eatGrapes(grape);
		person.eatOrange(orange);
	}
}
class Apple1{
	public void consume() {
		System.out.println("consuming Apple");
	}
}
class Grapes1{
	public void consume() {
		System.out.println("consuming Grapes");
	}
}
class Orange{
	public void consume() {
		System.out.println("consuming Orange");
	}
}
class Person1{
	public void eatApple(Apple1 apple) {
		apple.consume();
	}
	public void eatGrapes(Grapes1 grape) {
		grape.consume();
	}
	public void eatOrange(Orange orange) {
		orange.consume();
	}
}