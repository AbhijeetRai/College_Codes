interface MyInterface<R> {

    void add(R value);
}

class MyClass implements MyInterface<String> {

    public void add(String value) {

        System.out.println(value);
    }
}

class Demo {

    public static void main(String[] args) {

        new MyClass().add("A");

        //Error
        //new MyClass().add(10);
    }
}