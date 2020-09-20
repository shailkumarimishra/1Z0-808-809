package operators;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		int a=10;
		if(a<0  || ++a<10)
			
		{
			a++;
		}
		
		System.out.println(a);//11

		/**final int x;
		x=0;
		final int y=2;
		int i=(int)(Math.random()*4);
		switch(i) {
		case x:{
			System.out.println("A");
			break;}
		case 1:{
			System.out.println("B");
		}
		case 4:{
			System.out.println("D");
			break;
	
		}
		case y:{
			System.out.println("C");
			}
		}**/
	}
	

}
