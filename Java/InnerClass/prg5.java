class Parent {

        void detail() {

                System.out.println("This is parent");
        }
}

class Demo {

        static int age = 14;

        public static void main(String[] args) {
                                                                        //static not allowed in annonymous inner class
                Parent p = new Parent() {

                        void detail() {

                                System.out.println("This is child " + age);
                        }
                };

                p.detail();
        }
}
