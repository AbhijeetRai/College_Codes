/**
 * Sorting built in classes using comparator in TreeSet
 */

import java.util.*;


class SortNames implements Comparator<String> {

        public int compare(String s1, String s2) {

                return s1.compareTo(s2);
        }
}

class Demo {

        public static void main(String[] args) {

                TreeSet<String> java8 = new TreeSet<String> (new SortNames());

                java8.add("Abhijeet");
                java8.add("Sanket");
                java8.add("Mayur");
                java8.add("Rahul");
                java8.add("Akhilesh");

                System.out.println(java8);
        }
}
