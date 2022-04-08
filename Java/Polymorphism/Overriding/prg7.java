/**
 * In Java Parent p = new Child() is allowed, but child c = new Parent() is not.
 * On reference p, we can only call members of p.(methods and variable) see prg8
 */

class Parent {

        void fun(int a, double d) {

                System.out.println("Fun - 1");
        }
}

class Child extends Parent {

        /**
         * We are not overriding fun(int, double).
         * Instead we have another fun(double, int).
         * Because to override, method signature(order of parameters) must exactly be same
         */
        void fun(double d, int a) {

                System.out.println("Fun - 2");
        }
}

class Demo {

        public static void main(String[] args) {

                Child c = new Child();

                c.fun(1.1, 1);
                c.fun(1, 1.1);
        }
}
