import java.util.*;

class Abhijeet {

}

class Divya {

}

class Demo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList ();

		Abhijeet a = new Abhijeet();
		Divya d = new Divya();

		l.add(a);
		l.add(d);
		l.add(new Abhijeet());
		l.add(new Divya());

		/**
		 * This starts printing the address
		 */
		System.out.println(l);

		for (Object o : l) {

			System.out.println(o);
		}

		Iterator object = l.iterator();

		while(object.hasNext()) {

			System.out.println(object.next());
		}
	}
}
