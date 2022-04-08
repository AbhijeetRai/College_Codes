interface MyInterface<R> {

    void add(R value);
}

//any other letter can be used instead of R as show in next program
class MyClass<R> implements MyInterface<R> {

    public void add(R value) {

        System.out.println(value + " " + value.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        MyClass<Number> m1 = new MyClass<Number>();
        m1.add(10);

        MyClass m2 = new MyClass ();
        m2.add(20);
    }
}