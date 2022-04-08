interface Parent {

        static void detail() {

                System.out.println("Parent");
        }
}

/**
 * Static methods of an interface (in only interfaces) are not inherited, so Child will have copy of detail method
 * But it is not over-riding detail() in Parent, instead Child is simply having a copy of detail()
 */
interface Child extends Parent {

        static void detail() {

                System.out.println("Child");
        }
}

class Demo {

        public static void main(String[] args) {

                Child.detail();
        }
}
