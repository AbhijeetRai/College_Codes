class Papa {

        int age = 62;
}

class Abhijeet extends Papa {

        int age = 1999;

        void showAge(int age) {

                System.out.println("Age in function is " + age);
                System.out.println("Age in class is " + this.age);
                System.out.println("Age of parent is " + super.age);
        }
}

class Demo {

        public static void main(String[] args) {

                new Abhijeet().showAge(18);
        }
}
