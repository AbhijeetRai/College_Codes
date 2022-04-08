// Suppose I have two variables, of which I cannot decide data type

class Surgeon<N, P> {

    N nurse;
    P patient; 

    Surgeon(N tempNurse, P tempPatient) {

        nurse = tempNurse;
        patient = tempPatient;
    }

    void showType() {

        System.out.println("The nurse is of type -> " + nurse.getClass().getName());
        System.out.println("The patient is of type -> " + patient.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        Surgeon<String, Integer> ins1 = new Surgeon<String, Integer> ("Abhi", 10);
        ins1.showType();
    }
}