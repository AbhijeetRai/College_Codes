class Demo {
	
	public static void main(String[] args) {
		
		try {
					
			System.out.println("TRY");
			System.out.println(10 / 0);
		}catch(ArithmeticException e) {
			
			//catch block itself threw error
			System.out.println(10 / 0);
			System.out.println("CATCH");
		}

		finally {
			
			System.out.println("FINALLY");
		}

		System.out.println("MAIN");
	}
}
