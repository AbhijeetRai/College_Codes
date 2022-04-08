import java.util.*;

class Tournament {

        public static void main(String[] args) {

                ArrayList<String> cricket = new ArrayList<String> ();
                ArrayList<String> footBall = new ArrayList<String> ();

                cricket.add("Abhijeet");
                cricket.add("zagade");
                cricket.add("Adya");
                cricket.add("Sahil");
                cricket.add("Sanket");
                cricket.add("Abhijeet");

                footBall.add("Abhijeet");
                footBall.add("Adya");
                footBall.add("Sahil");
                footBall.add("Amit");
                footBall.add("Utkarsh");

                /** Set removes duplicate elemetns of collection while adding it*/
                HashSet list = new HashSet(cricket);
                System.out.println(cricket);
                System.out.println(list);
        }
}
