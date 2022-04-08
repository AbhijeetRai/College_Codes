class Demo {

	public static void main(String[] args) {

		//char c = 14.1;	//Error
		//int a = 41l;		//Error

		double d = 41.2f;
		float g = 10;

		int a = 'A';
		char c1 = 65;
		System.out.println(c1 + " " + a);

		char[] array1 = new char[] {97, 98, 99};

		for(char c : array1)
			System.out.print(c + " ");
		System.out.println();

		//int[] array2 = new int[] {14, 89.1};

		//fun(70);	//Error
		//gun(100.5);	//Error
	}

	static void fun(char a) {

	}

	static void gun(int b) {

	}
}
