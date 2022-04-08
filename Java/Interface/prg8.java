interface Punjab {

	String capital = "Chandigarh";

	default void capital() {

		System.out.println("Capital of Punjab is Chandigarh");
	}
}

interface Haryana {

	String capital = "Chandigarh";

	default void capitalOfHaryana() {

		System.out.println("Capital of Haryana is Chandigarh");
	}
}

class CapitalList implements Punjab, Haryana {

}

class Demo {

	public static void main(String[] args) {

		//No error is there, until we call capital variable.
		//But as soon as we call capital on CapitalList, compiler gets confused from where to access it(which interface)
		//It does not look for value, it simply sees 2 variables with same identifier and gets confused
		//System.out.println(new CapitalList().capital);

		new CapitalList().capital();
		System.out.println(Haryana.capital);
	}
}
