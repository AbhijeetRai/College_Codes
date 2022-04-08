/**
 * We either 'throws' exception till JVM, or use 'Try - Catch'(Handling code) anywhere.

 * However throws is not part of handling code, and thus the method where
 * exception has occured will abnormally terminate, if throws is used.
 * And JVM will check caller method for handling code   (Remember Sequence Folder)

 * Also if some method has try-catch as well as throws
 * try-cathch will be used.
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
