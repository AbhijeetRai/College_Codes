class Demo {
	
	static void fun() {
		
		try {
			
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			
			System.out.println("Handling Code fun");
			
			//nested try catch can also be used
			
			try {
				throw new ArithmeticException();
			}catch(ArithmeticException e1) {
				
				System.out.println("Nested catch");
			}						//handling code of previous line found
		}
	}

	public static void main(String[] args) {
		
		try {
			
			fun();
		}catch(ArithmeticException obj) {
			
			System.out.println("Handling code");
		}

		finally {
			
			System.out.println("In finally main");
		}

		System.out.println("Main");
	}
}
