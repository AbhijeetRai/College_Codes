/**
 * Interfaces before Java 8, used to be purely abstract. Since JDK 1.8, we can add bodies to methods of Interfaces,
 * using keyword default and static
 * otherwise, methods in interace are by default public and abstract.

 * Java does not support multiple inheritance, due to diamond problem but we can use interfaces in Java to achieve multiple inheritance
 * Class implementing an interface must give body to all it's abstract methods, or declare itself abstract
 */

interface Covid {

	void aatmNirbharBanie();
}

class Demo implements Covid {

	public void aatmNirbharBanie() {

		System.out.println("Are kaise banein Bhai? ");
	}

	public static void main(String[] args) {

		//object of interace cannot be created
		//new Covid();

		new Demo().aatmNirbharBanie();
	}
}
