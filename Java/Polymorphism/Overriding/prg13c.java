//METHOD - HIDING
class Parent {

        static void name() {

                System.out.println("Name is parent");
        }
}

class Child extends Parent {

        static void name() {

                System.out.println("Name is child");
        }
}

class Demo {

        public static void main(String[] args) {

                /**
                 * Even though, we have applied all the syntax of overriding.
                 * But instead of 'name is child', 'name is parent' will be printed.
                 * Because both the overriding and overriden methods are static and this is called method hiding
                 */
                Parent p = new Child();
                p.name();
        }
}
