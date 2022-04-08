class Foo {

        static {

                System.out.println("Foo static");
        }
}

class Doo {

        static {

                System.out.println("Doo static");
        }
}

class Demo {

        public static void main(String[] args) {


                new Doo();
                new Foo();
        }
}
