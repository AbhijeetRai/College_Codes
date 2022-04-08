class Umpire {

        private String umpire = "Simon... Taufel";

        void reviewing() {

                class DRS {
                        //static declaration not allowed in method local inner class
                        void check() {

                                System.out.println(umpire);
                                //if class is in non static method, then we can directly access
                                //non static attributes of outer class
                        }
                }

                DRS d = new DRS();
                d.check();
        }
}

class Demo {

        public static void main(String[] args) {

                new Umpire().reviewing();
        }
}
