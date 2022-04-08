import java.util.HashSet;

class Demo {
	
	public static void main(String[] args) {
		
		HashSet s = new HashSet();

		s.add(new Demo());
		s.add(new Demo());

		Demo d = new Demo();

		s.add(d);
		s.add(d);
		
		/**
		 * User defined classes are distinguished by address
		 * Hence 3 objects will be added.:
		 */
		System.out.println(s);
	}
}	
