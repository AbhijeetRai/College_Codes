import java.util.*;

class Employee implements Comparable<Employee> {

	String name;

	Employee(String name) {

		this.name = name;
	}

	public int compareTo(Employee e) {

		return name.compareTo(e.name);
	}

	public String toString() {

		return name;
	}
}

class Demo {

	public static void main(String[] args) {

		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(new Employee("Zagade"));
		t.add(new Employee("Abhijeet"));
		System.out.println(t);
	}
}
