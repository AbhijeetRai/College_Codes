abstract class Parent {
	
	void gun() {
		
		System.out.println("Parent gun");
	}

	void fun() {
		
		gun();
	}
}

class Child extends Parent {

	void gun() {
		
		System.out.println("Child gun");
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.fun();

		Parent p2 = new Child();
		p2.fun();

		Child c1 = new Child();
		c1.fun();
	}	
}
