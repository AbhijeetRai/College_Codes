class Custom {

	static class Demo {
	
		int a = 10;
		static int b = 20;

		static void fun() {
		
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

}

class Random {

	public static void main(String[] args) {
		
		new Custom.Demo().fun();
	}
}