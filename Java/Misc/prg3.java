/**
 * Remember while studying Set in collection, we noticed
 *
 * Set s = new HashSet();
 *
 * s.add(new String("Abhijeet"))
 * s.add(new String("Abhijeet"))
 * "Abhijeet" added only once
 *
 * s.add(new Employee(1))
 * s.add(new Employee(1))
 * 2 Employee added 
 *
 * We justified this saying content of user defined class is not checked, before adding
 * while on other hand content of in built classes is checked, before adding
 *
 * Also notice that Object reference stores content of in built class
 * and it stores address of user defined class.
 */

class Demo {
	
	Demo() {

	}

	Demo(String s) {

	}

	public static void main(String[] args) {
		
		Object o = null;
		
		System.out.println(o);
		
		o = new Demo();
		System.out.println(o);

		o = new Demo("Italy");
		System.out.println(o);

		o = new String("Italy");
		System.out.println(o);

		o = new StringBuffer("Italy");
		System.out.println(o);
	}
}

/**
 * I conclude reference 'o' of above program, stores, identifies and distinguishes
 * user defined class by address
 * in built class by content
 */
