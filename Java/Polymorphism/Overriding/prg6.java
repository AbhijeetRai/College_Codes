class Amitabh {

        void acting(int a, float b) {

                System.out.println("Amit - 1");
        }
}

class Abhishek extends Amitabh {

        void acting(int a) {

                System.out.println("Abhishek - 1");
        }

        void acting(int a, float b) {

                System.out.println("Abhishek - 2");
        }
}

class Demo {

        public static void main(String[] args) {

                Amitabh a = new Abhishek();
                //at compile time binds, with acting() method of amitabh, at run time binds with acting method of Abhishek
                a.acting(1,11.1f);

                //Error because, on parent reference we can only call/bind methods of parents.
                //Amitabh has no method acting(int)
                //a.acting(1);

                Abhishek b = new Abhishek();
                b.acting(1);
        }
}
