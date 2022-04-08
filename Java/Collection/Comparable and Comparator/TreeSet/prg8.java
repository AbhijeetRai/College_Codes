import java.util.*;

/**
 * toString() method gives string representation of any class - that is address
 * but for string, it will actually return the string itself
 */
class MyComparator implements Comparator {

        public int compare(Object obj1, Object obj2) {

                String s1 = (String)obj1;
                String s2 = obj2.toString();

                return s1.compareTo(s2);
        }
}

class Demo {

        public static void main(String[] args) {

                TreeSet t = new TreeSet(new MyComparator());

                t.add("zagade");
                t.add("Abhijeet");
                t.add("Sujay");
                t.add("Divya");
                t.add("Abhijeet");

                System.out.println(t);
        }
}
