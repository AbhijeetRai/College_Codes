import java.util.concurrent.*;

class Producer implements Runnable {

	final BlockingQueue<Integer> queue;

	Producer(BlockingQueue<Integer> queue) {

		this.queue = queue;
	}

	public void run() {

		try {

			fun();
		}catch(InterruptedException e) {

			System.out.println("InterruptP...");
			Thread.currentThread().interrupt();
		}
	}

	void fun() throws InterruptedException {

		for(int i = 0; i < 10; i++) {

			System.out.println("[Producer] Put : " + i);
			queue.put(i);
			//System.out.println("[Producer] Queue reminaingCapacity : " + queue.remainingCapacity());
			Thread.sleep(1000);
		}
	}
}


class Consumer implements Runnable {

	final BlockingQueue<Integer> queue;

	Consumer(BlockingQueue<Integer> queue) {

		this.queue = queue;
	}

	public void run() {

		try {

			while(true) {

				Integer take = queue.take();
				fun(take);
			}
		}catch(InterruptedException e) {

			System.out.println("InterruptP...");
			Thread.currentThread().interrupt();
		}
	}

	void fun(Integer take) throws InterruptedException {

		System.out.println("[Consumer] Take :" + take);
		Thread.sleep(500);
	}
}

class Demo {

	public static void main(String[] args)throws InterruptedException {

		BlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer> (1);

		Thread t1 = new Thread(new Producer(queue));
		t1.start();
		
		Thread t2 = new Thread(new Consumer(queue));
		t2.start();
	}
}
