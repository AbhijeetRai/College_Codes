/**
 * Entries in TreeMap are always sorted beased on natural order of keys or based on custom comparator.
 */

import java.util.*;
class Demo {

        public static void main(String[] args) {

                TreeMap tm = new TreeMap();
                tm.put("Zagade",83);
                tm.put("Divya",16);
                tm.put("Saujay",69);
                tm.put("Abhijeet",56);
                System.out.println(tm);
        }
}
