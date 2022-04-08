class Demo {

	public static void main(String[] args) {

		//Error - Possible loosy conversion from double to int
		//int[] array1 = new int[] {1, 11.123, 'A'};


		float[] array2 = new float[] {1.14f, 2, 'C'};

		for(int i = 0; i < 3; i++)
			System.out.print(array2[i] + " ");
		System.out.println();

		//Possible lossy conversion from double to char
		//char[] array3 = new char[] {'A', 11, 12.5};
	}
}
