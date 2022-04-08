class Demo {

        static int c;
        static int d = 20;

        Demo() {

                c = 300;
                d = 400;
        }

        public static void main(String[] args) {

                System.out.println(c + " " + d);

                Demo obj = new Demo();
                //Object bana islie constructor call hua
                //constructor call hua, islie 'c' initialise hua.
                //Agar, object bana hi nahi rahta to ! ?

                System.out.println(c + " " + d);
        }
}

/*

        static {}
        bipush 20

        Demo();
        bipush 300
        bipush 400
*/
