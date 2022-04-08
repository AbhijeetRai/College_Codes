class Parent {
        //overridden method is static
        static void name() {

                System.out.println("Name is parent");
        }
}

class Child extends Parent {

        void name() {

                System.out.println("Name is child");
        }
}
