import java.util.*;

class Demo {

	public static void main(String[] args) {

		List l = new ArrayList(2);

		int a = 10;

		l.add(10);
		l.add(10.5);
		l.add("Shashi");
		l.add(10);
		l.add(a);

		/**
		 * There are 3 ways to print, for each ,directly using system.out.println and cursor
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
