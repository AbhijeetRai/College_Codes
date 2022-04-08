//Annonymous inner class for one time use, using thread class

class Demo {

	public static void main(String[] args) {

		Thread t = new Thread() {

			public void run() {

				System.out.println("Thread " + Thread.currentThread().getName());
			}
		};

		System.out.println("Priority is " + t.getPriority());
		t.start();
	}
}
