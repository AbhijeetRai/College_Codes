/**
 * It is time that, we start looking every line of code in Java as an instruction
 * (& whether that instruction will be simply executed implicitly without calling it)
 * or think about every line JVM wise.
 */
class Demo {

        int a = 10;

        void fun() {

                a = 20;
        }

        public static void main(String[] args) {

                Demo d = new Demo();
                //object is made. referenced by d
                //a is put 10 in constructor

                System.out.println(d.a);

                d.fun();
                //a = 20, where a is 10 now.

                System.out.println(d.a);
        }
}
