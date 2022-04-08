abstract class ChristmasTree {

    String description = "Unknown type of tree";

    String getDescription() {
        return description;
    }

    abstract double getCost();
}

class Fir extends ChristmasTree {

    Fir() {

        description = "Fir";
    }

    double getCost() {
        return 180;
    }
}

class Pine extends ChristmasTree {

    Pine() {

        description = "Pine";
    }

    double getCost() {
        return 185;
    }
}

abstract class TreeDecorator extends ChristmasTree {

    abstract String getDescription();
}

class Ribbon extends TreeDecorator {

    ChristmasTree tree;

    Ribbon(ChristmasTree tree) {
        this.tree = tree;
    }

    String getDescription() {
        return tree.getDescription() + ", Ribbon";
    }

    double getCost() {
        return tree.getCost() + 2;
    }
}

class Light extends TreeDecorator {

    ChristmasTree tree;

    Light(ChristmasTree tree) {
        this.tree = tree;
    }

    String getDescription() {
        return tree.getDescription() + ", Light";
    }

    double getCost() {
        return tree.getCost() + 5;
    }
}

class Demo {

    public static void main(String[] args) {
        
        //Pine with Ribbon, Ribbon
        ChristmasTree tree1 = new Pine();
        tree1 = new Ribbon(tree1);
        tree1 = new Ribbon(tree1);
        System.out.println(tree1.getDescription() + " £" + tree1.getCost());

        //Fir with light, ribbon
        ChristmasTree tree2 = new Fir();
        tree2 = new Light(tree2);
        tree2 = new Ribbon(tree2);
        System.out.println(tree2.getDescription() + " £" + tree2.getCost());
    }
}