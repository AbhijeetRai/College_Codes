class GrandParent {

        GrandParent() {

                System.out.println("In GrandParent " + this);
        }
}

class Parent extends GrandParent {

}

class Child extends Parent {

}

class Demo {

        public static void main(String[] args) {

                new Child();
                new Parent();
                new GrandParent();
        }
}
/**
 * Execution of line new Child();
 * A child object will be created with exclusive copy of parent attached with it, parent will be attached with exclusive copy of GrandParent
 * Constructor of child will be executed which has super() on line 1. Control moves to Constructor of Parent, which has super on line 1, too.
 * Control is in Constructor of GrandParent and this will be printed. 'this' means us line pe control kaunse class k wajah se aya originally.
 * Here control moved due to Child class, thus address of Child will be printed in value of this
 */
