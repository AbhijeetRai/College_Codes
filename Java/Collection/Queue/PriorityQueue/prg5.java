import java.util.*;

class Student implements Comparable <Student> {

	int id;
	String name;

	Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int compareTo(Student s1) {

		return this.id - s1.id;
	}

	public String toString() {

		return id + " " + name;
	}
}

class Demo {

	public static void main(String[] args) {
		
		PriorityQueue<Student> p = new PriorityQueue<Student> ();

		p.add(new Student(11,"Abhijeet"));
		p.add(new Student(2,"Sanket"));

		System.out.println(p);
 	}
}