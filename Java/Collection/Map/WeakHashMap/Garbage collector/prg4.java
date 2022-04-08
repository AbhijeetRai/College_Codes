class Demo {

        public static void main(String[] args) {

                String s = "Abhijeet Rai";
                s = null;
                System.gc();
        }

        /**
         * Finalize method of demo was not called because
         * String object is null, not Demo
         * if finalize is overriden in string, finalize of string would be called ,otherwise object's
         */
        public void finalize() {

                System.out.println("In demo finalize");
        }
}
