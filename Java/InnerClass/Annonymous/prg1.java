abstract class CovidStats {

	void indiaStats() {

		System.out.println("5 Lakh casrs in India");
	}

	abstract void stateStats();
}

class Demo {

	public static void main(String[] args) {

		CovidStats bihar = new CovidStats() {

			void stateStats() {

				System.out.println("2000 cases in BIhar");
			}
		};

		bihar.indiaStats();
		bihar.stateStats();
	}
}
