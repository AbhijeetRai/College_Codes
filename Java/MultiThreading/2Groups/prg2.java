class MyThread extends Thread {

	MyThread(ThreadGroup group, String name) {

		super(group, name);
	}

	public void run() {

		Thread now = Thread.currentThread();

		System.out.println("Name of thread is " + now.getName());
		System.out.println("Name of thread group of current thread is " + now.getThreadGroup());
	}
}

class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup tg1 = new ThreadGroup("Parent");				//ThreadGroup​(String name)
		ThreadGroup tg2 = new ThreadGroup(tg1, "Child");			//ThreadGroup​(ThreadGroup parent, String name)

		System.out.println("The parent Thread Group of tg1 is " + tg1.getParent());
		System.out.println("The parent Thread Group of tg2 is " + tg2.getParent());

		MyThread t1 = new MyThread(tg1, "Thread-1");
		MyThread t2 = new MyThread(tg2, "Thread-2");

		t1.start();
		t1.join(); 			//Hey, main thread, wait for t1 to finish its task.
		t2.start();
	}
}