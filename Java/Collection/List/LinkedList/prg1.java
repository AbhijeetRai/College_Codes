import java.util.*;

class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		System.out.println("Before adding new elements :" + ll);

		ll.addFirst(5);
		ll.addLast(55);

		System.out.println("After adding 5 and 55 in the list : " + ll);

		ll.removeFirst();
		ll.removeLast();

		System.out.println("After removing 5 and 55 from the list : " + ll);
	}
}