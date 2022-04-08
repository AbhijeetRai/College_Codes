import java.util.*;


// generic not given in front of Comparable but changes in compareTo done
class Employee implements Comparable {

	int id;

	Employee(int id) {

		this.id = id;
	}

	public int compareTo(Object e1) {

                Employee e = (Employee)e1;
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
