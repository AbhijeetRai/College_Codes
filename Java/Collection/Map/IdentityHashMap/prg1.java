/**
 * In hashmap jvm uses equals() method to compare keys(content compare)
 * In identity hashmap '==' is used to compare keys(reference compare)
 */

import java.util.*;

class Demo {

        public static void main(String[] args) {

                HashMap hashmap = new HashMap();

                // Content same, different address
                String s = "Shashi";
                String s1 = new String("Shashi");

                hashmap.put(s,"Core2Web");
                hashmap.put(s1,"BinEncaps");
                System.out.println(hashmap);


                IdentityHashMap ihashmap = new IdentityHashMap();
                ihashmap.put(s,"Core2Web");
                ihashmap.put(s1,"BinEncaps");
                System.out.println(ihashmap);
        }
}
