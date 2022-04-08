/**
 * Storing String in priority queue but not on natural order
 */


import java.util.*;


class ComparatorWalaClass implements Comparator<String> {

	/**
	 * Compares its two arguments for order. Returns a 
	 negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
	 */
	public int compare(String s1, String s2) {

		return -1;
	}
}

class Demo {

	public static void main(String[] args) {
		
		PriorityQueue<String> p = new PriorityQueue<String> (new ComparatorWalaClass());

		p.add("Zagade");
		p.add("Divya");
		p.add("Sujay");
		p.add("Abhijeet Rai");

		System.out.println(p);
	}
}