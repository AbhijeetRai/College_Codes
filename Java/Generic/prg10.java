import java.util.*;

class GrandParent { }

class Parent extends GrandParent { }

class Child extends Parent { }

class MyClass<R> {

    void info(R val) {

    }
}

class Demo {

    public static void main(String[] args) {

        MyClass<Parent> obj1 = new MyClass<Parent> ();
        obj1.info(new Parent());       
        obj1.info(new Child());             //Downcasting allowed
        //obj1.info(new GrandParent());     //upcasting not allowed

        
        List<Parent> obj2 = new ArrayList<Parent> ();
        obj2.add(new Parent());
        obj2.add(new Child());              //Dpwncasting allowed
        //obj2.add(new GrandParent());      //upcasting not allowed
    }
}