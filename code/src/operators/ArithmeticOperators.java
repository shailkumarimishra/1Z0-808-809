package operators;

public class ArithmeticOperators {
byte b1;
byte b2;
int c=b1+b2;
float a=5/0;
	public static void main(String[] args) {
//	System.out.println(10/0);//Arithmetic Exception(AE)
	System.out.println(-10.0/0);//-Infinity
	System.out.println(-0.0/0);//NaN
	//System.out.println(0%0);//AE
	System.out.println(10+"shail");//10shail
	System.out.println(10+80+"20"+10+20+"30"+(40+50)+2+4);//90201020309024
	System.out.println(new ArithmeticOperators().a);

	}

}
