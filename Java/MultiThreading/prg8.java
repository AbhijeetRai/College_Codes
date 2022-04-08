class ThreadDemo extends Thread {
	
	public void run() {

		System.out.println("Hello from " + Thread.currentThread().getName());
		super.start();
	}
	
	public void start() {
		
		System.out.println("Hi from " + Thread.currentThread().getName());
		super.start();
	}
}

class Demo {
	
	public static void main(String[] args) throws Exception {
		
		ThreadDemo t = new ThreadDemo();
		t.start();
	}
}
