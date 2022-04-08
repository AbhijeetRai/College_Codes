/**
 * 'logical and operator' operates on boolean in "JAVA",
 * returns boolean value, and does not accept int as operator
 * bitwise on the other hand operates on the bit by bit values of integer

 * But in python 'logical and' operated on int values.
 */

class Demo {

        public static void main(String[] args) {

                int a = 1;
                int b = 2;

                //System.out.println(b && a);
                System.out.println(b & a);


                boolean c = true;
                boolean d = false;

                System.out.println(c && d);
        }
}
