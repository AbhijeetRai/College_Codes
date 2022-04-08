interface MyInterface<R> {

    void add(R o);
}

class MyClass implements MyInterface<Exception> {
    
}