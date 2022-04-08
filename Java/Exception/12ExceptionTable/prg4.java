import java.io.*;

class Demo {

	public static void main(String[] args) {

		try {

			System.out.println(10/0);//this line made difference
			//actually generatng an exception rather than throwing
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

Bytecode is

Exception table:
   from    to  target type
       0    10    21   Class java/lang/ArithmeticException
       0    10    41   Class java/lang/NullPointerException
       0    10    61   any
      21    30    61   any
      41    50    61   any


 * Compare with 4b.java bytecode
 */
