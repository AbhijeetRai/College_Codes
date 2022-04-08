class British {

        private int comeToIndia = 1608;

        static class GateWayOfIndia {

                static int year = 1911;         //static member(variables and methods) allowed in static nested CLASS

                void details() {

                        System.out.println(year);
                        System.out.println(new British().comeToIndia);     //cannot directly access outer non static, make object of outer
                }
        }

        public static void main(String[] args) {

                new GateWayOfIndia().details();
        }
}
