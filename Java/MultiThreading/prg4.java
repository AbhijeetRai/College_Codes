class ThreadDemo extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
	}
}

/**
 * In multithreading, any child thread(say t1), will inherit the priority of its parent thread.
 * (parent thread - the thread which created child thread t1)

 * Default priority of thread in java is 5
 */

class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadDemo t1 = new ThreadDemo();
		t1.start();

		Thread.currentThread().setPriority(8);
		Thread.sleep(2000);

		ThreadDemo t2 = new ThreadDemo();
		t2.start();
	}
}
