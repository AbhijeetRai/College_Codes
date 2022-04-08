/**
 * Putting user defined,user defined class in TreeMap
 */

import java.util.*;

/**
 * Class war that holds the year of the war
 * It acts as key in TreeMap
 * Key in TreeMap must be Comparable or
 * Comparator should be provided in constructor of
 * TreeMap explicitly.
 * @author Abhijeet Rai
 */
class War implements Comparable<War> {

        int year;

        /**
         * Constructor to intialise instance variable year
         * @param year
         */
        War(int year) {

                this.year = year;
        }

        /**
         * Overriding compareTo method of Comparable interface to
         * sort Wars according to year
         * @param War
         * @return Integer value depending upon comparison of years
         */
        public int compareTo(War w1) {

                return this.year - w1.year;
        }

        /**
         * We know that to print address of class, it calls toString()
         * So whenever key War has to be printed, it should return year
         * @return year
         */
        public String toString() {

                return Integer.toString(year);
        }
}

/**
 * Class war that holds the name of the war
 * @author Abhijeet Rai
 */
class WarName {

        String name;

        /**
         * Constructor to intialise instance variable name
         * @param name
         */
        WarName(String name) {

                this.name = name;
        }
        /**
         * We know that to print address of class, it calls toString()
         * So whenever value WarName has to be printed, it should return name
         * @return name
         */
        public String toString() {

                return name;
        }
}

/**
 * Class to control the flow of program
 * @author Abhijeet Rai
 */
class Demo {

        /**
         * Client side method is main method
         * @param String array to capture command line arguments
         */
        public static void main(String[] args) {

                /** Creating a treemap with name wars*/
                TreeMap<War,WarName> wars = new TreeMap<War,WarName> ();

                /** Putting year and name of war with help of instance variables of classes,
                 * in the TreeMap called 'wars'
                 */
                wars.put(new War(1939),new WarName("World war 2"));
                wars.put(new War(1914),new WarName("World war 1"));
                wars.put(new War(1947),new WarName("Cold war"));

                /** Printing the treemap wars*/
                System.out.println(wars);
        }
}
