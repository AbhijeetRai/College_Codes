class Demo {

	static void fun() {

		int a = 10 / 0;
		//No handling code for exception, terminate this method abnormally and go to caller of fun
		System.out.println("In fun");
	}

	static void gun() {

		try {

			fun();
		}catch(ArithmeticException e) {

			System.out.println(e.toString());
		}
		//caller of fun, there is handling code, do not terminate this method abnormally and do not go to caller of gun
		System.out.println("In gun");
	}

	public static void main(String[] args) {

		gun();	
		System.out.println("In main");
	}
}
