import java.util.*;

class Demo {

	public static void main(String[] args) {

		HashSet s = new HashSet();

		s.add("Abhijeet");
		s.add(21);

		s.add("Abhijeet");
		s.add(21);

		//content inside inbuilt class is checked but not inside user defined class
		s.add(new String("Abhijeet"));
		s.add(new Integer(21));

		System.out.println(s);
	}
}
