class Demo {

        public static void main(String[] args) {

                try {

                        throw new InterruptedException();
                }catch(InterruptedException e) {

                        System.out.println("Message is " + e.getMessage());
                }

                System.out.println("Demo");
        }
}
