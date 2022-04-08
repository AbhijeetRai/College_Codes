class Demo {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(10 / 5);
		}catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException");
		}

		System.out.println("Main");
	}
}

/**
 Compiled from "prg1.java"
class Demo {
  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: iconst_2
       4: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
       7: goto          19
      10: astore_1
      11: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      14: ldc           #5                  // String ArithmeticException
      16: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      19: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      22: ldc           #7                  // String Main
      24: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      27: return
    Exception table:
       from    to  target type
           0     7    10   Class java/lang/ArithmeticException
}

Bytecode of program seen above

If anything goes wrong between line 0 to 7 of "BYTECODE". Go to line 10 of "BYTECODE"
Line 10 of "BYTECODE" has instruction 'astore_1', that stores a reference in local variable.
(catch block with type ArithmeticException)
 */
