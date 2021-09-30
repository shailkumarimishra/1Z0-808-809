package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Note:- transient variables:-
 *            Is not serialized during serialization process.
 *            It will be initialized with default value during deserialization.
 *        static Variables:- 
 *            Is not serialized during serialization process.
 *            It will store the current value defined in the class during deserialization.
 */
public class SerializationExample {
	public static void displayData(Employee emp) {
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		System.out.println(emp.getLeaveDays());
	}

	public static void main(String[] args) {
		Employee emp = new Employee("shail", 21, 10000.4, 7);
		// serializing Employee class
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("shail.txt"))) {
			oos.writeObject(emp);
			System.out.println("Employee class object has been serialized\nData before deserialization:-");
			displayData(emp);
			/*
			 * here static data member(salary) and transient(leaveDays) doesn't get saved
			 * via serialization so we can see the changes after deserializing emp
			 */
			emp.setSalary(30000.9);
			/*
			 * here non-static data member(name) get saved via serialization so their will
			 * be no changes after deserializing emp
			 */
			emp.setName("anu");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// deserializing Employee class
		emp = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("shail.txt"))) {
			emp = (Employee) ois.readObject();
			System.out.println("Employee class object has been deserialized\nData after deserialization:-");
			displayData(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
