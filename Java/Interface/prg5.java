interface Covid {

        int cases = 100000; //(1 lakh in Bihar)

        void stats();
}

class Demo {

        public static void main(String[] args) {

                //By default variables of an interface are public, static and final
		//Covid.cases = 1;
                System.out.println(Covid.cases);
        }
}
