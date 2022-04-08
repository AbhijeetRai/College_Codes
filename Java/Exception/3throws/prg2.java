/**
 * We either 'throws' exception till JVM, or use 'Try - Catch'(Handling code) anywhere.

 * However throws is not part of handling code, and thus the method where
 * exception has occured will abnormally terminate, if throws is used.
 * And JVM will check caller method for handling code   (Remember Sequence Folder)
 */

 import java.io.*;
 class Demo {

         static void fun() throws IOException {

                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 br.close();
                 //no handling code, remove stackframe of fun, go to caller of fun
                 br.readLine();
                 System.out.println("In fun");
         }

         static void gun() throws IOException {

                 fun();
                 //no handling code for exception, remove stack frame and go to caller of fun
                 System.out.println("In gun");
         }

         public static void main(String[] args) throws IOException {

                 gun();
                 //no handling code, terminate this abnormally
                 System.out.println("In main");
         }
 }
