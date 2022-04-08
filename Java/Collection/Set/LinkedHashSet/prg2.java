import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		LinkedHashSet s = new LinkedHashSet();

		s.add("Abhijeet");
		s.add(new String("Abhijeet"));

		s.add(22);
		s.add(new Integer(22));

		/** Duplicate data is not accepted*/
		System.out.println(s);
	}
}