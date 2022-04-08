class Parent {
	
	Parent(int a) {

	}
}

class Child extends Parent {

}

class Demo {
	
	public static void main(String[] args) {
			
		/**
		 * Error because once object of child is created, control moves to constructor(default) of Child.
		 * Does not matter what you do in any constructor, the first line of constructor is 'super()'
		 *
		 * Which is call to default constructor of super(Parent) class. But Parent class has no default constructor here
		 */
		Child c = new Child();
	}
}
