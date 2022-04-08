import java.util.*;

class Demo {

	public static void main(String[] args) {

		LinkedHashSet<String> examHall = new LinkedHashSet<String>();

		examHall.add("Prerona");
		examHall.add("Prisha");
		examHall.add("Rahul");
		examHall.add("Me");
		examHall.add("Ritesh");


		examHall.add("Me");
		examHall.add("Ritesh");

		/** LinkedHashSet maintains order of insertion and avoids duplicate data*/
		System.out.println(examHall);

		Iterator object = examHall.iterator();

		while (object.hasNext()) {

			System.out.println(object.next());
		}
	}
}
