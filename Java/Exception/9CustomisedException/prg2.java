class CoronaVirus extends Throwable {

        CoronaVirus() {

        }

        CoronaVirus(String message) {

                super(message);
        }
}

class Life {

        //throws added because it is checked exception
        void year2020() throws CoronaVirus {

                throw new CoronaVirus("keep patience mankind");
        }
}

class Demo {

        public static void main(String[] args) {

                System.out.println("Life going on smoothly, let's enter 2020...");

                try {

                        new Life().year2020();
                }catch(CoronaVirus e) {

                        System.out.println(e.getCause());
                        System.out.println("God says " + e.getMessage());
                }

                System.out.println("2021");
        }
}
