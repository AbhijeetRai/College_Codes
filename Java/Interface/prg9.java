interface GoodMan {

        String nature = "Nice individual";

        default void printNation() {

                System.out.println("USA");
        }

        static void makeNemesis() {

                System.out.println("Red Skull");
        }
}

class CaptainAmerica implements GoodMan {

}

class Demo {

        public static void main(String[] args) {

                //variables of an interface (static in nature by default) are inherited
                System.out.println(CaptainAmerica.nature + " " + new CaptainAmerica().nature);

                //default methods of an interface are inherited
                new CaptainAmerica().printNation();

                //static methods of an interface are not inherited
                //CaptainAmerica.makeNemesis();
                //new CaptainAmerica().makeNemesis();
        }
}
