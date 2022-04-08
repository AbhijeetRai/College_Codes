class Mera implements Thread.UncaughtExceptionHandler {
	
	public void uncaughtException(Thread t, Throwable e) {
		
		System.out.println("Exception aya");
	}
}

class Demo {
	
	public static void main(String[] args) throws Exception {
		
		Thread current = Thread.currentThread();
		current.setDefaultUncaughtExceptionHandler(new Mera());
		
		Thread.sleep(5000);

		System.out.println(current.getDefaultUncaughtExceptionHandler());
		System.out.println(10 / 0);
	}
}
