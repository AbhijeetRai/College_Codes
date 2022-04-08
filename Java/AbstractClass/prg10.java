//Inheritance of static and instance methods, variables, from abstract class

abstract class Peter {

    static String name = "SpiderMan";
    int age = 15;

    static void showName() {

        System.out.println("Daily Bugle");
    }

    void makeNemesis() {

        System.out.println("Sinister Six");
    }
}

class Miles extends Peter {

}

class Demo {

    public static void main(String[] args) {
        
        System.out.println(Miles.name);
        Miles.showName();

        Miles kid = new Miles();

        System.out.println(kid.name);
        System.out.println(kid.age);

        kid.showName();
        kid.makeNemesis();
    }
}