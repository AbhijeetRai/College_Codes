class Demo {

        Object fun() {

                //well this is acceptable that return type is mentioned Object, but we are returning String
                //because String is child of Object
                return "Abhijeet";
        }

        //above method works only if, mentioned return type and actual returned value are parent child
        //not sibling classes. Nor, Child is declared and parent is being returned
        /*String gun() {

                return new StringBuffer();
        }*/

        public static void main(String[] args) {

                Demo d = new Demo();

                //But compiler "YET" does not yet know that we are returning string value.
                //String s = d.fun();

                Object o = d.fun();
                System.out.println("Object is " + o);

                String s = (String)d.fun();
                System.out.println("String is " + s);
        }
}
