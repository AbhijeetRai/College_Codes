interface W1983 {

        void aggressiveCaptain();

        default void captain() {

                System.out.println("Kapil");
        }
}

interface W2003 extends W1983 {

        default void aggressiveCaptain() {

                System.out.println("Saurabh...");
        }

        //default methods can be overridden
        default void captain() {

                System.out.println("Saurabh...");
        }
}

class W2011 implements W2003 {

}

class Demo {

        public static void main(String[] args) {

                new W2011().captain();
                new W2011().aggressiveCaptain();
        }
}
