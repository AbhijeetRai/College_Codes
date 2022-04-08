import java.io.*;
//Try - catch in finally block
class Demo1 {

        static void gun() {

                try {

                        System.out.println("In gun");
                }catch(ArithmeticException e1) {

                        System.out.println("Catch - 1");
                }finally{

                        System.out.println("Finally - 1");

                        try {
                                System.out.println(10/ 0);
                        }catch(ArithmeticException nested) {

                                System.out.println("NESTED TRY - CATCH IN FINALLY");
                        }finally {

				System.out.println("NESTED FINALLY");
			}

                        System.out.println(5 / 0);
                }
        }

        static void fun() {

                try {

                        gun();
                }catch(ArithmeticException e) {

                        System.out.println("Catch - 2");
                }finally {

                        System.out.println("Finally - 2");
                }
        }

        public static void main(String[] args) {

                try {

                        fun();
                }catch(ArithmeticException e) {

                        System.out.println("Catch - 3");
                }finally {

                        System.out.println("Finally - 3");
                }
        }
}

class Demo2 {

        public static void main(String[] args) {

                try {
			System.out.println("In try");
                }catch(Exception e) {
			
			System.out.println("In catch");
                }finally {
			
			System.out.println("In finally");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			try {
				br.close();
				br.readLine();
			}catch(IOException e) {
				
				System.out.println(e);
			}finally {

				System.out.println("NESTED FINALLY");
			}
		}
        }
}
