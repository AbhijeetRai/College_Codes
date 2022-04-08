abstract class Parent {

    static void fun() {

        System.out.println("Parent");
    }
}
//METHOD HIDING
class Child extends Parent {

    static void fun() {

        System.out.println("Child");
    }
}

class Demo {

    public static void main(String[] args) {

        Parent p = new Child();
        p.fun();
    }
}
