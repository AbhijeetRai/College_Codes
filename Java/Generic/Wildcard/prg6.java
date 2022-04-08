class Store<T> {


}


class MyClass<T> {

    void add(Store<T> obj) {

        System.out.println("In add");
    }
}

class Demo {

    public static void main(String[] args) {

        Store s1 = new Store();
        MyClass<String> m1 = new MyClass<String>();
        m1.add(new Store());
        m1.add(new Store<Integer> ());
    }
}