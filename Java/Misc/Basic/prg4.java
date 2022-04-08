class Germany {

        //each object holds unique and exclusive copy of instance variable
        //change made in instance variable by one object, is seen in that object only
        String name = "Germany";
        static int freedom = 1989;
        //only one copy of static variable exists for all objects.
        //change made in static variable by one object of class, is seen in all objects

}

class Europe {

        String name = "Europe";
        static int war = 1939;

        public static void main(String[] args) {

                Germany ger1 = new Germany();
                ger1.name = "DeutschLand";
                ger1.freedom = 1990;
                System.out.println(ger1.name + " " + ger1.freedom);

                Germany ger2 = new Germany();
                System.out.println(ger2.name + " " + ger2.freedom);

                Europe e1 = new Europe();
                e1.name = "European union";
                e1.war = 1945;
                System.out.println(e1.name + " " + e1.war);

                Europe e2 = new Europe();
                System.out.println(e2.name + " " + e2.war);
        }
}
