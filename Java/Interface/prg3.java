interface CovidWorld {
	
	void worldStats();
}

interface CovidIndia {
	
	void indiaStats();
}

class Stats implements CovidWorld, CovidIndia {
	
	public void worldStats() {
		
		System.out.println("Billions in World");
	}

	public void indiaStats() {
		
		System.out.println("Millions in India");
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		Stats s = new Stats();

		s.worldStats();
		s.indiaStats();
	}
}
