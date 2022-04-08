class Parent {

        int age = 40;
}

class Child extends Parent {

        int age = 12;
}

class Demo {

        public static void main(String[] args) {

                Parent p = new Child();
                System.out.println(p.age);
        }
}
/**
 * Variables are not over-ridden. Value of Variables is set at compile time.
 */
