abstract class Demo {
	
	/**
	 * An abstract method cannot be static.
	 */
	abstract static void fun();

	/**
	 * An abstract method cannot be final.
	 */
	final abstract void gun();
}
