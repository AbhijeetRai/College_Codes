import java.util.*;

class CompareString implements Comparator<String> {

        public int compare(String s1, String s2) {

                return s1.compareTo(s2);
        }
}

class Demo {

        public static void main(String[] args) {

                TreeMap map = new TreeMap(new CompareString());

                map.put("Zagade",83);
                map.put("Divya",16);
                map.put("Sujay",69);
                map.put("Abhijeet",30);

                System.out.println(map);
        }
}
