/**
 * Suppose, I have a class in Java, which operates on multiple data types. 
 * And the kind of data it operates on, keeps varying, from time to time. 
 * Generics can be used in such contenxt. To decide the data type the class will be operating on, 
 * during the run time. When instance will be created. 
 */

class Surgeon<B> {

    B value; 

    Surgeon(B value) {

        this.value = value;
    }

    void showType() {

        System.out.println("The patient is of type -> " + value.getClass().getName());
    }
}

class Demo {

    public static void main(String[] args) {

        Surgeon<String> ins1 = new Surgeon<String> ("Zemo");
        ins1.showType();

        Surgeon<Integer> ins2 = new Surgeon<Integer> (10);
        ins2.showType();
    }
}