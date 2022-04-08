class Marvel {
	
	{
		//instance block of class is executed only if object of class is made
		System.out.println("Hulk");
		System.out.println("Thor");
	}

	public static void main(String[] args) {
		
		{
			Marvel m = new Marvel();

			//instance block of any method is executed when stack frame of method is pushed on stack	
			System.out.println("Spider-Man");
			System.out.println("Iron-Fist");

		}
	}
}
