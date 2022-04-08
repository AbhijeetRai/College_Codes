class Demo {
	
	int a = 10;

	void fun() {
		
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		
		int a = 30;
		System.out.println(a);

		new Demo().fun();
	}
}	
