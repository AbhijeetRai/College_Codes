class Parent1 {

        public void fun1() {

                System.out.println("Fun-1");
        }
}

abstract class Parent2 {

        public void fun2() {

                System.out.println("Fun-2");
        }
}

interface Parent3 {

        void fun3();
}

class Demo {

        public static void main(String[] args) {

                Parent1 p1 = new Parent1() {

                        void fun1() {

                        }
                };

                Parent2 p2 = new Parent2() {

                        void fun2() {

                        }
                };

                Parent3 p3 = new Parent3() {

                        void fun3() {

                        }
                };
        }
}
