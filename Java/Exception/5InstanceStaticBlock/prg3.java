class MarvelCinematicUniverse {
	
	{	
		//is class ka object nai bana, class ka instance block fir nai execute hoga
		System.out.println("Watchers");
		System.out.println("Galactus");
	}

	public static void main(String[] args) {
		
		System.out.println("In Main");
	}

	static void safteyInNewYork() {
		
		{
			//stackframe of this method was never pushed, this instance block will not be executed			
			System.out.println("Spiderman");
			System.out.println("Daredevil");
		}
	}
}
