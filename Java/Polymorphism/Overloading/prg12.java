//ArrayIndexOutOfBoundsException is Child of RuntimeException.
//RuntimeException is child of Throwable

class Error {

        void fun(RuntimeException obj) {

                System.out.println("RuntimeException");
        }

        void fun(Throwable obj) {

                System.out.println("Throwable");
        }
}

class Demo {

        public static void main(String[] args) {

                Error obj = new Error();
                obj.fun(new ArrayIndexOutOfBoundsException());

                //obj.fun(new String("Error"));                 //compatible with neither

                //obj.fun(new Object());                       //Can be upcasted but not be downcasted
        }
}
