import java.util.*;

class Demo {

        public static void main(String[] args) {

                HashMap h = new HashMap();

                String s = new String("PPA");
                String s1 = new String("Python");

                h.put(s,"Sanket");
                h.put(s1,"Abhijeet");

                s = null;
                s1 = null;

                System.gc();

                System.out.println(h.get("PPA"));
                System.out.println(h.get("Python"));
        }
}
