class Demo {

        public static void main(String[] args) {

                try {

                        throw new InterruptedException("Hi");
                }catch(InterruptedException e) {

                        System.out.println(e.getMessage());
                }
        }
}
