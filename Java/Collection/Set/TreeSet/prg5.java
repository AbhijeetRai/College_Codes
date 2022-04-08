import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		
		TreeSet t = new TreeSet (s);

		t.add(2000);
		t.add(3000);

		System.out.println(t);
	}
}