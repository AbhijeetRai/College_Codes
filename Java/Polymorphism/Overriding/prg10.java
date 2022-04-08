class Parent {

        Object detail() {

                return new Object();
        }
}

/**
 * Suppose child is overriding parent's 'Object detail()' method, then while overriding
 * Child can give, subclass of 'Object', inside overiding method of child, as return type.
 */


/**
 * This is called co-variant return types
 * This holds true if parent's method return parent class, and child's method return child class, not vice versa.
 * This does not hold true for sibling return types.
 */
class Child extends Parent {

        String detail() {

                return "Abhijeet";
        }
}
