class Foo {

        static {

                System.out.println("Foo static");
        }
}

class Doo extends Foo {

        static {

                System.out.println("Doo static");
        }
}

class Demo {

        public static void main(String[] args) {

                //static block of parent will be executed first, to initialise its static variables.
                //Then static block of child will be executed
                new Doo();
        }
}
