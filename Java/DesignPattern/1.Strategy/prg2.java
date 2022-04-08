interface Team {

    void sena();
}

class Pandavas implements Team {

    public void sena() {

        System.out.println("Pandavs with Narayan himself");
    }
}

class Kauravas implements Team {

    public void sena() {

        System.out.println("Kauravas with Narayani-Sena");
    }
}

interface Weapon {

    void attack();
}

class Astra implements Weapon {

    public void attack() {

        System.out.println("Expert to attack with bow and arrow");
    }
}

class Shastra implements Weapon {

    public void attack() {

        System.out.println("Expert to attack with mace");
    }
}

/**
 * A class representing any warrior from Maharbharat
 * @author Abhijeet Rai
 */
abstract class Warrior {

    Team side;
    Weapon expertise;

    //name and astras Achieved by warriors used to vary,
    //from warrior to warrior
    abstract void name();
    abstract void divyastraAchieved();

    //every warrior was accompanied by these War Equipments
    //there is no need to override this method.
    void warEquipments() {

        System.out.println("Chariots(Rath) - Saarthi(Driver) - Horses");
    }

    void setTeam(Team side) {

        this.side = side;
    }

    void setWeaponExpertise(Weapon expertise) {

        this.expertise = expertise;
    }

    void revalTeam() {

        side.sena();
    }

    void showExpertise() {

        expertise.attack();
    }
}

class Duryodhan extends Warrior {

    void name() {

        System.out.println("Duryodhan");
    }

    void divyastraAchieved() {

        System.out.println("Boon from Gandhari");
    }
}

class Arjuna extends Warrior {

    void name() {

        System.out.println("Arjuna");
    }

    void divyastraAchieved() {

        System.out.println("Pashupati_Astra");
    }
}

class Demo {

    public static void main(String[] args) {

        Arjuna arjun = new Arjuna();
        arjun.setTeam(new Pandavas());
        arjun.setWeaponExpertise(new Astra());
        arjun.name();
        arjun.divyastraAchieved();
        arjun.revalTeam();
        arjun.showExpertise();

        System.out.println();

        Duryodhan duryodhan = new Duryodhan();
        duryodhan.setTeam(new Kauravas());
        duryodhan.setWeaponExpertise(new Shastra());
        duryodhan.name();
        duryodhan.divyastraAchieved();
        duryodhan.revalTeam();
        duryodhan.showExpertise();
    }
}
