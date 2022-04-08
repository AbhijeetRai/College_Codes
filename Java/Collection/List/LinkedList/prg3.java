import java.util.*;

class LinkedListDemo {

	public static void main(String[] args) {

		
		LinkedList<String> slist = new LinkedList<String> ();


		slist.add("Apple");
		slist.add("Microsoft");
		slist.add("Amazon");
		slist.add("Nvidia");
		System.out.println("Linked List : " + slist);


		slist.add(2,"Intel");
		System.out.println("Linked List : " + slist);


		LinkedList<String> clone = (LinkedList<String>) slist.clone();
		System.out.println("Clone : " + clone);


		slist.addFirst("Flipkart");
		System.out.println("Linked List : " + slist);


		slist.addLast("GSLab");
		System.out.println("Linked List : " + slist);


		slist.removeFirst();
		System.out.println("Linked List : " + slist);

		slist.removeLast();
		System.out.println("Linked List : " + slist);
	}
}