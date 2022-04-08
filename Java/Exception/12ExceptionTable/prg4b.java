import java.io.*;

class Demo {

	public static void main(String[] args) {

		try {

			throw new ArithmeticException();//exception merely thrown
		}catch(ArithmeticException e) {

			System.out.println("ARITHMETIC EXCEPTION");
		}catch(NullPointerException obj) {

			System.out.println("NULL POINTER EXCEPTION");
		}

		finally {

			System.out.println("FINALLY");
		}
	}
}

/**
 * Compare with prg4.java bytecode

 Exception table:
      from    to  target type
	  0     8     8   Class java/lang/ArithmeticException
	  0     8    28   Class java/lang/NullPointerException
	  0    17    48   any
	 28    37    48   any

 */
