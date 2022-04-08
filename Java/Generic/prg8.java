class MyClass<E> {

    void add(E e) {

        System.out.println(e);
    } 
}
class Demo {

    public static void main(String[] args) {

        MyClass<Number> l = new MyClass<Number> ();
        l.add(1);   //Upcasting allowed

        //Downcasting not allowed
        //l.add(new Object());
    }
}