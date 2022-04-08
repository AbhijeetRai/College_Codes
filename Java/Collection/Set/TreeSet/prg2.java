/**
 * Note - StringBuffer can be added in HashSet and LinkedHashSet "directly" but not Tresset as it does not
 * have compareTo() method in java 1.8. but my pc has 1.11
 */


import java.util.*;

class Demo {

	public static void main(String[] args) {

		HashSet s = new HashSet();
		s.add(new StringBuffer("Adya"));
		s.add(10);

		LinkedHashSet s1 = new LinkedHashSet();
		s1.add(new StringBuffer("Adya"));
		s1.add(10);


		TreeSet ss = new TreeSet();
		// Different type of datatypes cannot be added in treeset, gives run time class cast exception*/
		ss.add(10);
		ss.add(new String("Adya"));
		System.out.println(ss);
	}
}
