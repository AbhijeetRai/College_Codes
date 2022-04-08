class Store<T> {

}

class Demo {

    public static void main(String[] args) {

        Store<String> s1 = new Store<String> ();
        Store <String> s2 = new Store<String> ();
        Store<Integer> s3 = new Store<Integer> ();

        s1 = s2;
        //s1 = s3;  //Different types

        Store<?> s4 = s3;
        Store<?> s5 = null;
        s5 = s3;
    }
}