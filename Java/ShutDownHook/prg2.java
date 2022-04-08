class My_Thread extends Thread {
	
	public void run() {
		
		System.out.println("Clean up code by " + Thread.currentThread().getName());
		//Ensure all files, opened in relevance of code are closed
		//Ensure data base connections, are closed
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		//An unstarted thread (child of thread) is addedd as shutdown hook.
		Runtime.getRuntime().addShutdownHook(new My_Thread());
		
		//A new hook added
		Runtime.getRuntime().addShutdownHook(new My_Thread());
	}
}
