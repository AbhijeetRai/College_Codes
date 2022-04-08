/**
 * Every object is assigned some memory in Java, hashCode() method is Integer representation of that memory.
 * It is invoked on some object, and basically calls System.identityHashCode(this)
 */
class Demo {

    public static void main(String[] args) {
        
        Demo d = new Demo();
        System.out.println(d.hashCode() + " " + System.identityHashCode(d));
        //What d.hashCode() does is System.identityHashCode(this)
    }
}