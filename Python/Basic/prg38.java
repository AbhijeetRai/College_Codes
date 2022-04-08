class Parent {

        void m1(int x) {

                System.out.println("In m1 int");
        }

        void m1(float f) {

                System.out.println("In m1 float");
        }
}

class Child extends Parent {

        public static void main(String[] args) {

                Parent p = new Parent();
                Child  c = new Child();

                p.m1(10);
                c.m1(10);

                p.m1(10.5);
        }
}
