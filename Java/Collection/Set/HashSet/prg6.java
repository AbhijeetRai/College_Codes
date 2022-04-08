import java.util.*;

class HashSetDemo {

	public static void main(String[] args) {

		HashSet carNum = new HashSet();

		carNum.add(007);
		carNum.add(1);
		carNum.add(2);
		carNum.add(007);
		carNum.add(11);
		carNum.add(2);
		carNum.add(6);
		carNum.add(5);
		carNum.add(8);
		carNum.add(0);
		carNum.add(15);

		System.out.println(carNum);
	}
}
