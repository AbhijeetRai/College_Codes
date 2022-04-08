class Store<T> {

    void add(T o) {

        System.out.println(o);
    }
}

class Demo {

    public static void main(String[] args) {

        Store<Number> s1 = new Store<Number>();
        s1.add(101);                    //upcasting is allowed

        //This kind of stuff not allowed
        //Store<Number> s2 = new Store<Integer>(); 
    }   
}