import java.util.*;

class Demo {

        public static void main(String[] args) {

                Hashtable<Integer,String> h = new Hashtable<Integer,String> ();

                h.put(442,"Shashi");
                h.put(766,"Rahul");
                h.put(333,"Abhijeet");

                System.out.println(h);

                Set s = h.keySet();
                Iterator<Integer> itr = s.iterator();

                while(itr.hasNext()) {

                        Integer key = itr.next();
                        System.out.print(key +" ");
                        System.out.println(h.get(key));
                }
        }
}
