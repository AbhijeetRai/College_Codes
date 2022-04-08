interface GoodMan {

        default void printNation() {

                System.out.println("USA");
        }

        static void makeNemesis() {

                System.out.println("Red Skull");
        }

        private void wooPeggy() {

                System.out.println("Peggy Carter");
        }

        private static void wooSharon() {

                System.out.println("Sharon Carter");
        }
}

class Cap implements GoodMan {

}

class Demo {

        public static void main(String[] args) {

                Cap object = new Cap();


                //default method is inherited
                object.printNation();


                //static method of interface not inherited
                //Cap.makeNemesis();
                //object.makeNemesis();


                //private method is not inherited
                //object.wooPeggy();

                //private static method is not inherited
                //Cap.wooSharon();
                //object.wooSharon();
        }
}
