//to demonstrate multilevel inheritance
class W1983 {

        static String captain = "Kapil";
        int team = 15;

        static void showTeam() {

                System.out.println("India");
        }

        void venue() {

                System.out.println("UK");
        }
}

class W2003 extends W1983 {

}

class W2011 extends W2003 {

}

class Demo {

        public static void main(String[] args) {

                W2011 dhoni = new W2011();

                System.out.println(W2011.captain);
                System.out.println(dhoni.team);

                W2011.showTeam();
                dhoni.venue();
        }
}
