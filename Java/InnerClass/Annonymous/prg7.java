class Parent1 {

        void fun1() {

                System.out.println("Fun - 1");
        }
}

abstract class Parent2 {

        void fun2() {

                System.out.println("Fun - 2");
        }
}

interface Parent3 {

        default void fun3() {

                System.out.println("Fun - 3");
        }
}

class Demo {

        public static void main(String[] args) {

                Parent1 p1 = new Parent1() {

                        void gun() {

                                System.out.println("Gun");
                        }
                };
                //with reference of parent and object of child like Parent p = new Child();
                //we can only call methods of parent class
                p1.gun();

                Parent2 p2 = new Parent2() {

                        void gun() {

                                System.out.println("Gun");
                        }
                };
                p2.gun();


                Parent3 p3 = new Parent3() {

                        void gun() {

                                System.out.println("Gun");
                        }
                };
                p3.gun();
        }
}
