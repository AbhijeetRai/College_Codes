class ThreadDemo extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		ThreadDemo td = new ThreadDemo();
		
		//it will execute run method on same stack, so thread name will be same that is main.
		td.run();
		
		//a new stack will be created, so a new thread will be created
		td.start();
	}
}	
