import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();

		h.add(10);
		System.out.println(h);

		/** It does not accept duplicate values*/
		h.add(new Integer(10));
		System.out.println(h);


		h.add(new Double(10));
		System.out.println(h);
	}
}