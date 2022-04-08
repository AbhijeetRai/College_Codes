import java.util.*;

class MyComparator implements Comparator<String> {

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

                System.out.println(t);
        }
}
