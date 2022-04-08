class Germany extends Throwable {

}

class Demo {

        public static void main(String[] args) throws Germany {

                try {

                        throw new Germany();
                } catch(Germany e) {

                }
        }
}
