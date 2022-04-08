import java.util.*;

/**
 * A class Jharkhand that will push data of
 * voterlist in collection, called voterlist.
 * @author Abhijeet Rai
 */

public class Jharkhand {

        /**
         * main method is client side method
         * @exception no exception
         * @return no return  value
         */
        public static void main(String[] args) {

                /**
                 * As the voterlist should be ordered without duplicity
                 * We will create a collection using LinkedHashSet.
                 */

                LinkedHashSet<Integer> voterList = new LinkedHashSet<Integer> ();

                voterList.add(1);
                voterList.add(2);
                System.out.println("The current voters are : " + voterList);

                System.out.println("2 is illegal immigrant, is he present in the voterlist");

                if(voterList.contains(2)) {

                        System.out.println("Yes he is present in the list");
                        voterList.remove(2);
                        System.out.println("After removing illegal immigrants, the list is : " + voterList);
                        System.out.println("The current number of people in the list are :  " + voterList.size());
                }

                System.out.println("We have found entire local area is fraud, remove them from list");

                /** If it is not empty, then delete everything from the list*/
                if(!voterList.isEmpty()) {

                        voterList.clear();
                        System.out.println("After removing illegal immigrants, the list is : " + voterList);    
                }
        }
}
