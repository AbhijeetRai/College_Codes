import java.util.*;
/** Employee class does not have compare to method*/
/** In TreeSet class given in add() method must be comparable*/
class Employee {

	int id;

	Employee (int id) {

		this.id = id;
	}
}

class Demo {

	public static void main(String[] args) {

		TreeSet s = new TreeSet();
		s.add(new Employee(1));
		s.add(new Employee(2));

		System.out.println(s);
	}
}
