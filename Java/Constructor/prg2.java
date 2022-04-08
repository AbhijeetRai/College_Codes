/**
 * Default constructor is not given in this case, by default.
 * Compiler thinks, if he knows about parametrised constructor, he must be knowing
 * about default constructor too. He must write default constructor
 */
class Demo {

        Demo(int a) {

        }

        public static void main(String[] args) {

                Demo d = new Demo();
        }
}
