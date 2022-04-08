class Player<T, M> {

    Player(T strength1, M strength2) {

        System.out.println(strength1 + " " + strength2);
        System.out.println(strength1.getClass().getName() + " " + strength2.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        Player<String, String> dhoni = new Player<String, String> ("Batting", "Wicket Keeping");

        Player<String, String> rishab = new Player<String, String> ("Batting", 0);
    }
}