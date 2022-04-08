//Getter and Setter are two 'CONVENTIONAL' methods to access values of variables and update values of variables.
//Getter and setter are also called accessor and mutator. (A constructor is sometimes also used to set the values of variables).

class Custom {
	
	private int age;
	private String name;

	void setAge(int age) {
		
		this.age = age;
	}

	int getAge() {
		
		return age;
	}

	void setName(String name) {
		
		this.name = name;
	}

	String getName() {
		
		return name;
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		Custom c = new Custom();

		c.setAge(22);
		c.setName("Abhijeet");

		System.out.println("The age is " + c.getAge());
		System.out.println("The name is " + c.getName());
	}
}
