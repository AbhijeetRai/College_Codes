class BigBazaar {

        int x = 10;
        static int y = 20;
}

class Demo {

        public static void main(String[] args) {

                BigBazaar b1 = new BigBazaar();
                BigBazaar b2 = new BigBazaar();

                b1.x++;
                b1.y++;

                System.out.println(b2.x + " " + b2.y); 
        }
}
