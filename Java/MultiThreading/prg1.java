class ThreadDemo extends Thread {
	
	public void run() {
		
		System.out.println("Thread is by default from thread group " + Thread.currentThread().getThreadGroup());
	}
}

class Main {
	
	public static void main(String[] args) {
		
		new ThreadDemo().start();
	}
}
