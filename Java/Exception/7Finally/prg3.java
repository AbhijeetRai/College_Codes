class Demo {

	public static void main(String[] args) {
		
		try {

			System.out.println("In try");
		}catch(Throwable e) {

			System.out.println("In catch");
		}

		finally {

			System.out.println("In finally");
		}

		for(int i = 1; i <= 3; i++)
			System.out.println("Core2Web");
	}
}