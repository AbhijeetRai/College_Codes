class Grandparent {

    void name() {

        System.out.println("Grandparent");
    }
}

class Parent extends Grandparent {

    void name() {

        System.out.println("Parent");
    }
}

class Child extends Parent {

}

class Demo {

    public static void main(String[] args) {
        
        new Child().name();
    }
}