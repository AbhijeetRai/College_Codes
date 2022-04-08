class Parent {
	
	int age = 62;

	void printName() {
		
		System.out.println("Ram Narayan Rai");
	}
}

class Child extends Parent {
	
	int age = 22;

	void printName() {
		
		System.out.println("Abhijeet Rai");
	}

	void details() {
		
		int age = 58;

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
		
		new Child().details();
	}
}
