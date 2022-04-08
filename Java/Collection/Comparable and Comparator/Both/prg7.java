/**
 * In built class comparator in ArrayList - anonymous class
 */

import java.util.*;
class Demo {

        public static void main(String[] args) {

                ArrayList<String> java8 = new ArrayList<String> ();

                java8.add("Abhijeet");
                java8.add("Sanket");
                java8.add("Mayur");
                java8.add("Rahul");
                java8.add("Akhilesh");

                System.out.println("Before Sorting :" + java8);

                Comparator<String> sortname = new Comparator<String> () {

                        public int compare(String s1, String s2) {

                                return s1.compareTo(s2);
                        }
                };

                Collections.sort(java8,sortname);
                System.out.println("After Sorting :" + java8);
        }
}
