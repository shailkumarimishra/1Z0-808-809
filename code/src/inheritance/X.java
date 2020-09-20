package inheritance;

public interface X {
		void doSomething(int a);
		}
	interface  Y{
		void doSomething(int a);
		}
	interface Z extends X, Y{}

