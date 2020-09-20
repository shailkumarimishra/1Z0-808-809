package array;

public class ArrayAssignmentVariable {

	public static void main(String[] args) {
		int []a=new int[2];
		a[1]=4;
		a[2]=9;
//		System.out.println(a[1]);
		int [][]b=new int [3][3];
	//	b=a;
		int []c=new int[4];
		char[]ch=new char[2];
		//ch=c;
		int d[]=new int[3];
		int e[]=new int[2];
		e=d;
		int []f= {10};
		char []g= {'a'};
		a=f;
		//a=g;
		
		/**
		 * Every array is an object.
		 * This means,you can assign any array object to variable of type object like this
		 * int []a=new int[3];
		 * Object obj=a;
		 */
		Object obj=new int[3];
		/**
		 * Object[] obj2=new int[3];
		 * It will give you a compilation error because elements of the array pointed to by intArray are not Objects.
		 * They are ints.Therefore, you can't assign an array of ints to a variable of type array of Objects  
		 */
//		Object[] obj2=new int[3];
		/**
		 * Each element of the array created using new int[2][3] is an array of ints.
		 * An array of ints is an Object and therefore,an array of array of ints is an array of Objects.
		 */
		//Object[][] obj3=new int[2][3];//Invalid
		Object[] obj2=new int[2][3];//Valid
		Object obj4=new Object[3];//Parent <- child
		Object [][] obj5=new int[3][2][1];//valid
		System.out.println(obj5[0][0]);
		Object obj8=new int[4];//p<-c
		
		
		
		
		
		
	}

}
