package methodsandencapsulation;

import api.Address;

public class MethodOverloading {
	 void search(int phoneNo) {
		System.out.println("search by phone no.");
	}
	protected void search(String name) {
		System.out.println("search by name");
	}
	private void search(Address ad) {
		System.out.println("search by address");
	}
	public String search(int phoneNo,String name) {
		System.out.println("search by phone no & name");
		return name;
	}
	public int search(String name,int phoneNo) {
		System.out.println("search by name and phone no");
		return phoneNo;
	}

	public static void main(String[] args) {
		MethodOverloading method=new MethodOverloading();
//		method.search(null);//Exception

	}

}
