//Using comparator for user defined class in priority queue



import java.util.*;

class ComparatorWalaClass implements Comparator<Student> {

	/**
	 * Compares its two arguments for order. Returns a 
	 negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
	 */
	public int compare(Student s1, Student s2) {

		return s1.id - s2.id;
	}
}


class Student  {

	int id;
	String name;

	Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public String toString() {

		return id + " " + name;
	}
}

class Demo {

	public static void main(String[] args) {
		
		PriorityQueue<Student> p = new PriorityQueue<Student> (new ComparatorWalaClass());

		p.add(new Student(11,"Abhijeet"));
		p.add(new Student(2,"Sanket"));

		System.out.println(p);
	}
}