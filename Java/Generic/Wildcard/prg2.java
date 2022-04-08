class Store<A> {

    A[] list;

    Store(A[] list) {

        this.list = list;
    }

    // Wild card generic can be implemented with help of '?'
    // Use ? instead of A
    void compare(Store<?> anotherStore) {

        System.out.println(list.length + anotherStore.list.length);
    }
}

class Demo {

    public static void main(String[] args) {

        Store<String> names = new Store<String> (new String[] {"Abhijeet", "Saurabh"});
        Store<Integer> rolls = new Store<Integer> (new Integer[] {1, 2});

        names.compare(rolls); 
    }
}