class Parent {

        void name() {

                System.out.println("Name is Parent");
        }
}

class Child extends Parent {
        //overriding method is static
        static void name() {

                System.out.println("Name is Child");
        }
}
