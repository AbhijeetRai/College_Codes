import java.io.*;
import java.util.*;

class Player {

    String name; 
    int score; 

    Player(String name, int score) {

        this.name = name;
        this.score = score;
    }

    public String toString() {

        return this.name + " " + this.score;
    }
}

//The players are first sorted descending by score, then ascending by name.
class SortPlayer implements Comparator<Player> {

    public int compare(Player p1, Player p2) {

        int result = p1.score - p2.score;

        if (result != 0)
            return -result; 

        else
            return p1.name.compareTo(p2.name);
    }
}

class Demo {

    public static void main(String[] args) throws IOException {

        ArrayList<Player> players = new ArrayList<Player> ();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for(int i = 1; i <= number; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String name = st.nextToken().trim();
            int score = Integer.parseInt(st.nextToken().trim());

            Player p = new Player(name, score);
            players.add(p);
        }

        Collections.sort(players, new SortPlayer());

        for(Player p: players) 
            System.out.println(p);
    }
}