class Demo {
	
	static int fact(int n) {
		
		if(n == 0) 
			return 1;

		else
			return(n * fact(n - 1));
	}

	public static void main(String[] args) {
		
		System.out.println("Factorial of 4 is " + fact(4));
	}
}
