class Xyz {
	Entry root;

	void put(String k, Object v) {

		Entry t = root;
		if(t == null) {

			//---
			root = new Entry(k,v);
		}
		else {

			/*
				------------
				Their logic
			*/
			t.setValue(k,v);
		}
	}

	class Entry {

		String key;
		Object value;
		Entry(String key, Object o) {

			this.key = key;
			value = o;
		}
		void setValue(String k, Object v) {

			/*
				Their logic
			*/
			System.out.println("value is set");
		}
	}
	public static void main(String[] args) {
		Xyz x = new Xyz();
		Object PRESENT = new Object();
		x.put("Audi",PRESENT);
		x.put("BMW",PRESENT);
		x.put("Lamborghini",PRESENT);
	}
}