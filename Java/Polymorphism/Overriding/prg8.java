class Parent {

        int b;

        void gun() {

        }
}

class Child extends Parent {

        void fun() {

        }

        int a;
}

class Demo {

        public static void main(String[] args) {

                Parent p = new Child();

                p.gun();
                System.out.println(p.b);

                //on reference of Parent like (Parent p = new Child) and object of Child
                //We can only access methods and variables of parent
                p.fun();
                System.out.println(p.a);
        }
}
