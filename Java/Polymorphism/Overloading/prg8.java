class Custom1 {

        void fun(Thread t, int a) {

        }

        int fun(int a, Thread t) { //sequence is different, works

                return 1;
        }

        char gun(Thread t, int a) {

                return 'A';
        }

        //Tip-
        //return type does not matter in overloading a method
        //contrary to overriding, where return type must be same or co-variant
        String fun(Thread t, int a, char c) {

                return "Abhijeet";
        }

        /*void fun(Thread t, int a) {

        }*/
}

class Custom2 {

        void fun(Thread t, int a) {

        }
}
