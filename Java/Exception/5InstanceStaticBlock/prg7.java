class Demo {
	
	Demo() {
		
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance block of class");
	}

	public static void main(String[] args) {
		
		new Demo();
	}
}
//instance block has higher priority than constructor
