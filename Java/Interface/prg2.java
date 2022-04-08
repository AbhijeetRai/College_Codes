interface IndiaCovid {

	default void cases() {

		System.out.println("5 Lakh cases in India");
	}

	static void treated() {

		System.out.println("1 Lakh people treated");
	}
}

class IndiaStats implements IndiaCovid {


}

/**
 * Default methods of interface are inherited by implementing classes.
 * But static methods of an interface(only) are not inherited at all, in any case. They are worst.

 * Static methods of abstract class and class are inherited
 */

class Demo {

	public static void main(String[] args) {

		new IndiaStats().cases();
		//new IndiaStats().treated();
		//IndiaStats.treated();
		IndiaCovid.treated();
	}
}
