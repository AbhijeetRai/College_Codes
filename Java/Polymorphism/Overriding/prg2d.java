class Parent {

        int age = 40;

        void showAge() {                        //take showAge k near ka variable, do not go to child to access explicitly

                System.out.println("Age of parent is " + age);
        }
}

class Child extends Parent {

        int age = 10;
}

class Demo {

        public static void main(String[] args) {

                Parent p = new Child();
                p.showAge();

                Child c = new Child();
                c.showAge();
        }
}
