//We have to use throws or try-catch while explicitly throwing 'CHECKED' exceptions

class Demo {

        public static void main(String[] args) throws InterruptedException {

                throw new InterruptedException();
        }
}
