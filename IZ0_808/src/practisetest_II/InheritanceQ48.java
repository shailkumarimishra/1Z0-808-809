package practisetest_II;

interface I{
	default boolean equal(Object o) {
		return true;
	}
}
class AB implements I {
public boolean equal(Object o) {
	return false;
}
}

public class InheritanceQ48{
	public static void main(String []arr) {
		AB a=new AB();
		I ia = new AB();
		I i= new I() {};//anonymous class
//performance wise poor
		System .out.println(a.equals(ia)+" "+i.equals(ia));
		System.out.println(i.equal("hey"));
	}
	
}

