class British {

        private void expedition() {

                System.out.println("Come to India in 1608");
        }

        static void farewell() {

                System.out.println("In 1947, from GateWayOfIndia");
        }

        static class GateWayOfIndia {

                void details() {

                        farewell();
                        new British().expedition();     //make object to access outer non static
                }
        }
}

/**
 * It is possible to access all kinds of methods of outer class from static nested class
 */

class Demo {

        public static void main(String[] args) {

                new British.GateWayOfIndia().details();
        }
}
