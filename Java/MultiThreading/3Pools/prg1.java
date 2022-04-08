import java.util.concurrent.*;
 
class Task implements Runnable {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(2);

		pool.execute(new Task());
		pool.execute(new Task());

		pool.shutdown();
	}
}
