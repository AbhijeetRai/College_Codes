interface CovidStats {

	void stateStats();

	default void indiaStats() {

		System.out.println("5 Lakh cases");
	}

	static void worldStats() {

		System.out.println("50 Lakh cases");
	}
}

//An interface can be used as parent of annonymous inner class, too.

class Demo {

	public static void main(String[] args) {

		CovidStats bihar = new CovidStats() {

			public void stateStats() {

				System.out.println("2000 cases");
			}
		};

		bihar.stateStats();
		bihar.indiaStats();
	}
}
