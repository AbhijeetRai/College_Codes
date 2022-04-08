class Water {

        static int moles = 1;
        private int price = 20;

        //static declaration not allowed anywhere in normal inner class
        class Fish {

                int moles = 2;

                void details() {

                        int moles = 3;

                        System.out.println(moles);
                        System.out.println(this.moles);
                        System.out.println(Water.this.moles);
                        System.out.println(price);
                }
        }

        public static void main(String[] args) {

                Water.Fish wf = new Water().new Fish();
                wf.details();
        }
}
