/**
 * Making built in classes TreeSet comparable(They are by default comparable)
 */

import java.util.*;

class Demo {

        public static void main(String[] args) {

                TreeSet<String> java8 = new TreeSet<String> ();

                java8.add("Abhijeet");
                java8.add("Sanket");
                java8.add("Mayur");
                java8.add("Rahul");

                // Sorted by default alphabetically
                 System.out.println(java8);
        }
}
