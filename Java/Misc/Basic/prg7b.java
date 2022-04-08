abstract class Parent {

    void fun() {

        System.out.println("In fun");
    }
}

class Child extends Parent {

    void gun() {

        System.out.println("In gun");
    }
}

class Demo {

    public static void main(String[] args) {
        
        Parent p = new Child();     //this typecasting allowed
        p.fun();
        //p.gun();                  on reference of parent, only methods of parent can be called 

        //Child c = new Parent();   //object of abstract class cannot be created 

        Child c = new Child();
        c.fun();
        c.gun();
    }
}