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


		ArrayList<Integer> alist1 = new ArrayList<Integer>(1);
		alist1.add(9);
		alist1.add(8);
		alist.addAll(alist1);
		System.out.println("Integer Array List : " + alist);


		ArrayList<String> alistcopy = (ArrayList<String>) slist.clone();
		System.out.println("Clone : " + alistcopy);


		boolean flag = alist.contains(2);
		if (flag == true) {

			System.out.println("It contains 2");
		}
		else
			System.out.println("It does not contain 2");


		int value = alist.get(5);
		System.out.println(value);

		/**
		 * To remove 5 from list
		 */
		alist.remove(new Integer(5));
		System.out.println(alist);


		/**
		 * To remove element at index 4
		 */
		alist.remove(4);
		System.out.println(alist);


		Object[] obj = alist.toArray();
		for(int i = 0; i < obj.length; i++) {

			System.out.println("Values at index : " + i + " of ArrayList " + obj[i]);
		}


		alist.clear();
		System.out.println("The list is : " + alist);
	}
}
