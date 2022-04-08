import java.util.*;

class Employee implements Comparable<Employee> {

	String empName;
	String compName;
	int id;
	double salary;

	Employee (int id, String empName, String compName, double salary) {

		this.id = id;
		this.empName = empName;
		this.compName = compName;
		this.salary = salary;
	}

	public int compareTo (Employee obj) {

		return (int)(salary - obj.salary);
	}
} 

class CompDemo {

	public static void main(String[] args) {
		
		TreeSet<Employee> t = new TreeSet<Employee> ();

		t.add(new Employee(1,"Rahul","TCS",20000));
		t.add(new Employee(2,"Shashi","C2W",20000));
		t.add(new Employee(3,"Shardul","BiEncaps",40000));

		for (Employee emp : t) {

			System.out.println(emp.id + " " + emp.empName + " " + emp.compName +  " " + emp.salary);
		}
	}
}
