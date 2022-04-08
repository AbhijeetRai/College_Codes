class Parent {

        void m1() {

                System.out.println("In m1");
        }
}

class Child extends Parent {

        void m2() {

                System.out.println("In m2");
        }

        public static void main(String[] args) {

                Parent p = new Parent();
                p.m1();
                //p.m2();

                Child c = new Child();
                c.m1();
                c.m2();
        }
}
