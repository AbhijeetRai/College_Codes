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
		//duplicate data
		t.add(50);
		
		System.out.println(t);

		System.out.println();
		System.out.println(t.first());
		System.out.println(t.last());

		System.out.println(t.headSet(110));
		System.out.println(t.tailSet(110));

		System.out.println(t.subSet(80,110));

		System.out.println(t.comparator());
	}
}
