class Demo {

	public static void main(String[] args) {

		try {

			System.out.println("TRY");
			System.out.println(10 / 0); //this line made difference
			//actually generatng an exception rather than throwing

		}catch(ArithmeticException e) {

			System.out.println("CATCH");
		}

		finally {

			System.out.println("FINALLY");
		}

		System.out.println("MAIN");
	}
}
/**
 * Compare the bytecode with prg2.java
 *
 Exception table:
    from    to  target type
	0    18    29   Class java/lang/ArithmeticException
	0    18    49   any
       29    38    49   any
 */
