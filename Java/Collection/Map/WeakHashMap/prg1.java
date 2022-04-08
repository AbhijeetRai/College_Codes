import java.util.*;

class Demo {

        public static void main(String[] args) {

                WeakHashMap<String,String> weakhashmap = new WeakHashMap<String,String> ();

                String one = new String("One");
                String two = new String("Two");

                weakhashmap.put(one,"Pune");
                weakhashmap.put(two,"Mumbai");

                System.gc();

                System.out.println("Before : " + weakhashmap.get("One") + "  " + weakhashmap.get("Two"));
                
                //reference from stack made null
                //reference from heap (weakhashmap)(see JVM.jpeg) remains
                one = null;
                two = null;
                //key remains as gc is not called yet
                //System.gc();

                System.out.println("After : " + weakhashmap.get("One") + "  " + weakhashmap.get("Two"));

        }
}
