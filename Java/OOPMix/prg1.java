interface Kapil {

        String name = "Kapil";

        default void printYear() {

                System.out.println(1983);
        }
}

interface Ganguly extends Kapil {

        String name = "Saurabh";

        default void printYear() {

                System.out.println(2004);
        }
}

class Dhoni implements Ganguly {

}

class Demo {

        public static void main(String[] args) {

                System.out.println(new Dhoni().name);
                new Dhoni().printYear();
        }
}
