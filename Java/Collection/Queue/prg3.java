import java.util.*;

class QueueExapmle {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String> ();

		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.add("Four");

		queue.clear();
		queue.poll();      //returns null if queue is empty
		queue.remove();    //remove() of queue throws exception if queue is null
	}
}