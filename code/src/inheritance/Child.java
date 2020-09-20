package inheritance;

public class Child extends Parent {
	private String name;
	private double salary;
	
	public Child() {
		super("Mishra",1000,1200);
		
	}

	public static void main(String[] args) {
		String fullName;
		Double totalIncome;
		Child obj=new Child();  
//		obj.setSurname("Mishra");
		obj.name="Shail";
		fullName=obj.name+obj.getSurname();
		System.out.println(fullName);
//		obj.setDadsal(500000);
		obj.salary=1200;
		totalIncome=obj.salary+obj.getDadsal();
		System.out.println(totalIncome);
	}
}
        