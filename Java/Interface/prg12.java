//Java supports nested interface, interface in class

class thread {

        interface uncaughtexceptionhandler{

                void uncaughtexception();
        }
}

class random implements thread.uncaughtexceptionhandler {

        public void uncaughtexception() {

                System.out.println("Exception uncaught hai");
        }
}

class Demo {

        public static void main(String[] args) {

                new random().uncaughtexception();
        }
}
