class Umpire {

        String name = "Simon Taufel..";

        static void reviewing() {

                System.out.println("We are reviewing...");

                class DRS {

                        void check() {                  //static not allowed in method local inner class

                                System.out.println("Check no ball");
                                System.out.println(new Umpire().name); //cannot directly access outer non static, make object of outer
                                                                        //from static method local inner class
                        }
                }

                DRS d = new DRS();
                d.check();
        }
}

class Demo {

        public static void main(String[] args) {

                Umpire.reviewing();
        }
}
