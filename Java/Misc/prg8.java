class Demo {
	
	//a constructor can be private
	private Demo() {

	}

	Demo(int a) {
	
	}
	
	//method is inherited including local variables
	void fun() {
		
		int a = 100;
		System.out.println("a is " + a);
	}
}

class DemoChild extends Demo {
	
	DemoChild() {
		
		super(10);
	}
}

class Custom {
	
	public static void main(String[] args) {
		
		new DemoChild().fun();
	}
}
