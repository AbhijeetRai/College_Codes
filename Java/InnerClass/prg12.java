class Umpire {

        String umpire = "Bowden";

        static void review() {

                String thirdUmpire = "Taufel";

                class DRS {

                        void reviewing() {

                                new Umpire().umpire = "De Silva";
                                thirdUmpire = "Raju";
                        }
                }

                new DRS().reviewing();
        }
}
