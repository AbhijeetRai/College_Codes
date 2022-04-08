//We are overriding generic

import java.util.*;

class Demo {

    public static void main(String[] args) {
        
        ArrayList al1 = new ArrayList();
        al1.add(7);
        al1.add('A');

        ArrayList al2 = new ArrayList();
        al2.add(3.14);
        al2.add("Rai");

        ArrayList<Integer> al3 = new ArrayList<Integer>(al1);

        // Nothing apart from Integer is getting added in al3
        // al3.add("Abhi");
        al3.addAll(al2);

        System.out.println(al3);
    }
}