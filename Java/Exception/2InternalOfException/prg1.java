//A rough illustration of how exception handling works in Java

class GrandParent {

	private String message = null;

	GrandParent() {

		super();
	}

	GrandParent(String message) {

		this.message = message;
	}

	String getMessage() {

		return message;
	}
}

class Parent extends GrandParent {

	Parent() {

		super();
	}

	Parent(String message) {

		super(message);
	}
}

class Child extends Parent {

	Child() {

		super();
	}

	Child(String message) {

		super(message);
	}
}

class Demo {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.getMessage());

		Child c1 = new Child("Exception");
		System.out.println(c1.getMessage());
	}
}