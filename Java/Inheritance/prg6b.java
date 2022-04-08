class BajiRao {

	static String religion;
}

class RaghuNathRao extends BajiRao {

	RaghuNathRao() {

		religion = "Hindu";
	}
}

class SamsherBahadur extends BajiRao {

	SamsherBahadur() {

		religion = "Muslim";
	}
}

class Demo {

	public static void main(String[] args) {

		RaghuNathRao rr = new RaghuNathRao();
		SamsherBahadur sb = new SamsherBahadur();

		System.out.println(rr.religion);
		System.out.println(sb.religion);
	}
}

/**
 * Both the child classes have one unqiue copy each of parent BajiRao. Child1 changing variable of Parent
 * does not affect inheritance of Child2. Even though they got unique copy of object, but now we made change in static
 * variable, not instance variable.
 */
