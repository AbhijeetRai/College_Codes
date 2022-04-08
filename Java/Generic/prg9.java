import java.util.*;

/**
 * List's add looks like this 
 * void add(E e)
 */

class Demo {

    public static void main(String[] args) {

        List<Number> l1 = new ArrayList<Number> ();
        l1.add(1);      //Upcasting from Integer to Number allowed 

        
        //l1.add(new Object());
        //Downcasting not allowed
    }
}