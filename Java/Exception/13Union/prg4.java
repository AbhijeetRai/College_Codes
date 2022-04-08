/**
 * An exception table is stored in permanent generation / metaspace on non heap storage area
 * Exception table is created when a method defines try catch or finally block, JVM uses exception table to handle exception, when it is thrown.

 * Actually method area is part of permanent generation. 
 */

class Demo {
		
	static void fun() {
	
		String s = "Rahul";

		try {
			
			System.out.println(s.charAt(7));
		}catch(IndexOutOfBoundsException e) {
			
			System.out.println("Caught");
		}
	}

	public static void main(String[] args) {
		
		String s = "Rahul";

		try {
			
			System.out.println(s.charAt(7));
		}catch(ArithmeticException | NullPointerException obj) {
			
			System.out.println("Caught");
		}

		fun();
	}
}

/**
 * Even if 2 exception tables are seen for 2 functions in bytecode of above class. Only 1 table goes to JVM(both table will be combined).
 * Every class has 1 exception table for JVM
 */
