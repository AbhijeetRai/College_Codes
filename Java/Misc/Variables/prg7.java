/*
 * Normal instance and static variables can be left un-initialised
 * But final instance and static variables cannot be left un-initialised
 */

class Demo {

//initialise instance final variable in constructor

        final int a = 10;
        final int b;

        Demo(int value) {

                b = 20;
        }

        public static void main(String[] args) {

                System.out.println(new Demo(1).a + " " + new Demo(1).b);
        }
}

/**
 * Demo(int);
 * bipush 10
 * bipush 20
 */
