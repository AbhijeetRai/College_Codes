class Army<T> {

    T applicant; 

    Army(T tempApplicant) {

        applicant = tempApplicant;
    } 

    void showType() {

        System.out.println(applicant.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        Army<String> a1 = new Army<String> ("Air Force");
        a1.showType();

        //Once we have given generic as integer, we cannot add string
        //start putting T = Integer in Army class and imagine given line
        // Army<Integer> a2 = new Army<Integer> ("Navy");
        // a2.showType();
    }
}