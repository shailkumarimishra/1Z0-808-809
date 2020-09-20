package operators;

public class AssignmentOperator {
	//int a=b=c=d=89;//not allowed
	/**int a,b,c,d;
	a=b=c=d=12;**///not allowed
	static int a,b,c,d;

	public static void main(String[] args) {
		/**int a,b,c,d;
		a=b=c=d=90;**///allowed
		//int a=b=c=d=45;//not allowed
		a=b=c=d=20;
		int f;
		f=10;
		f=f+1;
		f+=1;//12
		System.out.println(f);
		//compound assignment operator
		f-=1;//9
		f/=2;//5
		f%=2;//0

	}

}
