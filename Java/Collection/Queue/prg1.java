import java.util.*;

class QueueExapmle {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String> ();

		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.add("Four");

		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);

		System.out.println(queue.remove());
		System.out.println(queue);


		/**
		 * remove(Object) is inherited from Collection interface
		 */

		queue.remove("Two");
		System.out.println(queue);
	}
}