class CoronaVirus extends RuntimeException {

        CoronaVirus() {

        }

        CoronaVirus(String message) {

                super(message);
        }
}

class Life {

        void year2020() {

                throw new CoronaVirus("Doomed");
        }
}

class Demo {

        public static void main(String[] args) {

                try {

                        new Life().year2020();
                }

                finally {

                        System.out.println("Finally");
                }

                System.out.println(2021);
        }
}
