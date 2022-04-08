/**
 * Each thread has a unique stack in Java. We are going to specify stack size
 * while creating a thread in Java. With the help of constructor, 
 * Thread (ThreadGroup group, Runnable target, String name, long stackSize)
 * Giving large stack size indicates that the recursion depth of thread is
 * high. While, low size of stack provides easy existence of many threads
 * concurrently without throwing out of memory error. 
 */

class MyThread implements Runnable {
	
	public void run() {
		
		System.out.println("Customised Stack Size");
		System.out.println(Thread.currentThread().getName());
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new ThreadGroup("Random_ThreadGroup"), 
		new MyThread(), "Random_Thread", 10);

		t.start();
	}
}
