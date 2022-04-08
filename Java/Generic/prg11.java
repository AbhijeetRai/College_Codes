class Store<T> {

    void add(T o) {

        System.out.println("In add");
    }
}

class Demo {

    public static void main(String[] args) {

        //if generic is not added, it will take it as Object
        Store s1 = new Store();
        s1.add(1);
    }
}