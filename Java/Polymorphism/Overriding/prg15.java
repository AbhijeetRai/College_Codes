abstract class Parent {

        abstract void fun(Thread t1, Throwable e1);
}

class Child extends Parent {

        void fun(Thread t2, Throwable e2) {

        }
}
