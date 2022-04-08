import java.util.*;

class NavigableTreeDemo {

        public static void main(String[] args) {

                TreeMap<String,String> t = new TreeMap<String,String> ();
                t.put("Apple","Steve");
                t.put("Microsoft","Bill");
                t.put("SpaceX","Elon");
                t.put("Amazon","Jeff");
                t.put("Persistent","Anand");

                System.out.println(t.ceilingKey("SpaceX"));
                System.out.println(t.higherKey("Amazon"));
                System.out.println(t.floorKey("Amazon"));
                System.out.println(t.lowerKey("Amazon"));

                System.out.println(t.pollFirstEntry());
                System.out.println(t.pollLastEntry());
                System.out.println(t.descendingMap());
        }
}
