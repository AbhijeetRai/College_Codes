class Umpire {

        private void showName() {

                System.out.println("The name is Simon Taufel");
        }

        static void showExperience() {

                System.out.println("Taufel has experiece of 300 matches");
        }

        void review() {

                class DRS {

                        void check() {          //it is possible to access all kinds of methods of outer class
                                                //from instance method local inner class
                                showName();
                                showExperience();
                        }
                }

                new DRS().check();
        }
}

class Demo {

        public static void main(String[] args) {

                new Umpire().review();
        }
}
