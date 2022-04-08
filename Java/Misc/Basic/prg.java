/**
 * static variables are class variables, they cannot be declared inside any block
 * not any function or even static block
 */
class Demo {

        static {

                //static String s;
        }

        public static void main(String[] args) {

                int a = 10;
                static char b;
        }

}
