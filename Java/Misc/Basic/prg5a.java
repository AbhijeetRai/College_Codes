class Germany {

}
/**
 * In Java, we can only 'throws' 'throw' or 'catch'
 * those clasess which are in hierarchy of Throwable
 * i.e. that class is either Throwable or any child of it
 * or exists below it.
 */
class Demo {

        public static void main(String[] args) throws Germany {

                try {

                        throw new Germany();
                } catch(Germany e) {

                }
        }
}
