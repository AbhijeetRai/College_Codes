abstract class Parent {

        static int a = 1001;

        static void showA() {

                System.out.println("Showing " + a);
        }
}

class Child extends Parent {

}

class Demo {

        public static void main(String[] args) {

                //object of abstract class cannot be created
                //Parent p = new Parent();

                System.out.println(new Child().a);
                new Child().showA();
        }
}
