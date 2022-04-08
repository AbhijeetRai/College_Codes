class Parent {

        int age = 40;

        void showAge() {                //(take showAge method k near ka variable)

                System.out.println("Age of parent is " + age);
        }
}

class Child extends Parent {

        int age = 10;                           //(take showAge method k near ka variable)

        void showAge() {

                System.out.println("Age of child is " + age);
        }
}

class Demo {

        public static void main(String[] args) {

                Parent p1 = new Child();
                p1.showAge();

                Parent p2 = new Parent();
                p2.showAge();
        }
}
