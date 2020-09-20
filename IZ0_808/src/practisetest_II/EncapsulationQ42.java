package practisetest_II;
class Animal{
	public void eat() throws Exception{
		System.out.println("Animals eats");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dogs eats");
	}
}

public class EncapsulationQ42 {
	public static void main(String []arr) {
	Animal a=new Dog();
	Dog d=new Dog();
	d.eat();
	/*a.eat();unhandled Exception( due to polymorphism ref a will search eat() in Animal class and also eat() is overriden in Dog class.so, the compiler search same 
      eat() method in Dog class throwing or handling Exception thrown by its overriden  method) if not found results into compilation fails */
	}
}
