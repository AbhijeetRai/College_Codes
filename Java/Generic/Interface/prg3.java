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

        
        MyClass m1 = new MyClass ();
        m1.add(10);
    }
}