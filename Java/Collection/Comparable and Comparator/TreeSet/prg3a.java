import java.util.*;


// generic not given in front of Comparable
//see compareTo() method of 3b, if you dont want to give generic
class Employee implements Comparable {

	int id;

	Employee(int id) {

		this.id = id;
	}

	public int compareTo(Employee e) {

		return this.id - e.id;
	}
	public String toString() {

		return Integer.toString(id);
	}
}

class Demo {

	public static void main(String[] args) {

		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(new Employee(1));
		t.add(new Employee(2));
		System.out.println(t);
	}
}
