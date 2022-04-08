class Water {

        private void waterDetails() {

                System.out.println("It is a freshwater body");
        }

        static void bodyName() {

                System.out.println("The river is Ganga River");
        }

        class Fish {

                void fishDetails() {
                                                                //it is possible to access all kinds of methods of outer class
                                                                //from normal inner class
                        System.out.println("The fish is tuna");
                        waterDetails();
                        bodyName();
                }
        }
}

class Demo {

        public static void main(String[] args) {

                new Water().new Fish().fishDetails();
        }
}
