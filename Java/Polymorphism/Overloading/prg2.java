class Demo {

    static void fun(float a, int b) {

        System.out.println("Floats are " + a + " " + b);
    }

    static void fun(int a, float b) {

        System.out.println("Integers are " + a + " " +b);
    }

	public static void main(String[] args) {

        fun(10, 10.1f);
        fun(10.1f, 10);

        //Ambiguous call
		//fun(10, 10);
		//fun('A', 'B');
	}
}
