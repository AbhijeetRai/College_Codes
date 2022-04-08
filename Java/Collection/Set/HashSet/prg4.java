import java.util.*;

class Demo {

	public static void main(String[] args) {

		HashSet object = new HashSet();

		object.add("Abhijeet");
		object.add("Divya");
		object.add("Abhijeet");
		object.add("Sujay");

		/** It is not accepting duplicate data*/
		/** It is also not maintaining insertion order*/
		System.out.println(object);
	}
}
