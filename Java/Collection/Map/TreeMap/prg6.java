import java.util.*;

class Demo {

        public static void main(String[] args) {

                TreeMap<Integer,String> wars = new TreeMap<Integer,String> ();

                wars.put(1939,"World war 2");
                wars.put(1914,"World war 1");
                wars.put(1947,"Cold war");
                wars.put(1999,"kargil war");

                System.out.println(wars);
                System.out.println(wars.headMap(1947));
                System.out.println(wars.tailMap(1939));
        }
}
