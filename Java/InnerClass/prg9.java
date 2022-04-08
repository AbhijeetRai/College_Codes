class Umpire {

        private void showName() {

                System.out.println("The name is Simon... Taufel");
        }

        static void showExperience() {

                System.out.println("Taufel has experiece of 300 matches!!");
        }

        static void review() {

                class DRS {

                        void check() {          //it is possible to access all kinds of methods of outer class
                                                //from static method local inner class

                                new Umpire().showName();   //make object to access outer non static from static method
                                showExperience();          //static of outer can be accessed directly
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
