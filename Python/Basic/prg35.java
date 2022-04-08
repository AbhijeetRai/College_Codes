class XYZ {

        XYZ() {

                System.out.println("In XYZ Constructor");
        }
}

class Demo {

        Demo() {

                System.out.println("In no argument");
        }

        Demo(int x) {

                XYZ x1 = new XYZ();
                System.out.println("In para");
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo();
                Demo obj2 = new Demo(10);
        }
}
