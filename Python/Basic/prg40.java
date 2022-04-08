//Inner class

class Outer {

        class Inner {

                void innerMethod() {

                        System.out.println("In inner");
                }
        }

        void outer() {

                System.out.println("In outer");
        }
}

class Demo {

        public static void main(String[] args) {

                Outer.Inner i = new Outer().new Inner();
                i.innerMethod();
        }
}
