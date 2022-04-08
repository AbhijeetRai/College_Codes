/**
 * A code that brings Exception in thread "main" java.lang.StackOverflowError
 */
class Demo {
	
	public static void main(String[] args) {
		
		while(true) {
			
			fun();
		}
	}

	static void fun() {
		
		fun();
	}
}
