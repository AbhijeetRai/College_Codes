interface MyInterface<R> {

    void add(R value);
}

class MyClass implements MyInterface {

    public void add(Object value) {

        System.out.println(value);
    }
}

class Demo {

    public static void main(String[] args) {

        new MyClass().add(20);
    }
}