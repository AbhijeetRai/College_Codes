class RashtraPatiBhavan {

        private int rooms;
        private double revenue;
        private int eventScedule;
        public String garden;
        public int plan;

        RashtraPatiBhavan(int rooms,double revenue,int eventScedule,String garden,int plan) {

                this.rooms = rooms;
                this.revenue = revenue;
                this.eventScedule = eventScedule;
                this.garden = garden;
                this.plan = plan;
        }

        void hostingEnvoys() {

                System.out.println(rooms + " " + revenue + " " + eventScedule + " " + garden + " " + plan);
        }
}

class Demo {

        public static void main(String[] args) {

                new RashtraPatiBhavan(100,2000000,6,"Botanical",200000).hostingEnvoys();
        }
}
