class Germany {

        String neighbour = "Belgium";
        static int freedom = 1989;

        void showTouristPlaces() {

                System.out.println("Bardenburger Tor and Berlin Mauer");
        }

        static void gun(Germany g) {

                System.out.println("In gun");
        }

        void fun() {

                //non static can access all members directly
                System.out.println(freedom);
                gun(new Germany());
                System.out.println(neighbour);
                showTouristPlaces();

                System.out.println();

                //we can use 'this' in non static context, to access static and instance, methods and variables
                System.out.println(this.neighbour);
                this.gun(new Germany());
                System.out.println(this.freedom);
                this.showTouristPlaces();

                System.out.println();

                //with the help of object, we can access anything
                Germany ger = new Germany();
                System.out.println(ger.freedom);
                ger.gun(new Germany());
                System.out.println(ger.neighbour);
                ger.showTouristPlaces();

                System.out.println();

                //Or use name of class to access static members
                System.out.println(Germany.freedom);
                Germany.gun(new Germany());
        }

        public static void main(String[] args) {

                new Germany().fun();
        }
}
