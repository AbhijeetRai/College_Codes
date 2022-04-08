class Store<A> {

    A[] list;

    Store(A[] list) {

        this.list = list;
    }

    void compare(Store<A> anotherStore) {

        System.out.println(list.length + anotherStore.list.length);
    }
}

class Demo {

    public static void main(String[] args) {

        Store<String> names = new Store<String> (new String[] {"Abhijeet", "Saurabh"});
        Store<String> surnames = new Store<String> (new String[] {"Rai", "Ghanwat"});

        names.compare(surnames);

        /**
         * In object names of class Store, replace A with String, so compare method becomes like 
         * void comapre(Store<String> anotherStore). So it means anotherStore reference 
         * must hold Store object that stores Strings. 
         */

         Store<Integer> rolls = new Store<Integer> (new Integer[] {1, 2});

        // compare method for name object looks like void compare(Store<String> anotherStore)
        // when we pass rolls to compare method of names object, it becomes 
        // Store<String> anotherStore = new Store<Integer> (new Integer[] {1, 2});
        names.compare(rolls);
        // We cannot compare rolls to names, to resolve this issue, use wild card generic

        /**
         * ! Wild card generic can be implemented with help of ? 
         * ? As show in the next example called prg12.java
         */
    }
}