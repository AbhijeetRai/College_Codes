class Parent {

        public int a = 10;

        public void fun() {

        }

        protected void gun() {

        }
}

class Child extends Parent {

        int a = 10;     //no weaker access privilege to variable

        void fun() {

        }

        void gun() {   //protected has more scope than default

        }
}
