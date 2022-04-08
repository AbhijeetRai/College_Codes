/**
 * When we want inseretion order to be preserved, use linked hashmap instead of hashmap.
 */

import java.util.*;

class Demo {

        public static void main(String[] args) {



                LinkedHashMap<Integer,String> lhashmap = new LinkedHashMap<Integer, String> ();
                lhashmap.put(1,"Abhijeet");
                lhashmap.put(2,"Sanket");
                lhashmap.put(3,"Mayur");
                lhashmap.put(4,"Rahul");
                System.out.println("LinkedHashMap : " + lhashmap);
        }
}
