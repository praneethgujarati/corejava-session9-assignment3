/* Assignment 9.3 : Create an application having a Generic HashMap with
   Empcode as key and EmpName as value. Display only EmpNames as output.
*/
import java.util.*;

class Employee {	// Class Employee having properties as empcode and empname

	int empcode;
	String empname;

	public Employee(int ecode, String ename){	// Constructor of Employee class
		this.empcode = ecode;
		this.empname = ename;
	}
}

class HashMapTest {	// Class HashMap

	public static void main(String[] args){
		char opt='y';
		int ecode;
		String ename;

		HashMap hm = new HashMap();	// Objct hm of Class HashMap

		// Receive input from console until option is set to No.
		while((opt == 'y') | (opt == 'Y')){	
			System.out.print("Enter the empcode: ");
			ecode = Integer.parseInt(System.console().readLine());
			System.out.print("Enter the empname: ");
			ename = System.console().readLine();
			Employee e = new Employee(ecode,ename);	// Object e of class Employee
			hm.put(e.empcode,e.empname);	// loaded hashmap with key/value pair
			System.out.print("Would you like to add more entries (y/n)? ");
			opt = System.console().readLine().charAt(0);
		}

		Set row = hm.entrySet();	// entrySet method to set entries in the map

		Iterator itr = row.iterator();	// Iterator to fetch rows in iteration

		System.out.println("\nEmployee Names");
		System.out.println("--------------");
		while (itr.hasNext()){	// hasNext to check if the next row exist
			Map.Entry me = (Map.Entry)itr.next();	// Map.Entry inner class of Map describes a key/value pair. Next method to fetch row.
			System.out.println(me.getValue());	// Only empnames printed as output
		}
	}
}