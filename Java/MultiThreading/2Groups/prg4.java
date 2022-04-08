class MyThread implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getName() + " is part of " + Thread.currentThread().getThreadGroup());
	}
}

class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup tg1 = new ThreadGroup("PARENT");
		ThreadGroup tg2 = new ThreadGroup(tg1, "CHILD");

		System.out.println("Parent group of tg1 is " + tg1.getParent());
		System.out.println("Parent group of tg2 is " + tg2.getParent());

		//Thread​(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg1, new MyThread(), "T-1");
		Thread t2 = new Thread(tg2, new MyThread(), "T-2");

		t1.start();
		t1.join();
		t2.start();
	}
}