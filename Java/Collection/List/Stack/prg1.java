import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();

		s.push("A");
		s.push("B");
		s.push("C");
		//s.add("D");

		System.out.println(s);


 		 /**
     * Returns the 1-based position where an object is on this stack.
     * If the object <tt>o</tt> occurs as an item in this stack, this
     * method returns the distance from the top of the stack of the
     * occurrence nearest the top of the stack; the topmost item on the
     * stack is considered to be at distance <tt>1</tt>. The <tt>equals</tt>
     * method is used to compare <tt>o</tt> to the
     * items in this stack.
     *
     * @param   o   the desired object.
     * @return  the 1-based position from the top of the stack where
     *          the object is located; the return value <code>-1</code>
     *          indicates that the object is not on the stack.
     */
		System.out.println(s.search("A"));	// 3 from top
		System.out.println(s.search("B"));  // 2 from top
		System.out.println(s.search("C"));  //1 because it is at top

		System.out.println("Now ListIterator : ");

		ListIterator obj = s.listIterator();

			while(obj.hasNext()) {

				System.out.println(obj.next());
			}

			System.out.println("Now iterator : ");

		Iterator ob = s.listIterator();

			while(ob.hasNext()) {

				System.out.println(ob.next());
			}

			System.out.println("Now vector's Enumeration : ");

		Enumeration e = s.elements();

		while(e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}

		//peeks top of stack but does not remove
		System.out.println("Peek : " + s.peek());
		System.out.println(s);

		//pops top of stack and remove
		System.out.println("Pop : " + s.pop());
		System.out.println(s);

		s.pop();
		System.out.println(s);

	}
}