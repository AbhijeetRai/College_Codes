class Parent {
	
	Parent() {
		
		System.out.println("Parent default");
	}
}

class Child extends Parent {
	
	Child() {
		
		super();	//explicit super(not implicit one) and this(), fight to be first line of constructor
		this(10);
	}

	Child(int a) {
		
		System.out.println("Child parametrised");
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		new Child();
	}
}
