class Demo {

        static void fun(String s, Object o) {

                System.out.println(s);
                System.out.println(o);
        }

        static void fun(Object o, String s) {

                System.out.println(o);
                System.out.println(s);
        }

        public static void main(String[] args) {

                //fun("Paris", "Milan");
        }
}
