import java.util.*;

class Demo {

	public static void main(String[] args) {

		HashSet h = new HashSet();

		h.add(new Integer(10));
		h.add(new Integer(10));
		h.add(new Integer(10));
		h.add(new Integer(10));
		h.add(new Integer(10));
		h.add(new Integer(10));

		h.add(new String("Shashi"));
		h.add(new String("Shashi"));

		String s = "Shashi";

		h.add(s);

		/** Set does not accept duplicate data.*/
		System.out.println(h);


	}
}
