package methodsandencapsulation;

public class ImpactOfPrimitive {
	public int age;
	public void modifyAge(int a){
	 a=a+10;
	 System.out.println(a);
	}
	
	public  static void main(String[] args){
		ImpactOfPrimitive student = new ImpactOfPrimitive();
	System.out.println(student.age);//0
	student.modifyAge(student.age);//10
	System.out.println(student.age);//0
	}

	

}
