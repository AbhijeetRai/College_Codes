import java.util.*;

class QueueExapmle {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String> ();

		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.add("Four");

		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.contains("Two"));
	}
}