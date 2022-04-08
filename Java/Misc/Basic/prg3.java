class Germany {

        String neighbour = "Belgium";
        static int freedom = 1989;

        void showTouristPlaces() {

                System.out.println("Bardenburger Tor and Berlin Mauer");
        }

        static void freedomMovement() {

                System.out.println("Reunification in 1990");
        }
}

class Europe {

        void fun() {

                //use name of class to access static members
                System.out.println(Germany.freedom);
                Germany.freedomMovement();

                //Now to access instance methods and variables , make object
                Germany ger = new Germany();
                System.out.println(ger.neighbour);
                ger.showTouristPlaces();
                //object can be used to access static methods and variables too.
                System.out.println(ger.freedom);
                ger.freedomMovement();
        }

        public static void main(String[] args) {

                //to access static variable and methods of other class, use name of other class.
                System.out.println(Germany.freedom);
                Germany.freedomMovement();

                //Now to access instance methods and variables , make object
                Germany ger = new Germany();
                System.out.println(ger.neighbour);
                ger.showTouristPlaces();
                //object can be used to access static methods and variables too.
                System.out.println(ger.freedom);
                ger.freedomMovement();

                System.out.println();
                new Europe().fun();
        }
}
