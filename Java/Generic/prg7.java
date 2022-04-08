interface MyList<R> {

    void sum(R val);
}

class MyClass<R> implements MyList<R> {

    public void sum(R val) {

        System.out.println(val + " " + val.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        MyList<Integer> list = new MyClass<Integer> ();
        list.sum(1); 
    }
}
