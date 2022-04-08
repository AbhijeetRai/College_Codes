abstract class CovidStats {

	public void indiaStats() {

		System.out.println("5 Lakh casrs in India");
	}

	public abstract void stateStats();
}

//An abstract class be a parent of annonymous inner class

class Demo {

	public static void main(String[] args) {

		CovidStats bihar = new CovidStats() {

			public void indiaStats() {

				System.out.println("5 Lakh, 2 thousand cases in India");
			}

			public void stateStats() {

				System.out.println("2000 cases in BIhar");
			}
		};

		bihar.indiaStats();
		bihar.stateStats();
	}
}
