class Parent {

}

class Child extends Parent {

}

class Demo {

	void fun(Object o) {

		System.out.println("Object");
	}

	void fun(Parent p) {

		System.out.println("Parent");
	}

	public static void main(String[] args) {

		new Demo().fun(new Child());
	}
}
