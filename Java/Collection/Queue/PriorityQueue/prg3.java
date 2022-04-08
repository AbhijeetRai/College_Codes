

//Writing comparator without generic


import java.util.*;


class ComparatorWalaClass implements Comparator {

	/**
	 * Compares its two arguments for order. Returns a 
	 negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
	 */
	public int compare(Object s1, Object s2) {

		String s3 = (String)s1;
		String s4 = (String) s2;
		return s3.compareTo(s4);
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