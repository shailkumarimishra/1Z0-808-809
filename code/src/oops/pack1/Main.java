package oops.pack1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		EncapsulationProblem en=new EncapsulationProblem();
		System.out.println(en);
		en.getList().remove(0);
		en.getDob().setYear(1990);
		en.getDog().setName("shail");
		System.out.println(en);
		
	}

}
