import java.util.*;

class Demo {

        public static void main(String[] args) {

                HashMap<String,String> hashmap = new HashMap<String,String> ();

                String one = new String("One");
                String two = new String("Two");

                hashmap.put(one,"Pune");
                hashmap.put(two,"Mumbai");

                System.gc();

                System.out.println("Before : " + hashmap.get("One") + "  " + hashmap.get("Two"));
                //reference from stack made null
                //reference from heap (hashmap)(see JVM.jpeg) remains
                one = null;
                two = null;
                //hashmap dominates gc, even if heap to heap reference 
                // it deosnt let heap swipe the key
                System.gc();

                System.out.println("After : " + hashmap.get("One") + "  " + hashmap.get("Two"));

        }
}
