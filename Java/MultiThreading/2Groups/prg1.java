class MyThread extends Thread {
	
	MyThread(ThreadGroup group, String name) {

		//to set group and name of Thread
		super(group, name);
	}

	public void run() {
		
		//getThreadGroup() method of Thread class returns the ThreadGroup to which this Thread belongs													
		System.out.println("The thread belongs to " + Thread.currentThread().getThreadGroup());	
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		//ThreadGroup (String name)
		ThreadGroup tg = new ThreadGroup("Parent");
		System.out.println("Parent Thread Group of tg is " + tg.getParent());

		//Thread (ThreadGroup group, String name)
		MyThread t = new MyThread(tg, "Thread - 0");
		t.start();
	}
}
