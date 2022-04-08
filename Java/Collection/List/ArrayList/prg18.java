import java.util.*;

class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> slist = new ArrayList<String> ();
		slist.add("PPA");
		slist.add("Java");
		slist.add("Python");
		slist.add("Android");
		System.out.println("String Array List : " + slist);


		slist.add(3,"IOT");
		System.out.println("String Array List : " + slist);

		
		ArrayList alistcopy = (ArrayList) slist.clone();
		System.out.println("Clone : " + alistcopy);
	}
}