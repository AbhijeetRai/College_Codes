import java.util.*;

class Demo {

        public static void main(String[] args) {

                WeakHashMap wmap = new WeakHashMap();
                wmap.put(10,"Sachin");
                wmap.put(7,"Dhoni");

                /**
                 * returns null value, if the key is not found
                 */
                System.out.println(wmap.get(10)+ " " + wmap.get(11));


                HashMap map = new HashMap();
                map.put(10,"Sachin");
                map.put(7,"Dhoni");
                /**
                 * returns null value, if the key is not found
                 */
                System.out.println(map.get(10)+ " " + map.get(11));
        }
}
