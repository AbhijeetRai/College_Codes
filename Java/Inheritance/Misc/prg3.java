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

                //static blocks are executed only once, which is when, its '.class' file is read from method area
                //Foo.class is not read from method area yet, which is why it's static block is not read yet.
                new Doo();
        }
}
