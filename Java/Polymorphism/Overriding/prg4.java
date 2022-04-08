abstract class Parent {

        abstract void fun(Demo d, Object o);
}

class Child extends Parent {

        //order does not match of method signature
        // to override method signature, order of parameters must exactly be same
        void fun(Object o, Demo d) {

        }
}

class Demo {

        public static void main(String[] args) {

        }
}
