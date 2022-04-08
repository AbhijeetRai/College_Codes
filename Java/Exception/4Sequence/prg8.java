//throws is 'not handling code'
//we got to throw, checked exception till JVM
/**
 * Also if some method has throws as well as try catch.
 * Try catch will be given more priority, because JVM first searches for handling code (try - catch)
 * if handling code not found, then caller of method is checked (throws)
 */

import java.io.*;

class Demo {

        static void fun() throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                br.close();
                try {

                        br.readLine();
                }catch(Exception e) {

                        System.out.println(e.toString());
                }
                System.out.println("In fun");
        }

        static void gun() throws IOException {

                fun();
                System.out.println("In gun");
        }

        public static void main(String[] args) throws IOException {

                gun();
                System.out.println("In main");
        }
}
