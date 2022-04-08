interface Parent {

    void fun();
}

class Child implements Parent {

    public void fun() {

        System.out.println("In fun");
    }

    void gun() {

        System.out.println("In gun");
    }
}

class Demo {

    public static void main(String[] args) {
        
        Parent p = new Child();
        p.fun();
        //p.gun();                    //on reference of parent, only methods of parent can be called

        //Child c = new Parent();     //interface cannot be instantiated. (Object of interface cannot be made)

        Child c = new Child();
        c.fun();
        c.gun();
    }
}
