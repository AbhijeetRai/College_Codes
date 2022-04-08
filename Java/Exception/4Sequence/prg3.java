class Demo {
	
	static void fun() {
			
		System.out.println(10 / 0);
		//No handling code for exception, terminate this method abnormally and go to caller of fun
		System.out.println("In fun");
	}

	static void gun() {
		
		fun();
		//caller of fun, no handling code, terminate this method abnormally and go to caller of gun
		System.out.println("In gun");
	}

	public static void main(String[] args) {
		
		try {
			gun();
		}catch(ArithmeticException e) {
			
			System.out.println(e.toString());
		}
		//there is handling code, do not terminate this	
		System.out.println("In main");
	}
}
