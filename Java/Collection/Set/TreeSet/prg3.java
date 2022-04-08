import java.util.*;

class Demo {

	public static void main(String[] args) {
		
		

		TreeSet ss = new TreeSet();
		
	    /** Printed in natural ascending order, duplicate data not aloowed*/
		ss.add(new String("Adya"));
		ss.add(new String("Sahil"));
		ss.add(new String("Rai"));
		ss.add(new String("Advait"));
		ss.add(new String("Adya"));
		System.out.println(ss);

		System.out.println(ss.headSet("Rai"));
		System.out.println(ss.tailSet("Rai"));
		

	}	
}