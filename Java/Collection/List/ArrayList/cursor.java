interface Pet {

	void name();
}

class List {


	Pet pet() {

		return new P();
	}

	private class P implements Pet {

		public void name() {

			System.out.println("Gogi");
		}
	}
}

class Demo {

	public static void main(String[] args) {
		
		List l = new List();

				Pet obj = l.pet();
				obj.name();
	}
}