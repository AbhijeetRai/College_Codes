//Dictionary(Child of object) is abstract class is parent of HashTable

//HashTable extends Dictionary implements Map
//Properties is child of hash table

import java.util.*;

class DictDemo {

        public static void main(String[] args) {

                Dictionary dict = new Hashtable();

                dict.put("Apple","Steve");
                dict.put("Microsoft","Bill");
                dict.put("Amazon","Jeff");
                dict.put("SpaceX","Elon");

                System.out.println(dict);
                System.out.println("Apple = " + dict.get("Apple"));
                System.out.println("BiEncaps = " + dict.get("BinEncaps"));

                Enumeration e = dict.elements();

                while(e.hasMoreElements())
                        System.out.print(e.nextElement()+" ");

                System.out.println();

                Enumeration e1 = dict.keys();

                while(e1.hasMoreElements())
                        System.out.print(e1.nextElement()+" ");

                System.out.println();
        }
}
