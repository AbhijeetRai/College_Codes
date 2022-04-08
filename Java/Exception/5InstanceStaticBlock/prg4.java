class MarvelCinematicUniverse {

	{
		//object of class is not made, this this will not be executed
		System.out.println("Watcher");
		System.out.println("Galactus");
	}

	public static void main(String[] args) {

		newYork();
	}

	static void newYork() {

		{
			//stackframe of this is pushed, this will be executed
			System.out.println("Spiderman");
			System.out.println("Daredevil");
		}
	}
}
