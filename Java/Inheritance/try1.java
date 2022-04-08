class Parent {

        int age = 38;
}


class Child extends Parent {

        int age = 10;

        Child() {

                this(10);
                //super(); //super and this fight with each other to be first line of Constructor
        }

        Child(int a) {

        }

        void show() {

                //super(); //allowed only in Constructor
                //this(); //allowed only in Constructor
        }

        static void print() {

        //        System.out.println(this.age);
        //        System.out.println(super.age); //this and super not allowed in static
        }
}

class Demo {

}
