/**
 * However if we want to treat our class as UNCHECKED exception
 * We can feel free to extend RuntimeException
 */

class CoronaVirus extends RuntimeException {

}

class Life {

        //no need of throws because it is unchecked exception
        void year2020() {

                throw new CoronaVirus();
        }
}

class Demo {

        public static void main(String[] args) {

                new Life().year2020();
        }
}
