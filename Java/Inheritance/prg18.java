class Superman {

        Superman() {

                System.out.println("Superman default");
        }

        Superman(String name) {

                System.out.println("Superman vs " + name);
        }

        static {

                System.out.println("Superman Static");
        }
}

class SuperBoy extends Superman {

        SuperBoy() {

                super("Batman");
                System.out.println("SuperBoy default");
        }

        static {

                System.out.println("SuperBoy static");
        }
}

class Demo {

        public static void main(String[] args) {

                new SuperBoy();
        }
}
