interface Krishna {

        default void teachings() {

                System.out.println("Karm karo");
        }
}

interface Arjuna extends Krishna {

        default void teachings() {

                System.out.println("Archery");
        }
}

interface Pradyumna extends Krishna {
        
}

class Abhimanyu implements Arjuna, Pradyumna {

}

class Demo {

        public static void main(String[] args) {

                new Abhimanyu().teachings();
        }
}
