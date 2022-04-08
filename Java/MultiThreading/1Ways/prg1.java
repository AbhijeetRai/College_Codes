//extend the Thread class
class ThreadDemo extends Thread {
	
	public void run() {
		
		System.out.println("The name of thread is " + Thread.currentThread().getName());
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		ThreadDemo t = new ThreadDemo();
		t.start();
	}
}
