class Parent {

        void marry() {

                System.out.println("Dipika");
        }
}

class Child extends Parent {

        void marry() {

                System.out.println("Disha");
        }

        public static void main(String[] args) {

                Parent p = new Parent();
                p.marry();

                Child c = new Child();
                c.marry();

                Parent p1 = new Child();
                p1.marry();
        }
}
