class British {

        static class GateWayOfIndia {

                //only one copy of static variable is maintained, even in static nested inner class
                static int arrival = 1608;
                int departure = 1947;
        }
}

class Demo {

        public static void main(String[] args) {

                British.GateWayOfIndia g1 = new British.GateWayOfIndia();

                g1.arrival = 1600;
                g1.departure = 2000;

                System.out.println(g1.arrival);
                System.out.println(g1.departure);

                British.GateWayOfIndia g2 = new British.GateWayOfIndia();

                System.out.println(g2.arrival);
                System.out.println(g2.departure);
        }
}
