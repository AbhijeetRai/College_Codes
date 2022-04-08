/**
 * I know, this code will bring exception.
 * Still I will run it, to see the sequence of stack trace.
 *
 * Stack trace works like, stack works in JVM.
 * Caller method(here main) lies at bottom of called method(here fun) and so on...
 *
 * and thus method with exception, lies at the top of stack trace and stack
 */
class Demo {
	
	void run() {
		
		nun();
	}
	
	public static void main(String[] args) {
		
		fun();
	}
	
	void gun() {
		
		run();
	}

	static void fun() {
		
		new Demo().gun();
	}

	static void nun() {
		
		System.out.println(10 / 0);
	}
}
