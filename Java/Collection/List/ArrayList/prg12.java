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

			Player obj = (Player)object.next();
			obj.display();
		}

		for(Player p : al) {

			 p.display();
			 Player obj = p;
			 obj.display();
		}
	}
}