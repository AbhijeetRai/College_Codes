import java.util.*;

class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer> ();
		alist.add(5);
		alist.add(11);
		alist.add(17);
		System.out.println("Integer Array List : " + alist);

		ArrayList<String> slist = new ArrayList<String> ();
		slist.add("PPA");
		slist.add("Java");
		slist.add("Python");
		slist.add("Android");
		System.out.println("String Array List : " + slist);

		alist.add(2,15);
		System.out.println("Integer Array List : " + alist);

		slist.add(3,"IOT");
		System.out.println("String Array List : " + slist);

		ArrayList alist1 = new ArrayList(1);
		alist1.add("HI");
		alist1.add("Hello");

		//String directly appeneded in ArrayList collection of <Integer> generic

		alist.addAll(alist1);
		System.out.println("Integer Array List : " + alist);
	}
}
