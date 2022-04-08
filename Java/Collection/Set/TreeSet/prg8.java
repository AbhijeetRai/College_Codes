import java.util.*;

class StringDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add(new StringBuffer("Dhoni"));
		t.add(new StringBuffer("Virat"));
		t.add(new StringBuffer("Rohit"));
		t.add(new StringBuffer("Kohli"));
		t.add(new StringBuffer("Yuvi"));

		System.out.println(t);
	}
}