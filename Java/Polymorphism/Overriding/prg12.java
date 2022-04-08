//final and private methods cannot be overridden
class Parent {

        final void detail() {

                System.out.println("Parent");
        }

        private void name() {

                System.out.println("Name is Parent");
        }
}

class Child extends Parent {

        //once a method is declared final in Parent, it cannot be overriden
        void detail() {

                System.out.println("Child");
        }

        void name() {

                System.out.println("Name is child");
        }
}

class Demo {

        public static void main(String[] args) {

                Parent p = new Parent();
                //private method cannot be called from outside the class
                p.name();
        }
}
