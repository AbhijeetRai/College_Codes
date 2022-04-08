class Parent {

	Parent(int a) {

	}
}

class Child extends Parent {

	Child() {

		super(10);
	}
}

class Demo {

	public static void main(String[] args) {

		/**
		 * Error because once object of child is created, control moves to constructor(default) of Child.
		 * Does not matter what you do in any constructor, the first line of constructor is 'super()'
		 *
		 * Which is call to default constructor of super(Parent) class. But Parent class has no default constructor here
		 * In such cases, write constructor of sub class explicitly and call super class' parametrised constructor
		 * or write a default constructor for super class
		 *
		 */
		Child c = new Child();
	}
}
