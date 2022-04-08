class ThreadChild extends Thread {

        public void run() {

                System.out.println(10 / 0);
        }
}

/**
 * Exceptions are thrown across methods and classes but never across threads
 */

class Demo {

        public static void main(String[] args) {

                ThreadChild t = new ThreadChild();

                try {

                        t.start();
                }catch(Exception e) {

                        System.out.println("CATCH");
                }

                finally {

                        System.out.println("finally");
                }

                System.out.println("Demo");
        }
}
