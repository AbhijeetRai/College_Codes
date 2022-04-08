class Parent1 {

        Parent1(int a) {

                System.out.println("Parent - 1");
        }
}

abstract class Parent2 {

        Parent2(String s) {

                System.out.println("Parent - 2");
        }
}

interface Parent3 {

        /*Parent3() {

                System.out.println("Parent - 3");
        }*/
}

/**
 * As soon as object of annonymous inner class is made, constructor of parent is called (constructor of abstract class and class)
 * The constructor can be default or parametrised. Constructor of an interface does not exist
 */

class Demo {

        public static void main(String[] args) {

                Parent1 p1 = new Parent1(10) {

                };

                Parent2 p2 = new Parent2("Abhijeet") {

                };
/**
 * If we have something like
 * Parent3 p3 = new Parent3(20)
 * here, we will get error like
 * anonymous class implements interface; cannot have arguments
 */
                Parent3 p3 = new Parent3() {

                };
        }
}
