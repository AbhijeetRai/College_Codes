abstract class Parent {

        abstract void fun(Object o, int a);
}

class Child extends Parent {

        //method signature must exactly be same to override
        void fun(int a, Object o) {

        }
}
