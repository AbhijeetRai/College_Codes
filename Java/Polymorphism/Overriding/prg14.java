class Parent {

        void name(String s1, int a1) {

                System.out.println("Parent");
        }
}

class Child extends Parent {

        //even if name (identifiers) are different, it is okay.
        void name(String s2, int a2) {

                System.out.println("Child");
        }
}

class Demo {

        public static void main(String[] args) {

                Parent p = new Child();
                p.name("Random", 0);
        }
}
