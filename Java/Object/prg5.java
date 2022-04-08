/**
 * toString() method returns textual representation of the object, on which it is invoked.
 * Textually representing an object makes it easier to read.
 */

 /**
  * It basically returns
  * getClass().getName() + "@" + Integer.toHexString(hashCode())
  */
class Demo {

    public static void main(String[] args) {
        
        Demo d = new Demo();
        System.out.println(d.toString());
        System.out.println(d.getClass().getName() + "@" + Integer.toHexString(d.hashCode()));
    }
}