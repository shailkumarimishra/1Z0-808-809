package array;

public class ArrayCreation {

	//private static final int MAX_VALUE = 2147483647;

	public static void main(String[] args) {
		int f[][]=new int[2][];
	  /*  f[0][0]=10;
		f[0][1]=20;
		f[1][0]=30;
		f[2][0]=40;
		f[2][1]=50;
		System.out.println(f[1][0]);*/
		f[0]=new int[2];
		f[1]=new int[2];
		 f[0][0]=10;
		 f[0][1]=20;
		 f[1][0]=30;
		 f[1][1]=40;
		 System.out.println(f[1][0]);
		
		
//		boolean []b= {true,false};
		int k1[]= {10,20};
		int q1[]= {30,40,50,60};
		System.out.println(k1[0]+" "+q1[0]);
		q1=k1;
		System.out.println(k1[0]+" "+q1[0]);
		
		
//		long d=3l;
//		long f[]=new long[d];
//		int []s,[]d,g[];
//		int h[],[]j;
//		int s[],g[][],f[][][];
		Object [] a=new Object[3];
		a[0]=10;
		a[1]=10.89;
		a[2]="shail";
		for(Object k:a)
			System.out.println(k);
		
	//	int[] a=new int[0];
		int[][]q=new int[3][2];
		q[1]=new int[5];
		System.out.println(q[0]);

	//	System.out.println(a);
		//System.out.println(a.length);
//		System.out.println(a[0]);
		/*for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.println(i);
		}*/
		/*int[] b={10,20,30,40,50,60};
		for(int i:b) {
			System.out.println(i);
		}*/
		/*Object[] obj=new Object[10];
		obj[0]=10;
		obj[1]="Anjali";
		obj[2]=20.0d;
		for(Object v:obj) {
			System.out.println(v);
		}*/
	/**	int[] b= {};
		System.out.println(b);
		System.out.println(b.length);
		System.out.println(b[0]);**/
		int []z=new int[2];
		z[0]=10;
		z[1]=20;
		System.out.println(z[0]);
		z=new int[4];
		
		System.out.println(z[0]);
		int [][]h;
		//System.out.println(z[1][0]);//NullPointerException
		
	          // anonymous array 
	          sum(new int[]{ 1, 2, 3 }); }
	    
	    public static void sum(int[] a) 
	    { 
	        int total = 0; 
	  
	        // using for-each loop 
	        for (int i : a)  
	            total = total + i; 
	          
	        System.out.println("The sum is:" + total); 
	    } 
	    
		
	}


