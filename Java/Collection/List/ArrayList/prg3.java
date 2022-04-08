//StringBuffer
import java.util.*;

class Demo {

	public static void main(String[] args) {

		ArrayList<StringBuffer> l = new ArrayList<StringBuffer> ();

		StringBuffer s1 = new StringBuffer("Divya");

		l.add(s1);
		l.add(new StringBuffer("Zagade"));

		//l.add(10);
		// error - int cannot be converted to stringbuffer

		//l.add("Shashi");
		// string cannot be converted to stringbuffer

		System.out.printf(l+"\n");

		for(StringBuffer s : l) {

			System.out.println(s);
		}

		Iterator object = l.iterator();

		while(object.hasNext()) {

			System.out.println(object.next());
		}
	}
}
