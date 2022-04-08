interface CovidStats {
	
	void stateStats();
}

class Demo {
	
	public static void main(String[] args) {
		
		CovidStats bihar = new CovidStats() {
			
			public void stateStats() {
				
				System.out.println("2000 cases");
			}
		};

		bihar.stateStats();
	}
}
