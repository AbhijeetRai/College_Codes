/**
 * Creating infinite number of threads wihtout loop or direct reucrsion
 */

 class ThreadDemo extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		new ThreadDemo().start();
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		new ThreadDemo().start();
	}
}
