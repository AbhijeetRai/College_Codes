/**
 * Sorting built in class in arraylist using comparable
 * Directly send it to get sort, mostly inbuilt classes are of comparable type,
 * they have to compare method, and they will be sorted
 */

import java.util.*;

class Demo {

        public static void main(String[] args) {

                ArrayList<String> java8 = new ArrayList<String> ();

                java8.add("Abhijeet");
                java8.add("Sanket");
                java8.add("Mayur");
                java8.add("Rahul");

                System.out.println("Before Sorting  :"  + java8);
                Collections.sort(java8);
                System.out.println("After Sorting  : " + java8);
        }
}
