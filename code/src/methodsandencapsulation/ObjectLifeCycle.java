package methodsandencapsulation;

public class ObjectLifeCycle {
/**StringBuilder sb;
sb=new StringBuilder();**/
	static StringBuilder sb;//object not created
	public static void main(String[] args) {
		System.out.println(sb);//null
		System.out.println(sb.append(true));//NullPointerException
		/**ObjectLifeCycle olc;
		olc=new ObjectLifeCycle();**/  //valid
	}

}
