import java.util.*;

class Demo {

	public static void main(String[] args) {

		HashSet h = new HashSet();

		h.add(10);
		h.add(10);
		h.add(10);
		h.add(new Integer(10));

		/** Set does not accept duplicate data*/
		System.out.println(h);


	}
}
