class Demo {
	
	public static void main(String[] args) {
		
		String s = "Rahul";

		try {
			System.out.println(10/0);		// exception thrown by this line		
			System.out.println(s.charAt(7));	//this line never executed
		}catch(ArithmeticException | NullPointerException e) {
			
			System.out.println("Caught");
		}
	}
}
