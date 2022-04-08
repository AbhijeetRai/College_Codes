abstract class Covid {

        void cases() {

                System.out.println("5000 cases");
        }
}

class Demo {

        int a = 10;
        static int b = 20;

        void place() {

                System.out.println("India");
        }

        static void origin() {

                System.out.println("China");
        }

        void fun() {

                Covid c = new Covid() {

                        void cases() {

                                System.out.println(b);
                                origin();

                                //no object required to access, instance memebers(methods and variables)
                                // as annonymous inner class is not in static context(fun is not static)
                                System.out.println(a);
                                place();
                                System.out.println("fun");
                        }
                };
                c.cases();
        }

        public static void main(String[] args) {

                new Demo().fun();
        }
}
