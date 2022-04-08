import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String> ();


		//l.add(10);
		/**
		 * Error- incompatible types integer cannot be converted to string
		 */

		l.add("Abhijeet");
		l.add("Divya");
		l.add("Prerona");
		l.add(new String("Raju"));

		String s1 = "PD";

		String s2 = new String("Siku");

		l.add(s1);
		l.add(s2);

		System.out.println(l);

		for(String s : l) {

			System.out.println(s);
		}

		Iterator object = l.iterator();

		while(object.hasNext()) {

			System.out.println(object.next());
		}
	}
}