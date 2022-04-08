/**
 * A code to bring out of memory error
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 */

import java.util.concurrent.*;

class Demo {
	
	public static void main(String[] args) throws Exception {
		
		PriorityBlockingQueue pbq = new PriorityBlockingQueue();

		while(true)
			pbq.add(new String("Abhijeet"));
	}
}
