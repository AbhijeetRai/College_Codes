class Parent {

        int age = 40;

        void showAge() {

                System.out.println("Age of parent is " + age);
        }
}

class Child extends Parent {

        void showAge() {                        //take showAge k near ka variable, if it is not present then inherit

                System.out.println("Age of child is " + age);
        }
}

class Demo {

        public static void main(String[] args) {

                Parent p = new Child();
                p.showAge();
        }
}
