class Covid {

	void stats() {

		System.out.println("5 Lakh cases");
	}
}

class Demo {

	public static void main(String[] args) {

		Covid bihar = new Covid() {

			void biharStats() {

				System.out.println("2000 cases");
			}
		};
		//on refernce of parent only methods of parent can be called.
		bihar.biharStats();
	}
}
