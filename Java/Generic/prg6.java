class Player<M, V> {

    void info(M name, V price) {

        System.out.println(name + " " + price);
        System.out.println(name.getClass().getName() + " " + price.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        Player<String, String> p = new Player<String, String> ();
        p.info("Dhoni", "17Cr");
        p.info("Gauti", 97);
    }
}