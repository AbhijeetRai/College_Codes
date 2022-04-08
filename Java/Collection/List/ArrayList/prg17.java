import java.util.*;

class ThreadDemo extends Thread {

	public void run() {

		for(int i = 0; i <= 100; i++) {

			Instagram.followers.add(11);
		}
	}
}

/**
 * It is not permissible for one thread to modify a collection, if another is iterating over it.
 */
class Instagram {

	static ArrayList<Integer> followers = new ArrayList<Integer> ();

	public static void main(String[] args) {

		followers.add(1);
		followers.add(2);
		followers.add(3);
		followers.add(4);
		followers.add(5);
		followers.add(6);

		ThreadDemo t = new ThreadDemo();
		t.start();

		Iterator object = followers.iterator();

		while(object.hasNext()) {

			int obj = (Integer)object.next();
			System.out.println(obj);
		}
	}
}
