class Store<T> {


}


class MyClass<T> {

    void add(Store<?> obj) {

        System.out.println("In add");
    }
}

class Demo {

    public static void main(String[] args) {

        Store s1 = new Store();
        MyClass m1 = new MyClass();
        m1.add(new Store());
    }
}