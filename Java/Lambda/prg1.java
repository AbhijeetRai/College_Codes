interface Covid {

	void cases(int number);

	default void situation() {

		System.out.println("India is battling with Covid");
	}

	default void origin() {

		System.out.println("The origin is Wuhan, China");
	}
}

class Demo {

	public static void main(String[] args) {
		
		Covid obj = (int number) -> System.out.println("Total cases are " + number);

		obj.cases(3000);
		obj.situation();
		obj.origin();
	}
}

/**
 * Lambda expressions act like object of functional interface. A functional interface has ONLY ONE abstract method and any number of default methods.
 * Lambda expressions implement the abstract method and thus implement the functional interface
 */