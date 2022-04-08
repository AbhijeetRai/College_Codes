interface MyInterface<R> {

    void add(R value);
}

//any other letter can be used instead of R 
class MyClass<M> implements MyInterface<M> {

    public void add(M value) {

        System.out.println(value);
    }
}

class Demo {

    public static void main(String[] args) {

        //We can skip generic as show in next program
        MyClass<Number> m1 = new MyClass<Number>();
        m1.add(10);
    }
}