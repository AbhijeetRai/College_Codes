//Inhertiance of static, instance, methods and variables in class

class Hank {

    static String name = "Ant-Man";
    double height = 4;

    static void showTech() {

        System.out.println("Nano");
    }

    void joinTeam() {

        System.out.println("Avengers");
    }
}

class Scott extends Hank {

}

class Demo {

    public static void main(String[] args) {
        
        System.out.println(Scott.name);
        Scott.showTech();

        Scott hero = new Scott();

        System.out.println(hero.name);
        System.out.println(hero.height);
        hero.showTech();
        hero.joinTeam();
    }
}