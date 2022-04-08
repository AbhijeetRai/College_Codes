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

        public static void main(String[] args) {

                Covid c = new Covid() {

                        void cases() {

                                //static members(variables and methods) of outside of static context(main) directly accessible
                                System.out.println(b);
                                origin();

                                //make object to access methods and variables "located outside static context(main)".
                                System.out.println(new Demo().a);
                                new Demo().place();
                        }
                };
                c.cases();
        }
}
