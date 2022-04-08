abstract class Bevrage {

    String description = "Unknown Bevrage";

    String getDescription() {

        return description;
    }

    abstract double getCost(); 
}

class HouseBlend extends Bevrage {

    HouseBlend() {

        description = "House Blend";
    }

    double getCost() {

        return 4.8;
    }
}

class DarkRoast extends Bevrage {

    DarkRoast() {

        description = "Dark Roast";
    }

    double getCost() {

        return 5.2;
    }
}

abstract class BevrageDecorator extends Bevrage {

    abstract String getDescription();
}

class Milk extends BevrageDecorator {

    Bevrage bevrage;

    Milk(Bevrage bevrage) {

        this.bevrage = bevrage;
    }

    String getDescription() {

        return bevrage.getDescription() + ", Milk";
    }

    double getCost() {

        return bevrage.getCost() + 0.5;
    }
}

class Whip extends BevrageDecorator {

    Bevrage bevrage;

    Whip(Bevrage bevrage) {

        this.bevrage = bevrage;
    }

    String getDescription() {

        return bevrage.getDescription() + ", Whip";
    }

    double getCost() {

        return bevrage.getCost() + 0.3;
    }
}

class Demo {

    public static void main(String[] args) {
        
        //Houseblend only
        Bevrage bevrage1 = new HouseBlend();
        System.out.println(bevrage1.getDescription() + " £" + bevrage1.getCost());

        //DarkRoast with whip
        Bevrage bevrage2 = new DarkRoast();
        bevrage2 = new Whip(bevrage2);
        System.out.println(bevrage2.getDescription()+ " £" +  bevrage2.getCost());

        //DarkRoast with Whip, Milk
        Bevrage bevrage3 = new DarkRoast();
        bevrage3 = new Whip(bevrage3);
        bevrage3 = new Milk(bevrage3);
        System.out.println(bevrage3.getDescription() + " £" + bevrage3.getCost());
    }
}