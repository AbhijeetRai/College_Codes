class Demo {

        static int count = 3;

        static void fun() {

                System.out.println("In fun");

                while(count >= 1) {

                        count--;
                        main(new String[] {});
                }
        }

        public static void main(String[] args) {

                System.out.println("In main");
                fun();
        }
}
//recursion allowed everywhere except constructor
