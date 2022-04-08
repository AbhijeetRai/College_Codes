/**
 * For catch to maintain the normal flow of program by try-catch
 * or for finally to do clean up by try - finally
 * or for expected working of try-catch-finally

 * risky code that generates exception must be placed in 'try' block only.
 */

class Demo {

        public static void main(String[] args) {

                System.out.println(10 / 0);     

                try {

                        System.out.println("In try block");
                }catch(ArithmeticException e) {

                        System.out.println("Exception aya");
                }

                finally {

                        System.out.println("In finally");
                }

                System.out.println("In main");
        }
}
