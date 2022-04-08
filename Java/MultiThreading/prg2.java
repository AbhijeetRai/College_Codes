class MyThread implements Runnable {
	
	public void run() {
		
		System.out.println("THREAD");
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);

		t.start();
		t.start();

		/**
		 * If any thread is started more than once, it leads to illegal thread state exception
		 */
	}
}
