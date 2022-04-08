class Umpire {

        String umpire = "Bowden";

        void review() {

                String thirdUmpire = "Taufel";

                class DRS {

                        void reviewing() {

                                umpire = "De Silva";
                                thirdUmpire = "Raju";
                        }
                }
                new DRS().reviewing();
        }
}
