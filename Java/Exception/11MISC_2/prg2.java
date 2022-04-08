class Demo {

        static void fun() {

                try {

                        System.out.println(10 / 0);
                }

                finally {

                        System.out.println("Finally of fun");
                }

                System.out.println("In fun");
        }

        static void gun() {

                try {

                        fun();
                }

                finally {

                        System.out.println("Finally of gun");
                }

                System.out.println("In gun");
        }
}

class Main {

        public static void main(String[] args) {

                try {

                        Demo.gun();
                }

                finally {

                        System.out.println("Finally of main");
                }

                System.out.println("In main");
        }
}
