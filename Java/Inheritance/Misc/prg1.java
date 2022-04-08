class Parent {
	
	Parent() {
		
		System.out.println("Parent default");
	}
}

class Child extends Parent {
	
	Child() {
		
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
