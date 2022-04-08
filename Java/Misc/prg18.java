abstract class W1983 {

        abstract void aggressiveCaptain();

        void captain() {

                System.out.println("Kapil");
        }
}

class W2003 extends W1983 {

        void aggressiveCaptain() {

                System.out.println("Saurabh");
        }

        void captain() {

                System.out.println("Saurabh");
        }
}

class W2011 extends W2003 {

}

class Demo {

        public static void main(String[] args) {

                new W2011().captain();
                new W2011().aggressiveCaptain();
        }
}
