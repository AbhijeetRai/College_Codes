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
	
	void details() {
		
		super.age();
		System.out.println(super.b);

		super.detail();
		System.out.println(super.a);
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		new Child().details();
	}
}
