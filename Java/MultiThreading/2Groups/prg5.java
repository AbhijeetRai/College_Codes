class ThreadDemo extends Thread {

        ThreadDemo() {

        }

        ThreadDemo(ThreadGroup group, Runnable target, String name, long stackSize) {

                super(group, target, name, stackSize);
        }

        public void run() {

                System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getThreadGroup());
        }
}

class Demo {

        public static void main(String[] args) {

                ThreadDemo t1 = new ThreadDemo(new ThreadGroup("First_ThreadGroup"), new ThreadDemo(), "First_Thread", 101);
                t1.start();
        }
}
