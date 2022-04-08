class Parent {

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
        
        Parent p = new Child();     
        p.fun();
        //p.gun();  //on reference of Parent, only methods of parent can be called

       //Child c = new Parent();    //this typecasting not allowed

       Child c = new Child();
       c.fun();
       c.gun();
    }
}