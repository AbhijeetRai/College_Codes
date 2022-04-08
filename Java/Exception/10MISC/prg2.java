class Demo {

	static void fun() {

		try {

			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			//handling code found
			System.out.println("Fun Handling Code");
		}

		System.out.println("In fun");
	}

	public static void main(String[] args) {
		
		try {

			fun();
		}catch(Exception e) {

			System.out.println("In catch");
		}

		finally {

			System.out.println("In finally");
		}

		System.out.println("In main");
	}
}

