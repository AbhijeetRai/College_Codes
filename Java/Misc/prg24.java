class Demo {

	int a = 10;
	int b = 20;

	Demo() {

		int a = 100;
		int b = 200;

		System.out.println(a);
		System.out.println(b);

		System.out.println(this.a);
		System.out.println(this.b);
	}

	void fun() {

		int a = 100;
		int b = 200;

		System.out.println(a);
		System.out.println(b);

		System.out.println(this.a);
		System.out.println(this.b);
	}


	public static void main(String[] args) {

		Demo d = new Demo();
		d.fun();
	}
}
