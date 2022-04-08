import java.util.*;

class Student{

	int id;
	String name;

	Student(int id, String name) {

		this.id = id;
		this.name = name;
	}
}

//Data to be added in priority queue must be of comaprable type
class Demo {

	public static void main(String[] args) {
		
		PriorityQueue<Student> p = new PriorityQueue<Student> ();

		p.add(new Student(1,"Abhijeet"));
		p.add(new Student(2,"Sanket"));
	}
}