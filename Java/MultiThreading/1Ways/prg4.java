//Annonymous inner class but runnable interface

class Demo {

        public static void main(String[] args) {

                Runnable r = new Runnable() {

                        public void run() {

                                System.out.println("NAAM - > " + Thread.currentThread().getName());
                        }
                };

                Thread t = new Thread(r);
                t.start();
		System.out.println("Name " + t.getName());
        }
}
