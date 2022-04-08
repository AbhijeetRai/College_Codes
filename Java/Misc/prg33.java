/**
 * Using 'this' we can print variable of superclass, if no such variable exists in child class
 */

class HowardStark {

        String tech = "Arc Reactor";
        static int worth = 400;
}

class TonyStark extends HowardStark {

        void print() {

                System.out.println(this.tech + " " + super.tech);
                System.out.println(this.worth + " " + super.worth);
        }
}

class Demo {

        public static void main(String[] args) {

                new TonyStark().print();
        }
}
