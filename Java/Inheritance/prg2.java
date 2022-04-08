class Parent {

        int age = 40;

        Parent() {

                System.out.println("This belongs to class " + this); //just for formality, child is shown
                System.out.println(this.age);			     //variable shown is of parents, this.age = 40
        }
}

class Child extends Parent {

        int age = 10;
}

class Demo {

        public static void main(String[] args) {

                Child c = new Child();
        }
}
