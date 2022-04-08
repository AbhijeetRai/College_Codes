interface Flyable {

        void fly();
}

class Fly implements Flyable {

        public void fly() {

                //behavior can be directly changed from here, without touching subclasses.
                System.out.println("Can fly with wings");
        }
}

class FlyNot implements Flyable {

        public void fly() {
                ////behavior can be directly changed from here, without touching subclasses.
                System.out.println("Cannot fly");
        }
}

abstract class Duck {

        Flyable f;

        abstract void look();

        void swim() {

                System.out.println("All ducks, even rubber ducks can swim");
        }

        void setFly(Flyable f) {

                this.f = f;
        }

        void performFly() {

                f.fly();
        }
}

class MallardDuck extends Duck {

        void look() {

                System.out.print("Looks like MallardDuck, ");
        }
}

class RubberDuck extends Duck {

        void look() {

                System.out.print("Looks like RubberDuck, ");
        }
}

class Demo {

        public static void main(String[] args) {

                MallardDuck md = new MallardDuck();
                md.setFly(new Fly());
                md.look();
                md.performFly();

                RubberDuck rd = new RubberDuck();
                rd.setFly(new FlyNot());
                rd.look();
                rd.performFly();
        }
}
