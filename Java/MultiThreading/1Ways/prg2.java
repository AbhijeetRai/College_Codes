//implement the Runnable interface
class MyThread implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getName());
		System.out.println("The priority of thread is " + Thread.currentThread().getPriority());
	}
}

class Demo {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		System.out.println("Name " + t.getName());
	}
}
