import java.util.*;

class Company {

	String companyName;
	String location;

	Company(String companyName, String location) {

		this.companyName = companyName;
		this.location = location;
	}
}

class Employee {

	int id;
	String employeeName;
	Company c;

	Employee(int id, String employeeName, String companyName, String location) {

		this.id = id;
		this.employeeName = employeeName;

		c = new Company(companyName, location);
	}
}

class Demo {

	public static void main(String[] args) {

		HashSet<Employee> h = new HashSet<Employee> ();

		/** Content of user defined data is not checked*/
		h.add(new Employee(1,"Shashi","BiEncaps","Pune"));
		h.add(new Employee(1,"Shashi","BiEncaps","Pune"));
		h.add(new Employee(2,"Shardul","Core2Web","Narhe"));

		for(Employee e : h) {

			System.out.print(e.id + " " + e.employeeName + " " + e.c.companyName + " " + e.c.location);
			System.out.println();
		}
	}
}
