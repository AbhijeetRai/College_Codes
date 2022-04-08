//Static members are inherited
class Parent {

	static int a = 10;
	static int b = 20;

	static void detail() {

		System.out.println("Hi this is parent");
	}

	static void age() {

		System.out.println("Age is 40");
	}
}

class Child extends Parent {

}

class Demo {

	public static void main(String[] args) {

		System.out.println("Static\n");

		Child.age();
		System.out.println(Child.b);

		new Child().detail();
		System.out.println(new Child().a);
	}
}
