package controlflow;

public class RndWhileAndFor {
int w;
	public static void main(String[] args) {
	/*	if(false) {
			System.out.println("hii");
		}
		else
			System.out.println("hey");*/
	/**	int i=0;
		int j=0;
		int k=0;**/
//		long k=0;//not allowed
//		byte k=0;//allowed
		
	/**while(true)//boolean is compulsory
		System.out.println("sanjali");//infinite loop**/
		
		//rnd of for loop
		/*if(10>5) {
			int m;}*/
		
		
//for( ; ; );
/**for( ; ; ) {
	
}**/
		//for( i=j=k=0;i<9;i++);//multiple initialisation is allowed
	/**	for(i=j=k=0;i<9&&i>0;);//diff datatypes not allowed
		/**for(i=j=k=0; ;) {
			System.out.println("hello");
		}**/
	/**	for ( ; i<9;i>>>=1) {
		int a=0;
		int b=a;		
			++i;
		}**///initialization is compulsory.
		
		/**int z=10;
		int y=5;
		for(System.out.println(z);y<z;System.out.println(y++)) {
			System.out.println(y);
		}**/
		int i=30;
		RndWhileAndFor obj=new RndWhileAndFor();
		for(obj.w=10;obj.w<i;obj.w++) {
			System.out.println(obj.w);
		}
		
		
		
		
	}

}
