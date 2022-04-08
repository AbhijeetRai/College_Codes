/**
 * To throw our class as exception, we must extend it to throwable.
 * And, when we extend our class to throwable, it is treated as checked exception
 */

class CoronaVirus extends Throwable {

}

class Life {

        void year2019() {

                System.out.println("Things to do in 2019");
        }

        void year2020() throws CoronaVirus {

                throw new CoronaVirus();
        }
}

class Demo {

        public static void main(String[] args) {

                System.out.println("Life is smoothly going, let's go to 2020");

                try {

                        new Life().year2020();
                }catch(CoronaVirus e) {

                        System.out.println(e + " in 2020");
                        System.out.println("Message from god is " + e.getMessage());
                }

                System.out.println("2021");
        }
}
