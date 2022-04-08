import java.util.*;

class Temp {

        public void finalize() {

                System.out.println("In finalize of Temp");
        }
}

class Demo {

        public static void main(String[] args) {

                WeakHashMap wmap = new WeakHashMap();

                Temp t = new Temp();
                Temp t1 = new Temp();

                wmap.put(t,"Shashi");
                wmap.put(t1,"Kanha");

                System.out.println("Before " + wmap);

                t = null;
                t1 = null;

                System.gc();

                System.out.println("After " + wmap);
        }
}
