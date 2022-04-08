class Demo {

	public static void main(String[] args) {

		try {

			System.out.println("TRY");
			throw new ArithmeticException();
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
Compiled from "prg2.java"
class Demo {
  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #3                  // String TRY
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: new           #5                  // class java/lang/ArithmeticException
      11: dup
      12: invokespecial #6                  // Method java/lang/ArithmeticException."<init>":()V
      15: athrow
      16: astore_1
      17: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      20: ldc           #7                  // String CATCH
      22: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      25: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      28: ldc           #8                  // String FINALLY
      30: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      33: goto          47
      36: astore_2
      37: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      40: ldc           #8                  // String FINALLY
      42: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      45: aload_2
      46: athrow
      47: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      50: ldc           #9                  // String MAIN
      52: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      55: return
    Exception table:
       from    to  target type
           0    16    16   Class java/lang/ArithmeticException
           0    25    36   any

'SAME FINALLY' is seen twice in bytecode because

If anything goes wrong between line 0 to 16, do  catch type 'ArithmeticException' at line 16, and execute FINALLY at line 28, and flow of code is maintained.

If anything goes wrong between line 0 to 25, go to line 36 because,
If 'any' exception remains uncaught or catch block itself throws exception, go to directly execute FINALLY at 40 before abnormal termination.
}
 */
