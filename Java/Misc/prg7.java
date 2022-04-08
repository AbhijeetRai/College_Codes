class Demo {

	//a constructor can be private
	private Demo() {

	}

	void fun() {

		int a = 10;
		System.out.println(a);
	}
}

class DemoChild extends Demo {

}

class Custom {

	public static void main(String[] args) {

		new DemoChild().fun();

		/**
		 * Error because, as soon as object of DemoChild() is created,
		 * control moves to constructor of DemoChild, where first line is super
		 * But constructor of parent is private
		 */
	}
}
