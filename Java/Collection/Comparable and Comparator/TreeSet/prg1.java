import java.util.*;

class Demo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();

		t.add(50);
		t.add(80);
		t.add(110);
		t.add(20);
		t.add(250);
		t.add(91);
		
		System.out.println(t);

		/**
		 * It internally calls compareTo() method
		 */
	}
}
