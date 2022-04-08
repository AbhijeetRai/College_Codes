/**
 * Putting user defined class and HashMap in TreeMap
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
 * Class to control the flow of program
 * @author Abhijeet Rai
 */
class Demo {

        /**
         * Client side method is main method
         * @param String array to capture command line arguments
         */
        public static void main(String[] args) {

                /** Creating a HashMap ww1(world war 1) to contain reason of war and nation to start war*/
                HashMap<String,String> ww1 = new HashMap<String,String> ();
                ww1.put("Assasination of ArchDuke Ferdinand","Austria");

                /** Creating a HashMap ww2(world war 2) to contain reason of war and nation to start war*/
                HashMap<String,String> ww2 = new HashMap<String,String> ();
                ww2.put("Hitler","Germany");

                /**
                 * Creating a treemap with name wars
                 * TreeMap wars will consist of year of war(key) put in the object of class war
                 * and stored in instance variable of class war.
                 * TreeMap will consist of HashMap ww1 and ww2 as value
                 */
                TreeMap<War,HashMap> wars = new TreeMap<War,HashMap> ();

                wars.put(new War(1914),ww1);
                wars.put(new War(1939),ww2);

                /**
                 * Retrieve all the keys from TreeMap 'wars' in a set called keys
                 * Keys consist of nothing but objects of class War
                 */
                Set<War> keys = wars.keySet();

                /**
                 * as long as set 'keys' has a key, iterate over it and
                 * retrieve every key one by one
                 * key is nothing but object of class War
                 */
                for(War key : keys) {

                        /** Simply print the currently achieved key*/
                        System.out.print(key + " ");

                        /**
                         * Now it is time to retrieve value from the HashMap ww1 and ww2
                         * HashMap ww1, ww2 are put as values in TreeMap 'wars'
                         * Pass the retrieved key to get() method, it will return the HashMap(ww1 or ww2)
                         * mapped to that particular key
                         */
                        HashMap<String,String> war = wars.get(key);

                        /**
                         * Retrieve all the values in a Collection, present in hashmap (ww1 or ww2)
                         * as long as hashmap ww1 or ww2 has values. Print those values one by one
                         */
                        Collection<String> valueSet = war.values();

                        for(String value : valueSet) {

                                System.out.println(value);
                        }
                }
        }
}
