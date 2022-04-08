class Parent {

        void detail() {

                System.out.println("This is parent");
        }
}

class Demo {

        private void gun() {

                System.out.println("This is gun");
        }

        static void fun() {

                System.out.println("This is fun");
        }

        public static void main(String[] args) {                        //all kinds of methods accessible from annonymous inner class
                                                                        //static not allowed in annonymous inner class
                Parent p = new Parent() {

                        void detail() {

                                new Demo().gun(); //make object to access non static.
                                fun();
                                System.out.println("This is child");
                        }
                };

                p.detail();
        }
}
