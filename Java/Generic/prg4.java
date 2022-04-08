class Player<E> {

    void info(E value) {

        System.out.println(value);
        System.out.println(value.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        Player<String> p1 = new Player<String> ();
        p1.info("Dhoni");

        Player<Integer> p2 = new Player<Integer> ();
        p2.info(7);
        
        //For object p2, replace E of class Player with Integer. 
        //Thus we cannot pass String to Integer value
        // p2.info("MS");

        Player p3 = new Player ();
        p3.info('A');
    }
}