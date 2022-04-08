import java.util.*;

class Demo {

	public static void main(String[] args) {

		/** A set does not maintain order in which elements are added*/
		HashSet<String> h = new HashSet<String>();

		h.add("Raju");
		h.add("Shyam");
		h.add("Babu Bhaiaya");

		System.out.println(h);

		// error - cannot find symbol
		//ListIterator obj = h.listIterator();
		// listIterator is only for classes implementing list interface

		Iterator obj = h.iterator();

		while (obj.hasNext()) {

			System.out.println(obj.next());
		}

		System.out.println("\nIn for each now");
		for(Object s : h) {

			System.out.println((String)s);
		}
	}
}
