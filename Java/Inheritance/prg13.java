class W1983 {

        String team;
        String captain = "Kapil";
}

class W2003 extends W1983 {

        void change() {
                //this method is never called, so this line is not executed
                captain = "Saurabh";
        }
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
