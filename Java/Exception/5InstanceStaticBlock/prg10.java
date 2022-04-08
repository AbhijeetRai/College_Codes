/**
 * Sequence -
 *
 * 1) static block
 * 2) static variable
 * 3) static method
 * 4) super
 * 5) instance variable
 * 6) instance block
 * 7) constructor
 * 8) instance method
 */

class Demo {

	{
		int a = 10;
		System.out.println("Instance block - 1");
	}

	Demo() {

		System.out.println("Constructor");
	}

	static {

		System.out.println("Static Block - 1");	 //static blocks are executed only once in sequence, before main
	}						//instance blocks are executed every time object is created

	public static void main(String[] args) {

		{
			Demo d = new Demo();
			System.out.println("In main");
			System.out.println("In main");
		}

		Demo d = new Demo();
	}

	{

		System.out.println("Instance block - 2");
	}

	static	{
		
		System.out.println("Static block - 2");
	}
}

/**
 * As you will see the bytecode, you shall realise...
 * all the static blocks merge together in bytecode
 * all the instance blocks merge with constructors in bytecode
 */
