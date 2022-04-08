import java.util.*;

class Demo {
		
		public static void main(String[] args) {
			
			LinkedList ll = new LinkedList();

			ll.add(10);
			ll.add(10.5);
			ll.add("Shashi");

			ListIterator obj = ll.listIterator();

			while(obj.hasNext()) {

				System.out.println(obj.next());
			}
		}
}