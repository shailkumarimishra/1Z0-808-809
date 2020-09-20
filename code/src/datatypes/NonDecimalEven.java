package datatypes;

public class NonDecimalEven {
//output "true" indicates that the number is even and output "false" indicates odd number
	public static void main(String[] args) {
		int i=0b100;
		int a=i%2;
		System.out.println(a==0);
		int j=0B101;
		int b=j%2;
		System.out.println(b==0);
		int k=053;
		System.out.println(k);
		int c=k%2;
		System.out.println(c==0);
		int l=016;
		int d=l%2;
		System.out.println(d==0);
		int m=0x9A;
		int e=m%2;
		System.out.println(e==0);
		int n=0X9B;
		int f=n%2;
		System.out.println(f==0);
		int q=0x9A;
		System.out.println(q);

	}

}
