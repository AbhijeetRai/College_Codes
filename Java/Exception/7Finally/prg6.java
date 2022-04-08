class Demo {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("In try block");
			System.out.println(10 / 0);
			System.out.println("Hello");
		}catch(Demo obj) {
			
			System.out.println("Demo obj");
		}catch(ArithmeticException e) {
			
			System.out.println("Handling code");
		}

		finally {
			
			System.out.println("Cleaning code");
		}
	}
}
