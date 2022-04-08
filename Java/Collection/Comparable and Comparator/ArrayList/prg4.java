import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		ArrayList<String> ThirdYear = new ArrayList<String> ();

		ThirdYear.add("Rahul");
		ThirdYear.add("Abhijeet");
		ThirdYear.add("Divya");
		ThirdYear.add("Sujay");

		Comparator<String> nameWise = new Comparator<String> () {

			public int compare(String s1, String s2) {

				return s1.compareTo(s2);
			}
		};

		System.out.println("Before Sorting : " + ThirdYear);
		Collections.sort(ThirdYear, namewise)
		System.out.println("After Sorting : " + ThirdYear);
}