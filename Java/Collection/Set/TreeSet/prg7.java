import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet ();

		t.add("Audi");
		t.add("BMW");
		t.add("Mercedes");
		t.add("Jaguar");

		System.out.println(t);

		for (String s : t) {

			System.out.println(s);
		} 
	}
}