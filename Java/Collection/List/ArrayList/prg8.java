import java.util.*;

class Player {

	String name;
	int totalMatches;

	Player(String name, int totalMatches) {

		this.name = name;
		this.totalMatches = totalMatches;
	}

	void display() {

		System.out.println("Name of the Player : " + name);
		System.out.println("Matches of the player : " + totalMatches);
	}
}

class Demo {

	public static void main(String[] args) {
		
		ArrayList<Player> al = new ArrayList<Player> ();
		al.add(new Player("Sachin",400));
		al.add(new Player("Shewag",300));

		Iterator object = al.iterator();

		while(object.hasNext()) {

			/** Error
			 * It needs casting 
			*/
			Player obj = object.next();
			obj.display();
		}
	}
}