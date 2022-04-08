class Demo {

        Demo(double d) {

                System.out.println(d);
        }

        //Downcasting of data is not allowed in java but upcasting is allowed

        public static void main(String[] args) {

                Demo d = new Demo('A');
        }
}
