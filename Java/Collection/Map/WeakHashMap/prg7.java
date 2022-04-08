import java.util.*;

class Temp {

        public void finalize() {

                System.out.println("In finalize of Temp");
        }
}

class Demo {

        public static void main(String[] args) {

                HashMap map = new HashMap();

                Temp t = new Temp();
                Temp t1 = new Temp();

                map.put(t,"Shashi");
                map.put(t1,"Kanha");

                System.out.println("Before " + map);

                t = null;
                t1 = null;

                //System.gc();

                System.out.println("After " + map);
        }
}
