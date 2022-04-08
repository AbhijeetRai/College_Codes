//static variable's only one copy exists.
//exclusive copy of instance variable with every object

class Demo {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		Demo d = new Demo();

		System.out.println(d.a);
		System.out.println(d.b);

		d.a = 30;
		d.b = 40;

		System.out.println(d.a);
		System.out.println(d.b);

		Demo e = new Demo();

		System.out.println(e.a);
		System.out.println(e.b);
	}
}
