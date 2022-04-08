class W1983 {

        String team;
        String captain = "Kapil";
}

/**
 * Start looking at every line in Java, like an instruction, and find out whether that instruction
 * is being executed. Here line 13 is executed in constructor we saw that in bytecode of W2003.
 * And constructor of W2003 is called through super() when object of 2011 is made.
 */
class W2003 extends W1983 {

        String captain = "Saurabh Ganguly";
}

class W2011 extends W2003 {

}

class Demo {

        public static void main(String[] args) {

                W2011 dhoni = new W2011();

                System.out.println(dhoni.team);
                System.out.println(dhoni.captain);
        }
}
