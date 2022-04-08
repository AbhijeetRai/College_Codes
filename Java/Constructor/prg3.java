class Demo {

        Demo(int a, double b) {

        }
        //we can define such constructor, if there is no ambigious call
        Demo(double a, int b) {

        }

        public static void main(String[] args) {

                //Error while calling
                new Demo(10, 10);
        }
}
