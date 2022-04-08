interface Mughal {

	void enemies(String name1, String name2);

	default void showDynasty() {

		System.out.println("The dynasty is Mughal");
	}

	default void showCapital() {

		System.out.println("The capital is Delhi");
	}
}

class Demo {

	public static void main(String[] args) {
		
		Mughal obj = (String name1, String name2) -> System.out.println("Enemies are " + name1 + " and " + name2);

		obj.enemies("Shivaji", "Maharana Pratap");
		obj.showDynasty();
		obj.showCapital();
	}
}