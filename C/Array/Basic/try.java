class Demo {
	
	public static void main(String[] args) {
		
		//Giving neither the size nor the initializer is leading to exception
		//int[] array = new int[] {}; 
		//array[0] = 10;
		
		//Array dimension missing
		//int arry = new int[];

		int[] array1 = new int[] {1, 2, 3};
		int[] array2 = new int[3];
		
		//Array creation with dimension and intialization is illegal
		//int[] array3 = new int[4] {1, 2, 3, 4};

	}
}
