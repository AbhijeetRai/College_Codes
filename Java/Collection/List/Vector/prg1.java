import java.util.*;

class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer> ();
		System.out.println(v.capacity());

		System.out.println("Now listIterator : ");

		v.add(10);
		v.add(20);
		v.addElement(30);
		v.add(10);
		v.addElement(30);

		ListIterator obj = v.listIterator();

			while(obj.hasNext()) {

				System.out.println(obj.next());
			}

			System.out.println("Now iterator : ");

		Iterator ob = v.listIterator();

			while(ob.hasNext()) {

				System.out.println(ob.next());
			}

			System.out.println("Now vector's Enumeration : ");

		Enumeration e = v.elements();

		while(e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}
	}
}