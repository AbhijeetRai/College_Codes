class Parent {
	
	static int age = 62;

	static void printName() {
		
		System.out.println("Ram Narayan Rai");
	}
}

class Child extends Parent {
	
	static int age = 22;

	static void printName() {
		
		System.out.println("Abhijeet Rai");
	}

	void details() {
		
		System.out.println(super.age);
		super.printName();

		System.out.println(age);
		printName();

		System.out.println(this.age);
		this.printName();
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Static\n");
		new Child().details();
	}
}
