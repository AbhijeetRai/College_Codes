class Demo {

        final static int a = 101;

        /*
         * Even though it says to initialise final static variable in constructor
         * It does not allow doing so, considering what if object is never made and constructor is never called
         * Thus static variable will not be ever initialised
         */
        static final int b;

        Demo() {
                //b = 20;
        }

        //hence initialise final static variable in static block
        static{
                b = 201;
        }

        public static void main(String[] args) {

                System.out.println(a + " " + b);
        }
}
