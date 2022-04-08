abstract class Custom {

	static int a = 10;
	int b = 20;

	abstract void gun();

	void fun() {

		System.out.println("In fun");
	}
}

class CustomChild extends Custom {

	void gun() {

		System.out.println("In gun");
	}
}

class Demo {

	public static void main(String[] args) {

		System.out.println(Custom.a);
		System.out.println(new CustomChild().b);
	}
}
