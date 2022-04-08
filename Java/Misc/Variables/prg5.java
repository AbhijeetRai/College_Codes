class Demo {

        int a;
        int b = 10;
        static int c;
        static int d = 20;

        Demo() {

                a = 100;
                b = 200;
        }

        static {

                c = 300;
                d = 400;
        }

        public static void main(String[] args) {

                Demo obj = new Demo();

                System.out.println(obj.a + " " + obj.b);
                System.out.println(c + " " + d);
        }
}
/*
        Demo();
        bipush 10
        bipush 100
        bipush 200

        static {}
        bipush 20
        bipush 300
        bipush 400
*/
