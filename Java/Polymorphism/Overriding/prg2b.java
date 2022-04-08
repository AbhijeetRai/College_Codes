class Parent {

        int age = 40;

        void showAge() {                        //take showAge k near ka variable

                System.out.println("Age of parent is " + age);
        }
}

class Child extends Parent {

}

class Demo {

        public static void main(String[] args) {

                Parent p = new Child();
                p.showAge();
        }
}
