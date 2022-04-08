class Hello {

	static void fun() {

		try {

			System.out.println(10 / 0);
		}

		/**
		 * No handling code, abnormally terminate and then go to caller of fun, remember(Sequence folder)
		 * but execute finally first
		 */
		finally {

			System.out.println("Finally");
		}

		System.out.println("In hello");
	}
}

class Demo {

	public static void main(String[] args) {
		
		try {

			Hello.fun();
		}catch(ArithmeticException e) {						//handling code, do not abnormally terminate
                                                         	//do not go to caller of main(i.e JVM)
			System.out.println("Handling Code");
		}

		finally {

			System.out.println("main");
		}

		System.out.println("In main");
	}
}