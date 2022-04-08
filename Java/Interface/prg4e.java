interface Punjab {

	int a = 10;

	static void capital() {

		System.out.println("Capital of Punjab is Chandigarh");
	}
}

interface Haryana {

	int a = 20;

	static void capital() {

		System.out.println("Capital of Haryana is Chandigarh");
	}
}

class CapitalList implements Punjab, Haryana {

}

class Demo {

	public static void main(String[] args) {

		System.out.println(Punjab.a);
		Haryana.capital();
	}
}
