class Demo {

        static int[] fun(int[] array) {

                //return {1, 2, 3};    // -illgeal start of expression
                return new int[] {1, 2, 3};
        }

        public static void main(String[] args) {

                //fun({1, 2, 3}); //Error - illgeal start of expression
                fun(new int[]{1, 2, 3});      //STANDARD way of doing this
        }
}
