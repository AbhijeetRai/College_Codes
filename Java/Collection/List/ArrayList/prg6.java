import java.util.*;

class ArrayListDemo {

	public static void main(String[] args) {
		
		/**
		 * If arrayList is created with negative capacity it throws illegal 
		 * argument exception(unchcked, run time)
		 */
		ArrayList al = new ArrayList(2);

		al.add("Shashi");
		al.add("Kanha");
		al.add("Ashish");
		al.add(null);
		al.add(1);
		al.add(75);
		al.add(98.5);

		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<String>(al);
		System.out.println(al2);

		al2.add("Snehal");
		al2.add("Sonali");
		al2.add("Nihara");	


		//al2.add(10);

		System.out.println(al2);
		System.out.println(al2.indexOf("Shashi"));
		System.out.println(al2.indexOf("Kanha"));

		/**
		 * Returns minus 1 if element is not present
		 */

		System.out.println(al2.indexOf(10));
	}
}