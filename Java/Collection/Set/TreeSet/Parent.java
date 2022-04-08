class Parent {

	public void fun() {

		System.out.println("In parent fun");
	}
}

class Child extends Parent {

	void gun() {

		System.out.println("In child gun");
	}
}


class Demo {

	public static void main(String[] args) {
		
		Parent p;
		p = new Child();

		p.fun();

		Parent p1 = new Parent();

		Child p2 = (Child)p1;
	}
}