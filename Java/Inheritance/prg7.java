//Private members are not inherited
class Parent {
	
	private int a = 10;
	private static int b = 20;

	private void detail() {
		
		System.out.println("Hi this is parent");
	}

	private static void age() {
		
		System.out.println("Age is 40");
	}
}

class Child extends Parent {

}

class Demo {
	
	public static void main(String[] args) {
		
		Child object = new Child();

		System.out.println(object.a);
		System.out.println(object.b);

		object.detail();
		object.age();

		System.out.println(Child.b);
		Child.age();
	}
}
