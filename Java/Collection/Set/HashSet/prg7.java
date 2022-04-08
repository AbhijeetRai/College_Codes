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


		teamPlayer.add("Virat Kohli");
		teamPlayer.add("Virat Kohli");
		teamPlayer.add("Virat Kohli");
		teamPlayer.add("Virat Kohli");
		teamPlayer.add("Virat Kohli");

		System.out.println(teamPlayer);
	}
}