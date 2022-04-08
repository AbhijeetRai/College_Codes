class Demo {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(10 / 0);
		}catch(ArithmeticException e) {
			
			System.out.println("Handling Code");

			try {
				
				System.out.println(10 / 0);
			}catch(ArithmeticException e1) {
				
				System.out.println("Nested Handling Code");
			}
		}catch(Exception e) {
			
			System.out.println("EXCEPTION");
		}

		finally {
			
			System.out.println("FINALLY");
		}
	}
}
