abstract class Kapil {

        String name = "Kapil";

        void printYear() {

                System.out.println(1983);
        }
}

abstract class Ganguly extends Kapil {

        String name = "Saurabh";

        void printYear() {

                System.out.println(2004);
        }
}

class Dhoni extends Ganguly {

}

class Demo {

        public static void main(String[] args) {

                System.out.println(new Dhoni().name);
                new Dhoni().printYear();
        }
}
