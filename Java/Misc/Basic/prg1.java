class Europe {

        String name = "Europen Union";
        static int war = 1939;

        static void gun() {

                System.out.println("In gun");
        }

        void fun() {

                System.out.println("In fun");
        }

        public static void main(String[] args) {

                //static members can be directly accessed from static context
                System.out.println(war);
                gun();
                //this works too
                System.out.println(Europe. war);
                Europe.gun();

                //to access non static from static, make object
                System.out.println(new Europe().name);
                new Europe().fun();

                System.out.println();

                //However with object we can access anything.
                Europe europe = new Europe();
                System.out.println(europe.war);
                europe.gun();
                System.out.println(europe.name);
                europe.fun();
        }
}
