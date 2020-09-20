package practisetest_II;

public class EncapsulationQ40 {
 private void run() {
	 System.out.println("A");
 }
}
class A extends EncapsulationQ40{
	private void run() {
//this method is not overrriden it is specific method of class A since,private method are not visible to outside classes
	}
}