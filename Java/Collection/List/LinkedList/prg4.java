import java.util.*;

class Mix {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer> ();
		LinkedList<Integer> ll = new LinkedList<Integer> ();

		for(int i = 1; i <= 3; i++) {

			al.add(i);
			ll.add(i);
		}

		Iterator obj = al.iterator();
		System.out.println("Array List : ");
		while(obj.hasNext())
			System.out.println(System.identityHashCode(obj.next()));

		obj = ll.iterator();
		System.out.println("\nLinked List : ");
		while(obj.hasNext())
			System.out.println(System.identityHashCode(obj.next()));
	}
}
