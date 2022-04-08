class Parent {

        Object detail() {

                return "Abhijeet";      //compatible with object
        }
}
/**
 * Co variant return types, number class is child of object
 */
class Child extends Parent {

        Number detail() {

                return new Integer(10);     //compatible with number
        }
}
