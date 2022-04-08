class Parent {

}

class Child extends Parent {

    void fun() {

        System.out.println(this);       //this can be printed
        //System.out.println(super);    //super cannot be printed
    }

    public static void main(String[] args) {
        
        new Child().fun();
    }
}

