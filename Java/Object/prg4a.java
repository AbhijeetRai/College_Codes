/**
 * User defined class reference in Original object, is shared with cloned object
 * Let's call this shallow copy. This happens by default in cloning
 */

class UnitedNations {

    int permanentMember;
    int temporaryMember;
}

class Country implements Cloneable {

    int happinesIndexRank; 
    int povertyIndexRank;
    UnitedNations un = new UnitedNations();


    public Object clone() {

        Object duplicate = null;

        try {
            duplicate = super.clone();
        }catch(CloneNotSupportedException obj) {

            System.out.println("CloneNotSupportedException, buddy!");
        }

        return duplicate;
    }
}

class Demo {

    public static void main(String[] args) {
        
        Country france = new Country();
        Country germany = (Country)france.clone();

        france.happinesIndexRank = 10;
        france.povertyIndexRank = 20;
        france.un.permanentMember = 30;
        france.un.temporaryMember = 40;

        germany.happinesIndexRank = 50;
        germany.povertyIndexRank = 60;
        germany.un.permanentMember = 70;
        germany.un.temporaryMember = 80;

        System.out.println(france.happinesIndexRank + " " + france.povertyIndexRank + " " + france.un.permanentMember + " " + france.un.temporaryMember);
        System.out.println(germany.happinesIndexRank + " " + germany.povertyIndexRank + " " + germany.un.permanentMember + " " + germany.un.temporaryMember);

        //User defined class reference un is shared between both the objects
        System.out.println(System.identityHashCode(france.un) + " " + System.identityHashCode(germany.un));
    }
}