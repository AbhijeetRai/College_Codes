abstract class Parent {

        abstract void fun(int a, float b);
}

/**
 * To override a method, method signature must exactly be same.
 * To overload it must be different.
 */
class Child extends Parent {

        void fun(int a) {

        }

        /**
         * Error because trying to override abstract void fun(int a, float b) with fun(float a, int b) does not count

         * To override a method, 'method signature' must be same. That is name of method, order of parameters,
         * number of parameters, type of parameters must be exactly same.
         */
        void fun(float a, int b) {

        }

        void fun(int a, float b, int c) {

        }

        /*void fun(int a, float b) {

        }*/
}
