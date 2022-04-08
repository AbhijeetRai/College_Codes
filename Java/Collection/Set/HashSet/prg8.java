import java.util.*;

class Cricket {

	public static void main(String[] args) {

		HashSet<String> teamPlayer = new HashSet<String> ();

		teamPlayer.add("Rohit Sharma");
		teamPlayer.add("KL Rahul");
		teamPlayer.add("Virat Kohli");
		teamPlayer.add("Shreyas Iyyer");
		teamPlayer.add("Rishabh Pant");

		System.out.println(teamPlayer);

		System.out.println("Dhoni kheltoy ka? : " + teamPlayer.contains("Dhoni"));

		/** We can also write same thing as teamPlayer.remove(new String("Rishabh Pant"))*/
		teamPlayer.remove("Rishabh Pant");
		System.out.println(teamPlayer);

		/** Size returns the number of elements in the set*/
		System.out.println("Current team size : " + teamPlayer.size());


		Iterator obj = teamPlayer.iterator();

		while (obj.hasNext()) {

			System.out.println(obj.next());
		}
	}
}
