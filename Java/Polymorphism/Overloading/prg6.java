class Demo {

        /**
         * name of method is same
         * number of parameter is same
         * even type is same but order is different
         */
        static void fun(int a, float b) {

        }

        /**
         * There is nothing wrong in writing these methods alone, but do not give ambigious call to them
         */
        static void fun(float a, int b) {

        }

        public static void main(String[] args) {

                System.out.println("main");

                //There is nothing wrong, as long there is no ambigious call.
                //fun(10, 10);
        }
}
