/**
 * Object class' is special. There is no super class to Object class
 * Thus there is no call to super in constructor of Object class.
 */

/**
 * getClass() method returns reference of class Class. The reference of is of type object on which this method is invoked. 
 * Same kind of objects share one reference of class called Class. In short name of your class is printed preceded by word class.
 */
class Demo {

    public static void main(String[] args) {
        
        Demo d = new Demo();
        System.out.println(d.getClass());
    }
}