interface Krishna {

        int a = 10;

        default void teachings() {

                System.out.println("Karm karo");
        }
}

interface Arjuna extends Krishna {

}

interface Pradyumna extends Krishna {

}

class Abhimanyu implements Arjuna, Pradyumna {

}

class Demo {

        public static void main(String[] args) {

                new Abhimanyu().teachings();
                System.out.println(new Abhimanyu().a);
        }
}
