class Demo {
	
	public static void main(String[] args) {
		
		try {
					
			System.out.println("TRY");
			System.out.println(10 / 0);
		}catch(ArithmeticException e) {
			
			System.out.println("CATCH OUT");
			
			try {

				System.out.println(10 / 0);
			}catch(ArithmeticException e1) {
				
				System.out.println(10/0);
			}

			finally {
				
				System.out.println("FINALLY IN");
			}
		}

		finally {
			
			System.out.println("FINALLY OUT");
		}

		System.out.println("MAIN");
	}
}
