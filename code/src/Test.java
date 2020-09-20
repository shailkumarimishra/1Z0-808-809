
public class Test {
public static void	nxt(Object o){
	int [] x=(int[]) o;	
	x[0]=1;
	x[1]=2;
		
	
//	String s = Integer.toString(234);
//	x[0]=s;
	}
public static void main(String[] args) {
//	Student s=new Student();
	int arr[]= {10,20};
	for(int s:arr) {
		System.out.println(s);
	}
	nxt(arr);
	for(int s:arr) {
		System.out.println(s);
	}
	
	
}
}
//class A{}
//class B{}
//interface I{}