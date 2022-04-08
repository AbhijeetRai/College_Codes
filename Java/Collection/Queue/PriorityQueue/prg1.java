import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		//remember array list, even if intial capacity was less, it grew with time
		// same happens here as well
		// moreover priority queue is unbounded 

		PriorityQueue<String> p = new PriorityQueue<String> (1);

		p.add("Zagade");
		p.add("Divya");
		p.add("Sujay");
		p.add("Abhijeet");

		//elements are stored according to natural odering
		System.out.println(p);
	}
}