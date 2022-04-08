class Demo {

	static void fun() {

		try {

			System.out.println(10 / 0);
		}catch(ArithmeticException e) {

			System.out.println(e.toString());
		}

		//There is  handling code for exception, do not terminate this method abnormally
		System.out.println("In fun");
	}

	static void gun() {

		fun();
		System.out.println("In gun");
	}

	public static void main(String[] args) {

		gun();
		System.out.println("In main");
	}
}
