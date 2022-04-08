import java.util.*;

class SortByName implements Comparator<String> {

	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}
}


class Demo {

	public static void main(String[] args) {
		
		ArrayList<String> ThirdYear = new ArrayList<String> ();

		ThirdYear.add("Rahul");
		ThirdYear.add("Abhijeet");
		ThirdYear.add("Divya");
		ThirdYear.add("Sujay");

		System.out.println("Before Sorting " + ThirdYear);
		Collections.sort(ThirdYear, new SortByName());
		System.out.println("After Sorting " + ThirdYear);
	}
}