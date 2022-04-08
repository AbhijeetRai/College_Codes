import java.util.*;

// generic not given in front of Comparator
//see compare method of prg 8, if you dont want to give generic
class MyComparator implements Comparator {

        public int compare(String obj1, String obj2) {

                return obj1.compareTo(obj2);
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
        }
}
