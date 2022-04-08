import java.util.*;

class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String> ();

		//error - incompatible types - Integer cannot be converted to string
		//ll.add(10);
		//ll.add(20);

		ll.add("Phutane");
		ll.add("Rai");

		System.out.println("The list : " + ll);


		ListIterator obj = ll.listIterator();

		while(obj.hasNext()) {

			System.out.println(obj.next());
		}

		Iterator ob = ll.iterator();

		while(ob.hasNext()) {

			System.out.println(ob.next());
		}
	}
}