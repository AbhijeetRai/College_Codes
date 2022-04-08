class ThreadDemo implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getName() + " is part of " + Thread.currentThread().getThreadGroup());
	}
}

class Demo {

	public static void main(String[] args) {
		
		ThreadGroup tg1 = new ThreadGroup("Parent");
		System.out.println("Parent thread group of tg1 is " + tg1.getParent());

		//Thread​(ThreadGroup group, Runnable target, String name)
		Thread t = new Thread(tg1, new ThreadDemo(), "DEMO");
		t.start();
	}
}