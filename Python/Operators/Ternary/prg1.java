class Demo {

        public static void main(String[] args) {

                int test = 45;
                /**
                 * This works like
                 * first if test > 40 will be evaluated
                 * if true print P else print 'F'
                 */
                System.out.println( test > 40 ? 'P' : 'F');

                test = 40;

                System.out.println( test > 40 ? 'P' : 'F');
        }
}
