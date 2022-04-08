/**
 * Sorting in buint class in arraylist using comparator.
 */

 import java.util.*;

class SortByName implements Comparator<String> {

        public int compare(String s1, String s2) {

                return s1.compareTo(s2);
        }
}


 class Demo {

         public static void main(String[] args) {

                 ArrayList<String> java8 = new ArrayList<String> ();

                 java8.add("Abhijeet");
                 java8.add("Sanket");
                 java8.add("Mayur");
                 java8.add("Rahul");
                 java8.add("Akhilesh");

                 System.out.println("Before Sorting ::" + java8);

                 Collections.sort(java8, new SortByName());
                 System.out.println("Before Sorting ::" + java8);
        }
}
