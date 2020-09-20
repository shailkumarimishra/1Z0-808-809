package api;

public class SwappingOf2Numbers {
	public static void swap(int x,int y) {
		int a=x;
		int b=y;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swapping: \n x= "+x+"\n y= "+y+"\nAfter Swapping: \n x= "+a+"\n y= "+b);
	}
	public static void swapWords(String s1,String s2) {
		String s3=s1;
		String s4=s2;
		
	}

	public static void main(String[] args) {
	swap(90,20);
	swapWords("Shail","Mishra");

	}

}
